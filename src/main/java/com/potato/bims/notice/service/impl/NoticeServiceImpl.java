package com.potato.bims.notice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.potato.bims.notice.domain.Notice;
import com.potato.bims.notice.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	public static String[] titleArr = {"","","","图书馆讲解员招聘启事","清明节开馆安排","共创图书馆文明倡议书","关于论文收引检索服务的声明","“《论语》回故里","图书馆现代技术讨论会"};
	public static String[] timeArr = {"","","","2015-01-23","2015-01-30","2015-02-03","2015-02-15","2015-02-28","2015-03-02"};
	public static String[] isReadArr = {"1","1","1","1","1","1","1","0","0"};
	public List<Notice> findAll() {
		List<Notice> list = new ArrayList<Notice>();
		for (int i = 8; i >= 0; i--) {
			Notice notice = new Notice();
			notice.setNoticeTitle(titleArr[i]);
			notice.setNoticeTime(timeArr[i]);
			notice.setIsRead(isReadArr[i]);
			list.add(notice);
		}
		return list;
	}

}
