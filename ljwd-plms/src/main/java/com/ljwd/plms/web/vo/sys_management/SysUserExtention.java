package com.ljwd.plms.web.vo.sys_management;

/**
 * Created by zhengzw on 2016/8/19
 * 系统用户分机号,SYS_USER_EXTENTION
 */
public class SysUserExtention {

    private Long id;                    //记录ID
    private String userId;              //用户ID
    private String extention;           //分机号
    private String prefix;              //前缀
    private String hotLine;             //电话号码
    private String cloudPwd;            //
    private String clidLeftNumber;      //
    private String siteDomain;          //
    private String areaCode;            //区号

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
        this.userId = userId;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getHotLine() {
        return hotLine;
    }

    public void setHotLine(String hotLine) {
        this.hotLine = hotLine;
    }

    public String getCloudPwd() {
        return cloudPwd;
    }

    public void setCloudPwd(String cloudPwd) {
        this.cloudPwd = cloudPwd;
    }

    public String getClidLeftNumber() {
        return clidLeftNumber;
    }

    public void setClidLeftNumber(String clidLeftNumber) {
        this.clidLeftNumber = clidLeftNumber;
    }

    public String getSiteDomain() {
        return siteDomain;
    }

    public void setSiteDomain(String siteDomain) {
        this.siteDomain = siteDomain;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

}
