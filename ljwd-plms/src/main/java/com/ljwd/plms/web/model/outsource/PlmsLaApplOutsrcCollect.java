package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 委外催记表,PLMS_LA_APPL_OUTSRC_COLLECT
 * */
public class PlmsLaApplOutsrcCollect extends BaseModel {

    private Long id;                            //记录ID
    private Long applId;                        //借款ID
    private Long cntrctId;                      //合同ID
    private Long comId;                         //委外机构ID
    private Integer overduePeriod;              //逾期期数
    private Integer overdueDays;                //逾期天数
    private String controlStatus;               //控管状态
    private BigDecimal recivAmt;                //委外金额
    private BigDecimal recycleAmt;              //回收金额
    private Date followTime;                    //最后跟进时间

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

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Integer getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Integer overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus == null ? null : controlStatus.trim();
    }

    public BigDecimal getRecivAmt() {
        return recivAmt;
    }

    public void setRecivAmt(BigDecimal recivAmt) {
        this.recivAmt = recivAmt;
    }

    public BigDecimal getRecycleAmt() {
        return recycleAmt;
    }

    public void setRecycleAmt(BigDecimal recycleAmt) {
        this.recycleAmt = recycleAmt;
    }

    public Date getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Date followTime) {
        this.followTime = followTime;
    }

}