package com.ljwd.plms.web.vo.case_management;

/**
 * 豁免案件Dto
 * LF_WAIVE_REQ
 * <p>Title: PlmsFeeWaiveApprovalResultDto</p>
 * @author pangshanxing
 * @date 2016年11月22日上午11:13:59
 */
public class PlmsFeeWaiveApprovalResultDto {

	public static final String STATUS_DRAFT = "DRAFT";				//豁免状态:待提交
	public static final String STATUS_SUBMITTED = "SUBMITTED";		//豁免状态:已添加
	public static final String STATUS_REJECTED = "REJECTED";		//豁免状态:审批拒绝
	public static final String STATUS_APPROVED = "APPROVED";		//豁免状态:审批通过

	private Long id;				//LF_WAIVE_REQ的id
	private Long paymentId;  		//放款记录ID
	private Long applId;     		//贷款申请单记录ID
	private String contractNo; 		//合同编号
	private String status; 			//豁免状态:DRAFT、SUBMITTED、REJECTED、APPROVED

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
