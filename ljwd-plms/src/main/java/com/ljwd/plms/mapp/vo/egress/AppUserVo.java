package com.ljwd.plms.mapp.vo.egress;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 联金催收app登录用户信息
 * Created by tangjialin on 2016-11-16 0016.
 */
public class AppUserVo {
    @JsonIgnore
    private String userId;         // SysUser表USER_ID
    @JsonIgnore
    private Long   outVisitUserId; // PLMS_OVM_OUT_VISIT_USER表ID
    @JsonIgnore
    private String pwd;            // 用户表密码
    @JsonIgnore
    private String salt;           // 用户表密码加密盐
    private String name;           // 姓名
    private String empNo;          // 工号
    private String tel;         // 手机号码

    public String getUserId() {
        return userId;
    }

    public AppUserVo setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Long getOutVisitUserId() {
        return outVisitUserId;
    }

    public AppUserVo setOutVisitUserId(Long outVisitUserId) {
        this.outVisitUserId = outVisitUserId;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public AppUserVo setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public AppUserVo setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public String getName() {
        return name;
    }

    public AppUserVo setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmpNo() {
        return empNo;
    }

    public AppUserVo setEmpNo(String empNo) {
        this.empNo = empNo;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public AppUserVo setTel(String tel) {
        this.tel = tel;
        return this;
    }
}
