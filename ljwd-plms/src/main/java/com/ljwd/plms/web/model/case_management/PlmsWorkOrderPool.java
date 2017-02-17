package com.ljwd.plms.web.model.case_management;

import com.ljwd.plms.web.model.ActiveModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 工单池(案件)表,PLMS_WORK_ORDER_POOL
 * */
public class PlmsWorkOrderPool extends ActiveModel {

    private Long id;                        //记录ID
    private Long paymentId;                 //放款记录ID
    private Long applId;                    //贷款申请单记录ID
    private String prdNo;                   //产品编号
    private String cntrctNo;                //合同编号
    private String custName;                //主贷人
    private String docno;                   //身份证号
    private BigDecimal loanAmt;             //货款金额
    private String status;                  //对应区间的状态值
    private String bizCategory;             //业务类型
    private String siteCode;	            //所属网点
    private String remark;                  //备注

    //ext
    private String circuRuleCode;           //对应流转规则CODE

    public String getCircuRuleCode() {
        return circuRuleCode;
    }

    public void setCircuRuleCode(String circuRuleCode) {
        this.circuRuleCode = circuRuleCode;
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo == null ? null : prdNo.trim();
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo == null ? null : cntrctNo.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno == null ? null : docno.trim();
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getBizCategory() {
		return bizCategory;
	}

	public void setBizCategory(String bizCategory) {
		this.bizCategory = bizCategory;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	
    
}