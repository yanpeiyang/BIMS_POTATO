package com.potato.bims.borrowread.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * BorrowRead entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="tb_borrow"
    ,catalog="bims_potato"
)

public class BorrowRead  implements java.io.Serializable {


    // Fields    

     private String id;
     private String readerId;
     private String bookCode;
     private String borrowTime;
     private String shouldReturnTime;
     private String actualReturnTime;
     private String borrowOper;
     private String returnOper;
     private String isreturn;
     private String deleteFlag;
     private String createTime;
     private String createUser;
     private String updateTime;
     private String updateUser;


    // Constructors

    /** default constructor */
    public BorrowRead() {
    }

	/** minimal constructor */
    public BorrowRead(String readerId, String bookCode, String createTime, String createUser) {
        this.readerId = readerId;
        this.bookCode = bookCode;
        this.createTime = createTime;
        this.createUser = createUser;
    }
    
    /** full constructor */
    public BorrowRead(String readerId, String bookCode, String borrowTime, String shouldReturnTime, String actualReturnTime, String borrowOper, String returnOper, String isreturn, String deleteFlag, String createTime, String createUser, String updateTime, String updateUser) {
        this.readerId = readerId;
        this.bookCode = bookCode;
        this.borrowTime = borrowTime;
        this.shouldReturnTime = shouldReturnTime;
        this.actualReturnTime = actualReturnTime;
        this.borrowOper = borrowOper;
        this.returnOper = returnOper;
        this.isreturn = isreturn;
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
    
    @Column(name="ID", unique=true, nullable=false)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="READER_ID", nullable=false, length=64)

    public String getReaderId() {
        return this.readerId;
    }
    
    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }
    
    @Column(name="BOOK_CODE", nullable=false, length=64)

    public String getBookCode() {
        return this.bookCode;
    }
    
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    
    @Column(name="BORROW_TIME", length=64)

    public String getBorrowTime() {
        return this.borrowTime;
    }
    
    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }
    
    @Column(name="SHOULD_RETURN_TIME", length=64)

    public String getShouldReturnTime() {
        return this.shouldReturnTime;
    }
    
    public void setShouldReturnTime(String shouldReturnTime) {
        this.shouldReturnTime = shouldReturnTime;
    }
    
    @Column(name="ACTUAL_RETURN_TIME", length=64)

    public String getActualReturnTime() {
        return this.actualReturnTime;
    }
    
    public void setActualReturnTime(String actualReturnTime) {
        this.actualReturnTime = actualReturnTime;
    }
    
    @Column(name="BORROW_OPER", length=16)

    public String getBorrowOper() {
        return this.borrowOper;
    }
    
    public void setBorrowOper(String borrowOper) {
        this.borrowOper = borrowOper;
    }
    
    @Column(name="RETURN_OPER", length=16)

    public String getReturnOper() {
        return this.returnOper;
    }
    
    public void setReturnOper(String returnOper) {
        this.returnOper = returnOper;
    }
    
    @Column(name="ISRETURN", length=1)

    public String getIsreturn() {
        return this.isreturn;
    }
    
    public void setIsreturn(String isreturn) {
        this.isreturn = isreturn;
    }
    
    @Column(name="DELETE_FLAG", length=1)

    public String getDeleteFlag() {
        return this.deleteFlag;
    }
    
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    
    @Column(name="CREATE_TIME", nullable=false, length=64)

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
    
    @Column(name="UPDATE_TIME", length=64)

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