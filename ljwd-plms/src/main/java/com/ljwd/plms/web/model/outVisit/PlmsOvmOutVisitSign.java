package com.ljwd.plms.web.model.outVisit;

import java.util.Date;

import com.ljwd.plms.web.model.ActiveModel;

public class PlmsOvmOutVisitSign extends ActiveModel{
    
	private Long id;

    private Long planId; 	//plms_OVM_OUT_VISIT_PLAN中的Id

    private String signBy;	//签到人

    private Date signTime;	//签到时间

    private String signAddress;	//签到地址

 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public String getSignBy() {
        return signBy;
    }

    public void setSignBy(String signBy) {
        this.signBy = signBy == null ? null : signBy.trim();
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getSignAddress() {
        return signAddress;
    }

    public void setSignAddress(String signAddress) {
        this.signAddress = signAddress == null ? null : signAddress.trim();
    }

}