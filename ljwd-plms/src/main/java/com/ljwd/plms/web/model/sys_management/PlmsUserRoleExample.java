package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14
 */
public class PlmsUserRoleExample extends BaseExample {

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

    public PlmsUserRoleExample setUserId(String userId) {
        this.userId = (userId == null || "".equals(userId) || "".equals(userId.trim())) ? null : userId.trim();
        return this;
    }

    public Long getRoleId() {
        return roleId;
    }

    public PlmsUserRoleExample setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

}
