package com.potato.bims.newbook.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.potato.bims.newbook.domain.Meeting;
import com.potato.bims.newbook.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService {
	public static String[] titleArr = {"","锦绣缘","和爸爸一起去海边","昭奚旧草","无尽深蓝","人在纽约","空鸟","不如我们从头来过","你要好好爱自己"};
	public static String[] timeArr = {"","2015-01-03","2015-01-22","2015-01-23","2015-01-30","2015-02-03","2015-02-15","2015-02-28","2015-03-02"};
	public static String[] isReadArr = {"","1","1","1","1","1","1","1","0"};
	public List<Meeting> findAll() {
		List<Meeting> list = new ArrayList<Meeting>();
		for (int i = 8; i >= 0; i--) {
			Meeting meeting = new Meeting();
			meeting.setMeetTheme(titleArr[i]);
			meeting.setMeetTime(timeArr[i]);
			meeting.setIsRead(isReadArr[i]);
			list.add(meeting);
		}
		return list;
	}

}
