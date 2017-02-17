package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 功能权限表,PLMS_FUNC_PERM
 * */
public class PlmsFuncPermExample extends BaseExample{

    private Long id;                        //表id
    private Long funcId;                    //功能id
    private Long permissionId;              //权限id
    private String isActive;                //数据有效性

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFuncId() {
        return funcId;
    }

    public void setFuncId(Long funcId) {
        this.funcId = funcId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsFuncPermExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }
}