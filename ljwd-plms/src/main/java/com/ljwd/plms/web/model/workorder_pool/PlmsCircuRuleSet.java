package com.ljwd.plms.web.model.workorder_pool;

import java.util.Date;

public class PlmsCircuRuleSet {
    private Long id;

    private String code;

    private Long overduedaysFrom;

    private Long overduedaysTo;

    private String riskLevelCode;

    private String isActive;

    private String remark;

    private String createdBy;

    private Date createTime;

    private String updatedBy;

    private Date updateTime;

    private Long recVer;

    private Long tagSeq;
    
    private String name;
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getRiskLevelCode() {
        return riskLevelCode;
    }

    public void setRiskLevelCode(String riskLevelCode) {
        this.riskLevelCode = riskLevelCode == null ? null : riskLevelCode.trim();
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
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
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

   
}