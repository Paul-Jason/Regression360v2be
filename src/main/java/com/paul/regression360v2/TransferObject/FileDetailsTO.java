package com.paul.regression360v2.TransferObject;

import java.util.List;

public class FileDetailsTO {
	
	private int fileId;
	private String fileName;
	private List<CommitTO> commitHistory;
	
	public FileDetailsTO() {

	}
	
	public FileDetailsTO(int fileId, String fileName, List<CommitTO> commitHistory) {
		this.fileId = fileId;
		this.fileName = fileName;
		this.commitHistory = commitHistory;
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public List<CommitTO> getCommitHistory() {
		return commitHistory;
	}

	public void setCommitHistory(List<CommitTO> commitHistory) {
		this.commitHistory = commitHistory;
	}
	
}
