package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 委外机构联系人,PLMS_OUTSRC_COM_CONTACT
 * */
public class PlmsOutsrcComContact extends ActiveModel{

    private Long id;                        //记录ID
    private Long outsrcComId;               //委外机构ID
    private String name;                    //姓名
    private String position;                //职位
    private String mobile;                  //手机
    private String tel;                     //办公座机
    private String email;                   //邮箱

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOutsrcComId() {
        return outsrcComId;
    }

    public void setOutsrcComId(Long outsrcComId) {
        this.outsrcComId = outsrcComId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

}