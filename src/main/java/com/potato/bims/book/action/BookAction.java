package com.potato.bims.book.action;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.potato.bims.book.domain.BookInfo;
import com.potato.bims.book.service.BookInfoService;
import com.potato.bims.borrowread.domain.BorrowRead;
import com.potato.bims.borrowread.service.BorrowReadService;
import com.potato.bims.common.action.BaseAction;
import com.potato.bims.common.constant.AppConstants;
import com.potato.bims.common.util.CommonResult;
import com.potato.bims.reader.domain.Reader;
import com.potato.bims.reader.service.ReaderService;
import com.potato.bims.user.domain.User;

public class BookAction extends BaseAction {
	@Autowired
	private BookInfoService bookInfoService;
	
	@Autowired
	private ReaderService readerService;
	
	@Autowired
	private BorrowReadService borrowReadService;
	
	private List<BookInfo> bookInfoList;
	
	private List<Reader> readerList;
	
	private List<BorrowRead> borrowReadList;
	
	private BookInfo bookInfo;
	
	private Reader reader;
	
	private String errorMsg;
	
	private CommonResult result;
	
	private BorrowRead borrowRead;
	
	/**
	 * 返回图书一览页面
	 */
	public String gotoBookList() {
		return "bookList";
	}
	
	/**
	 * 返回图书列表
	 */
	public void findBookInfoList() throws IOException {
		bookInfoList = bookInfoService.findBookInfoList();
		Map map = new HashMap();
		map.put("rows", bookInfoList);
		map.put("total", bookInfoList.size());
		String jsonStr = JSONObject.fromObject(map).toString();
		System.out.println(jsonStr);
		response.getWriter().print(jsonStr);
	}
	
	/**
	 * 返回图书添加页面
	 */
	public String gotoBookAdd(){
		return "bookEdit";
	}
	
	/**
	 * 返回图书更新页面
	 * @return
	 */
	public String gotoBookUpdate(){
		bookInfo = bookInfoService.findBookById(bookInfo.getBookId());
		return "bookEdit";
	}
	
