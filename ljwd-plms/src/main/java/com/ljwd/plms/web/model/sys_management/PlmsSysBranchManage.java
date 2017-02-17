package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * PLMS_SYS_BRANCH_MANAGE 分行监管
 * @author pangshanxing
 * @date 2017年2月9日下午3:05:27
 */
public class PlmsSysBranchManage extends ActiveModel{
   
	private Long id;				//ID

    private String userId;			//用户名

    private String siteCode;		//监管的分行

    private String remark;			//注释

   
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
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
    
}