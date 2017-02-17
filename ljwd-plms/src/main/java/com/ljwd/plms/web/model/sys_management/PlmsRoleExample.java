package com.ljwd.plms.web.model.sys_management;


import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

/**
 * Created by zhengzw on 2016/6/14
 */
public class PlmsRoleExample extends BaseExample {

    private Long id;
    private Long recVer;            //Version
    private String isActive;        //Y/N
    private String roleName;        //角色名字
    private String roleSign;        //角色标识

    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("roleSign","T.ROLE_SIGN ");
        sortMap.put("roleName","T.ROLE_NAME ");
        sortMap.put("isActiveText","T.IS_ACTIVE ");
        sortMap.put("description","T.DESCRIPTION ");
        sortMap.put("updatedUserName","T.UPDATED_BY ");
        sortMap.put("updateTime","T.UPDATE_TIME ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }
    public Long getId() {
        return id;
    }

    public PlmsRoleExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsRoleExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsRoleExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public PlmsRoleExample setRoleName(String roleName) {
        this.roleName = (roleName == null || "".equals(roleName) || "".equals(roleName.trim())) ? null : roleName.trim();
        return this;
    }

    public String getRoleSign() {
        return roleSign;
    }

    public PlmsRoleExample setRoleSign(String roleSign) {
        this.roleSign = (roleSign == null || "".equals(roleSign) || "".equals(roleSign.trim())) ? null : roleSign.trim();
        return this;
    }

}