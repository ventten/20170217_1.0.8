package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;

public class MyOutVisitResult extends PageRowNo{

    private Long id; //PLMS_OVM_OUT_VISIT_INFO中的ID
    
    private Long applId; //贷款申请ID
	
	private Date assignDate; //外访分配时间

    private Date expectCloseTime;  //预计结案日期  

  	private String visitType; //外访类型

  	private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)
    
  	private String statusVal;
  	
  	private String status;  //案件状态。Submitted(已提交)、Audited(已审核)、AuditRefused(审核拒绝)、Assigned(未计划)、Planing(计划中)、Visited(已外访)、NoVisit(未外访)

	private String applyNo; //申请编号

  	private String cntrctNo;  //合同编号
  	
    private String custName;  //主贷人
    
    private Long overdueDay; //分配时的逾期天数

    private Long overdueDayNow; //现在的逾期天数
    
    private Integer planNum; //计划外访次数

    private Integer finishNum; //完成外访次数

    private Integer historyNum;  //历史外访次数
    
    private String casetype; //案件性质
    
    private String casetypeName; //案件性质名称
    
    private Integer overduePeriod; //最小逾期期数

    private String isSetUp; //是否创建计划
    
    private String registerAddr; //户籍地址
    
    private String houseAddr; //住宅地址
    
    private String companyAddr;  //单位地址
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getCasetype() {
		return casetype;
	}

	public void setCasetype(String casetype) {
		this.casetype = casetype;
	}

	public String getCasetypeName() {
		return casetypeName;
	}

	public void setCasetypeName(String casetypeName) {
		this.casetypeName = casetypeName;
	}

	public Integer getOverduePeriod() {
		return overduePeriod;
	}

	public void setOverduePeriod(Integer overduePeriod) {
		this.overduePeriod = overduePeriod;
	}

	public String getStatusVal() {
		return statusVal;
	}

	public void setStatusVal(String statusVal) {
		this.statusVal = statusVal;
	}

	public String getIsSetUp() {
		return isSetUp;
	}

	public void setIsSetUp(String isSetUp) {
		this.isSetUp = isSetUp;
	}

	public String getRegisterAddr() {
		return registerAddr;
	}

	public void setRegisterAddr(String registerAddr) {
		this.registerAddr = registerAddr;
	}

	public String getHouseAddr() {
		return houseAddr;
	}

	public void setHouseAddr(String houseAddr) {
		this.houseAddr = houseAddr;
	}

	public String getCompanyAddr() {
		return companyAddr;
	}

	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}

}
