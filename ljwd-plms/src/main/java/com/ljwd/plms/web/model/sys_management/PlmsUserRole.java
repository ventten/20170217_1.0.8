package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.ActiveModel;
import com.ljwd.plms.web.model.BaseModel;

import java.util.Date;

/**
 * 用户角色表,plms_user_role
 * */
public class PlmsUserRole extends ActiveModel {

    private Long id;
    private String userId;
    private Long roleId;

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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}