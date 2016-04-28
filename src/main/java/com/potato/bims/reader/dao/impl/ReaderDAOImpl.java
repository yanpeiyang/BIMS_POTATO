package com.potato.bims.reader.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.potato.bims.reader.dao.ReaderDAO;
import com.potato.bims.reader.domain.Reader;
@Repository
public class ReaderDAOImpl implements ReaderDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Reader> findReaderList() {
		String hql = "from Reader t where 1=1 and t.deleteFlag = 0";
		List<Reader> readerList = hibernateTemplate.find(hql);
		return readerList;
	}
	
	public List<Reader> findReaderList(String paperNum,String paperType) {
		String hql = "from Reader t where 1=1 and t.deleteFlag = 0 and t.paperNum="+paperNum+" and t.paperType="+paperType;
		List<Reader> readerList = hibernateTemplate.find(hql); 
		return readerList;
	}
	
	public Reader findReaderById(String id) {
		return hibernateTemplate.get(Reader.class, id);
	}
	
	public void saveReader(Reader reader) {
		hibernateTemplate.save(reader);
	}

	public void updateReader(Reader reader) {
		hibernateTemplate.update(reader);
	}
	
	public void delReader(String readerId) {
		hibernateTemplate.bulkUpdate("delete from Reader t where t.readerId = ?",readerId);
	}

}
