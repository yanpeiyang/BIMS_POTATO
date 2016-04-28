package com.potato.bims.reader.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.potato.bims.common.action.BaseAction;
import com.potato.bims.reader.domain.Reader;
import com.potato.bims.reader.service.ReaderService;

public class ReaderAction extends BaseAction {
	@Autowired
	private ReaderService readerService;
	
	private List<Reader> readerList;
	
	private Reader reader;
	
	private String errorMsg;
	
	/**
	 * 返回读者一览页面
	 */
	public String gotoReaderList() {
		return "readerList";
	}
	
	/**
	 * 获取读者列表
	 */
	public void findReaderList() throws IOException {
		readerList = readerService.findReaderList();
		Map map = new HashMap();
		map.put("rows", readerList);
		map.put("total", readerList.size());
		String jsonStr = JSONObject.fromObject(map).toString();
		System.out.println(jsonStr);
		response.getWriter().print(jsonStr);
	}
	
	/**
	 * 返回读者添加页面
	 */
	public String gotoReaderAdd(){
		return "readerEdit";
	}
	
	/**
	 * 返回读者更新页面
	 * @return
	 */
	public String gotoReaderUpdate(){
		reader = readerService.findReaderById(reader.getReaderId());
		return "readerEdit";
	}
	
	/**
	 * 添加
	 * @return
	 */
	public String saveReader(){
		readerService.saveReader(reader);
		setErrorMsg("success");
		return "readerEdit";
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateReader(){
		readerService.updateReader(reader);
		setErrorMsg("success");
		return "readerEdit";
	}
	
	/**
	 * 删除图书
	 * @return
	 */
	public String delReader(){
		String ids = request.getParameter("ids");
		String[] fNos = ids.split(",");
		readerService.delReaderByIds(fNos);
		return this.gotoReaderList();
	}

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return the readerList
	 */
	public List<Reader> getReaderList() {
		return readerList;
	}

	/**
	 * @param readerList the readerList to set
	 */
	public void setReaderList(List<Reader> readerList) {
		this.readerList = readerList;
	}

	/**
	 * @return the reader
	 */
	public Reader getReader() {
		return reader;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Reader reader) {
		this.reader = reader;
	}
}
