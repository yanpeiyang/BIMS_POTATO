package com.potato.bims.merc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.potato.bims.merc.domain.Problem;
import com.potato.bims.merc.service.ProblemService;

@Service
public class ProblemServiceImpl implements ProblemService{
	public static String[] titleArr = {"","","","","上架新书核对","图书证补办工作落实","对新招聘管理员的培训","日常工作","汇报招聘讲解员事宜"};
	public static String[] timeArr = {"","","","","2015-01-30","2015-02-03","2015-02-15","2015-02-28","2015-03-02"};
	public static String[] isReadArr = {"","","","","1","1","0","0","0"};
	public List<Problem> findAll() {
		List<Problem> list = new ArrayList<Problem>();
		for (int i = 8; i >= 0; i--) {
			Problem problem = new Problem();
			problem.setProblemContent(titleArr[i]);
			problem.setProblemTime(timeArr[i]);
			problem.setIsRead(isReadArr[i]);
			list.add(problem);
		}
		return list;
	}
}
