package com.ljwd.plms.web.model.report;

import java.math.BigDecimal;
import java.util.Date;

import com.ljwd.plms.web.model.BaseModel;
/**
 * 贷款收回信息，用于记录贷款收回信息
 * LF_RPMNT
 * @author pangshanxing
 * @date 2016年12月20日下午4:36:15
 */
public class LfRpmnt extends BaseModel{
    
	private Long id;  

    private Long paymentId; //放款记录ID

    private Long applId;	//贷款申请记录ID

    private Long cntrctId;	//合同记录ID

    private String rpmntMthd;//交易方式,1现金，2银行转账，3自动代扣

    private Long offerReplyDtlId;//代扣记录id

    private Date txDate;	//还款日期

    private BigDecimal txAmt;//交易金额

    private BigDecimal postAmt;//入帐金额

    private BigDecimal refundAmt;//退款金额

    private Date depositeDate;	//到账日期

    private String status;	//状态. ADDED(有效)，REVERSED(冲销)

    private String inputBy;	//录入人FILLMAN

    private Date inputTime;	//录入时间

    private String reversedBy;//reverse action user

    private Date reverseTime;	//reverse timestamp

    private String reverseReason;//reverse reason

    private Long renewPaymentId;	//续贷提前结清相关PaymentId

    private Long refundRpmntId;		//退款记录对应的实收记录ID

    private String refundBy;	 //refund action user

    private Date refundTime;	//refund timestamp

    private String refundReason;	//refund reason

    private String isLock;		//锁帐
    
    private String remark; 		//备注

    private Long adjustWaiveReqId;	//调账对应的豁免申请id
    
    private String isWriteOff;		//是否是冲销相关的记录
    
    private Long originRpmntId;		//对应冲销哪条回款记录。
    
    private	Long bankAcId;			//银行账号
    
    private	Long refundBankAcId;	//退款银行账号
    
    private	String postType;		//入账类型.(NORMAL, SYS_CANCEL_POST, USER_CANCEL_POST, SUSPEND)
    

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

	public Long getCntrctId() {
		return cntrctId;
	}

	public void setCntrctId(Long cntrctId) {
		this.cntrctId = cntrctId;
	}

	public String getRpmntMthd() {
		return rpmntMthd;
	}

	public void setRpmntMthd(String rpmntMthd) {
		this.rpmntMthd = rpmntMthd;
	}

	public Long getOfferReplyDtlId() {
		return offerReplyDtlId;
	}

	public void setOfferReplyDtlId(Long offerReplyDtlId) {
		this.offerReplyDtlId = offerReplyDtlId;
	}

	public Date getTxDate() {
		return txDate;
	}

	public void setTxDate(Date txDate) {
		this.txDate = txDate;
	}

	public BigDecimal getTxAmt() {
		return txAmt;
	}

	public void setTxAmt(BigDecimal txAmt) {
		this.txAmt = txAmt;
	}

	public BigDecimal getPostAmt() {
		return postAmt;
	}

	public void setPostAmt(BigDecimal postAmt) {
		this.postAmt = postAmt;
	}

	public BigDecimal getRefundAmt() {
		return refundAmt;
	}

	public void setRefundAmt(BigDecimal refundAmt) {
		this.refundAmt = refundAmt;
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

	public Long getRenewPaymentId() {
		return renewPaymentId;
	}

	public void setRenewPaymentId(Long renewPaymentId) {
		this.renewPaymentId = renewPaymentId;
	}

	public Long getRefundRpmntId() {
		return refundRpmntId;
	}

	public void setRefundRpmntId(Long refundRpmntId) {
		this.refundRpmntId = refundRpmntId;
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

	public String getIsLock() {
		return isLock;
	}

	public void setIsLock(String isLock) {
		this.isLock = isLock;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getAdjustWaiveReqId() {
		return adjustWaiveReqId;
	}

	public void setAdjustWaiveReqId(Long adjustWaiveReqId) {
		this.adjustWaiveReqId = adjustWaiveReqId;
	}

	public String getIsWriteOff() {
		return isWriteOff;
	}

	public void setIsWriteOff(String isWriteOff) {
		this.isWriteOff = isWriteOff;
	}

	public Long getOriginRpmntId() {
		return originRpmntId;
	}

	public void setOriginRpmntId(Long originRpmntId) {
		this.originRpmntId = originRpmntId;
	}

	public Long getBankAcId() {
		return bankAcId;
	}

	public void setBankAcId(Long bankAcId) {
		this.bankAcId = bankAcId;
	}

	public Long getRefundBankAcId() {
		return refundBankAcId;
	}

	public void setRefundBankAcId(Long refundBankAcId) {
		this.refundBankAcId = refundBankAcId;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}
	
    
}