package com.ljwd.plms.web.vo.outVisit;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * * 外访计划详情 外访信息
 * <p>Title: AllOutVisitDetailInfoResult</p>
 * @author pangshanxing
 * @date 2016年11月8日下午2:33:01
 */
public class AllOutVisitDetailInfoResult {

	private Long id;
    private Long applId;
    private Long infoId; //外访信息表plms_ovm_out_visit_info的Id
    private String planCode; //外访计划编号
    private Date planStartTime;//计划外访日期
    private String signInfo;  //签到信息
    private String signAddress;	//签到地址
    private String assistBy;	//陪同人
    private String followupResults;//跟进结果
    private String followupResultsVal; ///跟进结果
    private Date ptpDate; //PTP日期
    private String ptpDateStr; //PTP日期
    private BigDecimal ptpAmt;//PTP金额
    private String addressValidity;//地址有效性
    private String addressValidityVal;//地址有效性
    private String address;//外访地址
    private String ovtresultDetail;//外访详情
    private String validAddress; //有效的地址(外发结果中地址有效性为无效时，要填入的有效地址)
    private String assistByNames; //陪同人
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getSignInfo() {
		return signInfo;
	}
	public void setSignInfo(String signInfo) {
		this.signInfo = signInfo;
	}
	public String getSignAddress() {
		return signAddress;
	}
	public void setSignAddress(String signAddress) {
		this.signAddress = signAddress;
	}
	public String getAssistBy() {
		return assistBy;
	}
	public void setAssistBy(String assistBy) {
		this.assistBy = assistBy;
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
	public String getPtpDateStr() {
		return ptpDateStr;
	}
	public void setPtpDateStr(String ptpDateStr) {
		this.ptpDateStr = ptpDateStr;
	}
	public BigDecimal getPtpAmt() {
		return ptpAmt;
	}
	public void setPtpAmt(BigDecimal ptpAmt) {
		this.ptpAmt = ptpAmt;
	}
	public String getAddressValidity() {
		return addressValidity;
	}
	public void setAddressValidity(String addressValidity) {
		this.addressValidity = addressValidity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOvtresultDetail() {
		return ovtresultDetail;
	}
	public void setOvtresultDetail(String ovtresultDetail) {
		this.ovtresultDetail = ovtresultDetail;
	}
	public String getAddressValidityVal() {
		return addressValidityVal;
	}
	public void setAddressValidityVal(String addressValidityVal) {
		this.addressValidityVal = addressValidityVal;
	}
	
	public String getFollowupResultsVal() {
		return followupResultsVal;
	}
	public void setFollowupResultsVal(String followupResultsVal) {
		this.followupResultsVal = followupResultsVal;
	}
	public String getValidAddress() {
		return validAddress;
	}
	public void setValidAddress(String validAddress) {
		this.validAddress = validAddress;
	}
	public String getAssistByNames() {
		return assistByNames;
	}
	public void setAssistByNames(String assistByNames) {
		this.assistByNames = assistByNames;
	}

	

    
}
