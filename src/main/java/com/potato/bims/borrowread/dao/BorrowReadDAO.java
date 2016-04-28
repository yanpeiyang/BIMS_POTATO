package com.potato.bims.borrowread.dao;

import java.util.List;

import com.potato.bims.borrowread.domain.BorrowRead;

public interface BorrowReadDAO {
	public void saveBorrowRead(BorrowRead borrowRead);
	public List<BorrowRead> findBorrowReadList(String bookCode,String paperNum);
	public void updateBorrowRead(BorrowRead borrowRead);
	public List<BorrowRead> findBorrowReadList(int pageNum,int pageSize);
}

