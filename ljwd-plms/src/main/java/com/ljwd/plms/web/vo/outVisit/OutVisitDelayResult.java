package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;

public class OutVisitDelayResult  extends PageRowNo{

		
	 private Long applId;
	 private Long infoId; //PLMS_OVM_OUT_VISIT_INFO表中ID
	 private Long delayId;//
	 private Long id; //PLMS_OVM_OUT_DELAY_DTL的id
	 private String areaName; //所属区域名称
	 private Long areaId; //所属区域Id
	 private String cntrctNo;  //合同编号
	 private String custName;  //主贷人
	 private String docno; //身份证号
	 private Date assignDate; //外访分配时间
	 private Date expectCloseTime;  //当前预计结案日期
	 private Date delaySubmitTime; //延期申请日期
	 private String delaySubmitBy;//延期申请人
	 private String delaySubmitName; //延期申请人姓名
	 private String delayDuration;//延期时长,一周
	 private Long delayTimes; //已延期次数
	 private Long visitOverNum; //完成外访次数
	 private Date lastFollowTime;//最后一次跟进时间
	 private String delayAuditResult;//延期审批情况,延期未审批(NOT_APPROVED)、延期已通过(PASS)、延期拒绝(REJECT)
	 private String delayAuditResultName; //延期审批情况,延期未审批(NOT_APPROVED)、延期已通过(PASS)、延期拒绝(REJECT)
	 private Date delayAuditTime;//延期审批日期
	 private String delayAuditBy;//延期审批人
	 private String delayAuditName;//延期审批人姓名
	 private String delayReason; //延期原因
	 private String delayAuditRefuse;//延期拒绝原因
	 private Integer overduePeriod;	//最早逾期期数
	
	 public Long getApplId() {
		return applId;
	}
	public void setApplId(Long applId) {
		this.applId = applId;
	}
	public Long getInfoId() {
		return infoId;
	}
	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}
	public Long getDelayId() {
		return delayId;
	}
	public void setDelayId(Long delayId) {
		this.delayId = delayId;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
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
	public String getDocno() {
		return docno;
	}
	public void setDocno(String docno) {
		this.docno = docno;
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
	public Date getDelaySubmitTime() {
		return delaySubmitTime;
	}
	public void setDelaySubmitTime(Date delaySubmitTime) {
		this.delaySubmitTime = delaySubmitTime;
	}
	public String getDelaySubmitBy() {
		return delaySubmitBy;
	}
	public void setDelaySubmitBy(String delaySubmitBy) {
		this.delaySubmitBy = delaySubmitBy;
	}
	public String getDelayDuration() {
		return delayDuration;
	}
	public void setDelayDuration(String delayDuration) {
		this.delayDuration = delayDuration;
	}
	public Long getDelayTimes() {
		return delayTimes;
	}
	public void setDelayTimes(Long delayTimes) {
		this.delayTimes = delayTimes;
	}
	public Long getVisitOverNum() {
		return visitOverNum;
	}
	public void setVisitOverNum(Long visitOverNum) {
		this.visitOverNum = visitOverNum;
	}
	public Date getLastFollowTime() {
		return lastFollowTime;
	}
	public void setLastFollowTime(Date lastFollowTime) {
		this.lastFollowTime = lastFollowTime;
	}
	public String getDelayAuditResult() {
		return delayAuditResult;
	}
	public void setDelayAuditResult(String delayAuditResult) {
		this.delayAuditResult = delayAuditResult;
	}
	public Date getDelayAuditTime() {
		return delayAuditTime;
	}
	public void setDelayAuditTime(Date delayAuditTime) {
		this.delayAuditTime = delayAuditTime;
	}
	public String getDelayAuditBy() {
		return delayAuditBy;
	}
	public void setDelayAuditBy(String delayAuditBy) {
		this.delayAuditBy = delayAuditBy;
	}
	public String getDelayReason() {
		return delayReason;
	}
	public void setDelayReason(String delayReason) {
		this.delayReason = delayReason;
	}
	public String getDelayAuditRefuse() {
		return delayAuditRefuse;
	}
	public void setDelayAuditRefuse(String delayAuditRefuse) {
		this.delayAuditRefuse = delayAuditRefuse;
	}
	public Integer getOverduePeriod() {
		return overduePeriod;
	}
	public void setOverduePeriod(Integer overduePeriod) {
		this.overduePeriod = overduePeriod;
	}
	public String getDelaySubmitName() {
		return delaySubmitName;
	}
	public void setDelaySubmitName(String delaySubmitName) {
		this.delaySubmitName = delaySubmitName;
	}
	public String getDelayAuditName() {
		return delayAuditName;
	}
	public void setDelayAuditName(String delayAuditName) {
		this.delayAuditName = delayAuditName;
	}
	public String getDelayAuditResultName() {
		return delayAuditResultName;
	}
	public void setDelayAuditResultName(String delayAuditResultName) {
		this.delayAuditResultName = delayAuditResultName;
	}
	
	 
	 
}
