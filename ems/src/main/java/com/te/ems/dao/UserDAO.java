package com.te.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.ems.beans.UserInfo;

@Repository
public interface UserDao extends JpaRepository<UserInfo, String> {


	public UserBean findByEmailAndPassword(String email, String password);
	
	public UserBean findByEmail(String email);
	
	

}
