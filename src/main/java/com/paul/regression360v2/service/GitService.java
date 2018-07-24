package com.paul.regression360v2.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.TransportConfigCallback;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.revwalk.RevCommit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.paul.regression360v2.TransferObject.CommitTO;
import com.paul.regression360v2.TransferObject.FileDetailsTO;
import com.paul.regression360v2.TransferObject.MainTO;
import com.paul.regression360v2.configuration.SshTransportConfigCallback;
import com.paul.regression360v2.dao.FileDetailsRepository;
import com.paul.regression360v2.dao.UserInfoRepository;
import com.paul.regression360v2.entity.FileDetails;
import com.paul.regression360v2.entity.UserInfo;
import com.paul.regression360v2.utils.Constants;
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
	
	public MainTO getFileCommitHistory() {
		String start;
		ArrayList<FileDetails> fileDetails = fileDetailsRepository.findByUserInfo(mainService.userInfoDB);;
		System.out.println(fileDetails);
		MainTO mainTO = new MainTO();
		List<FileDetailsTO> allFileDetails = new LinkedList<FileDetailsTO>();
		for(FileDetails fileDetail : fileDetails){
			FileDetailsTO fileDetailsTO = new FileDetailsTO();
			fileDetailsTO.setFileId(fileDetail.getFileId());
			fileDetailsTO.setFileName(fileDetail.getFileName());
			try {
				Iterable<RevCommit> log = git.log().addPath(fileDetail.getFileName()).call();
				List<CommitTO> commitHistory = new LinkedList<CommitTO>();
				for(RevCommit commit: log) {
					CommitTO commitTO = new CommitTO();
					System.out.println("Iterating through every commit!!");
					commitTO.setCommitId(commit.getId().getName());
					commitTO.setCommitTime(commit.getCommitTime());
					commitTO.setShortMessage(commit.getShortMessage());
					commitTO.setFullMessage(commit.getFullMessage());
					commitTO.setCommitAuthor(commit.getCommitterIdent());
					commitHistory.add(commitTO);
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
