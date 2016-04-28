package com.potato.bims.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potato.bims.user.dao.UserDAO;
import com.potato.bims.user.domain.User;
import com.potato.bims.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public User login(String userName, String userPwd) {

		return userDAO.findUserByNoAndPwd(userName, userPwd);
	}

	public User findUserById(String id) {
		
		return userDAO.findUserById(id);
	}

	public void saveUser(User user) {
		user.setDeteteFlg("0");
		userDAO.saveUser(user);
	}

	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

}
