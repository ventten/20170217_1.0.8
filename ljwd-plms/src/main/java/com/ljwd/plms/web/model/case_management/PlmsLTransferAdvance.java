package com.ljwd.plms.web.model.case_management;

import com.ljwd.plms.web.model.ActiveModel;

import java.util.Date;

/**
 * 提前移交案件表,PLMS_L_TRANSFER_ADVANCE
 * */
public class PlmsLTransferAdvance extends ActiveModel{
    
	private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private Long applId;                    //借款ID
    private Long overdueDays;               //申请移交时的自然逾期天数
    private String transfertype;            //移交类型
    private String transferreason;          //移交原因
    private String applicant;               //申请人
    private String circustatus;             //申请移交时案件所属区间
    private Date applydate;                 //申请日期
    private String status;                  //状态:TransferStatusType 枚举
    private String remark;                  //备注
    private String collector;               //此案件原催收员
    private String refusalReason;           //拒绝原因 REFUSAL_REASON
    //join-ext
    private String cntrctNo;                //合同编号

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

    public Long getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Long overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getTransfertype() {
        return transfertype;
    }

    public void setTransfertype(String transfertype) {
        this.transfertype = transfertype == null ? null : transfertype.trim();
    }

    public String getTransferreason() {
        return transferreason;
    }

    public void setTransferreason(String transferreason) {
        this.transferreason = transferreason == null ? null : transferreason.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getCircustatus() {
        return circustatus;
    }

    public void setCircustatus(String circustatus) {
        this.circustatus = circustatus == null ? null : circustatus.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

	public String getCollector() {
		return collector;
	}

	public void setCollector(String collector) {
		this.collector = collector;
	}

	public String getRefusalReason() {
		return refusalReason;
	}

	public void setRefusalReason(String refusalReason) {
		this.refusalReason = refusalReason;
	}

    
}