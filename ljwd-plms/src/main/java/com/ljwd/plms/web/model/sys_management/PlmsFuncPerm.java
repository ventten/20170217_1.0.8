package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 功能权限表,PLMS_FUNC_PERM
 * */
public class PlmsFuncPerm extends ActiveModel{

    private Long id;                        //表id
    private Long funcId;                    //功能id
    private Long permissionId;              //权限id

    //join-ext
    private String permissionName;          //权限名称

    //ext
    private boolean hasPerm;                //是否已有此权限

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

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public boolean isHasPerm() {
        return hasPerm;
    }

    public void setHasPerm(boolean hasPerm) {
        this.hasPerm = hasPerm;
    }

}