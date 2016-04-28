package com.potato.bims.merc.domain;

public class Problem {

	private String problemId;
	private String problemContent;
	private String problemTime;
	private String isRead;
	
	public String getProblemId() {
		return problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
	public String getProblemContent() {
		return problemContent;
	}
	public void setProblemContent(String problemContent) {
		this.problemContent = problemContent;
	}
	public String getProblemTime() {
		return problemTime;
	}
	public void setProblemTime(String problemTime) {
		this.problemTime = problemTime;
	}
	public String getIsRead() {
		return isRead;
	}
	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}
	
	
}
