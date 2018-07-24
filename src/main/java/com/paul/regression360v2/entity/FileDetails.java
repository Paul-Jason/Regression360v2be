package com.paul.regression360v2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "file_details")
public class FileDetails {
	
	@Id
	@Column(name="file_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fileId;
	
	@Column(name="file_name", nullable= false)
	private String fileName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private UserInfo userInfo;
	
	public FileDetails() {
			
	}
	
	public FileDetails(String fileName, UserInfo userInfo) {
		this.fileName = fileName;
		this.userInfo = userInfo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public int getFileId() {
		return fileId;
	}
	
}
