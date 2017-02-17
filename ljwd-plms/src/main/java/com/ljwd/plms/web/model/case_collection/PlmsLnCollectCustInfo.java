package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

/**
 * 催收记录自定义信息,PLMS_LN_COLLECT_CUST_INFO
 * */
public class PlmsLnCollectCustInfo extends BaseModel{
    
    private Long id;                    //记录ID
    private Long applId;                //借款申请ID
    @Deprecated
    private Integer periodNum;          //逾期期数(预留、暂时不用)
    @Deprecated
    private String collector;           //催收员(预留、暂时不用)
    private String custInfo;            //催收员备注较为重要的客户信息

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    @Deprecated
    public Integer getPeriodNum() {
        return periodNum;
    }

    @Deprecated
    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    @Deprecated
    public String getCollector() {
        return collector;
    }

    @Deprecated
    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getCustInfo() {
        return custInfo;
    }

    public void setCustInfo(String custInfo) {
        this.custInfo = custInfo == null ? null : custInfo.trim();
    }

}