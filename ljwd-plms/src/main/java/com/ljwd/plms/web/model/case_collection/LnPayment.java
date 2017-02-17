package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 付款申请单信息,用于记录付款申请单信息,LN_PAYMENT
 * */
public class LnPayment extends BaseModel{

    private Long id;                    //记录ID
    private Long applId;                //贷款申请单记录ID,贷款申请单信息表的记录ID
    private Long cntrctId;              //合同记录ID
    private String loanNo;              //贷款号
    private Date payDate;               //放款日期(LOANDATE)
    private Date startDate;             //起息日期
    private Date endDate;               //到期日期
    private Integer settleDay;          //结算日
    private BigDecimal payAmt;          //放款金额
    private BigDecimal actualPayAmt;    //实际放款金额
    private BigDecimal delayPayDateFee; //延后还款日期费用
    private String isPaid;              //放款状态,0-未放款 1-已放款,默认为0
    private String checkByPhone;        //电核: Y:符合, N:不符合
    private String remark;              //备注
    private String isWriteOff;          //是否核销
    private BigDecimal renewAmt;        //续贷提前还清金额
    private String isAdvClear;          //是否提前结清
    private Date clearDate;             //结清日期
    private Integer clearPeriod;        //结清日期所在期数.最大为贷款期数
    private BigDecimal returnAmt;       //返还金额

    //join-ext
    private String cntrctNo;            //合同编号

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

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

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getSettleDay() {
        return settleDay;
    }

    public void setSettleDay(Integer settleDay) {
        this.settleDay = settleDay;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public BigDecimal getActualPayAmt() {
        return actualPayAmt;
    }

    public void setActualPayAmt(BigDecimal actualPayAmt) {
        this.actualPayAmt = actualPayAmt;
    }

    public BigDecimal getDelayPayDateFee() {
        return delayPayDateFee;
    }

    public void setDelayPayDateFee(BigDecimal delayPayDateFee) {
        this.delayPayDateFee = delayPayDateFee;
    }

    public String getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid == null ? null : isPaid.trim();
    }

    public String getCheckByPhone() {
        return checkByPhone;
    }

    public void setCheckByPhone(String checkByPhone) {
        this.checkByPhone = checkByPhone == null ? null : checkByPhone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIsWriteOff() {
        return isWriteOff;
    }

    public void setIsWriteOff(String isWriteOff) {
        this.isWriteOff = isWriteOff;
    }

    public BigDecimal getRenewAmt() {
        return renewAmt;
    }

    public void setRenewAmt(BigDecimal renewAmt) {
        this.renewAmt = renewAmt;
    }

    public String getIsAdvClear() {
        return isAdvClear;
    }

    public void setIsAdvClear(String isAdvClear) {
        this.isAdvClear = isAdvClear;
    }

    public Date getClearDate() {
        return clearDate;
    }

    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    public Integer getClearPeriod() {
        return clearPeriod;
    }

    public void setClearPeriod(Integer clearPeriod) {
        this.clearPeriod = clearPeriod;
    }

    public BigDecimal getReturnAmt() {
        return returnAmt;
    }

    public void setReturnAmt(BigDecimal returnAmt) {
        this.returnAmt = returnAmt;
    }

}