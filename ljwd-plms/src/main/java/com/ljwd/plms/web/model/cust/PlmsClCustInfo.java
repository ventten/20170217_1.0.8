package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseModel;

import java.util.Date;

/**
 * 客户基本信息,plms_cl_cust_info
 * */
public class PlmsClCustInfo extends BaseModel{

    private Long id;                //记录id
    private String custName;        //姓名
    private String gender;          //性别: FEMALE/MALE
    private Date birthday;          //出生日期
    private String marriage;        //婚姻状况:未婚，已婚，离婚,分居,丧偶，其它
    private String doctype;         //证件类型
    private String docno;           //证件号码
    private String birthPlace;      //籍贯
    private String education;       //教育程度

    //mbfms-ext
    private Long applId;            //借款id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype == null ? null : doctype.trim();
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno == null ? null : docno.trim();
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

}