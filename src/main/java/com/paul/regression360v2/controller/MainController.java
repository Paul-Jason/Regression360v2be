package com.paul.regression360v2.controller;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.paul.regression360v2.TransferObject.MainTO;
import com.paul.regression360v2.service.GitService;
import com.paul.regression360v2.service.MainService;


@RestController
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@Autowired
	private GitService gitService;
	
	//GET rest end point for testing.
	@GetMapping(path = "/regression360/backend/hello-world")
	public String helloWorld() {
		return "Hello User!!";
	}
	
	//POST rest end point to consume the file details and store them in the database.
	@PostMapping(value = "/regression360/backend/filedetails", consumes = "application/json", produces = "application/json")
	public String postWebhook(@RequestBody String payload) {
		//we store this session details in the DB
		int user_local_commit_id = mainService.saveFileDetails(payload);
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("userLocalCommitId", user_local_commit_id);
		//Repo related activities 
		boolean status = gitService.cloneOrFetchRepo();
		//Getting the commit history details from here
		MainTO mainTO = gitService.getFileCommitHistory();
		mainTO.setUserLocalCommitId(user_local_commit_id);
		try {
			String ResponseJSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mainTO);
			return ResponseJSON;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return "Something went Wrong!!!";
	}
}
