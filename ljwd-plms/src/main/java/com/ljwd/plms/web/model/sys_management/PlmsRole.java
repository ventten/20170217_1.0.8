package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.ActiveModel;
import com.ljwd.plms.web.model.BaseModel;

import java.util.Date;

/**
 * 系统角色表,plms_role
 * */
public class PlmsRole extends ActiveModel {

    private Long id;
    private String roleName;
    private String roleSign;
    private String description;

    //ext
    private boolean hasRole;        //是否拥有此角色
    private Long rowNo;          //行号

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleSign() {
        return roleSign;
    }

    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign == null ? null : roleSign.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public boolean isHasRole() {
        return hasRole;
    }

    public void setHasRole(boolean hasRole) {
        this.hasRole = hasRole;
    }

}