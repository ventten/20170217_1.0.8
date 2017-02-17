package com.ljwd.plms.web.vo.outVisit;

import java.math.BigDecimal;
import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;

public class OutVisitAuditResult extends PageRowNo{

    private Long id;            //plms_ovm_out_visit_info的ID    
    
    private Long applId;        //贷款申请ID
    
    private Long paymentId;                     //paymentId
    
    private String paymentName;                 //渠道名

    private String cntrctNo;  //合同编号
    
    private String custName;  //主贷人

    private String docno; //身份证号 
    
    private String submitBy; //外访申请提交人
        
    private String submitOrgName; //所属机构名称
    
    private Date submitDate; //外访申请提交时间
        
    private String siteName; //签约网点名称
    
    private BigDecimal loanAmt;     //贷款金额	    

    private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)
    
    private String custTypeName; ///客户所属类别 
    
    private BigDecimal remainingPrincipal;     //剩余本金

    private Long overDays;     //逾期天数

    private String auditStatus; //审核状态
    
    private String auditStatusName; //审核状态名称
    
    private Date auditDate; //外访审核时间
    
    private Long auditedNum;   //历史审核通过次数

    private Long submitdNum;  //历史申请次数
    
    private String remark; //备注

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
		this.cntrctNo = cntrctNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getSubmitBy() {
		return submitBy;
	}

	public void setSubmitBy(String submitBy) {
		this.submitBy = submitBy;
	}

	
	public String getSubmitOrgName() {
		return submitOrgName;
	}

	public void setSubmitOrgName(String submitOrgName) {
		this.submitOrgName = submitOrgName;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}


	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public BigDecimal getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(BigDecimal loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public BigDecimal getRemainingPrincipal() {
		return remainingPrincipal;
	}

	public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
		this.remainingPrincipal = remainingPrincipal;
	}

	public Long getOverDays() {
		return overDays;
	}

	public void setOverDays(Long overDays) {
		this.overDays = overDays;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public Long getAuditedNum() {
		return auditedNum;
	}

	public void setAuditedNum(Long auditedNum) {
		this.auditedNum = auditedNum;
	}

	public Long getSubmitdNum() {
		return submitdNum;
	}

	public void setSubmitdNum(Long submitdNum) {
		this.submitdNum = submitdNum;
	}

	public String getDocno() {
		return docno;
	}

	public void setDocno(String docno) {
		this.docno = docno;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCustTypeName() {
		return custTypeName;
	}

	public void setCustTypeName(String custTypeName) {
		this.custTypeName = custTypeName;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public String getAuditStatusName() {
		return auditStatusName;
	}

	public void setAuditStatusName(String auditStatusName) {
		this.auditStatusName = auditStatusName;
	}
	
	
    

}
