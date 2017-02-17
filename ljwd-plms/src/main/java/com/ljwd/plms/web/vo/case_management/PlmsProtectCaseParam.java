package com.ljwd.plms.web.vo.case_management;

import com.ljwd.plms.web.model.BaseExample;

public class PlmsProtectCaseParam extends BaseExample {
	//催收区间状态值
	private String scopeStatus;
	//保护状态值(1,待流转 2，保护中)
	private String protectStatus;
	//保护条件（1，离职2，豁免3，降期4，保留）
	private String protectCondition;
	//是否在豁免中
	private String isWaive;
	
	public String getScopeStatus() {
		return scopeStatus;
	}
	public void setScopeStatus(String scopeStatus) {
		this.scopeStatus = scopeStatus;
	}
	public String getProtectStatus() {
		return protectStatus;
	}
	public void setProtectStatus(String protectStatus) {
		this.protectStatus = protectStatus;
	}
	public String getProtectCondition() {
		return protectCondition;
	}
	public void setProtectCondition(String protectCondition) {
		this.protectCondition = protectCondition;
	}
	public String getIsWaive() {
		return isWaive;
	}
	public void setIsWaive(String isWaive) {
		this.isWaive = isWaive;
	}
	
	
	
	
	
}
