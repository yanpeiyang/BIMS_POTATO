package com.potato.bims.user.dao;

import com.potato.bims.user.domain.User;

public interface UserDAO {

	public User findUserByNoAndPwd(String userNo,String userPwd);
	
	public void saveUser(User user);
	
	public User findUserById(String id);
	
	public void updateUser(User user);
}
