package com.ljwd.plms.web.model.outVisit;

import com.ljwd.plms.web.model.BaseExample;


public class PlmsOvmOutVisitUserExample extends BaseExample{
	
	private String  userId;
	
	private String isActive;
	
	private Long areaId; //所属区域Id

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	
	
}