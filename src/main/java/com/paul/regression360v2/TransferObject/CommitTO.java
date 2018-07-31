package com.paul.regression360v2.TransferObject;

import org.eclipse.jgit.lib.PersonIdent;

public class CommitTO {

	private String commitId;
	private PersonIdent commitAuthor;
	private int commitTime;	
	private String shortMessage;
	private String fullMessage;
	private String jiraId;
	private String jiraTicketType;
	private String jiraSummary;
	private String jiraDescription;
	private String jiraCreationTime;
	
	public CommitTO(){
		
	}
	
	public CommitTO(String commitId, PersonIdent commitAuthor, int commitTime, String shortMessage, String fullMessage, String jiraId, String jiraTicketType, String jiraSummary, String jiraDescription, String jiraCreationTime) {
		this.commitId = commitId;
		this.commitAuthor = commitAuthor;
		this.commitTime = commitTime;
		this.shortMessage = shortMessage;
		this.fullMessage = fullMessage;
		this.jiraId = jiraId;
		this.jiraTicketType = jiraTicketType;
		this.jiraSummary = jiraSummary;
		this.jiraDescription = jiraDescription;
		this.jiraCreationTime = jiraCreationTime;
	}

	public String getCommitId() {
		return commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public PersonIdent getCommitAuthor() {
		return commitAuthor;
	}

	public void setCommitAuthor(PersonIdent commitAuthor) {
		this.commitAuthor = commitAuthor;
	}

	public int getCommitTime() {
		return commitTime;
	}

	public void setCommitTime(int commitTime) {
		this.commitTime = commitTime;
	}

	public String getShortMessage() {
		return shortMessage;
	}

	public void setShortMessage(String shortMessage) {
		this.shortMessage = shortMessage;
	}

	public String getFullMessage() {
		return fullMessage;
	}

	public void setFullMessage(String fullMessage) {
		this.fullMessage = fullMessage;
	}

	public String getJiraId() {
		return jiraId;
	}

	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	public String getJiraTicketType() {
		return jiraTicketType;
	}

	public void setJiraTicketType(String jiraTicketType) {
		this.jiraTicketType = jiraTicketType;
	}

	public String getJiraDescription() {
		return jiraDescription;
	}

	public void setJiraDescription(String jiraDescription) {
		this.jiraDescription = jiraDescription;
	}

	public String getJiraCreationTime() {
		return jiraCreationTime;
	}

	public void setJiraCreationTime(String jiraCreationTime) {
		this.jiraCreationTime = jiraCreationTime;
	}

	public String getJiraSummary() {
		return jiraSummary;
	}

	public void setJiraSummary(String jiraSummary) {
		this.jiraSummary = jiraSummary;
	}

}
