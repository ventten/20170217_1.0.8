// default package
// Generated 2013-4-3 17:40:31 by Hibernate Tools 4.0.0
package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.*;


/**
 * 贷款申请信息表 表实体  LN_APPL_INFO
 */
public class ApplicationInfo {

    private Long id;
    private Long workflowId;
    private String siteCode;
    private String handleSiteCode;
    private String inputSiteCode;
    private String salesUser;  //客户经理
    private Long productId;
    private String productNo;
    private String applicationCode;
    private String inputtedBy;
    private BigDecimal applicationAmount;
    private Integer loanPeriod;
    private String loanPurpose;
    private String paymentType;
    private String customerSource;
    private Date applicationDate;
    private String loanType;  //贷款类别
    private BigDecimal interestRate;
    private BigDecimal renewPenaltyRate;
    private Long renewApplId;
    private String situation;
    private String channel;
    private Long salesOrgId;
    private Boolean isReviewed = false;
    private String reviewedBy;
    private Date reviewTime;
    private Long chargeSchemaId;
    private String feeMode = "NORMAL";
    private Boolean isJxlFlag = false;
    private String btzCateCory; //业务类型。(NORMAL,WHOLE),标准，趸缴
    private Long custAttributionId;
    private Integer loanDay;
    private Boolean adjustRepaymentDate = true;
    private String externalCode;
    private String creditAuzMode;
    private String creditAuzStatus;
    private String creditAuzStatus2;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getWorkflowId() {
		return workflowId;
	}
	public void setWorkflowId(Long workflowId) {
		this.workflowId = workflowId;
	}
	public String getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getHandleSiteCode() {
		return handleSiteCode;
	}
	public void setHandleSiteCode(String handleSiteCode) {
		this.handleSiteCode = handleSiteCode;
	}
	public String getInputSiteCode() {
		return inputSiteCode;
	}
	public void setInputSiteCode(String inputSiteCode) {
		this.inputSiteCode = inputSiteCode;
	}
	public String getSalesUser() {
		return salesUser;
	}
	public void setSalesUser(String salesUser) {
		this.salesUser = salesUser;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getApplicationCode() {
		return applicationCode;
	}
	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}
	public String getInputtedBy() {
		return inputtedBy;
	}
	public void setInputtedBy(String inputtedBy) {
		this.inputtedBy = inputtedBy;
	}
	public BigDecimal getApplicationAmount() {
		return applicationAmount;
	}
	public void setApplicationAmount(BigDecimal applicationAmount) {
		this.applicationAmount = applicationAmount;
	}
	public Integer getLoanPeriod() {
		return loanPeriod;
	}
	public void setLoanPeriod(Integer loanPeriod) {
		this.loanPeriod = loanPeriod;
	}
	public String getLoanPurpose() {
		return loanPurpose;
	}
	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getCustomerSource() {
		return customerSource;
	}
	public void setCustomerSource(String customerSource) {
		this.customerSource = customerSource;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	public BigDecimal getRenewPenaltyRate() {
		return renewPenaltyRate;
	}
	public void setRenewPenaltyRate(BigDecimal renewPenaltyRate) {
		this.renewPenaltyRate = renewPenaltyRate;
	}
	public Long getRenewApplId() {
		return renewApplId;
	}
	public void setRenewApplId(Long renewApplId) {
		this.renewApplId = renewApplId;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Long getSalesOrgId() {
		return salesOrgId;
	}
	public void setSalesOrgId(Long salesOrgId) {
		this.salesOrgId = salesOrgId;
	}
	public Boolean getIsReviewed() {
		return isReviewed;
	}
	public void setIsReviewed(Boolean isReviewed) {
		this.isReviewed = isReviewed;
	}
	public String getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}
	public Date getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}
	public Long getChargeSchemaId() {
		return chargeSchemaId;
	}
	public void setChargeSchemaId(Long chargeSchemaId) {
		this.chargeSchemaId = chargeSchemaId;
	}
	public String getFeeMode() {
		return feeMode;
	}
	public void setFeeMode(String feeMode) {
		this.feeMode = feeMode;
	}
	public Boolean getIsJxlFlag() {
		return isJxlFlag;
	}
	public void setIsJxlFlag(Boolean isJxlFlag) {
		this.isJxlFlag = isJxlFlag;
	}
	public String getBtzCateCory() {
		return btzCateCory;
	}
	public void setBtzCateCory(String btzCateCory) {
		this.btzCateCory = btzCateCory;
	}
	public Long getCustAttributionId() {
		return custAttributionId;
	}
	public void setCustAttributionId(Long custAttributionId) {
		this.custAttributionId = custAttributionId;
	}
	public Integer getLoanDay() {
		return loanDay;
	}
	public void setLoanDay(Integer loanDay) {
		this.loanDay = loanDay;
	}
	public Boolean getAdjustRepaymentDate() {
		return adjustRepaymentDate;
	}
	public void setAdjustRepaymentDate(Boolean adjustRepaymentDate) {
		this.adjustRepaymentDate = adjustRepaymentDate;
	}
	public String getExternalCode() {
		return externalCode;
	}
	public void setExternalCode(String externalCode) {
		this.externalCode = externalCode;
	}
	public String getCreditAuzMode() {
		return creditAuzMode;
	}
	public void setCreditAuzMode(String creditAuzMode) {
		this.creditAuzMode = creditAuzMode;
	}
	public String getCreditAuzStatus() {
		return creditAuzStatus;
	}
	public void setCreditAuzStatus(String creditAuzStatus) {
		this.creditAuzStatus = creditAuzStatus;
	}
	public String getCreditAuzStatus2() {
		return creditAuzStatus2;
	}
	public void setCreditAuzStatus2(String creditAuzStatus2) {
		this.creditAuzStatus2 = creditAuzStatus2;
	}

   
}
