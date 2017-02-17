package com.ljwd.plms.web.vo.workorder_pool;

import java.util.Date;

public class PlmsCircuRuleDto {

	
	private String code;
	
	private String val;
	    
	private Integer seq;

    private String ruleIsActive;

    private String grpName;

    private Long id;
    
    private String setIsActive;

    private Long overduedaysFrom;

    private Long overduedaysTo;

    private String riskLevelCode;
    
    private String riskLevelVal;
    
    private String remark;
    
    private Date createTime;

    private String createdBy;

    private Date updateTime;
    
    private String updatedBy;

    private Long recVer;

    private Long tagSeq;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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

	public String getSetIsActive() {
		return setIsActive;
	}

	public void setSetIsActive(String setIsActive) {
		this.setIsActive = setIsActive;
	}

	public String getRuleIsActive() {
		return ruleIsActive;
	}

	public void setRuleIsActive(String ruleIsActive) {
		this.ruleIsActive = ruleIsActive;
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

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	public String getRiskLevelVal() {
		return riskLevelVal;
	}

	public void setRiskLevelVal(String riskLevelVal) {
		this.riskLevelVal = riskLevelVal;
	}

	
	
	public PlmsCircuRuleDto() {
		
	}

	public PlmsCircuRuleDto(String code, String val, Integer seq,
			String ruleIsActive, String grpName, Long id, String setIsActive,
			Long overduedaysFrom, Long overduedaysTo, String riskLevelCode,
			String riskLevelVal, String remark, Date createTime,
			String createdBy, Date updateTime, String updatedBy, Long recVer,
			Long tagSeq) {
		super();
		this.code = code;
		this.val = val;
		this.seq = seq;
		this.ruleIsActive = ruleIsActive;
		this.grpName = grpName;
		this.id = id;
		this.setIsActive = setIsActive;
		this.overduedaysFrom = overduedaysFrom;
		this.overduedaysTo = overduedaysTo;
		this.riskLevelCode = riskLevelCode;
		this.riskLevelVal = riskLevelVal;
		this.remark = remark;
		this.createTime = createTime;
		this.createdBy = createdBy;
		this.updateTime = updateTime;
		this.updatedBy = updatedBy;
		this.recVer = recVer;
		this.tagSeq = tagSeq;
	}

    
    
    

}
