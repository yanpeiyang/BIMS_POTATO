package com.potato.bims.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.potato.bims.user.dao.UserDAO;
import com.potato.bims.user.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public User findUserByNoAndPwd(String userNo, String userPwd) {

		List<User> users = hibernateTemplate.find(
				"from User where userName = ? and userPwd = ?",
				userNo, userPwd);
		return users.isEmpty() ? null : users.get(0);

	}

	public void saveUser(User user) {

		hibernateTemplate.save(user);
	}

	public User findUserById(String id) {
		return hibernateTemplate.get(User.class, id);

	}

	public void updateUser(User user) {
		hibernateTemplate.update(user);
	}

}
