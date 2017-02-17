package com.ljwd.plms.web.model.sys_management;

import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

/**
 * Created by zhengzw on 2016/6/14
 */
public class SysUserExample extends BaseExample {

    private String userId;        //用户名
    private String userName;      //用户名
    private String isActive;      //数据有效性
    private Long roleId;          //角色ID

    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("userId","T.USER_ID ");
        sortMap.put("userName","USER_NAME ");
        sortMap.put("isActiveText","IS_ACTIVE ");
        sortMap.put("updatedBy","UPDATED_BY ");
        sortMap.put("updateTime","UPDATE_TIME ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }
    public Long getRoleId() {
        return roleId;
    }

    public SysUserExample setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public SysUserExample setUserId(String userId) {
        this.userId = (userId == null || "".equals(userId) || "".equals(userId.trim())) ? null : userId.trim();
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public SysUserExample setUserName(String userName) {
        this.userName = (userName == null || "".equals(userName) || "".equals(userName.trim())) ? null : userName.trim();
        return this;
    }

    public String getIsActive() {
        return isActive;
    }

    public SysUserExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

}
