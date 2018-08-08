package com.paul.regression360v2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_info")
public class UserInfo {
	
	@Id
	@Column(name="user_local_commit_info_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userLocalCommitInfoId;
	
	@Column(name="user_name", nullable= false)
	private String userName;
	
	@Column(name="jira_issue_id", nullable= false)
	private String jiraIssueId;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userInfo")
	private  List<FileDetails> fileDetails;
	
	public UserInfo() {
			
	}
	
	public UserInfo(String userName, List<FileDetails> fileDetails, String jiraIssueId) {
		this.userName = userName;
		this.fileDetails = fileDetails;
		this.jiraIssueId = jiraIssueId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<FileDetails> getFileDetails() {
		return fileDetails;
	}

	public void setFileDetails(List<FileDetails> fileDetails) {
		this.fileDetails = fileDetails;
	}

	public int getUserLocalCommitInfoId() {
		return userLocalCommitInfoId;
	}

	public String getJiraIssueId() {
		return jiraIssueId;
	}

	public void setJiraIssueId(String jiraIssueId) {
		this.jiraIssueId = jiraIssueId;
	}
	
}
