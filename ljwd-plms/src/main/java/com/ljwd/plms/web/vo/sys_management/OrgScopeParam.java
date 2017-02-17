package com.ljwd.plms.web.vo.sys_management;

public class OrgScopeParam {

	private Long orgId;
	private Long[] scopeList;
	private String isActive;
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public Long[] getScopeList() {
		return scopeList;
	}
	public void setScopeList(Long[] scopeList) {
		this.scopeList = scopeList;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	
	
}
