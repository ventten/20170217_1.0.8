package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 
* @ClassName: Receivable 
* @Description: TODO(LF_RECIV) 
* @author zhengjizhao
* @date 2016年9月8日 上午10:48:45 
*
 */
public class Receivable {

    private Long id;
    private Long paymentId;  //放款id
    private Long contractId;  //contract id
    private Long applicationId;  //application id
    private Integer periodNumber;  //期次
    private BigDecimal totalReceivableAmount = BigDecimal.ZERO;  //该期总应收款
    private BigDecimal totalActualAmount = BigDecimal.ZERO;  //总实收款
    private BigDecimal totalWaivedAmount = BigDecimal.ZERO;  //总减免金额
    private Date actualRepaymentDate;  //实际还款日期
    private Boolean isOverdue = false;  //是否逾期？
    private Date startDate;  //起息日期
    private Date endDate;  //结息日期
    private Date maxRepaymentDate;  //最大应还日期
    private Date repaymentDate;  //还款日期
    private Integer failCollectNumber = 0;  //代扣失败次数
    private Date reCollectDate;  //重扣日期
    private Boolean reCollectIsAdvanceClear = false;  //是否再扣提前结清
    private BigDecimal reCollectAmount = BigDecimal.ZERO;  //重扣金额
    private Date lastCalcTime;  //最后一次计算时间
    private String status ;  //还款状态.UNPAID (未还), PAID (已还), FAILED (失败),PARTIAL_PAID(部分还)
    private Boolean isAdvanceClear;  //是否提前结清
    /**
     * 返还金额, 还款日期对应的计划期数的返回金额
     */
    private BigDecimal returnAmount = BigDecimal.ZERO;  //返还金额
    private Boolean isDeleted = false;  //是否被删除
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
	public Long getContractId() {
		return contractId;
	}
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	public Integer getPeriodNumber() {
		return periodNumber;
	}
	public void setPeriodNumber(Integer periodNumber) {
		this.periodNumber = periodNumber;
	}
	public BigDecimal getTotalReceivableAmount() {
		return totalReceivableAmount;
	}
	public void setTotalReceivableAmount(BigDecimal totalReceivableAmount) {
		this.totalReceivableAmount = totalReceivableAmount;
	}
	public BigDecimal getTotalActualAmount() {
		return totalActualAmount;
	}
	public void setTotalActualAmount(BigDecimal totalActualAmount) {
		this.totalActualAmount = totalActualAmount;
	}
	public BigDecimal getTotalWaivedAmount() {
		return totalWaivedAmount;
	}
	public void setTotalWaivedAmount(BigDecimal totalWaivedAmount) {
		this.totalWaivedAmount = totalWaivedAmount;
	}
	public Date getActualRepaymentDate() {
		return actualRepaymentDate;
	}
	public void setActualRepaymentDate(Date actualRepaymentDate) {
		this.actualRepaymentDate = actualRepaymentDate;
	}
	public Boolean getIsOverdue() {
		return isOverdue;
	}
	public void setIsOverdue(Boolean isOverdue) {
		this.isOverdue = isOverdue;
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
	public Date getMaxRepaymentDate() {
		return maxRepaymentDate;
	}
	public void setMaxRepaymentDate(Date maxRepaymentDate) {
		this.maxRepaymentDate = maxRepaymentDate;
	}
	public Date getRepaymentDate() {
		return repaymentDate;
	}
	public void setRepaymentDate(Date repaymentDate) {
		this.repaymentDate = repaymentDate;
	}
	public Integer getFailCollectNumber() {
		return failCollectNumber;
	}
	public void setFailCollectNumber(Integer failCollectNumber) {
		this.failCollectNumber = failCollectNumber;
	}
	public Date getReCollectDate() {
		return reCollectDate;
	}
	public void setReCollectDate(Date reCollectDate) {
		this.reCollectDate = reCollectDate;
	}
	public Boolean getReCollectIsAdvanceClear() {
		return reCollectIsAdvanceClear;
	}
	public void setReCollectIsAdvanceClear(Boolean reCollectIsAdvanceClear) {
		this.reCollectIsAdvanceClear = reCollectIsAdvanceClear;
	}
	public BigDecimal getReCollectAmount() {
		return reCollectAmount;
	}
	public void setReCollectAmount(BigDecimal reCollectAmount) {
		this.reCollectAmount = reCollectAmount;
	}
	public Date getLastCalcTime() {
		return lastCalcTime;
	}
	public void setLastCalcTime(Date lastCalcTime) {
		this.lastCalcTime = lastCalcTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsAdvanceClear() {
		return isAdvanceClear;
	}
	public void setIsAdvanceClear(Boolean isAdvanceClear) {
		this.isAdvanceClear = isAdvanceClear;
	}
	public BigDecimal getReturnAmount() {
		return returnAmount;
	}
	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
    
}
