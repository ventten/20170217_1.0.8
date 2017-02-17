package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 银行费用明细,LF_RECIV_FEE_DTL
 * */
public class LfRecivFeeDtl extends BaseModel{

    private Long id;                        //记录ID
    private Long recivId;                   //应收ID
    private String ledgerCode;              //帐目代码
    private Date startDate;                 //
    private Date endDate;                   //
    private BigDecimal baseVal;             //计算基数, 如：逾期利息就是指剩余本金
    private BigDecimal rate;                //费率或一固定值
    private BigDecimal amt;                 //应收金额
    private Date calcTime;                  //计算时间
    private Long refId;                     //参考记录id, 对于逾期/外包催收， 引用lf_rpmnt.id
    private String remark;                  //备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecivId() {
        return recivId;
    }

    public void setRecivId(Long recivId) {
        this.recivId = recivId;
    }

    public String getLedgerCode() {
        return ledgerCode;
    }

    public void setLedgerCode(String ledgerCode) {
        this.ledgerCode = ledgerCode == null ? null : ledgerCode.trim();
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

    public BigDecimal getBaseVal() {
        return baseVal;
    }

    public void setBaseVal(BigDecimal baseVal) {
        this.baseVal = baseVal;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Date getCalcTime() {
        return calcTime;
    }

    public void setCalcTime(Date calcTime) {
        this.calcTime = calcTime;
    }

    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

}