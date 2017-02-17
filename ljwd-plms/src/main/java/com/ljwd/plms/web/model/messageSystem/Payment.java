package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.*;

/**
 * 
* @ClassName: Payment 
* @Description: TODO(付款申请单信息,用于记录付款申请单信息 LN_PAYMENT) 
* @author A18ccms a18ccms_gmail_com 
* @date 2016年9月7日 下午6:46:08 
*
 */
public class Payment implements java.io.Serializable {

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4935326662348950666L;
	private Long id; //记录ID
    private Long contractId; //合同记录ID
    private Long applicationInfoId; //贷款申请单记录ID,贷款申请单信息表的记录ID
    private String loanNo;  //贷款号
    private Date payDate;  //放款日期(LOANDATE)
    private Date startDate;  //起息日期
    private Date endDate;  //到期日期
    private Integer settleDay;  //结算日
    private Boolean isPaid = false;  //放款状态,0 未放款 1 已放款,默认为0 
    private Boolean isWriteOff = false;  //是否核销
    private Boolean isAdvanceClear = false;  //是否提前结清
    private Date clearDate;  //结清日期
    private BigDecimal payAmount;  //放款金额
    private BigDecimal actualPayAmount;  //实际放款金额
    private BigDecimal renewAmount = BigDecimal.ZERO;  //续贷提前还清金额
    private BigDecimal delayPayDateFee = BigDecimal.ZERO;  //延后还款日期费用
    private Boolean checkByPhone;  //电核: Y:符合, N:不符合
    private String remark;  //备注
    /**
     * 返还金额, 还款日期对应的计划期数的返回金额
     */
    private BigDecimal returnAmount = BigDecimal.ZERO;  //返还金额
    /**
     * 结清期数（结清日期所对应的期数）
     */
    private Integer cleanPeriod;  //结清日期所在期数.最大为贷款期数
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getContractId() {
		return contractId;
	}
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}
	public Long getApplicationInfoId() {
		return applicationInfoId;
	}
	public void setApplicationInfoId(Long applicationInfoId) {
		this.applicationInfoId = applicationInfoId;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
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
	public Integer getSettleDay() {
		return settleDay;
	}
	public void setSettleDay(Integer settleDay) {
		this.settleDay = settleDay;
	}
	public Boolean getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}
	public Boolean getIsWriteOff() {
		return isWriteOff;
	}
	public void setIsWriteOff(Boolean isWriteOff) {
		this.isWriteOff = isWriteOff;
	}
	public Boolean getIsAdvanceClear() {
		return isAdvanceClear;
	}
	public void setIsAdvanceClear(Boolean isAdvanceClear) {
		this.isAdvanceClear = isAdvanceClear;
	}
	public Date getClearDate() {
		return clearDate;
	}
	public void setClearDate(Date clearDate) {
		this.clearDate = clearDate;
	}
	public BigDecimal getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}
	public BigDecimal getActualPayAmount() {
		return actualPayAmount;
	}
	public void setActualPayAmount(BigDecimal actualPayAmount) {
		this.actualPayAmount = actualPayAmount;
	}
	public BigDecimal getRenewAmount() {
		return renewAmount;
	}
	public void setRenewAmount(BigDecimal renewAmount) {
		this.renewAmount = renewAmount;
	}
	public BigDecimal getDelayPayDateFee() {
		return delayPayDateFee;
	}
	public void setDelayPayDateFee(BigDecimal delayPayDateFee) {
		this.delayPayDateFee = delayPayDateFee;
	}
	public Boolean getCheckByPhone() {
		return checkByPhone;
	}
	public void setCheckByPhone(Boolean checkByPhone) {
		this.checkByPhone = checkByPhone;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public BigDecimal getReturnAmount() {
		return returnAmount;
	}
	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}
	public Integer getCleanPeriod() {
		return cleanPeriod;
	}
	public void setCleanPeriod(Integer cleanPeriod) {
		this.cleanPeriod = cleanPeriod;
	}

    
}
