package com.potato.bims.borrowread.service.impl;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.potato.bims.book.dao.BookInfoDAO;
import com.potato.bims.book.domain.BookInfo;
import com.potato.bims.book.service.BookInfoService;
import com.potato.bims.borrowread.dao.BorrowReadDAO;
import com.potato.bims.borrowread.domain.BorrowRead;
import com.potato.bims.borrowread.service.BorrowReadService;
import com.potato.bims.common.constant.AppConstants;
import com.potato.bims.common.util.AppUtils;
import com.potato.bims.user.domain.User;

@Repository
public class BorrowReadServiceImpl implements BorrowReadService{
	@Autowired
	private BorrowReadDAO borrowReadDAO ;

	public void saveBorrowRead(BorrowRead borrowRead) {
		borrowReadDAO.saveBorrowRead(borrowRead);
	}

	public List<BorrowRead> findBorrowReadList(String bookCode, String paperNum) {
		return borrowReadDAO.findBorrowReadList(bookCode, paperNum);
	}

	public void UpdateBorrowRead(BorrowRead borrowRead) {
		borrowReadDAO.updateBorrowRead(borrowRead);
	}

	public List<BorrowRead> findBookInfoList(int pageNum, int pageSize) {
		return borrowReadDAO.findBorrowReadList(pageNum,pageSize);
	}

}
