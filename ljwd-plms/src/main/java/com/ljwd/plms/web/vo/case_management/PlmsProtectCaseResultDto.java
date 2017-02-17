package com.ljwd.plms.web.vo.case_management;


import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;


public class PlmsProtectCaseResultDto extends PageRowNo{
	//工单日志表id
	private Long logId;
	
	private Long applId;
	
	private Long paymentId;
	//区间值
	private String statusVal;
	//区间名称
	private String statusName;
	 //合同编号
    private String cntrctNo;
    //主贷人
    private String custName;
    //身份证号
    private String docno;
    //（1，离职2，豁免3，降期4，保留）
    private String defendStatus;
    //保护条件
    private String protectCondition;
    //保护状态
    private String protectStatus;
    //催收员
    private String collector;
    //催收员姓名
    private String collectorName;
    //保留截止日期
    private String protectEndDate;
    //豁免状态
    private String waivdeStatus;
    //是否能撤回
    private String isRecall;
    //发起保留时间
    private String createTime;
    //实时豁免状态
    private String realtimeStatus;
    //是否在豁免中
    private String isWaive;
    
	public Long getApplId() {
		return applId;
	}
	public void setApplId(Long applId) {
		this.applId = applId;
	}
	public String getStatusVal() {
		return statusVal;
	}
	public void setStatusVal(String statusVal) {
		this.statusVal = statusVal;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
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
	public String getProtectCondition() {
		return protectCondition;
	}
	public void setProtectCondition(String protectCondition) {
		this.protectCondition = protectCondition;
	}
	public String getProtectStatus() {
		return protectStatus;
	}
	public void setProtectStatus(String protectStatus) {
		this.protectStatus = protectStatus;
	}
	public String getCollector() {
		return collector;
	}
	public void setCollector(String collector) {
		this.collector = collector;
	}
	
	
	public String getProtectEndDate() {
		return protectEndDate;
	}
	public void setProtectEndDate(String protectEndDate) {
		this.protectEndDate = protectEndDate;
	}
	public String getDefendStatus() {
		return defendStatus;
	}
	public void setDefendStatus(String defendStatus) {
		this.defendStatus = defendStatus;
	}
	public String getCollectorName() {
		return collectorName;
	}
	public void setCollectorName(String collectorName) {
		this.collectorName = collectorName;
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getWaivdeStatus() {
		return waivdeStatus;
	}
	public void setWaivdeStatus(String waivdeStatus) {
		this.waivdeStatus = waivdeStatus;
	}
	public String getIsRecall() {
		return isRecall;
	}
	public void setIsRecall(String isRecall) {
		this.isRecall = isRecall;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Long getLogId() {
		return logId;
	}
	public void setLogId(Long logId) {
		this.logId = logId;
	}
	public String getRealtimeStatus() {
		return realtimeStatus;
	}
	public void setRealtimeStatus(String realtimeStatus) {
		this.realtimeStatus = realtimeStatus;
	}
	public String getIsWaive() {
		return isWaive;
	}
	public void setIsWaive(String isWaive) {
		this.isWaive = isWaive;
	}
	
	
	
	
}