	/**
	 * 添加
	 * @return
	 */
	public void saveBook()  throws IOException{
		bookInfoService.saveBookInfo(bookInfo);
		CommonResult s = new CommonResult();
		s.setSuccess("success");
		String jsonStr = JSONObject.fromObject(s).toString();
		response.getWriter().print(jsonStr);
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateBook(){
		bookInfoService.updateBookInfo(bookInfo);
		setErrorMsg("success");
		return "bookEdit";
	}
	
	/**
	 * 删除图书
	 * @return
	 */
	public String delBook(){
		String ids = request.getParameter("ids");
		String[] fNos = ids.split(",");
		bookInfoService.delBookByIds(fNos);
		return this.gotoBookList();
	}
	
	/**
	 * 图书借阅页面
	 * @return
	 */
	public String gotoBookborrowRead(){
		bookInfo = bookInfoService.findBookById(bookInfo.getBookId());
		return "borrowRead";
	}
	
	/**
	 * 图书借阅
	 * @return
	 * @throws IOException 
	 */
	public void borrowRead() throws IOException{
		Date date = new Date();
		User user = (User) ServletActionContext.getRequest().getSession()
				.getAttribute(AppConstants.USER_SESSION);
		bookInfo = bookInfoService.findBookById(bookInfo.getBookId());
		bookInfo.setBorrownum(bookInfo.getBorrownum()+1);
		bookInfoService.updateBookInfo(bookInfo);
		reader = readerService.findReaderById(reader.getReaderId());
		reader.setBorrownum(reader.getBorrownum()+1);
		readerService.updateReader(reader);
		borrowRead.setShouldReturnTime("1111");//应还时间
		borrowRead.setReaderId(reader.getReaderNo());//读者编号
		borrowRead.setBookCode(bookInfo.getBookCode());//图书条形码
		borrowRead.setCreateUser(user.getUserName());
		borrowRead.setCreateTime(date.toString());
		borrowReadService.saveBorrowRead(borrowRead);
		CommonResult s = new CommonResult();
		s.setSuccess("success");
		String jsonStr = JSONObject.fromObject(s).toString();
		response.getWriter().print(jsonStr);
	}
	
	/**
	 * 图书归还页面
	 * @return
	 */
	public String gotoReturnBook(){
		bookInfo = bookInfoService.findBookById(bookInfo.getBookId());
		return "returnBook";
	}
	
	/**
	 * 图书归还页面
	 * @return
	 * @throws IOException 
	 */
	public void returnBook() throws IOException{
		//借阅
		CommonResult s = new CommonResult();
		borrowReadList = borrowReadService.findBorrowReadList(bookInfo.getBookCode(), reader.getPaperNum());
		if(!borrowReadList.isEmpty()){
			for (BorrowRead borrowReadOne : borrowReadList) {
				borrowRead = borrowReadOne;
				if(borrowRead.getIsreturn()=="0"){
					borrowRead.setIsreturn("1");
					borrowReadService.UpdateBorrowRead(borrowRead);
					s.setSuccess("success");
					String jsonStr = JSONObject.fromObject(s).toString();
					response.getWriter().print(jsonStr);
				}else{
					s.setError("error");
					String jsonStr = JSONObject.fromObject(s).toString();
					response.getWriter().print(jsonStr);
				}
			}
//			//图书
//			bookInfoList = bookInfoService.findBookListByBookCode(bookInfo.getBookCode());
//			for (BookInfo book : bookInfoList) {
//				bookInfo = book;
//				bookInfo.setBorrownum(bookInfo.getBorrownum()-1);
//				bookInfoService.updateBookInfo(bookInfo);
//			}
//			//读者
//			readerList = readerService.findReaderList(reader.getPaperNum(), reader.getPaperType());
//			for (Reader readerOne : readerList) {
//				reader = readerOne;
//				reader.setBorrownum(reader.getBorrownum()-1);
//				readerService.updateReader(reader);
//			}
		} else {
			s.setError("error");
			String jsonStr = JSONObject.fromObject(s).toString();
			response.getWriter().print(jsonStr);
		}
		
	}
	
	/**
	 * 读者检索
	 * @return
	 * @throws IOException 
	 */
	public void queryReader() throws IOException{
		CommonResult s = new CommonResult();
		readerList = readerService.findReaderList(reader.getPaperNum(),reader.getPaperType());
		if(!readerList.isEmpty()){
			for (Reader queryReader : readerList) {
				reader = queryReader;
			}
			String jsonStr = JSONObject.fromObject(reader).toString();
			response.getWriter().print(jsonStr);
		} else{
			s.setError("error");
			String jsonStr = JSONObject.fromObject(s).toString();
			response.getWriter().print(jsonStr);
		}
	}
	
	/**
	 * 图书借阅排行榜
	 * @return
	 */
	
	public String gotoBookRanklist(){
		return "bookranklist";
	}
	
	public List<BookInfo> getBookInfoList() {
		return bookInfoList;
	}

	public void setBookInfoList(List<BookInfo> bookInfoList) {
		this.bookInfoList = bookInfoList;
	}

	public BookInfo getBookInfo() {
		return bookInfo;
	}
	
	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
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
	 * @return the result
	 */
	public CommonResult getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(CommonResult result) {
		this.result = result;
	}

	/**
	 * @return the borrowRead
	 */
	public BorrowRead getBorrowRead() {
		return borrowRead;
	}

	/**
	 * @param borrowRead the borrowRead to set
	 */
	public void setBorrowRead(BorrowRead borrowRead) {
		this.borrowRead = borrowRead;
	}

	public List<BorrowRead> getBorrowReadList() {
		return borrowReadList;
	}

	public void setBorrowReadList(List<BorrowRead> borrowReadList) {
		this.borrowReadList = borrowReadList;
	}
}
