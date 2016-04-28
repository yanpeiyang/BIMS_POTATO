package com.potato.bims.reader.service.impl;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.potato.bims.book.dao.BookInfoDAO;
import com.potato.bims.book.domain.BookInfo;
import com.potato.bims.book.service.BookInfoService;
import com.potato.bims.common.constant.AppConstants;
import com.potato.bims.common.util.AppUtils;
import com.potato.bims.reader.dao.ReaderDAO;
import com.potato.bims.reader.domain.Reader;
import com.potato.bims.reader.service.ReaderService;
import com.potato.bims.user.domain.User;

@Repository
public class ReaderServiceImpl implements ReaderService{
	@Autowired
	private ReaderDAO readerDAO ;

//	public void saveBookInfo(BookInfo bookInfo) {
////		User user = (User) ServletActionContext.getRequest().getSession()
////				.getAttribute(AppConstants.USER_SESSION);
////		bookInfo.setUpdateUser(user.getUserId());
////		bookInfo.setUpdateTime(AppUtils.getSysDate());
//		bookInfo.setCreateUser("111");
//		bookInfo.setCreateTime(AppUtils.getSysDate());
//		bookInfo.setDeleteFlag("0");
//		bookInfoDAO.saveBookInfo(bookInfo);
//	}
//
//	public void updateBookInfo(BookInfo bookInfo) {
////		User user = (User) ServletActionContext.getRequest().getSession()
////				.getAttribute(AppConstants.USER_SESSION);
////		bookInfo.setUpdateUser(user.getUserId());
////		bookInfo.setUpdateTime(AppUtils.getSysDate());
//		bookInfo.setCreateUser("111");
//		bookInfo.setCreateTime(AppUtils.getSysDate());
//		bookInfo.setDeleteFlag("0");
//		bookInfoDAO.updateBookInfo(bookInfo);
//	}

	public List<Reader> findReaderList() {
		return readerDAO.findReaderList();
	}
	
	public List<Reader> findReaderList(String paperNum,String paperType) {
		return readerDAO.findReaderList(paperNum,paperType);
	}
	
	public Reader findReaderById(String id) {
		return readerDAO.findReaderById(id);
	}

	public void delReaderByIds(String[] fNos) {
		for (int i = 0; i < fNos.length; i++) {
			Reader reader = this.findReaderById(fNos[i]);
			reader.setDeleteFlag("1");
			this.updateReader(reader);
		}
	}

	public void saveReader(Reader reader) {
		readerDAO.saveReader(reader);
	}

	public void updateReader(Reader reader) {
		readerDAO.updateReader(reader);
	}
}
