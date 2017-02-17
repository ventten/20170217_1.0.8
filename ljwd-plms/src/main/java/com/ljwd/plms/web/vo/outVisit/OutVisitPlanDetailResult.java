package com.ljwd.plms.web.vo.outVisit;

import java.math.BigDecimal;
import java.util.Date;

public class OutVisitPlanDetailResult {

    private Date assignDate; //外访分配时间
    private Date expectCloseTime;  //预计结案日期  
  	private String applyNo; //申请编号
  	private String cntrctNo;  //合同编号
    private String custName;  //主贷人
    private Long custId; // 主贷人在cl_cust中的id;
    private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)
    private String tel;//联系电话
    private BigDecimal loanAmt;//货款金额
    private Integer periodNum;//贷款期数
    private Integer paidPeriod;//已还期数
    private BigDecimal overdueAmount;//逾期应还金额
    private Long overdueDay; //分配时的逾期天数
    private Long overdueDayNow; //现在的逾期天数
    private Integer historyNum;  //历史外访次数
    private String caseStatus;//案件状态
    private String submitBy;//提交人
    private String idCardNo;//身份证号
	public Date getAssignDate() {
		return assignDate;
	}
	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}
	public Date getExpectCloseTime() {
		return expectCloseTime;
	}
	public void setExpectCloseTime(Date expectCloseTime) {
		this.expectCloseTime = expectCloseTime;
	}
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
	public Long getOverdueDay() {
		return overdueDay;
	}
	public void setOverdueDay(Long overdueDay) {
		this.overdueDay = overdueDay;
	}
	public Long getOverdueDayNow() {
		return overdueDayNow;
	}
	public void setOverdueDayNow(Long overdueDayNow) {
		this.overdueDayNow = overdueDayNow;
	}
	public Integer getHistoryNum() {
		return historyNum;
	}
	public void setHistoryNum(Integer historyNum) {
		this.historyNum = historyNum;
	}
	public String getCaseStatus() {
		return caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	public String getSubmitBy() {
		return submitBy;
	}
	public void setSubmitBy(String submitBy) {
		this.submitBy = submitBy;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
    
}
