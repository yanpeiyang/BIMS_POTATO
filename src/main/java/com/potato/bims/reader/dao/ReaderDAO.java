package com.potato.bims.reader.dao;

import java.util.List;

import com.potato.bims.reader.domain.Reader;

public interface ReaderDAO {
	
	public List<Reader> findReaderList();
	
	public List<Reader> findReaderList(String paperNum,String paperType);
	
	public Reader findReaderById(String id);
	
	public void saveReader(Reader reader);
	
	public void updateReader(Reader reader);
	
	public void delReader(String readerId);
}
