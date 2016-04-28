package com.potato.bims.borrowread.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.potato.bims.book.domain.BookInfo;
import com.potato.bims.book.service.BookInfoService;
import com.potato.bims.borrowread.domain.BorrowRead;
import com.potato.bims.borrowread.service.BorrowReadService;
import com.potato.bims.common.action.BaseAction;
import com.potato.bims.reader.domain.Reader;
import com.potato.bims.reader.service.ReaderService;

public class BorrowReadAction extends BaseAction {
	@Autowired
	private BorrowReadService borrowReadService;
	
	private String errorMsg;
	
	private List<BorrowRead> borrowReadList;
	/**
	 * 返回借阅信息一览页面
	 */
	public String gotoBorrowList() {
		return "borrowList";
	}
	
	/**
	 * 返回图书列表
	 */
	public void findBorrowReadList() throws IOException {
		int pageNum = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("rows"));
		borrowReadList = borrowReadService.findBookInfoList(pageNum,pageSize);
		Map map = new HashMap();
		map.put("rows", borrowReadList);
		map.put("total", borrowReadList.size());
		String jsonStr = JSONObject.fromObject(map).toString();
		System.out.println(jsonStr);
		response.getWriter().print(jsonStr);
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

	public List<BorrowRead> getBorrowReadList() {
		return borrowReadList;
	}

	public void setBorrowReadList(List<BorrowRead> borrowReadList) {
		this.borrowReadList = borrowReadList;
	}

}
