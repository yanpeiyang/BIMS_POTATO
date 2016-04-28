package com.potato.bims.book.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.potato.bims.book.dao.BookInfoDAO;
import com.potato.bims.book.domain.BookInfo;
@Repository
public class BookInfoDAOImpl implements BookInfoDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<BookInfo> findBookInfoList() {
		String hql = "from BookInfo t where 1=1 and t.deleteFlag = 0";
		List<BookInfo> bookList = hibernateTemplate.find(hql);
		return bookList;
	}
	
	//还书检索书籍
	public List<BookInfo> findBookListByBookCode(String bookCode) {
		String hql = "from BookInfo t where 1=1 and t.deleteFlag = 0 and t.bookCode="+bookCode;
		List<BookInfo> bookList = hibernateTemplate.find(hql);
		return bookList;
	}
	
	public void saveBookInfo(BookInfo bookInfo){
		hibernateTemplate.save(bookInfo);
	}
	
	public void updateBookInfo(BookInfo bookInfo){
		hibernateTemplate.update(bookInfo);
	}
	
	public BookInfo findBookInfoById(String id) {
		return hibernateTemplate.get(BookInfo.class, id);
	}

	public void delBook(String bookCode) {
		hibernateTemplate.bulkUpdate("delete from BookInfo t where t.bookCode = ?",bookCode);
	}

}
