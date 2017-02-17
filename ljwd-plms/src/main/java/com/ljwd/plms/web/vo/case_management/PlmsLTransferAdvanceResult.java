package com.ljwd.plms.web.vo.case_management;

import java.math.BigDecimal;
import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;

public class PlmsLTransferAdvanceResult extends PageRowNo{

	private Long id;
	
	private Long applId;
	
	private Long paymentId;
	//合同编号
    private String cntrctNo;
    //主贷人
    private String custName; 
    //货款金额
    private BigDecimal loanAmt;
    //移交时的逾期天数
    private Long overdueDays;
    //移交类型
    private String transfertype;
    //移交原因
    private String transferreason;
    //申请人
    private String applicant;
   // 申请移交时案件所属区间
    private String circustatus;
    //申请移交时案件所属名称
    private String circuStatusName;
    //申请日期
    private Date applydate;
    //状态
    private String status;
   //最早逾期期数
    private Integer overduePeriod;   
    
    private String refusalReason;           //拒绝原因 REFUSAL_REASON

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
	public BigDecimal getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(BigDecimal loanAmt) {
		this.loanAmt = loanAmt;
	}
	public Long getOverdueDays() {
		return overdueDays;
	}
	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
	}
	public String getTransfertype() {
		return transfertype;
	}
	public void setTransfertype(String transfertype) {
		this.transfertype = transfertype;
	}
	public String getTransferreason() {
		return transferreason;
	}
	public void setTransferreason(String transferreason) {
		this.transferreason = transferreason;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getCircustatus() {
		return circustatus;
	}
	public void setCircustatus(String circustatus) {
		this.circustatus = circustatus;
	}
	public String getCircuStatusName() {
		return circuStatusName;
	}
	public void setCircuStatusName(String circuStatusName) {
		this.circuStatusName = circuStatusName;
	}
	public Date getApplydate() {
		return applydate;
	}
	public void setApplydate(Date applydate) {
		this.applydate = applydate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getOverduePeriod() {
		return overduePeriod;
	}
	public void setOverduePeriod(Integer overduePeriod) {
		this.overduePeriod = overduePeriod;
	}
	public String getRefusalReason() {
		return refusalReason;
	}
	public void setRefusalReason(String refusalReason) {
		this.refusalReason = refusalReason;
	}
	
	
    
    
}
