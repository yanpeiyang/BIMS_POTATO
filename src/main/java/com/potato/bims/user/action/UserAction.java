package com.potato.bims.user.action;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.potato.bims.common.action.BaseAction;
import com.potato.bims.common.constant.AppConstants;
import com.potato.bims.user.domain.User;
import com.potato.bims.user.service.UserService;

public class UserAction extends BaseAction {

	@Autowired
	private UserService userService;

	private User user;

	private String errorMsg;

	public String login() {

		if (StringUtils.isEmpty(user.getUserName())) {
			errorMsg = "用户名不能为空";
			return "login";
		}
		if (StringUtils.isEmpty(user.getUserPwd())) {
			errorMsg = "密码不能为空";
			return "login";
		}
		User loginUser = userService.login(user.getUserName(),user.getUserPwd());
		// 登陆失败
		if (loginUser == null) {
			errorMsg = "用户名或密码错误";
			return "login";
		}
		
		// 将登陆信息存入session
		request.getSession().setAttribute(AppConstants.USER_SESSION, loginUser);
		return "success";
	}
	
	public String exit() {
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "login";
	}
	
	public String gotoSaveUser(){
		return "saveUser";
	}
	
	public String saveUser() {
		userService.saveUser(user);
		setErrorMsg("success");
		return "saveUser";
	} 
	
	public String updatePwd(){
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute(AppConstants.USER_SESSION);
		String password = request.getParameter("userPwd");
		user.setUserPwd(password);
		userService.updateUser(user);
		return SUCCESS;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
