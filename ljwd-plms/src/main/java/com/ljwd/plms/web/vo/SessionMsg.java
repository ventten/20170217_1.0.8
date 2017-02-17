package com.ljwd.plms.web.vo;

/**
 * Created by zhengzw on 2016/6/12 0012.
 * 存放session信息
 */
public class SessionMsg {

    private String name;        //登录名(userId)
    private String userName;    //用户姓名
    private Long orgId;         //机构ID

    public SessionMsg() {

    }

    public SessionMsg(String name) {
        this.name = name;
    }

    public SessionMsg(String name,String userName,Long orgId) {
        this.name = name;
        this.userName = userName;
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

}
