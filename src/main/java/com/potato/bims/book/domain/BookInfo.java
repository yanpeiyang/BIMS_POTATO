package com.potato.bims.book.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * BookInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="tb_book_info"
    ,catalog="bims_potato"
)

public class BookInfo  implements java.io.Serializable {


    // Fields    
	 private String bookId;
     private String bookCode;
     private String bookName;
     private String type;
     private String autor;
     private String translator;
     private String pubname;
     private String price;
     private String page;
     private String bcase;
     private String storageQuantity;
     private String intime;
     private String oper;
     private int borrownum;
     private String deleteFlag;
     private String createTime;
     private String createUser;
     private String updateTime;
     private String updateUser;


    // Constructors

    /** default constructor */
    public BookInfo() {
    }

	/** minimal constructor */
    public BookInfo(String bookName, String type, String autor, String createTime, String createUser) {
        this.bookName = bookName;
        this.type = type;
        this.autor = autor;
        this.createTime = createTime;
        this.createUser = createUser;
    }
    
    /** full constructor */
    public BookInfo(String bookName, String type, String autor, String translator, String pubname, String price, String page, String bcase, String storageQuantity, String intime, String oper, int borrownum, String deleteFlag, String createTime, String createUser, String updateTime, String updateUser) {
        this.bookName = bookName;
        this.type = type;
        this.autor = autor;
        this.translator = translator;
        this.pubname = pubname;
        this.price = price;
        this.page = page;
        this.bcase = bcase;
        this.storageQuantity = storageQuantity;
        this.intime = intime;
        this.oper = oper;
        this.borrownum = borrownum;
        this.deleteFlag = deleteFlag;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }
    
 // Property accessors
    @Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")      
    @Column(name="BOOK_ID", unique=true, nullable=false)
    /**
	 * @return the bookId
	 */
	public String getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	@Column(name="BOOK_CODE", nullable=false, length=64)
	
    public String getBookCode() {
        return this.bookCode;
    }
    
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    
    @Column(name="BOOK_NAME", nullable=false, length=64)

    public String getBookName() {
        return this.bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    @Column(name="TYPE", nullable=false, length=64)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="AUTOR", nullable=false, length=64)

    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Column(name="TRANSLATOR", length=64)

    public String getTranslator() {
        return this.translator;
    }
    
    public void setTranslator(String translator) {
        this.translator = translator;
    }
    
    @Column(name="PUBNAME", length=100)

    public String getPubname() {
        return this.pubname;
    }
    
    public void setPubname(String pubname) {
        this.pubname = pubname;
    }
    
    @Column(name="PRICE", length=16)

    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    @Column(name="PAGE", length=8)

    public String getPage() {
        return this.page;
    }
    
    public void setPage(String page) {
        this.page = page;
    }
    
    @Column(name="BCASE", length=64)

    public String getBcase() {
        return this.bcase;
    }
    
    public void setBcase(String bcase) {
        this.bcase = bcase;
    }
    
    @Column(name="STORAGE_QUANTITY", length=64)

    public String getStorageQuantity() {
        return this.storageQuantity;
    }
    
    public void setStorageQuantity(String storageQuantity) {
        this.storageQuantity = storageQuantity;
    }
    
    @Column(name="INTIME", length=0)

    public String getIntime() {
        return this.intime;
    }
    
    public void setIntime(String intime) {
        this.intime = intime;
    }
    
    @Column(name="OPER", length=100)

    public String getOper() {
        return this.oper;
    }
    
    public void setOper(String oper) {
        this.oper = oper;
    }
    
    @Column(name="BORROWNUM", length=32)

    public int getBorrownum() {
        return this.borrownum;
    }
    
    public void setBorrownum(int borrownum) {
        this.borrownum = borrownum;
    }
    
    @Column(name="DELETE_FLAG", length=1)

    public String getDeleteFlag() {
        return this.deleteFlag;
    }
    
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    
    @Column(name="CREATE_TIME", nullable=false, length=0)

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="CREATE_USER", nullable=false, length=32)

    public String getCreateUser() {
        return this.createUser;
    }
    
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    
    @Column(name="UPDATE_TIME", length=0)

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    
    @Column(name="UPDATE_USER", length=32)

    public String getUpdateUser() {
        return this.updateUser;
    }
    
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}