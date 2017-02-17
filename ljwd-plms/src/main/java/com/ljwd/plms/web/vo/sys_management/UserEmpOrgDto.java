package com.ljwd.plms.web.vo.sys_management;

/**
 * Created by zhengzw on 2016/8/24
 * 催收人员机构信息Dto
 */
public class UserEmpOrgDto {

    private String userId;          //用户ID
    private String userName;        //用户姓名
    private Long empId;             //员工ID(SYS_EMP员工表ID)
    private String empName;         //员工姓名
    private Long orgId;             //机构ID(SYS_ORG机构表ID)
    private String orgName;         //机构名字

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

}
