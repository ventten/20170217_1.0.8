package com.ljwd.plms.web.model.sys_management;

import java.util.List;

import com.ljwd.plms.web.model.BaseExample;



public class SysSiteExample extends BaseExample{
	
	private String isActive;
	
	private List<String> siteCodes;

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public List<String> getSiteCodes() {
		return siteCodes;
	}

	public void setSiteCodes(List<String> siteCodes) {
		this.siteCodes = siteCodes;
	}
	
	
	
	
}