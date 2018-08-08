package com.paul.regression360v2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paul.regression360v2.entity.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	
	UserInfo findByUserLocalCommitInfoId(int userLocalCommitInfoId);

}
