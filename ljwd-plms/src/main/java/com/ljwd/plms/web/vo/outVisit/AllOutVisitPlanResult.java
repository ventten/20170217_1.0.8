package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;

public class AllOutVisitPlanResult extends PageRowNo{

	private Long applId;
	private Long infoId;
	private Long planId;
	private String planCode; //计划编号
    private Date planStartTime;//计划外访日期
	private String visitType; //外访类型
    private String custName;  //主贷人
	private String addressType; //地址类型
	private String outVisiter;//外访人员
	private String outVisiterName;//外访人员
    private String planStatus; //计划外访状态
    private String planStatusName;//计划外访状态名称
	private String addressValidity;//地址有效性
	private String followupResults;//跟进结果
    private Date expectCloseTime;  //预计结案日期  
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
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public Date getPlanStartTime() {
		return planStartTime;
	}
	public void setPlanStartTime(Date planStartTime) {
		this.planStartTime = planStartTime;
	}
	public String getVisitType() {
		return visitType;
	}
	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getOutVisiter() {
		return outVisiter;
	}
	public void setOutVisiter(String outVisiter) {
		this.outVisiter = outVisiter;
	}
	public String getOutVisiterName() {
		return outVisiterName;
	}
	public void setOutVisiterName(String outVisiterName) {
		this.outVisiterName = outVisiterName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getPlanStatusName() {
		return planStatusName;
	}
	public void setPlanStatusName(String planStatusName) {
		this.planStatusName = planStatusName;
	}
	public String getAddressValidity() {
		return addressValidity;
	}
	public void setAddressValidity(String addressValidity) {
		this.addressValidity = addressValidity;
	}
	public String getFollowupResults() {
		return followupResults;
	}
	public void setFollowupResults(String followupResults) {
		this.followupResults = followupResults;
	}
	public Date getExpectCloseTime() {
		return expectCloseTime;
	}
	public void setExpectCloseTime(Date expectCloseTime) {
		this.expectCloseTime = expectCloseTime;
	}

    
}
