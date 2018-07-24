package com.paul.regression360v2.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paul.regression360v2.entity.FileDetails;
import com.paul.regression360v2.entity.UserInfo;

@Repository
public interface FileDetailsRepository extends JpaRepository<FileDetails, Integer >{
		
		ArrayList<FileDetails> findByUserInfo(UserInfo userInfo);
		
}
