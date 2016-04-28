package com.potato.bims.common.action;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.web.context.ServletConfigAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 *  所有的action都继续本类，该类为其它action类初始化了request,response,application三个对象。
 *  实现ServletRequestAware、ServletContextAware、ServletResponseAware、ServletConfigAware
 * @author shaojx
 *
 */
public class BaseAction extends ActionSupport implements ServletRequestAware, ServletContextAware , ServletResponseAware, ServletConfigAware{
	
	private static final long serialVersionUID = -4196402321332278384L;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected ServletConfig config;
	protected ServletContext application;
	public static final int PAGESIZE = 20;
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		request.setAttribute("ctx", request.getContextPath());//设置工程的名称
	}
	
	public void setServletContext(ServletContext application) {
		this.application = application;
	}
	
	public void setServletResponse(HttpServletResponse response) {		
		this.response = response;
	}

	public void setServletConfig(ServletConfig config) {
		this.config = config;
	}	
	
}
