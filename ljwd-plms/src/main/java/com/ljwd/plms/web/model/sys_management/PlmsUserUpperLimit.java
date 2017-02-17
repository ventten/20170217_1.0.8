package com.ljwd.plms.web.model.sys_management;


import com.ljwd.plms.web.model.ActiveModel;

public class PlmsUserUpperLimit extends ActiveModel {
    
	private Long id;

    private Long orgId;	//所属机构Id

    private Long roleId;	//角色ID
    
    private Integer upperLimit; //上限值

    //dto
    private String orgName;	//机构名称
    
    private String roleName; //角色名称
    
	private Long rowNo;  //行号

    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

	public Integer getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(Integer upperLimit) {
		this.upperLimit = upperLimit;
	}
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getRowNo() {
		return rowNo;
	}

	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
	}

	
    
}