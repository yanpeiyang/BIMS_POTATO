package com.potato.bims.newbook.domain;

public class Meeting {
	/** 会议ID */
	private String meetId;
	/** 会议主题 */
	private String meetTheme;
	/** 会议人数 */
	private String meetNumber;
	/** 会议人员 */
	private String meetPersonnel;
	/** 会议时间 */
	private String meetTime; 
	/** 会议地点 */
	private String meetPlace;
	/** 会议内容 */
	private String meetContent;
	private String isRead;
	public String getMeetId() {
		return meetId;
	}
	public void setMeetId(String meetId) {
		this.meetId = meetId;
	}
	public String getMeetTheme() {
		return meetTheme;
	}
	public void setMeetTheme(String meetTheme) {
		this.meetTheme = meetTheme;
	}
	public String getMeetNumber() {
		return meetNumber;
	}
	public void setMeetNumber(String meetNumber) {
		this.meetNumber = meetNumber;
	}
	public String getMeetPersonnel() {
		return meetPersonnel;
	}
	public void setMeetPersonnel(String meetPersonnel) {
		this.meetPersonnel = meetPersonnel;
	}
	public String getMeetTime() {
		return meetTime;
	}
	public void setMeetTime(String meetTime) {
		this.meetTime = meetTime;
	}
	public String getMeetPlace() {
		return meetPlace;
	}
	public void setMeetPlace(String meetPlace) {
		this.meetPlace = meetPlace;
	}
	public String getMeetContent() {
		return meetContent;
	}
	public void setMeetContent(String meetContent) {
		this.meetContent = meetContent;
	} 
	public String getIsRead() {
		return isRead;
	}
	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}
}
