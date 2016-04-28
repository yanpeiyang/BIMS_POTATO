package com.potato.bims.book.service;

import java.util.List;

import com.potato.bims.book.domain.BookInfo;

public interface BookInfoService {
	public List<BookInfo> findBookInfoList();

	public BookInfo findBookById(String id);

	public void delBookByIds(String[] fNos);
	
	public void saveBookInfo(BookInfo bookInfo);
	
	public void updateBookInfo(BookInfo bookInfo);
	
	public List<BookInfo> findBookListByBookCode(String bookCode);
}
