package com.ljwd.plms.web.model.outVisit;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;

public class PlmsOvmOutVisitInfoExample extends BaseExample {

	private String custType; // 客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)

	private String submitReason; // 提交外访申请时的理由

	private Long[] checkedCase; // 选中案件的贷款申请ID(多选)
	
	private Long applId; //选中案件的贷款申请ID（单选）

	private Long[] ids; // 选择案件的在PLMS_OVM_OUT_VISIT_INFO中的id

	private String handelResult; // 操作结果

	private String auditRefusedReason; // 审核拒绝原因

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date closedDate; // 结案日期

	private String closedType; // 结案类别

	private String closedReason; // 结案原因

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getSubmitReason() {
		return submitReason;
	}

	public void setSubmitReason(String submitReason) {
		this.submitReason = submitReason;
	}

	public Long[] getCheckedCase() {
		return checkedCase;
	}

	public void setCheckedCase(Long[] checkedCase) {
		this.checkedCase = checkedCase;
	}

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	public String getHandelResult() {
		return handelResult;
	}

	public void setHandelResult(String handelResult) {
		this.handelResult = handelResult;
	}

	public String getAuditRefusedReason() {
		return auditRefusedReason;
	}

	public void setAuditRefusedReason(String auditRefusedReason) {
		this.auditRefusedReason = auditRefusedReason;
	}

	public Date getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public String getClosedType() {
		return closedType;
	}

	public void setClosedType(String closedType) {
		this.closedType = closedType;
	}

	public String getClosedReason() {
		return closedReason;
	}

	public void setClosedReason(String closedReason) {
		this.closedReason = closedReason;
	}

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
	}

	
	
}