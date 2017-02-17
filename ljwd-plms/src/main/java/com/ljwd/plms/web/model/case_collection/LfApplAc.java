package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 合同概要表,LF_APPL_AC
 * */
public class LfApplAc extends BaseModel{

    private Long paymentId;                         //放款记录ID
    private Long applId;                            //贷款申请记录ID
    private Long cntrctId;                          //合同记录ID
    private String locked;                          //locked caused by offer.
    private Integer outsrcCnt;                      //外包次数
    private BigDecimal repaidPrincipal;             //已还本金
    private Date lastRpmntDate;                     //最后还款时间
    private BigDecimal lastRpmntAmt;                //最后还款金额
    private Date calcDate;                          //
    private String isOverdue;                       //是否逾期
    private BigDecimal ttlRecivAmt;                 //总应收款
    private Integer overdueDays;                    //逾期天数
    private Long minRecivPeriod;                    //应还未还最小期次
    private Integer currentRecivPeriod;             //CALC_DATE所处的期次
    private String remark;                          //
    private Integer lockPhase;                      //locked phase：0 -> not locked, 1 -> principal + interest, 2 -> others, 3 -> all

    //join-ext
    private String cntrctNo;                        //合同编号
    private String wfStatus;                        //贷款状态

    public LfApplAc() {

    }

    public LfApplAc(BaseModel base) {
        setCreatedBy(base.getCreatedBy());
        setCreateTime(base.getCreateTime());
        setUpdatedBy(base.getUpdatedBy());
        setUpdateTime(base.getUpdateTime());
        setRecVer(base.getRecVer());
        setTagSeq(base.getTagSeq());
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
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

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    public Integer getOutsrcCnt() {
        return outsrcCnt;
    }

    public void setOutsrcCnt(Integer outsrcCnt) {
        this.outsrcCnt = outsrcCnt;
    }

    public BigDecimal getRepaidPrincipal() {
        return repaidPrincipal;
    }

    public void setRepaidPrincipal(BigDecimal repaidPrincipal) {
        this.repaidPrincipal = repaidPrincipal;
    }

    public Date getLastRpmntDate() {
        return lastRpmntDate;
    }

    public void setLastRpmntDate(Date lastRpmntDate) {
        this.lastRpmntDate = lastRpmntDate;
    }

    public BigDecimal getLastRpmntAmt() {
        return lastRpmntAmt;
    }

    public void setLastRpmntAmt(BigDecimal lastRpmntAmt) {
        this.lastRpmntAmt = lastRpmntAmt;
    }

    public Date getCalcDate() {
        return calcDate;
    }

    public void setCalcDate(Date calcDate) {
        this.calcDate = calcDate;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }

    public BigDecimal getTtlRecivAmt() {
        return ttlRecivAmt;
    }

    public void setTtlRecivAmt(BigDecimal ttlRecivAmt) {
        this.ttlRecivAmt = ttlRecivAmt;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Long getMinRecivPeriod() {
        return minRecivPeriod;
    }

    public void setMinRecivPeriod(Long minRecivPeriod) {
        this.minRecivPeriod = minRecivPeriod;
    }

    public Integer getCurrentRecivPeriod() {
        return currentRecivPeriod;
    }

    public void setCurrentRecivPeriod(Integer currentRecivPeriod) {
        this.currentRecivPeriod = currentRecivPeriod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getLockPhase() {
        return lockPhase;
    }

    public void setLockPhase(Integer lockPhase) {
        this.lockPhase = lockPhase;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(String wfStatus) {
        this.wfStatus = wfStatus;
    }

}