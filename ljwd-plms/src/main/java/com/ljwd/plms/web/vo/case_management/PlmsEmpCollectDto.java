package com.ljwd.plms.web.vo.case_management;

import java.math.BigDecimal;

public class PlmsEmpCollectDto {

	  private Long id;
	  private String userId;
	  private Long groupId;
	  private String isLeader;		 //是否是组长
	  private Integer monthCaseCount;	//月新增累计库存
	  private BigDecimal monthRemainingPrincipal;	//月新增累计库存剩余本金
	  private Long orgId;  //所属机构Id
	  private String roleIds;	//角色ID
	  private Integer clearMonthCaseCount; //结清数

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Integer getMonthCaseCount() {
		return monthCaseCount==null?0:monthCaseCount;
	}

	public void setMonthCaseCount(Integer monthCaseCount) {
		this.monthCaseCount = monthCaseCount;
	}

	public BigDecimal getMonthRemainingPrincipal() {
		return monthRemainingPrincipal;
	}

	public void setMonthRemainingPrincipal(BigDecimal monthRemainingPrincipal) {
		this.monthRemainingPrincipal = monthRemainingPrincipal;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public Integer getClearMonthCaseCount() {
		return clearMonthCaseCount;
	}

	public void setClearMonthCaseCount(Integer clearMonthCaseCount) {
		this.clearMonthCaseCount = clearMonthCaseCount;
	}

	public String getIsLeader() {
		return isLeader;
	}

	public void setIsLeader(String isLeader) {
		this.isLeader = isLeader;
	}
	
	
	
}
