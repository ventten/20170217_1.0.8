package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 合同信息,LN_CNTRCT
 * */
public class LnCntrct extends BaseModel{

    private Long id;                    //记录ID,由序列Seq_Contract_ID产生
    private Long applId;                //贷款申请单记录ID
    private String cntrctNo;            //合同编号
    private BigDecimal loanAmt;         //贷款金额
    private Integer loanPeriod;         //贷款期数.old:loantime
    private BigDecimal intRate;         //贷款月利率
    private String cntrctStatus;        //合同状态
    private String signUser;            //签约人
    private Date signTime;              //签约时间
    private Date appointTime;           //预约时间
    private String appointNote;         //预约事项
    private String appointedBy;         //预约人.
    private Long cntrctSn;              //合同流水号，生成合同时需要。
    private String siteCode;            //签约网点
    private String remark;              //备注
    private Integer delayDay;           //延期天数
    private BigDecimal apprAmt;         //审批金额
    private Integer loanDay;            //贷款天数
    private String isSignal;            //是否电子签章

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

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo == null ? null : cntrctNo.trim();
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public BigDecimal getIntRate() {
        return intRate;
    }

    public void setIntRate(BigDecimal intRate) {
        this.intRate = intRate;
    }

    public String getCntrctStatus() {
        return cntrctStatus;
    }

    public void setCntrctStatus(String cntrctStatus) {
        this.cntrctStatus = cntrctStatus == null ? null : cntrctStatus.trim();
    }

    public String getSignUser() {
        return signUser;
    }

    public void setSignUser(String signUser) {
        this.signUser = signUser == null ? null : signUser.trim();
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public String getAppointNote() {
        return appointNote;
    }

    public void setAppointNote(String appointNote) {
        this.appointNote = appointNote == null ? null : appointNote.trim();
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public void setAppointedBy(String appointedBy) {
        this.appointedBy = appointedBy == null ? null : appointedBy.trim();
    }

    public Long getCntrctSn() {
        return cntrctSn;
    }

    public void setCntrctSn(Long cntrctSn) {
        this.cntrctSn = cntrctSn;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDelayDay() {
        return delayDay;
    }

    public void setDelayDay(Integer delayDay) {
        this.delayDay = delayDay;
    }

    public BigDecimal getApprAmt() {
        return apprAmt;
    }

    public void setApprAmt(BigDecimal apprAmt) {
        this.apprAmt = apprAmt;
    }

    public Integer getLoanDay() {
        return loanDay;
    }

    public void setLoanDay(Integer loanDay) {
        this.loanDay = loanDay;
    }

    public String getIsSignal() {
        return isSignal;
    }

    public void setIsSignal(String isSignal) {
        this.isSignal = isSignal == null ? null : isSignal.trim();
    }

}