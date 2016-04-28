package com.potato.bims.user.service;

import com.potato.bims.user.domain.User;

public interface UserService {

	public User login(String userAccount, String userPassword);
	
	public User findUserById(String id);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
}
