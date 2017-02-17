package com.ljwd.plms.web.model.messageSystem;

import java.util.Date;

/**
 * 
* @ClassName: UserSearchResultItemDto 
* @Description: TODO(查询系统当前操作人员信息，从未带系统移植的，搞不清楚为什么这么封装) 
* @author zhengjizhao
* @date 2016年9月7日 下午3:06:41 
*
 */
public class UserSearchResultItemDto {
    private String userId;
    
    private Long employeeId;
    
    private String employeeName;
    
    private Long orgId;
    
    private String officeTelephone;
    
    private Date lastLoginTime;
    
    private Boolean isActive;
    
    private Long areaId;
    
    private String areaName;
    

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the orgId
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * @param orgId the orgId to set
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * @return the officeTelephone
     */
    public String getOfficeTelephone() {
        return officeTelephone;
    }

    /**
     * @param officeTelephone the officeTelephone to set
     */
    public void setOfficeTelephone(String officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    /**
     * @return the lastLoginTime
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime the lastLoginTime to set
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * @return the isActive
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * @return the employeeId
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
