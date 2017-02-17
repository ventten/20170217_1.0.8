package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: Repayment 
* @Description: TODO(LF_RPMNT) 
* @author A18ccms a18ccms_gmail_com 
* @date 2016年9月8日 下午3:14:22 
*
 */
public class Repayment  {

    private Long id;

    private Long paymentId;  //PAYMENT_ID

    private Long refundRepaymentId;  //REFUND_RPMNT_ID

    private Long offerReplyDetailId;  //OFFER_REPLY_DTL_ID

    private Long applicationId;  //APPL_ID

    private Long contractId;  //CNTRCT_ID

    private Long contract;  //CNTRCT_ID

    private String repaymentMethod;  //RPMNT_MTHD

    private String inputBy;  //INPUT_BY

    private Date inputTime;  //INPUT_TIME

    private Date txDate;  //TX_DATE

    private BigDecimal txAmount ;  //TX_AMT

    private BigDecimal refundAmount ;  //REFUND_AMT

    private BigDecimal postAmount ;  //POST_AMT

    private Date depositeDate;  //DEPOSITE_DATE

    private String status ; //STATUS

    private String reversedBy; // REVERSED_BY

    private Date reverseTime;  //REVERSE_TIME

    private String reverseReason;  //REVERSE_REASON

    private String refundBy;  //REFUND_BY

    private Date refundTime;  //REFUND_TIME

    private String refundReason;  //REFUND_REASON


    private String remark;  //REMARK

    private Long renewPaymentId;  //RENEW_PAYMENT_ID

    private Boolean isLock;  //IS_LOCK

    private Long adjustWaiveRequestId;  //ADJUST_WAIVE_REQ_ID

    private Long originRepaymentId;  //ORIGIN_RPMNT_ID

    private Boolean isWriteOff;  //IS_WRITE_OFF

    private Long bankAccountId;  //BANK_AC_ID

    private Long bankAccount; //BANK_AC_ID

    private Long refundBankAccountId;  //REFUND_BANK_AC_ID

    private Long refundBankAccount;  //REFUND_BANK_AC_ID

    private String postType; //POST_TYPE

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

	public Long getRefundRepaymentId() {
		return refundRepaymentId;
	}

	public void setRefundRepaymentId(Long refundRepaymentId) {
		this.refundRepaymentId = refundRepaymentId;
	}


	public Long getOfferReplyDetailId() {
		return offerReplyDetailId;
	}

	public void setOfferReplyDetailId(Long offerReplyDetailId) {
		this.offerReplyDetailId = offerReplyDetailId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public Long getContract() {
		return contract;
	}

	public void setContract(Long contract) {
		this.contract = contract;
	}

	public String getRepaymentMethod() {
		return repaymentMethod;
	}

	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public String getInputBy() {
		return inputBy;
	}

	public void setInputBy(String inputBy) {
		this.inputBy = inputBy;
	}

	public Date getInputTime() {
		return inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	public Date getTxDate() {
		return txDate;
	}

	public void setTxDate(Date txDate) {
		this.txDate = txDate;
	}

	public BigDecimal getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(BigDecimal txAmount) {
		this.txAmount = txAmount;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public BigDecimal getPostAmount() {
		return postAmount;
	}

	public void setPostAmount(BigDecimal postAmount) {
		this.postAmount = postAmount;
	}

	public Date getDepositeDate() {
		return depositeDate;
	}

	public void setDepositeDate(Date depositeDate) {
		this.depositeDate = depositeDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReversedBy() {
		return reversedBy;
	}

	public void setReversedBy(String reversedBy) {
		this.reversedBy = reversedBy;
	}

	public Date getReverseTime() {
		return reverseTime;
	}

	public void setReverseTime(Date reverseTime) {
		this.reverseTime = reverseTime;
	}

	public String getReverseReason() {
		return reverseReason;
	}

	public void setReverseReason(String reverseReason) {
		this.reverseReason = reverseReason;
	}

	public String getRefundBy() {
		return refundBy;
	}

	public void setRefundBy(String refundBy) {
		this.refundBy = refundBy;
	}

	public Date getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getRefundReason() {
		return refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getRenewPaymentId() {
		return renewPaymentId;
	}

	public void setRenewPaymentId(Long renewPaymentId) {
		this.renewPaymentId = renewPaymentId;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Long getAdjustWaiveRequestId() {
		return adjustWaiveRequestId;
	}

	public void setAdjustWaiveRequestId(Long adjustWaiveRequestId) {
		this.adjustWaiveRequestId = adjustWaiveRequestId;
	}

	public Long getOriginRepaymentId() {
		return originRepaymentId;
	}

	public void setOriginRepaymentId(Long originRepaymentId) {
		this.originRepaymentId = originRepaymentId;
	}

	public Boolean getIsWriteOff() {
		return isWriteOff;
	}

	public void setIsWriteOff(Boolean isWriteOff) {
		this.isWriteOff = isWriteOff;
	}

	public Long getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public Long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(Long bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Long getRefundBankAccountId() {
		return refundBankAccountId;
	}

	public void setRefundBankAccountId(Long refundBankAccountId) {
		this.refundBankAccountId = refundBankAccountId;
	}

	public Long getRefundBankAccount() {
		return refundBankAccount;
	}

	public void setRefundBankAccount(Long refundBankAccount) {
		this.refundBankAccount = refundBankAccount;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}
    
    

}
