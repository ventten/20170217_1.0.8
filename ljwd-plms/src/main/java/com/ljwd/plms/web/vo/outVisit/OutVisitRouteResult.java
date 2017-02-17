package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;

public class OutVisitRouteResult {
	
	
	private Long applId; 
	private Long infoId; //
	private Long planId;
	private Date outVisitDate; //外访时间
	private String outVisiter; //外访员
	private String outVisiterName; //外访员
    private String assistBy;	//陪同人
    private String assistByNames; //陪同人
    private String address;//外访地址
	public Date getOutVisitDate() {
		return outVisitDate;
	}
	public void setOutVisitDate(Date outVisitDate) {
		this.outVisitDate = outVisitDate;
	}
	public String getOutVisiter() {
		return outVisiter;
	}
	public void setOutVisiter(String outVisiter) {
		this.outVisiter = outVisiter;
	}
	public String getAssistBy() {
		return assistBy;
	}
	public void setAssistBy(String assistBy) {
		this.assistBy = assistBy;
	}
	public String getAssistByNames() {
		return assistByNames;
	}
	public void setAssistByNames(String assistByNames) {
		this.assistByNames = assistByNames;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
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
	public String getOutVisiterName() {
		return outVisiterName;
	}
	public void setOutVisiterName(String outVisiterName) {
		this.outVisiterName = outVisiterName;
	}
    
    
}
