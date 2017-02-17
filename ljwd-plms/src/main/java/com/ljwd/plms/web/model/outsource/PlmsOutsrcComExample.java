package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 委外机构,PLMS_OUTSRC_COM
 * */
public class PlmsOutsrcComExample extends BaseExample{

    private Long id;                            //记录ID
    private Long recVer;                        //Version
    private String outsrcComName;               //机构名称(模糊查询)
    private String comName;                     //机构名称(完全匹配查询)
    private String isActive;                    //数据有效性
    private Long wdCorpId;                      //微贷外包公司表sys_outsrc_corp的ID
    private Long noThisId;                      //排除此ID

    public Long getNoThisId() {
        return noThisId;
    }

    public PlmsOutsrcComExample setNoThisId(Long noThisId) {
        this.noThisId = noThisId;
        return this;
    }

    public Long getWdCorpId() {
        return wdCorpId;
    }

    public PlmsOutsrcComExample setWdCorpId(Long wdCorpId) {
        this.wdCorpId = wdCorpId;
        return this;
    }

    public Long getId() {
        return id;
    }

    public PlmsOutsrcComExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsOutsrcComExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getOutsrcComName() {
        return outsrcComName;
    }

    public PlmsOutsrcComExample setOutsrcComName(String outsrcComName) {
        this.outsrcComName = (outsrcComName == null || "".equals(outsrcComName) || "".equals(outsrcComName.trim())) ? null : outsrcComName.trim();
        return this;
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsOutsrcComExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

    public String getComName() {
        return comName;
    }

    public PlmsOutsrcComExample setComName(String comName) {
        this.comName = comName;
        return this;
    }

}