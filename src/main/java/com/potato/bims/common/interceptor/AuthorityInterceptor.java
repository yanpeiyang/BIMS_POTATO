package com.potato.bims.common.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor {
	//
	@Override
	public String intercept(ActionInvocation inter) throws Exception {
		// TODO Auto-generated method stub

		// 获取HTTPREQUEST
		HttpServletRequest httpRequest = ServletActionContext.getRequest();
		// 获取STRUTS2的REQUEST
		ActionContext request = ActionContext.getContext();
		httpRequest.getSession().getAttribute("UserInfo");
		// if (user == null) {
		// return "gotologin";
		// } else {

		String url = httpRequest.getServletPath();
		boolean bool = urlInspection(url);// 验证用户权限;
		if (bool) {
			return inter.invoke();
		} else {
			return "autherror";
		}
//		}
	}

	// TODO
	private boolean urlInspection(String url) {
		return true;
	}

}