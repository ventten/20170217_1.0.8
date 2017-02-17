package com.ljwd.plms.web.vo.workorder_pool;

import java.util.Date;

public class PlmsProtectRuleDto {

	private String code;

    private String val;

    private Integer seq;

    private String ruleIsActive;

    private String ruleRemark;
    
    private Long id;

    private String assignCode;
    
    private String assignVal;

    private String setIsActive;

    private String setRemark;

    private String createdBy;

    private Date createTime;

    private String updatedBy;

    private Date updateTime;

    private Long recVer;

    private Long tagSeq;

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

	public String getRuleIsActive() {
		return ruleIsActive;
	}

	public void setRuleIsActive(String ruleIsActive) {
		this.ruleIsActive = ruleIsActive;
	}

	public String getRuleRemark() {
		return ruleRemark;
	}

	public void setRuleRemark(String ruleRemark) {
		this.ruleRemark = ruleRemark;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssignCode() {
		return assignCode;
	}

	public void setAssignCode(String assignCode) {
		this.assignCode = assignCode;
	}

	public String getSetIsActive() {
		return setIsActive;
	}

	public void setSetIsActive(String setIsActive) {
		this.setIsActive = setIsActive;
	}

	public String getSetRemark() {
		return setRemark;
	}

	public void setSetRemark(String setRemark) {
		this.setRemark = setRemark;
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
	
	
	

	public String getAssignVal() {
		return assignVal;
	}

	public void setAssignVal(String assignVal) {
		this.assignVal = assignVal;
	}

	public PlmsProtectRuleDto() {
		super();

	}

	public PlmsProtectRuleDto(String code, String val, Integer seq,
			String ruleIsActive, String ruleRemark, Long id, String assignCode,
			String assignVal, String setIsActive, String setRemark,
			String createdBy, Date createTime, String updatedBy,
			Date updateTime, Long recVer, Long tagSeq) {
		super();
		this.code = code;
		this.val = val;
		this.seq = seq;
		this.ruleIsActive = ruleIsActive;
		this.ruleRemark = ruleRemark;
		this.id = id;
		this.assignCode = assignCode;
		this.assignVal = assignVal;
		this.setIsActive = setIsActive;
		this.setRemark = setRemark;
		this.createdBy = createdBy;
		this.createTime = createTime;
		this.updatedBy = updatedBy;
		this.updateTime = updateTime;
		this.recVer = recVer;
		this.tagSeq = tagSeq;
	}

	
    
}
