package com.potato.bims.reader.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * Reader entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="tb_reader"
    ,catalog="bims_potato"
)

public class Reader  implements java.io.Serializable {


    // Fields    

     private String readerId;
     private String readerNo;
     private String readerName;
     private String sex;
     private String readerType;
     private String paperType;
     private String paperNum;
     private String tel;
     private String email;
     private String remark;
     private int borrownum;
     private String createDate;
     private String createUser;
     private String updateDate;
     private String updateUser;
     private String deleteFlag;

    // Constructors

    /** default constructor */
    public Reader() {
    }

	/** minimal constructor */
    public Reader(String readerNo, String readerName) {
        this.readerNo = readerNo;
        this.readerName = readerName;
    }
    
    /** full constructor */
    public Reader(String readerNo, String readerName, String sex, String readerType, String paperType, String paperNum, String tel, String email, String remark, int borrownum, String createDate, String createUser, String updateDate, String updateUser) {
        this.readerNo = readerNo;
        this.readerName = readerName;
        this.sex = sex;
        this.readerType = readerType;
        this.paperType = paperType;
        this.paperNum = paperNum;
        this.tel = tel;
        this.email = email;
        this.remark = remark;
        this.borrownum = borrownum;
        this.createDate = createDate;
        this.createUser = createUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
    }

    @Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")      
    
    @Column(name="READER_ID", unique=true, nullable=false, length=64)

    public String getReaderId() {
        return this.readerId;
    }
    
    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }
    
    @Column(name="READER_NO", nullable=false, length=50)

    public String getReaderNo() {
        return this.readerNo;
    }
    
    public void setReaderNo(String readerNo) {
        this.readerNo = readerNo;
    }
    
    @Column(name="READER_NAME", nullable=false, length=50)

    public String getReaderName() {
        return this.readerName;
    }
    
    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }
    
    @Column(name="SEX", length=8)

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Column(name="READER_TYPE", length=50)

    public String getReaderType() {
        return this.readerType;
    }
    
    public void setReaderType(String readerType) {
        this.readerType = readerType;
    }
    
    @Column(name="PAPER_TYPE", length=30)

    public String getPaperType() {
        return this.paperType;
    }
    
    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }
    
    @Column(name="PAPER_NUM", length=40)

    public String getPaperNum() {
        return this.paperNum;
    }
    
    public void setPaperNum(String paperNum) {
        this.paperNum = paperNum;
    }
    
    @Column(name="TEL", length=20)

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    @Column(name="EMAIL", length=50)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="REMARK", length=80)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="BORROWNUM", length=10)

    public int getBorrownum() {
        return this.borrownum;
    }
    
    public void setBorrownum(int borrownum) {
        this.borrownum = borrownum;
    }
    
    @Column(name="CREATE_DATE", length=0)

    public String getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    
    @Column(name="CREATE_USER", length=40)

    public String getCreateUser() {
        return this.createUser;
    }
    
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    
    @Column(name="UPDATE_DATE", length=0)

    public String getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    
    @Column(name="UPDATE_USER", length=40)

    public String getUpdateUser() {
        return this.updateUser;
    }
    
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Column(name="DELETE_FLAG", length=40)
    
	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
   








}