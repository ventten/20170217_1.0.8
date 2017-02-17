package com.ljwd.plms.web.vo.outVisit;

import java.math.BigDecimal;

/**
 * 外访计划详情 客户信息
 * <p>Title: AllOutVisitPlanDetailResult</p>
 * @author pangshanxing
 * @date 2016年11月8日上午10:50:59
 */
public class AllOutVisitPlanDetailCustResult {

	private String applyNo; //申请编号
  	private String cntrctNo;  //合同编号
    private String custName;  //主贷人
    private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)
    private BigDecimal loanAmt;//货款金额
    private Integer periodNum;//贷款期数
    private Integer paidPeriod;//已还期数
    private BigDecimal overdueAmount;//逾期应还金额
    private BigDecimal clearAmount;//提前结清金额
    private Long overdueDayNow; //现在的逾期天数
    private Long overdueDay; //分配时的逾期天数
    private String planStatus;//计划状态
    private String address;//外访地址
    private String addressType; //地址类型
    
    private String idCardNo;//身份证号
    
	public String getApplyNo() {
		return applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
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
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public BigDecimal getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(BigDecimal loanAmt) {
		this.loanAmt = loanAmt;
	}
	public Integer getPeriodNum() {
		return periodNum;
	}
	public void setPeriodNum(Integer periodNum) {
		this.periodNum = periodNum;
	}
	public Integer getPaidPeriod() {
		return paidPeriod;
	}
	public void setPaidPeriod(Integer paidPeriod) {
		this.paidPeriod = paidPeriod;
	}
	public BigDecimal getOverdueAmount() {
		return overdueAmount;
	}
	public void setOverdueAmount(BigDecimal overdueAmount) {
		this.overdueAmount = overdueAmount;
	}
	public BigDecimal getClearAmount() {
		return clearAmount;
	}
	public void setClearAmount(BigDecimal clearAmount) {
		this.clearAmount = clearAmount;
	}
	public Long getOverdueDayNow() {
		return overdueDayNow;
	}
	public void setOverdueDayNow(Long overdueDayNow) {
		this.overdueDayNow = overdueDayNow;
	}
	public Long getOverdueDay() {
		return overdueDay;
	}
	public void setOverdueDay(Long overdueDay) {
		this.overdueDay = overdueDay;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

    
}
