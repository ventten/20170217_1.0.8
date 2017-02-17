package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 委外机构沟通日志,PLMS_OUTSRC_COM_LOG
 * */
public class PlmsOutsrcComLogExample extends BaseExample{

    private Long id;                        //记录ID
    private Long outsrcComId;               //委外机构ID
    private Long recVer;                    //Version
    private String isActive;                //Y/N

    public Long getId() {
        return id;
    }

    public PlmsOutsrcComLogExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOutsrcComId() {
        return outsrcComId;
    }

    public PlmsOutsrcComLogExample setOutsrcComId(Long outsrcComId) {
        this.outsrcComId = outsrcComId;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsOutsrcComLogExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsOutsrcComLogExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

}