package com.potato.bims.worldthings.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.potato.bims.worldthings.domain.Mail;
import com.potato.bims.worldthings.service.MailService;

@Service
public class MailServiceImpl implements MailService{
	public static String[] titleArr = {"","","","","","韩永进会见伊朗驻华大使哈吉·阿里·阿斯哈","国家图书馆召开2015年党风廉政建设工作会议","“千年古郡 九朝神韵——正定历史文化展”在国家图书馆开展","中国古籍保护协会成立"};
	public static String[] timeArr = {"","","","","","2015-01-23","2015-01-30","2015-02-03","2015-02-15"};
	public static String[] isReadArr = {"","","","","","1","1","0","0"};
	public List<Mail> findAll() {
		List<Mail> list = new ArrayList<Mail>();
		for (int i = 8; i >= 0; i--) {
			Mail mail = new Mail();
			mail.setMailTitle(titleArr[i]);
			mail.setMailTime(timeArr[i]);
			mail.setIsRead(isReadArr[i]);
			list.add(mail);
		}
		return list;
	}

}
