package com.ljwd.plms.web.model.workorder_pool;

import java.util.Date;

public class PlmsCollectionRuleSet {
    private Long id;

    private Integer val;

    private String name;

    private String status;

    private String circuRuleCode;

    private String assignMethodCode;

    private String assignRuleCode;

    private String isRunning;

    private String isActive;

    private String remark;

    private String createdBy;

    private Date createTime;

    private String updatedBy;

    private Date updateTime;

    private Long recVer;

    private Long tagSeq;

    private String orderType;

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
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCircuRuleCode() {
        return circuRuleCode;
    }

    public void setCircuRuleCode(String circuRuleCode) {
        this.circuRuleCode = circuRuleCode == null ? null : circuRuleCode.trim();
    }

    public String getAssignMethodCode() {
        return assignMethodCode;
    }

    public void setAssignMethodCode(String assignMethodCode) {
        this.assignMethodCode = assignMethodCode == null ? null : assignMethodCode.trim();
    }

    public String getAssignRuleCode() {
        return assignRuleCode;
    }

    public void setAssignRuleCode(String assignRuleCode) {
        this.assignRuleCode = assignRuleCode == null ? null : assignRuleCode.trim();
    }

    public String getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(String isRunning) {
        this.isRunning = isRunning == null ? null : isRunning.trim();
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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }
}