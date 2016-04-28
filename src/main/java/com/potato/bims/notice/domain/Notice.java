package com.potato.bims.notice.domain;




/**
 *	通知公告实体类
 *	(映射数据库 YW_Notice) 
 */
public class Notice {
	/** 通知公告ID */
	private String noticeId;
	/** 通知公告标题 */
	private String noticeTitle;
	/** 通知公告发布时间 */
	private String noticeTime;
	/** 通知公告发布人 */
	private String noticePersonnel;
	/** 通知公告内容 */
	private String noticeContent;
	private String isRead;
	
	public String getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeTime() {
		return noticeTime;
	}
	public void setNoticeTime(String noticeTime) {
		this.noticeTime = noticeTime;
	}
	public String getNoticePersonnel() {
		return noticePersonnel;
	}
	public void setNoticePersonnel(String noticePersonnel) {
		this.noticePersonnel = noticePersonnel;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getIsRead() {
		return isRead;
	}
	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}
}
