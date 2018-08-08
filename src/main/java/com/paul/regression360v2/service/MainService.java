package com.paul.regression360v2.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.paul.regression360v2.dao.FileDetailsRepository;
import com.paul.regression360v2.dao.UserInfoRepository;
import com.paul.regression360v2.entity.FileDetails;
import com.paul.regression360v2.entity.UserInfo;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

@Service
public class MainService {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Autowired
	private FileDetailsRepository fileDetailsRepository;
	
	public UserInfo userInfoDB;
		
	public int saveFileDetails(String payload) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectReader readerForList = mapper.reader(new TypeReference<List<String>>() {});
		try {
			JsonNode rootNode = mapper.readValue(payload, JsonNode.class);
			String userName = rootNode.get("userName").asText();
			JsonNode fileDetailsNode = rootNode.get("fileDetails");
			String localJiraIssueId = rootNode.get("jiraIssueId").asText();
			ArrayList<String> files = readerForList.readValue(fileDetailsNode);
			System.out.println("userName : " + userName);
			for(String file: files) {
				System.out.println("file : " + file);
			}
			UserInfo userInfo = new UserInfo();
			userInfo.setUserName(userName);
			userInfo.setJiraIssueId(localJiraIssueId);
			userInfoDB  = userInfoRepository.save(userInfo);
			FileDetails fileDetails;
			for(String file: files) {
				fileDetails = new FileDetails();
				fileDetails.setFileName(file);
				fileDetails.setUserInfo(userInfoDB);
				fileDetailsRepository.save(fileDetails);
			}
			//Calling jira system to write the comment of the url:
			OkHttpClient client = new OkHttpClient();
			client.setConnectTimeout(30, TimeUnit.SECONDS);
			client.setReadTimeout(30, TimeUnit.SECONDS);
			client.setWriteTimeout(30, TimeUnit.SECONDS);
			String url = "https://sapjira.wdf.sap.corp/rest/api/2/issue/" + userInfoDB.getJiraIssueId() +"/comment";
			System.out.println("jira url : " + url);
			System.setProperty("javax.net.ssl.trustStore","C:/Program Files/Java/jdk1.8.0_102/jre/lib/security/cacerts.file");
	        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
	        MediaType mediaType = MediaType.parse("application/json");
	        RequestBody body = RequestBody.create(mediaType, "{\r\n\t\"body\": \"This is the URL to get the commit history details: http://localhost:2020/regression360/backend/getFilesCommitHistory/"+ userInfoDB.getUserLocalCommitInfoId() +"\"\r\n}\r\n");
	        Request request = new Request.Builder()
	        		  .url(url)
	        		  .post(body)
	        		  .addHeader("content-type", "application/json")
	        		  .addHeader("cache-control", "no-cache")
					  .addHeader("authorization", "Basic aTMyOTA0NjpBQmRldmlsaWVyczM=")
	        		  .addHeader("postman-token", "74b9244a-298b-5830-6de1-2b6752669255")
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
				System.out.println(response.isSuccessful());
			} catch (IOException e) {
				e.printStackTrace();
			}
			return userInfoDB.getUserLocalCommitInfoId();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1; 
	}

}
