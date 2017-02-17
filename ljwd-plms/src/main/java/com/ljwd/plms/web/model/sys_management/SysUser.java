package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.ActiveModel;

import java.util.Date;

/**
 * 系统用户表,sys_user
 * */
public class SysUser extends ActiveModel {

    private String userId;          //用户ID
    private String userName;        //用户姓名
    private String pwd;             //密码
    private String salt;            //加密盐值
    private String userType;        //用户类型 USER ADMIN
    private Long empId;             //对应员工ID
    private Date lastLoginTime;     //最后登录时间

    private Long rowNo;             //分页行数

    //join-ext
    private String roleNames;       //拥有的角色名称

    private Long orgId;             //机构ID

    public SysUser() {

    }

    public SysUser(String username, String password) {
        this.userName = username;
        this.pwd = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

}