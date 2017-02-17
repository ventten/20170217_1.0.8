package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 催收记录自定义信息,PLMS_LN_COLLECT_CUST_INFO
 * */
public class PlmsLnCollectCustInfoExample extends BaseExample{

    private Long id;                    //记录ID
    private Long applId;                //借款申请ID
    private Integer periodNum;          //逾期期数
    private String collector;           //催收员
    private Long recVer;                //版本号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplId() {
        return applId;
    }

    public PlmsLnCollectCustInfoExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Integer getPeriodNum() {
        return periodNum;
    }

    public PlmsLnCollectCustInfoExample setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    public String getCollector() {
        return collector;
    }

    public PlmsLnCollectCustInfoExample setCollector(String collector) {
        this.collector = collector;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public void setRecVer(Long recVer) {
        this.recVer = recVer;
    }

}