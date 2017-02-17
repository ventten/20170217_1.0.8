package com.ljwd.plms.web.model.sys_management;


import com.ljwd.plms.web.model.BaseModel;

public class SysOrg extends BaseModel{
   
	private Long id; 	//记录ID
    private Long pid;	//上级组织机构
    private String orgNo;	//组织机构编号
    private String orgName;	//组织机构名称
    private String leaderUserId;	//leader user id
    private String leaderName;	//组织机构负责人姓名
    private String leaderTel;	//负责人联系电话
    private String fax;		//传真
    private String tel;		//办公电话
    private String addr;	//办公地址
    private String post;	//邮编	
    private String isSite;	//是否网点
    private String remark;	//备注	
    private String isAppr;	//是否审批部门
    private String siteCode;	//网点编码
    private String orgType;		//SALES_GROUP, BRNACH, APPR_DEP, OPR_DEP

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
    	if(pid==null){
    		return 0L;
    	}else{
            return pid;
    	}
    }

    public void setPid(Long pid) {
        this.pid = pid == null ? 0 :pid;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getLeaderUserId() {
        return leaderUserId;
    }

    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId == null ? null : leaderUserId.trim();
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName == null ? null : leaderName.trim();
    }

    public String getLeaderTel() {
        return leaderTel;
    }

    public void setLeaderTel(String leaderTel) {
        this.leaderTel = leaderTel == null ? null : leaderTel.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getIsSite() {
        return isSite;
    }

    public void setIsSite(String isSite) {
        this.isSite = isSite == null ? null : isSite.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIsAppr() {
        return isAppr;
    }

    public void setIsAppr(String isAppr) {
        this.isAppr = isAppr == null ? null : isAppr.trim();
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }
}