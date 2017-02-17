package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/12/10
 * 再扣申请表,LF_RE_COLLECT_REQ
 * */
public class LfReCollectReq extends BaseModel{

    public static final String STATUS_CREATED = "CREATED";          //未处理
    public static final String STATUS_CANCELLED = "CANCELLED";      //取消
    public static final String STATUS_OFFERED = "OFFERED";          //已报盘
    public static final String STATUS_FAILED = "FAILED";            //扣款失败
    public static final String STATUS_COLLECTED = "COLLECTED";      //扣款成功

    private Long id;                        //记录ID
    private Long cntrctId;                  //合同ID
    private Integer periodNum;              //期数
    private BigDecimal reqAmt;              //再扣金额
    private String reqBy;                   //申请人ID
    private Date reqTime;                   //申请时间
    private Long offerBatDtlId;             //
    private String rpayType;                //再扣类型：NORMAL-正常还款,ADV_CLEAR-提前结清
    private Date collectDate;               //再扣日期
    private String status;                  //状态：CREATED-未处理,CANCELLED-取消,OFFERED-已报盘,FAILED-扣款失败,COLLECTED-扣款成功
    private String remark;                  //备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
    }

    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public BigDecimal getReqAmt() {
        return reqAmt;
    }

    public void setReqAmt(BigDecimal reqAmt) {
        this.reqAmt = reqAmt;
    }

    public String getReqBy() {
        return reqBy;
    }

    public void setReqBy(String reqBy) {
        this.reqBy = reqBy == null ? null : reqBy.trim();
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public Long getOfferBatDtlId() {
        return offerBatDtlId;
    }

    public void setOfferBatDtlId(Long offerBatDtlId) {
        this.offerBatDtlId = offerBatDtlId;
    }

    public String getRpayType() {
        return rpayType;
    }

    public void setRpayType(String rpayType) {
        this.rpayType = rpayType == null ? null : rpayType.trim();
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

}