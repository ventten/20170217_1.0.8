package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 应收款项表,LF_RECIV
 * */
public class LfReciv extends BaseModel{

    public static final String STATUS_UNPAID = "UNPAID";                //状态-未还
    public static final String STATUS_PAID = "PAID";                    //状态-还清
    public static final String STATUS_PARTIAL_PAID = "PARTIAL_PAID";    //状态-部分还

    private Long id;                    //记录ID
    private Long cntrctId;              //合同ID
    private Long applId;                //借款申请ID
    private Long paymentId;             //放款ID
    private Integer periodNum;          //期数
    private BigDecimal ttlRecivAmt;     //该期总应收款
    private BigDecimal ttlActualAmt;    //总实收款
    private BigDecimal ttlWaivedAmt;    //总减免金额
    private Date actualRpmntDate;       //实际还款日期
    private String isOverdue;           //是否逾期
    private String isAdvClear;          //是否提前结清
    private Date startDate;             //起息日期
    private Date endDate;               //结息日期
    private Date rpmntDate;             //应还日期
    private Date maxRpmntDate;          //最大应还日期
    private Integer failCollectNum;     //代扣失败次数
    private Date reCollectDate;         //重扣日期
    private BigDecimal reCollectAmt;    //重扣金额
    private Date lastCalcTime;          //最后一次计算时间
    private String status;              //还款状态.UNPAID (未还), PAID (已还), FAILED (失败),PARTIAL_PAID(部分还)
    private String reCollectIsAdvClear; //是否再扣提前结清
    private String isDeleted;           //是否被删除:Y-已删除、N-未删除
    private BigDecimal returnAmt;       //返还金额

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

    public BigDecimal getTtlRecivAmt() {
        if(ttlRecivAmt == null){
            ttlRecivAmt = BigDecimal.ZERO;
        }
        return ttlRecivAmt;
    }

    public void setTtlRecivAmt(BigDecimal ttlRecivAmt) {
        this.ttlRecivAmt = ttlRecivAmt;
    }

    public BigDecimal getTtlActualAmt() {
        if(ttlActualAmt == null){
            ttlActualAmt = BigDecimal.ZERO;
        }
        return ttlActualAmt;
    }

    public void setTtlActualAmt(BigDecimal ttlActualAmt) {
        this.ttlActualAmt = ttlActualAmt;
    }

    public BigDecimal getTtlWaivedAmt() {
        if(ttlWaivedAmt == null){
            ttlWaivedAmt = BigDecimal.ZERO;
        }
        return ttlWaivedAmt;
    }

    public void setTtlWaivedAmt(BigDecimal ttlWaivedAmt) {
        this.ttlWaivedAmt = ttlWaivedAmt;
    }

    public Date getActualRpmntDate() {
        return actualRpmntDate;
    }

    public void setActualRpmntDate(Date actualRpmntDate) {
        this.actualRpmntDate = actualRpmntDate;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue == null ? null : isOverdue.trim();
    }

    public String getIsAdvClear() {
        return isAdvClear;
    }

    public void setIsAdvClear(String isAdvClear) {
        this.isAdvClear = isAdvClear == null ? null : isAdvClear.trim();
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

    public Date getRpmntDate() {
        return rpmntDate;
    }

    public void setRpmntDate(Date rpmntDate) {
        this.rpmntDate = rpmntDate;
    }

    public Date getMaxRpmntDate() {
        return maxRpmntDate;
    }

    public void setMaxRpmntDate(Date maxRpmntDate) {
        this.maxRpmntDate = maxRpmntDate;
    }

    public Integer getFailCollectNum() {
        return failCollectNum;
    }

    public void setFailCollectNum(Integer failCollectNum) {
        this.failCollectNum = failCollectNum;
    }

    public Date getReCollectDate() {
        return reCollectDate;
    }

    public void setReCollectDate(Date reCollectDate) {
        this.reCollectDate = reCollectDate;
    }

    public BigDecimal getReCollectAmt() {
        return reCollectAmt;
    }

    public void setReCollectAmt(BigDecimal reCollectAmt) {
        this.reCollectAmt = reCollectAmt;
    }

    public Date getLastCalcTime() {
        return lastCalcTime;
    }

    public void setLastCalcTime(Date lastCalcTime) {
        this.lastCalcTime = lastCalcTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getReCollectIsAdvClear() {
        return reCollectIsAdvClear;
    }

    public void setReCollectIsAdvClear(String reCollectIsAdvClear) {
        this.reCollectIsAdvClear = reCollectIsAdvClear == null ? null : reCollectIsAdvClear.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public BigDecimal getReturnAmt() {
        return returnAmt;
    }

    public void setReturnAmt(BigDecimal returnAmt) {
        this.returnAmt = returnAmt;
    }

}