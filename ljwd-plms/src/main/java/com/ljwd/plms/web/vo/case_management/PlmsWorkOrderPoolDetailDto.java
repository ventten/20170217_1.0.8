package com.ljwd.plms.web.vo.case_management;

import java.math.BigDecimal;
import java.util.Date;

public class PlmsWorkOrderPoolDetailDto {

	  	private Long applId;

	    private Long paymentId;
	    //合同编号
	    private String cntrctNo;
	    //放款渠道
	    private String paymentType;
	    //贷款产品编码
	    private String prdNo;
	    //贷款产品名称
	    private String proName;
	    //所属网点编码
	    private String siteCode;
	    //所属网点名称
	    private String siteName;
	    //主贷人
	    private String custName;
	    //身份证号
	    private String docno;
	    //业务类型
	    private String businessCategory;
	    //案件性质(预留字段)
	    private String caseNature;
	    //贷款金额	    
	    private BigDecimal loanAmt;
	    //最早逾期期数
	    private Integer overduePeriod;
	    //至今为止的逾期期数
	    private Integer maxOverduePeriod;
	    //逾期金额
	    private BigDecimal overdueAmount;
	    //剩余本金
	    private BigDecimal remainingPrincipal;
	    //逾期天数
	    private Integer overDays;
	    //应还日期
	    private Date rpmntDate;
	    //催收员Id
	    private String collector;
	    //催收员Name
	    private String collectorName;
	    //所属队列
	    private String queue;
	    //分配日期
	    private Date assignDate;
	    //代理催收员
	    private String agent;
	    //代理催收员name
	    private String agentName;
	    //已代理
	    private String isAgent;
	    //代理起始日期
	    private Date allocBeginDate;
	    //代理结束日期
	    private Date allocEndDate;
	    
		public Long getApplId() {
			return applId;
		}

		public void setApplId(Long applId) {
			this.applId = applId;
		}

		public Long getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(Long paymentId) {
			this.paymentId = paymentId;
		}

		public String getCntrctNo() {
			return cntrctNo;
		}

		public void setCntrctNo(String cntrctNo) {
			this.cntrctNo = cntrctNo;
		}

		public String getPaymentType() {
			return paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public String getPrdNo() {
			return prdNo;
		}

		public void setPrdNo(String prdNo) {
			this.prdNo = prdNo;
		}

		public String getProName() {
			return proName;
		}

		public void setProName(String proName) {
			this.proName = proName;
		}

		public String getSiteCode() {
			return siteCode;
		}

		public void setSiteCode(String siteCode) {
			this.siteCode = siteCode;
		}

		public String getSiteName() {
			return siteName;
		}

		public void setSiteName(String siteName) {
			this.siteName = siteName;
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

		public String getBusinessCategory() {
			return businessCategory;
		}

		public void setBusinessCategory(String businessCategory) {
			this.businessCategory = businessCategory;
		}

		public String getCaseNature() {
			return caseNature;
		}

		public void setCaseNature(String caseNature) {
			this.caseNature = caseNature;
		}

		public BigDecimal getLoanAmt() {
			return loanAmt;
		}

		public void setLoanAmt(BigDecimal loanAmt) {
			this.loanAmt = loanAmt;
		}

		public Integer getOverduePeriod() {
			return overduePeriod;
		}

		public void setOverduePeriod(Integer overduePeriod) {
			this.overduePeriod = overduePeriod;
		}

		public BigDecimal getOverdueAmount() {
			return overdueAmount;
		}

		public void setOverdueAmount(BigDecimal overdueAmount) {
			this.overdueAmount = overdueAmount;
		}

		public BigDecimal getRemainingPrincipal() {
			return remainingPrincipal;
		}

		public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
			this.remainingPrincipal = remainingPrincipal;
		}
		public Integer getOverDays() {
			return overDays;
		}

		public void setOverDays(Integer overDays) {
			this.overDays = overDays;
		}

		public String getCollector() {
			return collector;
		}

		public void setCollector(String collector) {
			this.collector = collector;
		}

		public String getCollectorName() {
			return collectorName;
		}

		public void setCollectorName(String collectorName) {
			this.collectorName = collectorName;
		}

		public String getQueue() {
			return queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		

		public String getIsAgent() {
			return isAgent;
		}

		public void setIsAgent(String isAgent) {
			this.isAgent = isAgent;
		}
		

		public String getAgent() {
			return agent;
		}

		public void setAgent(String agent) {
			this.agent = agent;
		}

		public String getAgentName() {
			return agentName;
		}

		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}

		public Integer getMaxOverduePeriod() {
			return maxOverduePeriod;
		}

		public void setMaxOverduePeriod(Integer maxOverduePeriod) {
			this.maxOverduePeriod = maxOverduePeriod;
		}

		public Date getRpmntDate() {
			return rpmntDate;
		}

		public void setRpmntDate(Date rpmntDate) {
			this.rpmntDate = rpmntDate;
		}

		public Date getAssignDate() {
			return assignDate;
		}

		public void setAssignDate(Date assignDate) {
			this.assignDate = assignDate;
		}

		public Date getAllocBeginDate() {
			return allocBeginDate;
		}

		public void setAllocBeginDate(Date allocBeginDate) {
			this.allocBeginDate = allocBeginDate;
		}

		public Date getAllocEndDate() {
			return allocEndDate;
		}

		public void setAllocEndDate(Date allocEndDate) {
			this.allocEndDate = allocEndDate;
		}

		
}
