package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 委外机构联系人,PLMS_OUTSRC_COM_CONTACT
 * */
public class PlmsOutsrcComContactExample extends BaseExample {

    private Long id;                        //记录ID
    private Long outsrcComId;               //委外机构ID
    private Long recVer;                    //Version
    private String isActive;                //Y/N
    private String name;                    //姓名
    private String mobile;                  //手机

    public Long getId() {
        return id;
    }

    public PlmsOutsrcComContactExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOutsrcComId() {
        return outsrcComId;
    }

    public PlmsOutsrcComContactExample setOutsrcComId(Long outsrcComId) {
        this.outsrcComId = outsrcComId;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsOutsrcComContactExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsOutsrcComContactExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

    public String getName() {
        return name;
    }

    public PlmsOutsrcComContactExample setName(String name) {
        this.name = name;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public PlmsOutsrcComContactExample setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
}