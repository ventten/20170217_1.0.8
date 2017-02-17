package com.ljwd.plms.web.model.outVisit;

import com.ljwd.plms.web.model.BaseExample;



public class PlmsOvmOutDelayDtlExample extends BaseExample{
	
	private Long id;
	 
	private Long delayId; //对应PLMS_OVM_OUT_DELAY中的ID

    private String delayAuditResult;//延期审批情况,延期未审批(NOT_APPROVED)、延期已通过(PASS)、延期拒绝(REJECT)

	
    
    
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

	public String getDelayAuditResult() {
		return delayAuditResult;
	}

	public void setDelayAuditResult(String delayAuditResult) {
		this.delayAuditResult = delayAuditResult;
	}

    
	
}