package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * 
* @ClassName: RepaymentPlan 
* @Description: TODO(LN_RPMNT_PLAN) 
* @author zhengjizhao
* @date 2016年9月8日 上午10:09:43 
*
 */
public class RepaymentPlan{

    private Long id;
    private Long applicationInfoId;  //贷款申请单记录ID
    private Long paymentId;  //贷款记录ID
    private Integer periodNumber;  //还款期数
    private Date startDate;  //起息日期
    private Date endDate;  //止息日期
    private Date maxRepaymentDate;  //最大应还日期
    private Date repaymentDate;  //还款日期
    private BigDecimal principal = BigDecimal.ZERO;  //还款本金
    private BigDecimal interest = BigDecimal.ZERO;  //还款利息
    private BigDecimal interestAdjust = BigDecimal.ZERO;  //利息调整值
    private RepaymentStatus status;  //状态.UNREPAID, PARTIAL_REPAID, REPAID.old: 0未还，1部分未，2还清
    private Integer interestDay = 0;  //计息天数
    private BigDecimal totalAmount = BigDecimal.ZERO;  //还款总金额,本金，利息，费用
    private Boolean isExtent = false;  //是否展期,0否,1是,默认为0
    private BigDecimal penalty = BigDecimal.ZERO;  //提前还款违约金
    private BigDecimal penaltyRate = BigDecimal.ZERO;  //提前还款违约金费率
    private BigDecimal clearAmount = BigDecimal.ZERO;  //提前还款总金额
    private BigDecimal remainPrincipal = BigDecimal.ZERO;  //剩余本金
    /**
     * 返还金额
     */
    private BigDecimal returnAmount = BigDecimal.ZERO;  //返还金额
    /**
     * 实际本金。趸缴模式的实际本金是用放款金额计算得出。
     */
    private BigDecimal actualPrincipal = BigDecimal.ZERO;  //实际本金。趸缴模式的实际本金是用放款金额计算得出
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
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Integer getPeriodNumber() {
		return periodNumber;
	}
	public void setPeriodNumber(Integer periodNumber) {
		this.periodNumber = periodNumber;
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
	public BigDecimal getPrincipal() {
		return principal;
	}
	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}
	public BigDecimal getInterest() {
		return interest;
	}
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}
	public BigDecimal getInterestAdjust() {
		return interestAdjust;
	}
	public void setInterestAdjust(BigDecimal interestAdjust) {
		this.interestAdjust = interestAdjust;
	}
	public RepaymentStatus getStatus() {
		return status;
	}
	public void setStatus(RepaymentStatus status) {
		this.status = status;
	}
	public Integer getInterestDay() {
		return interestDay;
	}
	public void setInterestDay(Integer interestDay) {
		this.interestDay = interestDay;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Boolean getIsExtent() {
		return isExtent;
	}
	public void setIsExtent(Boolean isExtent) {
		this.isExtent = isExtent;
	}
	public BigDecimal getPenalty() {
		return penalty;
	}
	public void setPenalty(BigDecimal penalty) {
		this.penalty = penalty;
	}
	public BigDecimal getPenaltyRate() {
		return penaltyRate;
	}
	public void setPenaltyRate(BigDecimal penaltyRate) {
		this.penaltyRate = penaltyRate;
	}
	public BigDecimal getClearAmount() {
		return clearAmount;
	}
	public void setClearAmount(BigDecimal clearAmount) {
		this.clearAmount = clearAmount;
	}
	public BigDecimal getRemainPrincipal() {
		return remainPrincipal;
	}
	public void setRemainPrincipal(BigDecimal remainPrincipal) {
		this.remainPrincipal = remainPrincipal;
	}
	public BigDecimal getReturnAmount() {
		return returnAmount;
	}
	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}
	public BigDecimal getActualPrincipal() {
		return actualPrincipal;
	}
	public void setActualPrincipal(BigDecimal actualPrincipal) {
		this.actualPrincipal = actualPrincipal;
	}
    
    
}
