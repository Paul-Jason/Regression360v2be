package com.paul.regression360v2.service;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.TransportConfigCallback;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.revwalk.RevCommit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.paul.regression360v2.TransferObject.CommitTO;
import com.paul.regression360v2.TransferObject.FileDetailsTO;
import com.paul.regression360v2.TransferObject.MainTO;
import com.paul.regression360v2.configuration.SshTransportConfigCallback;
import com.paul.regression360v2.dao.FileDetailsRepository;
import com.paul.regression360v2.dao.UserInfoRepository;
import com.paul.regression360v2.entity.FileDetails;
import com.paul.regression360v2.entity.UserInfo;
import com.paul.regression360v2.utils.Constants;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.paul.regression360v2.service.MainService;


@Service
public class GitService {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Autowired
	private FileDetailsRepository fileDetailsRepository;
	
	@Autowired
	private MainService mainService;
		
	private static Git git;
	
	private final static TransportConfigCallback transportConfigCallback = new SshTransportConfigCallback();

	public boolean cloneOrFetchRepo() {
		System.out.println("You are using this project: "+ Constants.REPO_NAME);
		final File workingDir = new File(Constants.TEMP_DIR + "/" + Constants.REPO_NAME);
		System.out.println("Working directory : " + workingDir);
		if(workingDir.exists()) {
			try {
				git = Git.open(workingDir);
				System.out.println("Repository opened at : " + workingDir);
				return true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				Git result = Git.cloneRepository()
				.setURI(Constants.REMOTE_URL + "/" + Constants.REPO_NAME)
				.setDirectory(new File(Constants.TEMP_DIR + "/" + Constants.REPO_NAME))
				.call();
				System.out.println("Having repository: " + result.getRepository().getDirectory());
				return true;
			} catch (GitAPIException e) {
				e.printStackTrace();
			}
        }
		return false;
	}
	
