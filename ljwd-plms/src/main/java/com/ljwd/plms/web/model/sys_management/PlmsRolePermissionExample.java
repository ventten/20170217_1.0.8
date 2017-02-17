package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 角色权限表,plms_role_permission
 * */
public class PlmsRolePermissionExample extends BaseExample {

    private Long id;
    private Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public PlmsRolePermissionExample setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

}
