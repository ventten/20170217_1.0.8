package com.ljwd.plms.web.model.outVisit;

import java.util.Date;

import com.ljwd.plms.web.model.BaseModel;
/**
 * PLMS_OVM_OUT_DELAY_DTL
 * <p>Title: PlmsOvmOutDelayDtl</p>
 * @author pangshanxing
 * @date 2016年10月19日下午5:48:16
 */
public class PlmsOvmOutDelayDtl extends BaseModel{
   
	private Long id;

    private Long delayId; //对应PLMS_OVM_OUT_DELAY中的ID

    private Date expectCloseTime; //申请延期时此案件的预计结案日期

    private Date delaySubmitTime; //延期申请日期

    private String delaySubmitBy;//延期申请人

    private String delayDuration;//延期时长,一周
    
    private String delayReason; //延期原因

    private String delayAuditResult;//延期审批情况,延期未审批(NOT_APPROVED)、延期已通过(PASS)、延期拒绝(REJECT)

    private Date delayAuditTime;//延期审批日期

    private String delayAuditBy;//延期审批人

    private String delayAuditRefuse;//延期拒绝原因


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDelayId() {
        return delayId;
    }

    public void setDelayId(Long delayId) {
        this.delayId = delayId;
    }

    public Date getExpectCloseTime() {
        return expectCloseTime;
    }

    public void setExpectCloseTime(Date expectCloseTime) {
        this.expectCloseTime = expectCloseTime;
    }

    public Date getDelaySubmitTime() {
        return delaySubmitTime;
    }

    public void setDelaySubmitTime(Date delaySubmitTime) {
        this.delaySubmitTime = delaySubmitTime;
    }

    public String getDelaySubmitBy() {
        return delaySubmitBy;
    }

    public void setDelaySubmitBy(String delaySubmitBy) {
        this.delaySubmitBy = delaySubmitBy == null ? null : delaySubmitBy.trim();
    }

    public String getDelayDuration() {
        return delayDuration;
    }

    public void setDelayDuration(String delayDuration) {
        this.delayDuration = delayDuration == null ? null : delayDuration.trim();
    }

    public String getDelayAuditResult() {
        return delayAuditResult;
    }

    public void setDelayAuditResult(String delayAuditResult) {
        this.delayAuditResult = delayAuditResult == null ? null : delayAuditResult.trim();
    }

    public Date getDelayAuditTime() {
        return delayAuditTime;
    }

    public void setDelayAuditTime(Date delayAuditTime) {
        this.delayAuditTime = delayAuditTime;
    }

    public String getDelayAuditBy() {
        return delayAuditBy;
    }

    public void setDelayAuditBy(String delayAuditBy) {
        this.delayAuditBy = delayAuditBy == null ? null : delayAuditBy.trim();
    }

    public String getDelayAuditRefuse() {
        return delayAuditRefuse;
    }

    public void setDelayAuditRefuse(String delayAuditRefuse) {
        this.delayAuditRefuse = delayAuditRefuse == null ? null : delayAuditRefuse.trim();
    }

	public String getDelayReason() {
		return delayReason;
	}

	public void setDelayReason(String delayReason) {
		this.delayReason = delayReason;
	}

    
}