package com.potato.bims.reader.service;

import java.util.List;

import com.potato.bims.reader.domain.Reader;

public interface ReaderService {

	public List<Reader> findReaderList();
	
	public List<Reader> findReaderList(String paperNum,String paperType);
	
	public Reader findReaderById(String id);

	public void delReaderByIds(String[] fNos);
	
	public void saveReader(Reader reader);
	
	public void updateReader(Reader reader);
	
}
