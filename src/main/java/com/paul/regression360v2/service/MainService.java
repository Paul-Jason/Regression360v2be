package com.paul.regression360v2.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.TransportConfigCallback;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.paul.regression360v2.configuration.SshTransportConfigCallback;
import com.paul.regression360v2.dao.FileDetailsRepository;
import com.paul.regression360v2.dao.UserInfoRepository;
import com.paul.regression360v2.entity.FileDetails;
import com.paul.regression360v2.entity.UserInfo;
import com.paul.regression360v2.utils.Constants;

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
			ArrayList<String> files = readerForList.readValue(fileDetailsNode);
			System.out.println("userName : " + userName);
			for(String file: files) {
				System.out.println("file : " + file);
			}
			UserInfo userInfo = new UserInfo();
			userInfo.setUserName(userName);
			userInfoDB  = userInfoRepository.save(userInfo);
			FileDetails fileDetails;
			for(String file: files) {
				fileDetails = new FileDetails();
				fileDetails.setFileName(file);
				fileDetails.setUserInfo(userInfoDB);
				fileDetailsRepository.save(fileDetails);
			}
			return userInfoDB.getUserLocalCommitInfoId();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1; 
	}

}
