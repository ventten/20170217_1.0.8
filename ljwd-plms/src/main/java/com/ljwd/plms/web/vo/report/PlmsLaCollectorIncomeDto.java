package com.ljwd.plms.web.vo.report;

import java.util.Date;

public class PlmsLaCollectorIncomeDto {

	 	private Long id;
		private Long rpmntId; //实收Id	
	    private String collectUser; //催收员
	    private String collectorAgent;	//代理催收员
	    private String collectUser2; //催收员
	    private String collectorAgent2;	//代理催收员
	    private String outVisit;	//外访员
	    private String isActive;	//Y/N
	    private Long applId;			//贷款申请记录ID
	    private Long outinfoId;			//外访信息ID
	    private	Long bankAcId;			//银行账号
	    private Date assignDate;		//外访分配日期
	    private Date inputTime;			//入账时间
	    private Date approveTime;		//委外审批通过时间
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getRpmntId() {
			return rpmntId;
		}
		public void setRpmntId(Long rpmntId) {
			this.rpmntId = rpmntId;
		}
		public String getCollectUser() {
			return collectUser;
		}
		public void setCollectUser(String collectUser) {
			this.collectUser = collectUser;
		}
		public String getCollectorAgent() {
			return collectorAgent;
		}
		public void setCollectorAgent(String collectorAgent) {
			this.collectorAgent = collectorAgent;
		}
		public String getCollectUser2() {
			return collectUser2;
		}
		public void setCollectUser2(String collectUser2) {
			this.collectUser2 = collectUser2;
		}
		public String getCollectorAgent2() {
			return collectorAgent2;
		}
		public void setCollectorAgent2(String collectorAgent2) {
			this.collectorAgent2 = collectorAgent2;
		}
		public String getOutVisit() {
			return outVisit;
		}
		public void setOutVisit(String outVisit) {
			this.outVisit = outVisit;
		}
		public String getIsActive() {
			return isActive;
		}
		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}
		public Long getApplId() {
			return applId;
		}
		public void setApplId(Long applId) {
			this.applId = applId;
		}
		public Long getBankAcId() {
			return bankAcId;
		}
		public void setBankAcId(Long bankAcId) {
			this.bankAcId = bankAcId;
		}
		public Date getAssignDate() {
			return assignDate;
		}
		public void setAssignDate(Date assignDate) {
			this.assignDate = assignDate;
		}
		public Long getOutinfoId() {
			return outinfoId;
		}
		public void setOutinfoId(Long outinfoId) {
			this.outinfoId = outinfoId;
		}
		
		public Date getInputTime() {
			return inputTime;
		}
		public void setInputTime(Date inputTime) {
			this.inputTime = inputTime;
		}
		public Date getApproveTime() {
			return approveTime;
		}
		public void setApproveTime(Date approveTime) {
			this.approveTime = approveTime;
		}
		
	   

	
}
