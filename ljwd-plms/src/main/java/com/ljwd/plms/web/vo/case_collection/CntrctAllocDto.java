package com.ljwd.plms.web.vo.case_collection;

/**
 * Created by zhengzw on 2016/11/17
 * 合同部分信息
 */
public class CntrctAllocDto {

    private String cntrctNo;                //合同编号
    private Long applId;                    //借款ID
    private Integer overduePeriod;          //最小逾期期数
    private Integer overDays;               //逾期天数
    private String collector;               //当前催收员
    private String agent;                   //当前代理催收员

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Integer getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Integer overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public Integer getOverDays() {
        return overDays;
    }

    public void setOverDays(Integer overDays) {
        this.overDays = overDays;
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

}
