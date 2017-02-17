package com.ljwd.plms.web.vo.outVisit;

public class OutVisitDelayDto {
	
	  //延期申请
	  private String infoIdStrs; 
	  private String delayDuration;//延期时长,一周
	  private String delayReason; //延期原因
	  private Long[] infoIds;
	
	  //延期审批
	  private String delayIdsStr;
	  private String delayDtlIdsStr;
	  private String delayAuditResult;//延期审批情况,延期未审批(NOT_APPROVED)、延期已通过(PASS)、延期拒绝(REJECT)
	  private String delayAuditRefuse;//延期拒绝原因
	  private Long[] delayIds;
	  private Long[] delayDtlIds;
	
	public String getDelayDuration() {
		return delayDuration;
	}
	public void setDelayDuration(String delayDuration) {
		this.delayDuration = delayDuration;
	}
	public String getDelayReason() {
		return delayReason;
	}
	public void setDelayReason(String delayReason) {
		this.delayReason = delayReason;
	}
	public String getInfoIdStrs() {
		return infoIdStrs;
	}
	public void setInfoIdStrs(String infoIdStrs) {
		this.infoIdStrs = infoIdStrs;
	}
	public Long[] getInfoIds() {
		return infoIds;
	}
	public void setInfoIds(Long[] infoIds) {
		this.infoIds = infoIds;
	}
	
	public String getDelayAuditResult() {
		return delayAuditResult;
	}
	public void setDelayAuditResult(String delayAuditResult) {
		this.delayAuditResult = delayAuditResult;
	}
	public String getDelayAuditRefuse() {
		return delayAuditRefuse;
	}
	public void setDelayAuditRefuse(String delayAuditRefuse) {
		this.delayAuditRefuse = delayAuditRefuse;
	}
	public String getDelayIdsStr() {
		return delayIdsStr;
	}
	public void setDelayIdsStr(String delayIdsStr) {
		this.delayIdsStr = delayIdsStr;
	}
	public String getDelayDtlIdsStr() {
		return delayDtlIdsStr;
	}
	public void setDelayDtlIdsStr(String delayDtlIdsStr) {
		this.delayDtlIdsStr = delayDtlIdsStr;
	}
	public Long[] getDelayIds() {
		return delayIds;
	}
	public void setDelayIds(Long[] delayIds) {
		this.delayIds = delayIds;
	}
	public Long[] getDelayDtlIds() {
		return delayDtlIds;
	}
	public void setDelayDtlIds(Long[] delayDtlIds) {
		this.delayDtlIds = delayDtlIds;
	}
	
	
	  
	  

}
