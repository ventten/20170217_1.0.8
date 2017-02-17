package com.ljwd.plms.web.vo.case_management;

import java.math.BigDecimal;

public class PlmsWorkOrderAssignDto {

	private Long id;
	
	private Long applId;
	
	private Long paymentId;
	
	private String status;
	//逾期天数
	private Long overdueDays;
	//剩余本金
	private BigDecimal remainingPrincipal;	
	//最早逾期期数
    private Long overduePeriod;
    
    private String bizCategory; //业务类型
    
    private String siteCode; //所属网点
    
    private String signCode; //签约网点

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

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getOverdueDays() {
		return overdueDays;
	}

	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
	}

	public BigDecimal getRemainingPrincipal() {
		return remainingPrincipal;
	}

	public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
		this.remainingPrincipal = remainingPrincipal;
	}

	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	public Long getOverduePeriod() {
		return overduePeriod;
	}

	public void setOverduePeriod(Long overduePeriod) {
		this.overduePeriod = overduePeriod;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getSignCode() {
		return signCode;
	}

	public void setSignCode(String signCode) {
		this.signCode = signCode;
	}

	public String getBizCategory() {
		return bizCategory;
	}

	public void setBizCategory(String bizCategory) {
		this.bizCategory = bizCategory;
	}

	

	
	
	
}
