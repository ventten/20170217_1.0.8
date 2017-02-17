package com.ljwd.plms.web.vo.sys_management;

import java.util.Date;

public class PlmsUserUpperLimitResultDto {
	 	private Long id;

	    private String orgNo; //机构编号
	    
	    private String orgName; //机构名称(ORG_NO)

	    private Long roleId; //角色Id
	    
	    private String roleName; 

	    private String userId;
	    
	    private String userName;

	    private Long upperLimit;

	    private String isActive;

	    private String createdBy;

	    private Date createTime;

	    private String updatedBy;

	    private Date updateTime;

	    private Long recVer;

	    private Long tagSeq;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOrgNo() {
			return orgNo;
		}

		public void setOrgNo(String orgNo) {
			this.orgNo = orgNo;
		}

		public String getOrgName() {
			return orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public Long getRoleId() {
			return roleId;
		}

		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getUpperLimit() {
			return upperLimit;
		}

		public void setUpperLimit(Long upperLimit) {
			this.upperLimit = upperLimit;
		}

		public String getIsActive() {
			return isActive;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
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
	    
	    

}
