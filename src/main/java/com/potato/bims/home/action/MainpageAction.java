package com.potato.bims.home.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.potato.bims.common.action.BaseAction;
import com.potato.bims.merc.domain.Problem;
import com.potato.bims.merc.service.ProblemService;
import com.potato.bims.newbook.domain.Meeting;
import com.potato.bims.newbook.service.MeetingService;
import com.potato.bims.notice.domain.Notice;
import com.potato.bims.notice.service.NoticeService;
import com.potato.bims.worldthings.domain.Mail;
import com.potato.bims.worldthings.service.MailService;

public class MainpageAction extends BaseAction{
	
	@Autowired
	private NoticeService noticeService;
	
	@Autowired
	private MailService mailService;
	
	@Autowired
	private MeetingService meetingService;
	
	@Autowired
	private ProblemService problemService;
	
	//公告
	private List<Notice> noticeList = new ArrayList<Notice>();
	//邮件
	private List<Mail> mailList = new ArrayList<Mail>();
	//会议
	private List<Meeting> meetingList = new ArrayList<Meeting>();
	//待办事件
	private List<Problem> problemList = new ArrayList<Problem>();

	/**
	 * 跳转到主页面
	 */
	public String gotoHomePage(){
		
		noticeList = noticeService.findAll();
		mailList = mailService.findAll();
		meetingList = meetingService.findAll();
		problemList = problemService.findAll();
		
		return "home";
	}

	public List<Notice> getNoticeList() {
		return noticeList;
	}

	public void setNoticeList(List<Notice> noticeList) {
		this.noticeList = noticeList;
	}

	public List<Mail> getMailList() {
		return mailList;
	}

	public void setMailList(List<Mail> mailList) {
		this.mailList = mailList;
	}

	public List<Meeting> getMeetingList() {
		return meetingList;
	}

	public void setMeetingList(List<Meeting> meetingList) {
		this.meetingList = meetingList;
	}

	public List<Problem> getProblemList() {
		return problemList;
	}

	public void setProblemList(List<Problem> problemList) {
		this.problemList = problemList;
	}
	
	
}
