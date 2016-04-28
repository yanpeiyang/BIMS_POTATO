package com.potato.bims.borrowread.service;

import java.util.List;

import com.potato.bims.borrowread.domain.BorrowRead;

public interface BorrowReadService {
	
	public void saveBorrowRead(BorrowRead borrowRead);
	
	public List<BorrowRead> findBorrowReadList(String bookCode, String paperNum);

	public void UpdateBorrowRead(BorrowRead borrowRead);

	public List<BorrowRead> findBookInfoList(int pageNum, int pageSize);
}
