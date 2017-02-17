package com.ljwd.plms.web.vo.sys_management;

import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;
/**
 * <p>Title: BranchManageResult</p>
 * @author pangshanxing
 * @date 2017年2月10日下午5:10:34
 */
public class BranchManageResult extends PageRowNo{
	
	private Long orgId; 		//所属机构Id
	private String orgName;		//所属机构名称
	private String userId;		//员工Id
	private String userName;	//员工姓名
	private String branchSiteCodes;	//监管的分行site_code
	private String branchSiteNames;	//监管的分行site_name
	private String updatedBy;       //修改人
	private Date updateTime;        //修改日期
	private String updatedUserName;	//修改人
	public Long getOrgId(){
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
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
	public String getBranchSiteCodes() {
		return branchSiteCodes;
	}
	public void setBranchSiteCodes(String branchSiteCodes) {
		this.branchSiteCodes = branchSiteCodes;
	}
	public String getBranchSiteNames() {
		return branchSiteNames;
	}
	public void setBranchSiteNames(String branchSiteNames) {
		this.branchSiteNames = branchSiteNames;
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
	public String getUpdatedUserName() {
		return updatedUserName;
	}
	public void setUpdatedUserName(String updatedUserName) {
		this.updatedUserName = updatedUserName;
	}
	
	
	

}
