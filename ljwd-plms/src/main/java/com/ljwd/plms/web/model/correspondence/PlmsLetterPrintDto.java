package com.ljwd.plms.web.model.correspondence;

/**
 * 生成PDF模板时要在模板里替换的属性 实体
 * ClassName: PlmsLetterPrintDto 
 * @Description: TODO
 * @author zhengjizhao
 * @date 2016年10月27日下午5:34:18
 */
public class PlmsLetterPrintDto {

	
    private String letterAddr;//收信地址
    private String custName;//客户名称
    private String idCardNo;//身份证号码
    private String contractNo;//合同编号
    private String cutoffDateStr;//截止日期
    private String ttlAmtStr;//逾期的合计金额
    private String collectPhone;//崔收电话
    private String overduePrincipalStr;//逾期未还的本金
    private String overdueIntStr;//逾期未还的利息
    private String overdueBrokerFeeStr;//逾期居间费
    private String brokerFeeAndIntStr;//居间费 + 未还的利息
    private String overduePenaltyStr;//逾期违约金
    private String overdueFailCollectFeeStr;//逾期扣款失败费
    private String overdueDayStr;//逾期天数
    private String collector;//崔收专员
    private String clearAmtStr;//结清金额
    private String corresCode; //信函编号
    private String creaditQueryFee;  //划扣手续费
    
	
	public String getCreaditQueryFee() {
		return creaditQueryFee;
	}
	public void setCreaditQueryFee(String creaditQueryFee) {
		this.creaditQueryFee = creaditQueryFee;
	}
	public String getCorresCode() {
		return corresCode;
	}
	public void setCorresCode(String corresCode) {
		this.corresCode = corresCode;
	}
	public String getLetterAddr() {
		return letterAddr;
	}
	public void setLetterAddr(String letterAddr) {
		this.letterAddr = letterAddr;
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
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getCutoffDateStr() {
		return cutoffDateStr;
	}
	public void setCutoffDateStr(String cutoffDateStr) {
		this.cutoffDateStr = cutoffDateStr;
	}
	public String getTtlAmtStr() {
		return ttlAmtStr;
	}
	public void setTtlAmtStr(String ttlAmtStr) {
		this.ttlAmtStr = ttlAmtStr;
	}
	public String getCollectPhone() {
		return collectPhone;
	}
	public void setCollectPhone(String collectPhone) {
		this.collectPhone = collectPhone;
	}
	public String getOverduePrincipalStr() {
		return overduePrincipalStr;
	}
	public void setOverduePrincipalStr(String overduePrincipalStr) {
		this.overduePrincipalStr = overduePrincipalStr;
	}
	public String getOverdueIntStr() {
		return overdueIntStr;
	}
	public void setOverdueIntStr(String overdueIntStr) {
		this.overdueIntStr = overdueIntStr;
	}
	public String getOverdueBrokerFeeStr() {
		return overdueBrokerFeeStr;
	}
	public void setOverdueBrokerFeeStr(String overdueBrokerFeeStr) {
		this.overdueBrokerFeeStr = overdueBrokerFeeStr;
	}
	public String getBrokerFeeAndIntStr() {
		return brokerFeeAndIntStr;
	}
	public void setBrokerFeeAndIntStr(String brokerFeeAndIntStr) {
		this.brokerFeeAndIntStr = brokerFeeAndIntStr;
	}
	public String getOverduePenaltyStr() {
		return overduePenaltyStr;
	}
	public void setOverduePenaltyStr(String overduePenaltyStr) {
		this.overduePenaltyStr = overduePenaltyStr;
	}
	public String getOverdueFailCollectFeeStr() {
		return overdueFailCollectFeeStr;
	}
	public void setOverdueFailCollectFeeStr(String overdueFailCollectFeeStr) {
		this.overdueFailCollectFeeStr = overdueFailCollectFeeStr;
	}
	public String getOverdueDayStr() {
		return overdueDayStr;
	}
	public void setOverdueDayStr(String overdueDayStr) {
		this.overdueDayStr = overdueDayStr;
	}
	public String getCollector() {
		return collector;
	}
	public void setCollector(String collector) {
		this.collector = collector;
	}
	public String getClearAmtStr() {
		return clearAmtStr;
	}
	public void setClearAmtStr(String clearAmtStr) {
		this.clearAmtStr = clearAmtStr;
	}
    
}
