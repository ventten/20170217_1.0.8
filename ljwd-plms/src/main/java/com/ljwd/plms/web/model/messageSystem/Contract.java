package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {
	
	    private Long id; //记录ID,唯一,由序列Seq_Contract_ID产生
	    private Long applicationInfoId; //贷款申请单记录ID
	    private String contractNo; //合同编号
	    private BigDecimal loanAmount; //贷款金额
	    private Integer loanPeriod;  //贷款期数.old:loantime
	    private BigDecimal interestRate;  //贷款月利率
	    private String contractStatus;  //合同状态,
	    private Date signTime;  //签约时间
	    private String signUser;  //签约人
	    private Date appointTime;  //预约时间
	    private String appointNote;  //预约事项
	    private String appointedBy;  //预约人.
	    private Long contractSn;  //合同流水号，生成合同时需要。
	    private String siteCode;  //签约网点
	    private String remark;  //备注
	    private Integer loanDay;  //贷款天数
	    private Integer delayDay = 0; //延期天数
	    private BigDecimal approvalAmount; //审批金额
	    private Boolean isSignal = false; //是否电子签章
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getApplicationInfoId() {
			return applicationInfoId;
		}
		public void setApplicationInfoId(Long applicationInfoId) {
			this.applicationInfoId = applicationInfoId;
		}
		public String getContractNo() {
			return contractNo;
		}
		public void setContractNo(String contractNo) {
			this.contractNo = contractNo;
		}
		public BigDecimal getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(BigDecimal loanAmount) {
			this.loanAmount = loanAmount;
		}
		public Integer getLoanPeriod() {
			return loanPeriod;
		}
		public void setLoanPeriod(Integer loanPeriod) {
			this.loanPeriod = loanPeriod;
		}
		public BigDecimal getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(BigDecimal interestRate) {
			this.interestRate = interestRate;
		}
		public String getContractStatus() {
			return contractStatus;
		}
		public void setContractStatus(String contractStatus) {
			this.contractStatus = contractStatus;
		}
		public Date getSignTime() {
			return signTime;
		}
		public void setSignTime(Date signTime) {
			this.signTime = signTime;
		}
		public String getSignUser() {
			return signUser;
		}
		public void setSignUser(String signUser) {
			this.signUser = signUser;
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
			this.appointNote = appointNote;
		}
		public String getAppointedBy() {
			return appointedBy;
		}
		public void setAppointedBy(String appointedBy) {
			this.appointedBy = appointedBy;
		}
		public Long getContractSn() {
			return contractSn;
		}
		public void setContractSn(Long contractSn) {
			this.contractSn = contractSn;
		}
		public String getSiteCode() {
			return siteCode;
		}
		public void setSiteCode(String siteCode) {
			this.siteCode = siteCode;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public Integer getLoanDay() {
			return loanDay;
		}
		public void setLoanDay(Integer loanDay) {
			this.loanDay = loanDay;
		}
		public Integer getDelayDay() {
			return delayDay;
		}
		public void setDelayDay(Integer delayDay) {
			this.delayDay = delayDay;
		}
		public BigDecimal getApprovalAmount() {
			return approvalAmount;
		}
		public void setApprovalAmount(BigDecimal approvalAmount) {
			this.approvalAmount = approvalAmount;
		}
		public Boolean getIsSignal() {
			return isSignal;
		}
		public void setIsSignal(Boolean isSignal) {
			this.isSignal = isSignal;
		}
	    
	    
}
