package com.ljwd.plms.web.vo.outVisit;

import java.math.BigDecimal;
import java.util.Date;

public class AllOutVisitExportResult {

	private Long rowNo;	//序号
	private String outVisiterName;//外访人员姓名
	private String applyNo; //申请编号
	private Date assignDate; //外访分配时间
    private Date expectCloseTime;  //预计结案日期  
    private String visitType; //外访类型
  	private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)
  	private String statusVal;  //案件状态。Submitted(已提交)、Audited(已审核)、AuditRefused(审核拒绝)、Assigned(未计划)、Planing(计划中)、Visited(已外访)、NoVisit(未外访)
  	private String cntrctNo;  //合同编号
    private String custName;  //主贷人
    private String idCardNo; //身份证号
    private BigDecimal loanAmt;	  //货款金额
    private BigDecimal remainingPrincipal;  //剩余本金
    private Long overdueDay; //分配时的逾期天数
    private Long overdueDayNow; //现在的逾期天数
    private Integer planNum; //计划外访次数
    private Integer finishNum; //完成外访次数
    private Integer historyNum;  //历史外访次数
    private Integer registerOverNum; //户籍地址外访次数
    private Integer houseOverNum; //住宅地址外访次数
    private Integer companyOverNum;  //单位地址外访次数
    private String userName; //提交人
    
    
	public String getOutVisiterName() {
		return outVisiterName;
	}
	public void setOutVisiterName(String outVisiterName) {
		this.outVisiterName = outVisiterName;
	}
	public Long getRowNo() {
		return rowNo;
	}
	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
	}
	public String getApplyNo() {
		return applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
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
	public String getVisitType() {
		return visitType;
	}
	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getStatusVal() {
		return statusVal;
	}
	public void setStatusVal(String statusVal) {
		this.statusVal = statusVal;
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
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public BigDecimal getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(BigDecimal loanAmt) {
		this.loanAmt = loanAmt;
	}
	public BigDecimal getRemainingPrincipal() {
		return remainingPrincipal;
	}
	public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
		this.remainingPrincipal = remainingPrincipal;
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
	public Integer getPlanNum() {
		return planNum;
	}
	public void setPlanNum(Integer planNum) {
		this.planNum = planNum;
	}
	public Integer getFinishNum() {
		return finishNum;
	}
	public void setFinishNum(Integer finishNum) {
		this.finishNum = finishNum;
	}
	public Integer getHistoryNum() {
		return historyNum;
	}
	public void setHistoryNum(Integer historyNum) {
		this.historyNum = historyNum;
	}
	public Integer getRegisterOverNum() {
		return registerOverNum;
	}
	public void setRegisterOverNum(Integer registerOverNum) {
		this.registerOverNum = registerOverNum;
	}
	public Integer getHouseOverNum() {
		return houseOverNum;
	}
	public void setHouseOverNum(Integer houseOverNum) {
		this.houseOverNum = houseOverNum;
	}
	public Integer getCompanyOverNum() {
		return companyOverNum;
	}
	public void setCompanyOverNum(Integer companyOverNum) {
		this.companyOverNum = companyOverNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
    
    
}
