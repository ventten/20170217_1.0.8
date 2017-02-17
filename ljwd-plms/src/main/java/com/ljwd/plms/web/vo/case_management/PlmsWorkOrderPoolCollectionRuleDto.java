package com.ljwd.plms.web.vo.case_management;

public class PlmsWorkOrderPoolCollectionRuleDto {
    /*流转区间的状态值  唯一*/
    private String status;

    private String name;
    /*流转规则*/
    private String circuRuleCode;
    
    private String circuRuleVal;
    
    private Long overduedaysFrom;

    private Long overduedaysTo;
    //分配方法
    private String assignMethodCode;
    
    private String assignMethodVal;
    //分配规则
    private String assignRuleCode;
    
    private String assignRuleVal;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCircuRuleCode() {
		return circuRuleCode;
	}

	public void setCircuRuleCode(String circuRuleCode) {
		this.circuRuleCode = circuRuleCode;
	}

	public String getCircuRuleVal() {
		return circuRuleVal;
	}

	public void setCircuRuleVal(String circuRuleVal) {
		this.circuRuleVal = circuRuleVal;
	}

	public Long getOverduedaysFrom() {
		return overduedaysFrom;
	}

	public void setOverduedaysFrom(Long overduedaysFrom) {
		this.overduedaysFrom = overduedaysFrom;
	}

	public Long getOverduedaysTo() {
		return overduedaysTo;
	}

	public void setOverduedaysTo(Long overduedaysTo) {
		this.overduedaysTo = overduedaysTo;
	}

	public String getAssignMethodCode() {
		return assignMethodCode;
	}

	public void setAssignMethodCode(String assignMethodCode) {
		this.assignMethodCode = assignMethodCode;
	}

	public String getAssignMethodVal() {
		return assignMethodVal;
	}

	public void setAssignMethodVal(String assignMethodVal) {
		this.assignMethodVal = assignMethodVal;
	}

	public String getAssignRuleCode() {
		return assignRuleCode;
	}

	public void setAssignRuleCode(String assignRuleCode) {
		this.assignRuleCode = assignRuleCode;
	}

	public String getAssignRuleVal() {
		return assignRuleVal;
	}

	public void setAssignRuleVal(String assignRuleVal) {
		this.assignRuleVal = assignRuleVal;
	}

	public PlmsWorkOrderPoolCollectionRuleDto() {
		super();
	}

	public PlmsWorkOrderPoolCollectionRuleDto(String status, String name,
			String circuRuleCode, String circuRuleVal, Long overduedaysFrom,
			Long overduedaysTo, String assignMethodCode,
			String assignMethodVal, String assignRuleCode, String assignRuleVal) {
		super();
		this.status = status;
		this.name = name;
		this.circuRuleCode = circuRuleCode;
		this.circuRuleVal = circuRuleVal;
		this.overduedaysFrom = overduedaysFrom;
		this.overduedaysTo = overduedaysTo;
		this.assignMethodCode = assignMethodCode;
		this.assignMethodVal = assignMethodVal;
		this.assignRuleCode = assignRuleCode;
		this.assignRuleVal = assignRuleVal;
	}
    
    
	
}
