package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 贷款还款计划信息,用于记录贷款还款计划信息,LN_RPMNT_PLAN
 * */
public class LnRpmntPlan extends BaseModel{

    private Long id;                        //记录ID
    private Long applId;                    //贷款申请单记录ID
    private Long paymentId;                 //放款记录ID
    private Integer periodNum;              //还款期数
    private Date startDate;                 //起息日期
    private Date endDate;                   //止息日期
    private Date maxRpmntDate;              //最大应还日期
    private Date rpmntDate;                 //还款日期
    private BigDecimal principal;           //还款本金
    private BigDecimal interest;            //还款利息
    private String status;                  //状态.UNREPAID, PARTIAL_REPAID, REPAID.old: 0未还，1部分未，2还清
    private Integer intDay;                 //计息天数
    private BigDecimal ttlAmt;              //还款总金额,本金，利息，费用
    private String isExtent;                //是否展期,0否,1是,默认为0
    private BigDecimal penalty;             //提前还款违约金
    private BigDecimal penaltyRate;         //提前还款违约金费率
    private BigDecimal remainPrincipal;     //剩余本金
    private BigDecimal clearAmt;            //提前还款总金额
    private BigDecimal intAdjust;           //利息调整值
    private BigDecimal actualPrincipal;     //实际本金。趸缴模式的实际本金是用放款金额计算得出
    private BigDecimal returnAmt;           //返还金额

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

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
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

    public Date getMaxRpmntDate() {
        return maxRpmntDate;
    }

    public void setMaxRpmntDate(Date maxRpmntDate) {
        this.maxRpmntDate = maxRpmntDate;
    }

    public Date getRpmntDate() {
        return rpmntDate;
    }

    public void setRpmntDate(Date rpmntDate) {
        this.rpmntDate = rpmntDate;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getIntDay() {
        return intDay;
    }

    public void setIntDay(Integer intDay) {
        this.intDay = intDay;
    }

    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    public void setTtlAmt(BigDecimal ttlAmt) {
        this.ttlAmt = ttlAmt;
    }

    public String getIsExtent() {
        return isExtent;
    }

    public void setIsExtent(String isExtent) {
        this.isExtent = isExtent == null ? null : isExtent.trim();
    }

    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    public BigDecimal getRemainPrincipal() {
        return remainPrincipal;
    }

    public void setRemainPrincipal(BigDecimal remainPrincipal) {
        this.remainPrincipal = remainPrincipal;
    }

    public BigDecimal getClearAmt() {
        return clearAmt;
    }

    public void setClearAmt(BigDecimal clearAmt) {
        this.clearAmt = clearAmt;
    }

    public BigDecimal getIntAdjust() {
        return intAdjust;
    }

    public void setIntAdjust(BigDecimal intAdjust) {
        this.intAdjust = intAdjust;
    }

    public BigDecimal getActualPrincipal() {
        return actualPrincipal;
    }

    public void setActualPrincipal(BigDecimal actualPrincipal) {
        this.actualPrincipal = actualPrincipal;
    }

    public BigDecimal getReturnAmt() {
        return returnAmt;
    }

    public void setReturnAmt(BigDecimal returnAmt) {
        this.returnAmt = returnAmt;
    }

}