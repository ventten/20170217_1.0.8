package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.BaseExample;


public class PlmsSysBranchManageExample extends BaseExample {
	
	private Long orgId;		//机构id
	private String userId;	//员工Id
	private String[] siteCode;	//监管分行
	
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String[] getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String[] siteCode) {
		this.siteCode = siteCode;
	}
	
	
	
}