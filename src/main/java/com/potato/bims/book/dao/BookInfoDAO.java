package com.potato.bims.book.dao;

import java.util.List;

import com.potato.bims.book.domain.BookInfo;

public interface BookInfoDAO {
	public List<BookInfo> findBookInfoList();

	public BookInfo findBookInfoById(String id);
	
	public void saveBookInfo(BookInfo bookInfo);
	
	public void updateBookInfo(BookInfo bookInfo);
	
	public List<BookInfo> findBookListByBookCode(String bookCode);
}
