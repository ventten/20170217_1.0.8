package com.ljwd.plms.web.model.outVisit;

import java.util.Date;

import com.ljwd.plms.web.model.BaseModel;
/**
 * PLMS_OVM_OUT_DELAY
 * <p>Title: PlmsOvmOutDelay</p>
 * @author pangshanxing
 * @date 2016年10月19日下午5:36:02
 */
public class PlmsOvmOutDelay extends BaseModel{
	
    private Long id;   //外访延期ID

    private Long infoId; //对应PLMS_OVM_OUT_VISIT_INFO表中ID

    private Long delayTimes; //已延期次数

    private Long ovFinishTimes;//完成外访次数

    private Date lastFollowTime;//最后一次跟进时间

    //dto
    private Long applId;
    
    private Date expectCloseTime; //申请延期此案件的预计结案日期

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public Long getDelayTimes() {
        return delayTimes;
    }

    public void setDelayTimes(Long delayTimes) {
        this.delayTimes = delayTimes;
    }

    public Long getOvFinishTimes() {
        return ovFinishTimes;
    }

    public void setOvFinishTimes(Long ovFinishTimes) {
        this.ovFinishTimes = ovFinishTimes;
    }

    public Date getLastFollowTime() {
        return lastFollowTime;
    }

    public void setLastFollowTime(Date lastFollowTime) {
        this.lastFollowTime = lastFollowTime;
    }

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
	}

	public Date getExpectCloseTime() {
		return expectCloseTime;
	}

	public void setExpectCloseTime(Date expectCloseTime) {
		this.expectCloseTime = expectCloseTime;
	}
    
   
}