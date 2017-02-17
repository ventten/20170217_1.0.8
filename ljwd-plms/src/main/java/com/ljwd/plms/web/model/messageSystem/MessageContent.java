package com.ljwd.plms.web.model.messageSystem;

import java.util.Date;

/**
 * 短信生成时信息实体
 * @author zhengjizhao
 *
 */
public class MessageContent {
	private Long applId;
	private String contractNo;
	private String paymentType;
	private String redeemStatus;
	private String relationMes;
	private String contactsMes;  //取到的联系人主键ID
	private String custNamaGo; //取到的联系人名字
	private String suiTableGroupMes;
	private String suiTableTypeMes;
	private Date hanstenDateMes;
	private String refundMes;
	private String telMes;
	private String messagetext;
	private Long periodNum;                 //逾期期数
	private String followedBy;              //跟进人姓名
	
	
	public String getCustNamaGo() {
		return custNamaGo;
	}
	public void setCustNamaGo(String custNamaGo) {
		this.custNamaGo = custNamaGo;
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
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getRedeemStatus() {
		return redeemStatus;
	}
	public void setRedeemStatus(String redeemStatus) {
		this.redeemStatus = redeemStatus;
	}
	public String getRelationMes() {
		return relationMes;
	}
	public void setRelationMes(String relationMes) {
		this.relationMes = relationMes;
	}
	public String getContactsMes() {
		return contactsMes;
	}
	public void setContactsMes(String contactsMes) {
		this.contactsMes = contactsMes;
	}
	public String getSuiTableGroupMes() {
		return suiTableGroupMes;
	}
	public void setSuiTableGroupMes(String suiTableGroupMes) {
		this.suiTableGroupMes = suiTableGroupMes;
	}
	public String getSuiTableTypeMes() {
		return suiTableTypeMes;
	}
	public void setSuiTableTypeMes(String suiTableTypeMes) {
		this.suiTableTypeMes = suiTableTypeMes;
	}
	public Date getHanstenDateMes() {
		return hanstenDateMes;
	}
	public void setHanstenDateMes(Date hanstenDateMes) {
		this.hanstenDateMes = hanstenDateMes;
	}
	public String getRefundMes() {
		return refundMes;
	}
	public void setRefundMes(String refundMes) {
		this.refundMes = refundMes;
	}
	public String getTelMes() {
		return telMes;
	}
	public void setTelMes(String telMes) {
		this.telMes = telMes;
	}
	public String getMessagetext() {
		return messagetext;
	}
	public void setMessagetext(String messagetext) {
		this.messagetext = messagetext;
	}
	
}
