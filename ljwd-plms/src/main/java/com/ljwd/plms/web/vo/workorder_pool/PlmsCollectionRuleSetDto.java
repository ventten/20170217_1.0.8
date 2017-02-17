package com.ljwd.plms.web.vo.workorder_pool;

import java.util.Date;

public class PlmsCollectionRuleSetDto {

	private Long id;

    private Integer val;

    private String name;
    
    private String status;

    private String circuRuleCode;
    
    private String circuRuleVal;

    private String assignMethodCode;
    
    private String assignMethodVal;

    private String assignRuleCode;
    
    private String assignRuleVal;

    private String isRunning;

    private String isActive;

    private String remark;

    private String createdBy;

    private Date createTime;

    private String updatedBy;

    private Date updateTime;

    private Long recVer;

    private Long tagSeq;
    /*逾期天数*/
    private Long overduedaysFrom;

    private Long overduedaysTo;
    /*风险等级*/
    private String riskLevelCode;
    
    private String riskLevelval;
    /*组长分配月上限值*/
    private Integer upperLimit;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getIsRunning() {
		return isRunning;
	}

	public void setIsRunning(String isRunning) {
		this.isRunning = isRunning;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getRecVer() {
		return recVer;
	}

	public void setRecVer(Long recVer) {
		this.recVer = recVer;
	}

	public Long getTagSeq() {
		return tagSeq;
	}

	public void setTagSeq(Long tagSeq) {
		this.tagSeq = tagSeq;
	}
	
	
	

	public PlmsCollectionRuleSetDto() {
		super();
	}

	public PlmsCollectionRuleSetDto(Long id, Integer val, String name,
			String status, String circuRuleCode, String circuRuleVal,
			String assignMethodCode, String assignMethodVal,
			String assignRuleCode, String assignRuleVal, String isRunning,
			String isActive, String remark, String createdBy, Date createTime,
			String updatedBy, Date updateTime, Long recVer, Long tagSeq) {
		super();
		this.id = id;
		this.val = val;
		this.name = name;
		this.status = status;
		this.circuRuleCode = circuRuleCode;
		this.circuRuleVal = circuRuleVal;
		this.assignMethodCode = assignMethodCode;
		this.assignMethodVal = assignMethodVal;
		this.assignRuleCode = assignRuleCode;
		this.assignRuleVal = assignRuleVal;
		this.isRunning = isRunning;
		this.isActive = isActive;
		this.remark = remark;
		this.createdBy = createdBy;
		this.createTime = createTime;
		this.updatedBy = updatedBy;
		this.updateTime = updateTime;
		this.recVer = recVer;
		this.tagSeq = tagSeq;
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

	public String getRiskLevelCode() {
		return riskLevelCode;
	}

	public void setRiskLevelCode(String riskLevelCode) {
		this.riskLevelCode = riskLevelCode;
	}

	public String getRiskLevelval() {
		return riskLevelval;
	}

	public void setRiskLevelval(String riskLevelval) {
		this.riskLevelval = riskLevelval;
	}

	public Integer getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(Integer upperLimit) {
		this.upperLimit = upperLimit;
	}

	public PlmsCollectionRuleSetDto(String status, String circuRuleCode,
			String circuRuleVal, String assignMethodCode,
			String assignMethodVal, String assignRuleCode,
			String assignRuleVal, Long overduedaysFrom, Long overduedaysTo,
			Integer upperLimit) {
		super();
		this.status = status;
		this.circuRuleCode = circuRuleCode;
		this.circuRuleVal = circuRuleVal;
		this.assignMethodCode = assignMethodCode;
		this.assignMethodVal = assignMethodVal;
		this.assignRuleCode = assignRuleCode;
		this.assignRuleVal = assignRuleVal;
		this.overduedaysFrom = overduedaysFrom;
		this.overduedaysTo = overduedaysTo;
		this.upperLimit = upperLimit;
	}

	public PlmsCollectionRuleSetDto(Long id, String name, String status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}

	
	

    
}
