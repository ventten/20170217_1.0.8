package com.ljwd.plms.web.vo.outVisit;

public class OutVisitCaseArea {

	private Long applId;
	
	private String input_site_code; //交单网点
	
	private Long areaId; //所属区域Id

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
	}

	public String getInput_site_code() {
		return input_site_code;
	}

	public void setInput_site_code(String input_site_code) {
		this.input_site_code = input_site_code;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	
	
	
}
