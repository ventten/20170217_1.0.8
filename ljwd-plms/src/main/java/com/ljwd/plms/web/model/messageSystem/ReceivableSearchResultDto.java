package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceivableSearchResultDto {

	 private Long receivableId;
	    private Long contractId;
	    private Long applicationId;
	    private Long paymentId;
	    private Long repaymentPlanId;
	    private Integer periodNumber; 
	    private BigDecimal totalReceivableAmount;
	    private BigDecimal totalActualAmount;
	    private BigDecimal totalWaivedAmount;
	    private Date actualRepaymentDate;
	    private Boolean isOverdue;
	    private Date startDate;
	    private Date endDate;
	    private Integer failCollectNumber;
	    private Date reCollectDate;
	    private Date lastCalcTime;
	    private RepaymentStatus status;
	    
	    private String contractNo;
	    private BigDecimal loanAmount;
	    private Date repaymentDate;
	    private Date maxRepaymentDate;
	    private Date payDate;
	    private String clientName;
	    private String idCardNo;
	    private Integer overdueDays;
	    
	    private BigDecimal repaymentPostAmount;
	    
	    private List<ReceivableDetailDto> receivableDetails = new ArrayList<ReceivableDetailDto>();
	    private BusinessCategory businessCategory;
	    
	    /**
	     * @return the receivableId
	     */
	    public Long getReceivableId() {
	        return receivableId;
	    }

	    /**
	     * @param receivableId the receivableId to set
	     */
	    public void setReceivableId(Long receivableId) {
	        this.receivableId = receivableId;
	    }

	    /**
	     * @return the contractId
	     */
	    public Long getContractId() {
	        return contractId;
	    }

	    /**
	     * @param contractId the contractId to set
	     */
	    public void setContractId(Long contractId) {
	        this.contractId = contractId;
	    }

	    /**
	     * @return the applicationId
	     */
	    public Long getApplicationId() {
	        return applicationId;
	    }

	    /**
	     * @param applicationId the applicationId to set
	     */
	    public void setApplicationId(Long applicationId) {
	        this.applicationId = applicationId;
	    }

	    /**
	     * @return the paymentId
	     */
	    public Long getPaymentId() {
	        return paymentId;
	    }

	    /**
	     * @param paymentId the paymentId to set
	     */
	    public void setPaymentId(Long paymentId) {
	        this.paymentId = paymentId;
	    }

	    /**
	     * @return the repaymentPlanId
	     */
	    public Long getRepaymentPlanId() {
	        return repaymentPlanId;
	    }

	    /**
	     * @param repaymentPlanId the repaymentPlanId to set
	     */
	    public void setRepaymentPlanId(Long repaymentPlanId) {
	        this.repaymentPlanId = repaymentPlanId;
	    }

	    /**
	     * @return the periodNumber
	     */
	    public Integer getPeriodNumber() {
	        return periodNumber;
	    }

	    /**
	     * @param periodNumber the periodNumber to set
	     */
	    public void setPeriodNumber(Integer periodNumber) {
	        this.periodNumber = periodNumber;
	    }

	    /**
	     * @return the totalReceivableAmount
	     */
	    public BigDecimal getTotalReceivableAmount() {
	        return totalReceivableAmount;
	    }

	    /**
	     * @param totalReceivableAmount the totalReceivableAmount to set
	     */
	    public void setTotalReceivableAmount(BigDecimal totalReceivableAmount) {
	        this.totalReceivableAmount = totalReceivableAmount;
	    }

	    /**
	     * @return the totalActualAmount
	     */
	    public BigDecimal getTotalActualAmount() {
	        return totalActualAmount;
	    }

	    /**
	     * @param totalActualAmount the totalActualAmount to set
	     */
	    public void setTotalActualAmount(BigDecimal totalActualAmount) {
	        this.totalActualAmount = totalActualAmount;
	    }

	    /**
	     * @return the totalWaivedAmount
	     */
	    public BigDecimal getTotalWaivedAmount() {
	        return totalWaivedAmount;
	    }

	    /**
	     * @param totalWaivedAmount the totalWaivedAmount to set
	     */
	    public void setTotalWaivedAmount(BigDecimal totalWaivedAmount) {
	        this.totalWaivedAmount = totalWaivedAmount;
	    }

	    /**
	     * @return the actualRepaymentDate
	     */
	    public Date getActualRepaymentDate() {
	        return actualRepaymentDate;
	    }

	    /**
	     * @param actualRepaymentDate the actualRepaymentDate to set
	     */
	    public void setActualRepaymentDate(Date actualRepaymentDate) {
	        this.actualRepaymentDate = actualRepaymentDate;
	    }

	    /**
	     * @return the isOverdue
	     */
	    public Boolean getIsOverdue() {
	        return isOverdue;
	    }

	    /**
	     * @param isOverdue the isOverdue to set
	     */
	    public void setIsOverdue(Boolean isOverdue) {
	        this.isOverdue = isOverdue;
	    }

	    /**
	     * @return the startDate
	     */
	    public Date getStartDate() {
	        return startDate;
	    }

	    /**
	     * @param startDate the startDate to set
	     */
	    public void setStartDate(Date startDate) {
	        this.startDate = startDate;
	    }

	    /**
	     * @return the endDate
	     */
	    public Date getEndDate() {
	        return endDate;
	    }

	    /**
	     * @param endDate the endDate to set
	     */
	    public void setEndDate(Date endDate) {
	        this.endDate = endDate;
	    }

	    /**
	     * @return the failCollectNumber
	     */
	    public Integer getFailCollectNumber() {
	        return failCollectNumber;
	    }

	    /**
	     * @param failCollectNumber the failCollectNumber to set
	     */
	    public void setFailCollectNumber(Integer failCollectNumber) {
	        this.failCollectNumber = failCollectNumber;
	    }

	    /**
	     * @return the reCollectDate
	     */
	    public Date getReCollectDate() {
	        return reCollectDate;
	    }

	    /**
	     * @param reCollectDate the reCollectDate to set
	     */
	    public void setReCollectDate(Date reCollectDate) {
	        this.reCollectDate = reCollectDate;
	    }

	    /**
	     * @return the lastCalcTime
	     */
	    public Date getLastCalcTime() {
	        return lastCalcTime;
	    }

	    /**
	     * @param lastCalcTime the lastCalcTime to set
	     */
	    public void setLastCalcTime(Date lastCalcTime) {
	        this.lastCalcTime = lastCalcTime;
	    }

	    /**
	     * @return the status
	     */
	    public RepaymentStatus getStatus() {
	        return status;
	    }

	    /**
	     * @param status the status to set
	     */
	    public void setStatus(RepaymentStatus status) {
	        this.status = status;
	    }

	    /**
	     * @return the contractNo
	     */
	    public String getContractNo() {
	        return contractNo;
	    }

	    /**
	     * @param contractNo the contractNo to set
	     */
	    public void setContractNo(String contractNo) {
	        this.contractNo = contractNo;
	    }

	    /**
	     * @return the loanAmount
	     */
	    public BigDecimal getLoanAmount() {
	        return loanAmount;
	    }

	    /**
	     * @param loanAmount the loanAmount to set
	     */
	    public void setLoanAmount(BigDecimal loanAmount) {
	        this.loanAmount = loanAmount;
	    }

	    /**
	     * @return the maxRepaymentDate
	     */
	    public Date getMaxRepaymentDate() {
	        return maxRepaymentDate;
	    }

	    /**
	     * @param maxRepaymentDate the maxRepaymentDate to set
	     */
	    public void setMaxRepaymentDate(Date maxRepaymentDate) {
	        this.maxRepaymentDate = maxRepaymentDate;
	    }

	    /**
	     * @return the payDate
	     */
	    public Date getPayDate() {
	        return payDate;
	    }

	    /**
	     * @param payDate the payDate to set
	     */
	    public void setPayDate(Date payDate) {
	        this.payDate = payDate;
	    }

	    /**
	     * @return the clientName
	     */
	    public String getClientName() {
	        return clientName;
	    }

	    /**
	     * @param clientName the clientName to set
	     */
	    public void setClientName(String clientName) {
	        this.clientName = clientName;
	    }

	    /**
	     * @return the idCardNo
	     */
	    public String getIdCardNo() {
	        return idCardNo;
	    }

	    /**
	     * @param idCardNo the idCardNo to set
	     */
	    public void setIdCardNo(String idCardNo) {
	        this.idCardNo = idCardNo;
	    }

	    /**
	     * @return the overdueDays
	     */
	    public Integer getOverdueDays() {
	        return overdueDays;
	    }

	    /**
	     * @param overdueDays the overdueDays to set
	     */
	    public void setOverdueDays(Integer overdueDays) {
	        this.overdueDays = overdueDays;
	    }

	    /**
	     * @return the receivableDetails
	     */
	    public List<ReceivableDetailDto> getReceivableDetails() {
	        return receivableDetails;
	    }

	    /**
	     * @param receivableDetails the receivableDetails to set
	     */
	    public void setReceivableDetails(List<ReceivableDetailDto> receivableDetails) {
	        this.receivableDetails = receivableDetails;
	    }

	    /**
	     * @return the repaymentDate
	     */
	    public Date getRepaymentDate() {
	        return repaymentDate;
	    }

	    /**
	     * @param repaymentDate the repaymentDate to set
	     */
	    public void setRepaymentDate(Date repaymentDate) {
	        this.repaymentDate = repaymentDate;
	    }
		public BigDecimal getRepaymentPostAmount() {
			return repaymentPostAmount;
		}
		public void setRepaymentPostAmount(BigDecimal repaymentPostAmount) {
			this.repaymentPostAmount = repaymentPostAmount;
		}

	    public BusinessCategory getBusinessCategory() {
	        return businessCategory;
	    }

	    public void setBusinessCategory(BusinessCategory businessCategory) {
	        this.businessCategory = businessCategory;
	    }       
}
