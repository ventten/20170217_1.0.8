package com.ljwd.plms.web.vo.correspondence;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * ClassName: PlmsCorresExportDto 
 * @Description: excel文件导出时的数据实体
 * @author zhengjizhao
 * @date 2016年10月31日下午3:52:32
 */
public class PlmsCorresExportDto {

	private String documentName;//文档名称 （信函类别）
	private String clientName;//收件人
	private String idCardNo;//身份证号码
	private String contractNo;//合同编号
	private String genBy;//生成人
	private Date genTime;//生成时间
	private Integer overdueDay;//逾期天数
	private String addrType; //地址类别
	private String addres; //客户地址
	private String loanName;//贷款人
	private BigDecimal principal;//剩余本金(逾期本金)
	private BigDecimal overdueInterest;//逾期利息(逾期违约金)
	private BigDecimal failCollectFee;//扣款失败手续费
	private BigDecimal brokerFee;//利息 和 居间费
	private BigDecimal collectCost;//催收费
	private String createditFee; //划扣手续费
	private BigDecimal totalAmount;//总金额
	private String collector; //联系人
	private String collectPhone; //联系电话
	//private Long applId; //贷款申请id
	
	
	public String getDocumentName() {
		return documentName;
	}
	public String getCreateditFee() {
		return createditFee;
	}
	public void setCreateditFee(String createditFee) {
		this.createditFee = createditFee;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
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
	public String getGenBy() {
		return genBy;
	}
	public void setGenBy(String genBy) {
		this.genBy = genBy;
	}
	public Date getGenTime() {
		return genTime;
	}
	public void setGenTime(Date genTime) {
		this.genTime = genTime;
	}
	public Integer getOverdueDay() {
		return overdueDay;
	}
	public void setOverdueDay(Integer overdueDay) {
		this.overdueDay = overdueDay;
	}
	public String getAddrType() {
		return addrType;
	}
	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public BigDecimal getPrincipal() {
		return principal;
	}
	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}
	public BigDecimal getOverdueInterest() {
		return overdueInterest;
	}
	public void setOverdueInterest(BigDecimal overdueInterest) {
		this.overdueInterest = overdueInterest;
	}
	public BigDecimal getFailCollectFee() {
		return failCollectFee;
	}
	public void setFailCollectFee(BigDecimal failCollectFee) {
		this.failCollectFee = failCollectFee;
	}
	public BigDecimal getBrokerFee() {
		return brokerFee;
	}
	public void setBrokerFee(BigDecimal brokerFee) {
		this.brokerFee = brokerFee;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BigDecimal getCollectCost() {
		return collectCost;
	}
	public void setCollectCost(BigDecimal collectCost) {
		this.collectCost = collectCost;
	}
	public String getCollector() {
		return collector;
	}
	public void setCollector(String collector) {
		this.collector = collector;
	}
	public String getCollectPhone() {
		return collectPhone;
	}
	public void setCollectPhone(String collectPhone) {
		this.collectPhone = collectPhone;
	}
	/*public Long getApplId() {
		return applId;
	}
	public void setApplId(Long applId) {
		this.applId = applId;
	}*/
	
}
