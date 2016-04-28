package com.potato.bims.borrowread.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.potato.bims.borrowread.dao.BorrowReadDAO;
import com.potato.bims.borrowread.domain.BorrowRead;
import com.potato.bims.common.util.PageUtil;
@Repository
public class BorrowReadDAOImpl implements BorrowReadDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveBorrowRead(BorrowRead borrowRead) {
		hibernateTemplate.save(borrowRead);
	}

	@SuppressWarnings("unchecked")
	public List<BorrowRead> findBorrowReadList(String bookCode, String paperNum) {
		String hql = "from BorrowRead t where 1=1 and t.bookCode="+bookCode+"and t.readerId="+paperNum;
		List<BorrowRead> borrowReadList = hibernateTemplate.find(hql);
		return borrowReadList;
	}

	public void updateBorrowRead(BorrowRead borrowRead) {
		hibernateTemplate.update(borrowRead);
	}

	public List<BorrowRead> findBorrowReadList(final int pageNum,final int pageSize) {
		final String hql = "from BorrowRead t where 1=1 and t.deleteFlag = 0";
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<BorrowRead> borrowReadList = hibernateTemplate.executeFind(new  HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				return PageUtil.getList(session, hql, pageSize, pageNum);
			}
			
		});
		
		return borrowReadList;
	}

}
