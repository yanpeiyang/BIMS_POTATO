package com.potato.bims.worldthings.domain;

public class Mail {

	private String mailId;
	private String mailTitle;
	private String mailTime;
	private String isRead;
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMailTitle() {
		return mailTitle;
	}
	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
	}
	public String getMailTime() {
		return mailTime;
	}
	public void setMailTime(String mailTime) {
		this.mailTime = mailTime;
	}
	public String getIsRead() {
		return isRead;
	}
	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}
	
	
}
