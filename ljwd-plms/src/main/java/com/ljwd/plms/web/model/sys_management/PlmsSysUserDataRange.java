package com.ljwd.plms.web.model.sys_management;


import com.ljwd.plms.web.model.BaseModel;

public class PlmsSysUserDataRange extends BaseModel{
    private Long id;

    private String userId; //用户ID

    private Long orgId;  //权限机构Id

    private String generatedBy; //操作者
    
    
    //dto
    
    private Long userOrgId; //用户所属机构Id
    
    private String userOrgName; //用户所属机构名称
    
    private String userName; //员工姓名
    
    private String orgNames; //权限机构名称集

    private String orgIds;  //权限机构集
    
    private Long rowNo;  //行号


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy == null ? null : generatedBy.trim();
    }

	public Long getUserOrgId() {
		return userOrgId;
	}

	public void setUserOrgId(Long userOrgId) {
		this.userOrgId = userOrgId;
	}

	public String getUserOrgName() {
		return userOrgName;
	}

	public void setUserOrgName(String userOrgName) {
		this.userOrgName = userOrgName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrgNames() {
		return orgNames;
	}

	public void setOrgNames(String orgNames) {
		this.orgNames = orgNames;
	}

	public String getOrgIds() {
		return orgIds;
	}

	public void setOrgIds(String orgIds) {
		this.orgIds = orgIds;
	}

	public Long getRowNo() {
		return rowNo;
	}

	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
	}

    
    
}