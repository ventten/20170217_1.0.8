package com.ljwd.plms.web.vo.case_collection;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;

public class CustRecivDetailExample extends BaseExample{

	 private String cntrctNo;                    //合同编号
	 private String custName;                    //主贷人
	 private String idCardNo;                   //身份证号
	 private String siteCode;					//所属网点
	 private String paymentType;				//放款类型
	 private String payStatus;					//还款状态
	 @DateTimeFormat( pattern = "yyyy-MM-dd" )
	 private Date reCollectDate;				//再扣日期
	 @DateTimeFormat( pattern = "yyyy-MM-dd" )
	 private Date repaymentDateFrom;			//应还款日期开始
	 @DateTimeFormat( pattern = "yyyy-MM-dd" )
	 private Date repaymentDateTo; 				//应还款日期截止
	 @DateTimeFormat( pattern = "yyyy-MM-dd" )
	 private Date collectDateFrom;				//扣款日期开始
	 @DateTimeFormat( pattern = "yyyy-MM-dd" )
	 private Date collectDateTo;				//扣款日期截止
	public String getCntrctNo() {
		return cntrctNo;
	}
	public void setCntrctNo(String cntrctNo) {
		this.cntrctNo = cntrctNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public Date getReCollectDate() {
		return reCollectDate;
	}
	public void setReCollectDate(Date reCollectDate) {
		this.reCollectDate = reCollectDate;
	}
	public Date getRepaymentDateFrom() {
		return repaymentDateFrom;
	}
	public void setRepaymentDateFrom(Date repaymentDateFrom) {
		this.repaymentDateFrom = repaymentDateFrom;
	}
	public Date getRepaymentDateTo() {
		return repaymentDateTo;
	}
	public void setRepaymentDateTo(Date repaymentDateTo) {
		this.repaymentDateTo = repaymentDateTo;
	}
	public Date getCollectDateFrom() {
		return collectDateFrom;
	}
	public void setCollectDateFrom(Date collectDateFrom) {
		this.collectDateFrom = collectDateFrom;
	}
	public Date getCollectDateTo() {
		return collectDateTo;
	}
	public void setCollectDateTo(Date collectDateTo) {
		this.collectDateTo = collectDateTo;
	}
	 
	 
}