	public MainTO getFileCommitHistory(UserInfo userInfoDB) {
		//This sesssions details are store in DB.
		ArrayList<FileDetails> fileDetails = fileDetailsRepository.findByUserInfo(userInfoDB);
		System.out.println(fileDetails);
		//Main POJO of the Final JSON Response
		MainTO mainTO = new MainTO();
		List<FileDetailsTO> allFileDetails = new LinkedList<FileDetailsTO>();
		//Iterating through each file present in the session
		for(FileDetails fileDetail : fileDetails){
			FileDetailsTO fileDetailsTO = new FileDetailsTO();
			fileDetailsTO.setFileId(fileDetail.getFileId());
			fileDetailsTO.setFileName(fileDetail.getFileName());
			//Getting the commit history of this file
			try {
				Iterable<RevCommit> log = git.log().addPath(fileDetail.getFileName()).setMaxCount(5).call();
				List<CommitTO> commitHistory = new LinkedList<CommitTO>();
				HashMap<String, CommitTO> jiraIdCommit = new HashMap<String , CommitTO>();
				//Getting commit details for each commit and storing in the POJO not the DB
				for(RevCommit commit: log) {
					CommitTO commitTO = new CommitTO();
					System.out.println("Iterating through every commit!!");
					commitTO.setCommitId(commit.getId().getName());
					commitTO.setCommitTime(commit.getCommitTime());
					commitTO.setShortMessage(commit.getShortMessage());
					commitTO.setFullMessage(commit.getFullMessage());
					commitTO.setCommitAuthor(commit.getCommitterIdent());
					
					String commitMessage = commit.getFullMessage();
					//Check for whether the commit message contains the jira id and a lot of validations
					if(Pattern.compile(Pattern.quote("jira:"), Pattern.CASE_INSENSITIVE).matcher(commitMessage).find()) {
						String[] fullMessage = commitMessage.split("(?i)jira:");
						if(fullMessage.length >1) {
							String jiraInfo = fullMessage[1];
							StringBuffer jiraId = new StringBuffer() ;
							for(int i = 0; i < jiraInfo.length(); i++) {
								if(Character.isDigit(jiraInfo.charAt(i)) || Character.isLetter(jiraInfo.charAt(i)) || jiraInfo.charAt(i) == '-') { 
									jiraId.append(jiraInfo.charAt(i));
								}
								else if(jiraInfo.charAt(i) == '\n') {
									break;
								}
							}
							String jiraIdString = jiraId.toString();
							System.out.println("jira id : " + jiraIdString);
							if(Pattern.compile(Pattern.quote("fpa"), Pattern.CASE_INSENSITIVE).matcher(jiraIdString).find()) {
								jiraIdCommit.put(jiraIdString, commitTO);
							}	
						}
					}
				}
				/*Talking to JIRA for multiple issues of a single file*/
				List<String> jiraIds = new ArrayList<String>(jiraIdCommit.keySet());
				StringBuilder multipleJiraIdsQuery = new StringBuilder();
				for(int i = 0; i < jiraIds.size() ; i++) {
					if(i == jiraIds.size() -1)
						multipleJiraIdsQuery.append(jiraIds.get(i));
					else
						multipleJiraIdsQuery.append(jiraIds.get(i) + ",");
				}
				//Building url to call the JIRA system for the details of multiple issues reelated to a single file at one shot.
				OkHttpClient client = new OkHttpClient();
				client.setConnectTimeout(30, TimeUnit.SECONDS);
				client.setReadTimeout(30, TimeUnit.SECONDS);
				client.setWriteTimeout(30, TimeUnit.SECONDS);
				String url = Constants.JIRA_BASE_URL_MULTPLE_ISSUSES + " " + "(" + multipleJiraIdsQuery + ")";
				System.out.println("jira url : " + url);
				System.setProperty("javax.net.ssl.trustStore","C:/Program Files/Java/jdk1.8.0_102/jre/lib/security/cacerts.file");
		        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
				Request request = new Request.Builder()
						  .url(url)
						  .get()
						  .addHeader("authorization", "Basic aTMyOTA0NjpBQmRldmlsaWVyczM=")
						  .addHeader("cache-control", "no-cache")
						  .build();
				
		        System.setProperty("javax.net.ssl.trustStrore", "C:/Program Files/Java/jdk1.8.0_102/jre/lib/security/cacerts.file");
		        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		        //Providing https certificate details to talk to SAP Jira system
		        String trustStore = System.getProperty("javax.net.ssl.trustStore");
		        if (trustStore == null) {
		            System.out.println("javax.net.ssl.trustStore is not defined");
		        } else {
		            System.out.println("javax.net.ssl.trustStore = " + trustStore);
		        }
				try {
					Response response = client.newCall(request).execute();
					if(response.isSuccessful()) {
						String responseJsonString = response.body().string();
//						String responseJsonString = Constants.JIRA_MULTIPLE_ISSUES_SAMPLE_JSON;  //use to have sample jira response instead of calling the jira system
						ObjectMapper mapper = new ObjectMapper();
						@SuppressWarnings("deprecation")
						ObjectReader readerForList = mapper.reader(new TypeReference<List<Object>>() {});
						JsonNode rootNode = mapper.readValue(responseJsonString, JsonNode.class);
						JsonNode issues = rootNode.get("issues");
						List<Object> issuesList = readerForList.readValue(issues);
						//Populating jira related details in the CommitTO POJO.
						for(Object issue : issuesList) {
							JsonNode issueNode = mapper.convertValue(issue, JsonNode.class);
							String issueKey = issueNode.get("key").asText();
							CommitTO commitTO = jiraIdCommit.get(issueKey);
							commitTO.setJiraId(issueKey);
							JsonNode fields = issueNode.get("fields");
							commitTO.setJiraSummary(fields.get("summary").asText());
							commitTO.setJiraDescription(fields.get("description").asText());
							commitTO.setJiraTicketType(fields.get("issuetype").get("description").asText());
							commitTO.setJiraCreationTime(fields.get("created").asText());
							commitHistory.add(commitTO);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				fileDetailsTO.setCommitHistory(commitHistory);
			} catch (GitAPIException e) {
				e.printStackTrace();
			}
			allFileDetails.add(fileDetailsTO);
		}
		mainTO.setFileDetails(allFileDetails);
		return mainTO;
	}
}
