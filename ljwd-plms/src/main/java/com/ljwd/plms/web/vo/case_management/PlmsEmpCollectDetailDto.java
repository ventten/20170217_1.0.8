package com.ljwd.plms.web.vo.case_management;

import java.math.BigDecimal;

public class PlmsEmpCollectDetailDto {
	//id
	private Long id;
	//所在区间的id
	private Long groupId;
	//是否是组长
	private String isLeader;
	//催收员
	private String collector;
	//催收员姓名
	private String collectorName;
	//所属机构名称
	private String orgName;
	//月累计剩余本金
	private BigDecimal monthRemainingPrincipal;
	//月累计户数
	private Integer monthCaseCount;
	//当前剩余本金
	private BigDecimal currentRemainingPrincipal;
	//当前户数
	private Integer currentCaseCount;
	//所属机构Id
	private Long orgId;
	
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
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public BigDecimal getMonthRemainingPrincipal() {
		return monthRemainingPrincipal;
	}
	public void setMonthRemainingPrincipal(BigDecimal monthRemainingPrincipal) {
		this.monthRemainingPrincipal = monthRemainingPrincipal;
	}
	public Integer getMonthCaseCount() {
		return monthCaseCount;
	}
	public void setMonthCaseCount(Integer monthCaseCount) {
		this.monthCaseCount = monthCaseCount;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	
	public String getIsLeader() {
		return isLeader;
	}
	public void setIsLeader(String isLeader) {
		this.isLeader = isLeader;
	}
	public BigDecimal getCurrentRemainingPrincipal() {
		return currentRemainingPrincipal;
	}
	public void setCurrentRemainingPrincipal(BigDecimal currentRemainingPrincipal) {
		this.currentRemainingPrincipal = currentRemainingPrincipal;
	}
	public Integer getCurrentCaseCount() {
		return currentCaseCount;
	}
	public void setCurrentCaseCount(Integer currentCaseCount) {
		this.currentCaseCount = currentCaseCount;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	
	
	
	
	

	
}
