package com.ljwd.plms.web.vo.outVisit;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OutVisitPlanDto {
	
		private String addr; //外访地址
	  
		private Long id;

	    private Long applId;

	    private Long infoId; //外访信息表plms_ovm_out_visit_info的Id

	    private String planCode; //外访计划编号
		@DateTimeFormat( pattern = "yyyy-MM-dd" )
	    private Date planStartTime;//计划外访日期

	    private String planStatus; //计划外访状态

	    private Long signId; //签到表中对应的Id

	    private String address;//外访地址

	    private String addressType; //地址类型

	    private String addressValidity;//地址有效性

	    private String followupResults;//跟进结果

	    private String assistBy;//陪同人
		@DateTimeFormat( pattern = "yyyy-MM-dd" )
	    private Date ptpDate; //PTP日期

	    private BigDecimal ptpAmt;//PTP金额

	    private String ovtresultDetail;//外访详情

	    private String visitCancelType;//外访取消类别

	    private String visitCancelResion;//外访取消原因

	    private String remark;//备注
	    
	    private String signStatus; //外访计划签到状态。Signning(计划中)，Signned(已签到)
	    
	    private String validAddress; //有效的地址(外发结果中地址有效性为无效时，要填入的有效地址)
	    

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public Date getPlanStartTime() {
		return planStartTime;
	}

	public void setPlanStartTime(Date planStartTime) {
		this.planStartTime = planStartTime;
	}

	public String getAssistBy() {
		return assistBy;
	}

	public void setAssistBy(String assistBy) {
		this.assistBy = assistBy;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
	}

	public Long getInfoId() {
		return infoId;
	}

	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Long getSignId() {
		return signId;
	}

	public void setSignId(Long signId) {
		this.signId = signId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressValidity() {
		return addressValidity;
	}

	public void setAddressValidity(String addressValidity) {
		this.addressValidity = addressValidity;
	}

	public String getFollowupResults() {
		return followupResults;
	}

	public void setFollowupResults(String followupResults) {
		this.followupResults = followupResults;
	}

	public Date getPtpDate() {
		return ptpDate;
	}

	public void setPtpDate(Date ptpDate) {
		this.ptpDate = ptpDate;
	}

	public BigDecimal getPtpAmt() {
		return ptpAmt;
	}

	public void setPtpAmt(BigDecimal ptpAmt) {
		this.ptpAmt = ptpAmt;
	}

	public String getOvtresultDetail() {
		return ovtresultDetail;
	}

	public void setOvtresultDetail(String ovtresultDetail) {
		this.ovtresultDetail = ovtresultDetail;
	}

	public String getVisitCancelType() {
		return visitCancelType;
	}

	public void setVisitCancelType(String visitCancelType) {
		this.visitCancelType = visitCancelType;
	}

	public String getVisitCancelResion() {
		return visitCancelResion;
	}

	public void setVisitCancelResion(String visitCancelResion) {
		this.visitCancelResion = visitCancelResion;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSignStatus() {
		return signStatus;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public String getValidAddress() {
		return validAddress;
	}

	public void setValidAddress(String validAddress) {
		this.validAddress = validAddress;
	}
	  
	  

}
