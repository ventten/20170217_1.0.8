package com.ljwd.plms.web.model.messageSystem;
/**
 * 短信生成中客户联系人信息实体
 * @author zhengjizhao
 *
 */
public class MesContact {
	private Long conId; //记录ID
	private Long clCustId; //客户信息表ID
	private String srcCode; //来源：微贷、聚信立、网络、外部机构、客户来电
	private Long applId; //贷款申请ID
	private String rltnshp; //关系:配偶、朋友、公司、同事、亲戚
	private String conName; //联系人姓名
	private String telType; //号码类型
	private String telNum; //号码
	
	public Long getConId() {
		return conId;
	}
	public void setConId(Long conId) {
		this.conId = conId;
	}
	public Long getClCustId() {
		return clCustId;
	}
	public void setClCustId(Long clCustId) {
		this.clCustId = clCustId;
	}
	public String getSrcCode() {
		return srcCode;
	}
	public void setSrcCode(String srcCode) {
		this.srcCode = srcCode;
	}
	public Long getApplId() {
		return applId;
	}
	public void setApplId(Long applId) {
		this.applId = applId;
	}
	public String getRltnshp() {
		return rltnshp;
	}
	public void setRltnshp(String rltnshp) {
		this.rltnshp = rltnshp;
	}
	public String getConName() {
		return conName;
	}
	public void setConName(String conName) {
		this.conName = conName;
	}
	public String getTelType() {
		return telType;
	}
	public void setTelType(String telType) {
		this.telType = telType;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
}
