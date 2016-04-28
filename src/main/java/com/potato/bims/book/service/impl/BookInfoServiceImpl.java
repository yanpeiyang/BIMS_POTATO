package com.potato.bims.book.service.impl;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.potato.bims.book.dao.BookInfoDAO;
import com.potato.bims.book.domain.BookInfo;
import com.potato.bims.book.service.BookInfoService;
import com.potato.bims.common.constant.AppConstants;
import com.potato.bims.common.util.AppUtils;
import com.potato.bims.user.domain.User;

@Repository
public class BookInfoServiceImpl implements BookInfoService{
	@Autowired
	private BookInfoDAO bookInfoDAO ;
	
	public List<BookInfo> findBookInfoList() {
		return bookInfoDAO.findBookInfoList();
	}

	public BookInfo findBookById(String id) {
		return bookInfoDAO.findBookInfoById(id);
	}
	
	public void delBookByIds(String[] fNos) {
		for (int i = 0; i < fNos.length; i++) {
			BookInfo bookInfo = this.findBookById(fNos[i]);
			bookInfo.setDeleteFlag("1");
			this.updateBookInfo(bookInfo);
		}
	}

	public void saveBookInfo(BookInfo bookInfo) {
//		User user = (User) ServletActionContext.getRequest().getSession()
//				.getAttribute(AppConstants.USER_SESSION);
//		bookInfo.setUpdateUser(user.getUserId());
//		bookInfo.setUpdateTime(AppUtils.getSysDate());
		bookInfo.setCreateUser("111");
		bookInfo.setCreateTime(AppUtils.getSysDate());
		bookInfo.setDeleteFlag("0");
		bookInfoDAO.saveBookInfo(bookInfo);
	}

	public void updateBookInfo(BookInfo bookInfo) {
//		User user = (User) ServletActionContext.getRequest().getSession()
//				.getAttribute(AppConstants.USER_SESSION);
//		bookInfo.setUpdateUser(user.getUserId());
//		bookInfo.setUpdateTime(AppUtils.getSysDate());
		bookInfo.setCreateUser("111");
		bookInfo.setCreateTime(AppUtils.getSysDate());
		bookInfoDAO.updateBookInfo(bookInfo);
	}

	public List<BookInfo> findBookListByBookCode(String bookCode) {
		return bookInfoDAO.findBookListByBookCode(bookCode);
	}
}
