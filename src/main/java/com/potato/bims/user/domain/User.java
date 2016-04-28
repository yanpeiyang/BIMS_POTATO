package com.potato.bims.user.domain;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="tb_user"
    ,catalog="bims_potato"
)

public class User  implements java.io.Serializable {


    // Fields    

     private String userId;
     private String userNo;
     private String userName;
     private String userPwd;
     private String userSex;
     private String userBirth;
     private String userTel;
     private String userMobile;
     private String userEmail;
     private String userClass;
     private String deteteFlg;
     private String createUserid;
     private String createTime;
     private String updateUserid;
     private String updateTime;


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String userNo, String userName, String userPwd, String deteteFlg) {
        this.userNo = userNo;
        this.userName = userName;
        this.userPwd = userPwd;
        this.deteteFlg = deteteFlg;
    }
    
    /** full constructor */
    public User(String userNo, String userName, String userPwd, String userSex, String userBirth, String userTel, String userMobile, String userEmail, String userClass, String deteteFlg, String createUserid, String createTime, String updateUserid, String updateTime) {
        this.userNo = userNo;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userSex = userSex;
        this.userBirth = userBirth;
        this.userTel = userTel;
        this.userMobile = userMobile;
        this.userEmail = userEmail;
        this.userClass = userClass;
        this.deteteFlg = deteteFlg;
        this.createUserid = createUserid;
        this.createTime = createTime;
        this.updateUserid = updateUserid;
        this.updateTime = updateTime;
    }
    
    // Property accessors
    @Id
  	@GeneratedValue(generator = "system-uuid")
  	@GenericGenerator(name = "system-uuid", strategy = "uuid")    
   
    @Column(name="USER_ID", unique=true, nullable=false, length=64)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="USER_NO", nullable=false, length=128)

    public String getUserNo() {
        return this.userNo;
    }
    
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
    
    @Column(name="USER_NAME", nullable=false, length=128)

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="USER_PWD", nullable=false, length=128)

    public String getUserPwd() {
        return this.userPwd;
    }
    
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    
    @Column(name="USER_SEX", length=128)

    public String getUserSex() {
        return this.userSex;
    }
    
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    
    @Column(name="USER_BIRTH", length=128)

    public String getUserBirth() {
        return this.userBirth;
    }
    
    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }
    
    @Column(name="USER_TEL", length=128)

    public String getUserTel() {
        return this.userTel;
    }
    
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
    
    @Column(name="USER_MOBILE", length=128)

    public String getUserMobile() {
        return this.userMobile;
    }
    
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
    
    @Column(name="USER_EMAIL", length=128)

    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    @Column(name="USER_ClASS", length=128)

    public String getUserClass() {
        return this.userClass;
    }
    
    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }
    
    @Column(name="DETETE_FLG", nullable=false, length=100)

    public String getDeteteFlg() {
        return this.deteteFlg;
    }
    
    public void setDeteteFlg(String deteteFlg) {
        this.deteteFlg = deteteFlg;
    }
    
    @Column(name="CREATE_USERID", length=128)

    public String getCreateUserid() {
        return this.createUserid;
    }
    
    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }
    
    @Column(name="CREATE_TIME", length=0)

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="UPDATE_USERID", length=128)

    public String getUpdateUserid() {
        return this.updateUserid;
    }
    
    public void setUpdateUserid(String updateUserid) {
        this.updateUserid = updateUserid;
    }
    
    @Column(name="UPDATE_TIME", length=0)

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

}