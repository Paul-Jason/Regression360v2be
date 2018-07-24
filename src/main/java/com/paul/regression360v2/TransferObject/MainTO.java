package com.paul.regression360v2.TransferObject;

import java.util.List;

public class MainTO {
	
	private int userLocalCommitId;
	private List<FileDetailsTO> allFileDetails;
	
	public MainTO() {
		
	}
	
	public MainTO(int userLocalCommitId, List<FileDetailsTO> fileDetails) {
		this.userLocalCommitId = userLocalCommitId;
		this.allFileDetails = fileDetails;
	}

	public int getUserLocalCommitId() {
		return userLocalCommitId;
	}

	public void setUserLocalCommitId(int userLocalCommitId) {
		this.userLocalCommitId = userLocalCommitId;
	}

	public List<FileDetailsTO> getFileDetails() {
		return allFileDetails;
	}

	public void setFileDetails(List<FileDetailsTO> fileDetails) {
		this.allFileDetails = fileDetails;
	}
	
}
