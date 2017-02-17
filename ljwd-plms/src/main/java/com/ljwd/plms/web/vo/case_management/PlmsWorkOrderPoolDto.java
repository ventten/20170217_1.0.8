package com.ljwd.plms.web.vo.case_management;

import java.math.BigDecimal;

import com.ljwd.plms.web.vo.PageRowNo;

public class PlmsWorkOrderPoolDto extends PageRowNo{

    private Long applId;					//借款ID
    private Long paymentId;					//放款ID
    private Long cntrctId;					//合同ID
    private String cntrctNo;				//合同编号
    private String custName;				//主贷人
    private String docno;					//身份证号
    private BigDecimal loanAmt;				//货款金额
    private String prdNo;					//产品编号
    private String collector;				//催收员
    private String collectorName;			//催收员姓名
    private String agent;					//代理催收员
    private String agentName;				//代理催收员姓名
    private Long overDays;					//逾期天数
    private Integer overduePeriod;			//最早逾期期数
    private BigDecimal remainingPrincipal;	//剩余本金
    private BigDecimal overdueAmount;		//逾期金额
    private Long recVer;					//版本号
    private String status;          		//当前所属区间
    private String  clearStatus;    		//结清状态（只有是CLEAR是结清）
    private String bizCategory;     		//业务类型
    private String siteCode;        		//所属网点
    private String siteName;				//所属网点
    private Long regionId;          		//区域ID
    private String proName;					//贷款产品

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
    }

    public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
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

	public BigDecimal getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(BigDecimal loanAmt) {
		this.loanAmt = loanAmt;
	}

	public Long getOverDays() {
		return overDays;
	}

	public void setOverDays(Long overDays) {
		this.overDays = overDays;
	}

	public String getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}	

	public Integer getOverduePeriod() {
		return overduePeriod;
	}

	public void setOverduePeriod(Integer overduePeriod) {
		this.overduePeriod = overduePeriod;
	}

	public BigDecimal getRemainingPrincipal() {
		return remainingPrincipal;
	}

	public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
		this.remainingPrincipal = remainingPrincipal;
	}

	public BigDecimal getOverdueAmount() {
		return overdueAmount;
	}

	public void setOverdueAmount(BigDecimal overdueAmount) {
		this.overdueAmount = overdueAmount;
	}

	public Long getRecVer() {
		return recVer;
	}

	public void setRecVer(Long recVer) {
		this.recVer = recVer;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClearStatus() {
		return clearStatus;
	}

	public void setClearStatus(String clearStatus) {
		this.clearStatus = clearStatus;
	}

	public String getBizCategory() {
		return bizCategory;
	}

	public void setBizCategory(String bizCategory) {
		this.bizCategory = bizCategory;
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

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

}
