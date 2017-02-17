package com.ljwd.plms.web.vo.case_management;

import java.math.BigDecimal;


public class PlmsWorkOrderPoolExportDto {
	//序号
	private Long rowNo;
    //合同编号
    private String cntrctNo;
    //主贷人
    private String custName;
    //身份证号
    private String docno;
    //货款金额
    private BigDecimal loanAmt;
    //逾期天数
    private Long overDays;
    //逾期金额
    private BigDecimal overdueAmount;
    //剩余本金
    private BigDecimal remainingPrincipal;
    //催收员    
    private String collectorName;
    //代理催收员    
    private String agentName;
    //业务类型
    private String bizCategory;
    //贷款产品
    private String proName;
    
	public Long getRowNo() {
		return rowNo;
	}
	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
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
	public String getCollectorName() {
		return collectorName;
	}
	public void setCollectorName(String collectorName) {
		this.collectorName = collectorName;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getBizCategory() {
		return bizCategory;
	}
	public void setBizCategory(String bizCategory) {
		this.bizCategory = bizCategory;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
    
    
}
