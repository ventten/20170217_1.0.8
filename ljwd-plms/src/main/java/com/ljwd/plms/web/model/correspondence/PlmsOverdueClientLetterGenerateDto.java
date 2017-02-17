package com.ljwd.plms.web.model.correspondence;

import java.math.BigDecimal;
import java.util.Date;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.vo.PageRowNo;
/**
 * 信函逾期数据查询实体
 * @author zhengjizhao
 *
 */
public class PlmsOverdueClientLetterGenerateDto extends PageRowNo{

	 	private String siteName;//网点
	    private String paymentType;//
	    private String paymentTypeName;//放款类别
	    private String clientName;//客户名称
	    private String idCardNo;//身份证号码
	    private String clientAddr;//客户地址
	    private String addrType;//客户地址类型
	    private String contractNo;//合同编号 --------------------（合同编号）
	    private BigDecimal loanAmount;//贷款金额
	    private Date repaymentDate;//应还款日期
	    private Integer overdueDay;//逾期天数
	    private Long paymentId;
	    private Long applyId;
	    private String collector;//崔收员姓名
	    private String gender;//崔收员性别
	    private String collectorId;//崔收员Id
	    private String collectPhone;//崔收电话
	    private Long contractId;//合同id
	    private BigDecimal remainderPrincipal;//剩余本金
	    private BigDecimal overduePrincipal;//逾期本金
	    private BigDecimal overdueInterest;//利息
	    private BigDecimal overdueBrokerFee;//逾期居间费
	    private BigDecimal overduePenalty;//逾期违约金(逾期利息)
	    private BigDecimal overdueFailCollectFee;//扣款失败手续费
	    private BigDecimal clearAmt;//结清金额
	    private String tmplCode; //信函模板code
	    private String tmplName; //信函模板名称
	    private Date createDate; //信函生成时间
	    private String corresCode; //信函编号
	    private BigDecimal creaditQueryFee; //划扣手续费
	    
	    private String repaymentDateFmt;//应还款日期格式化（yyy-mm-dd）
	    
		public String getRepaymentDateFmt() {
			return D.parse(repaymentDate);
		}
		public BigDecimal getCreaditQueryFee() {
			return creaditQueryFee;
		}
		public void setCreaditQueryFee(BigDecimal creaditQueryFee) {
			this.creaditQueryFee = creaditQueryFee;
		}
		public String getCorresCode() {
			return corresCode;
		}
		public void setCorresCode(String corresCode) {
			this.corresCode = corresCode;
		}
		public String getSiteName() {
			return siteName;
		}
		public void setSiteName(String siteName) {
			this.siteName = siteName;
		}
		public String getPaymentType() {
			return paymentType;
		}
		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}
		public String getPaymentTypeName() {
			return paymentTypeName;
		}
		public void setPaymentTypeName(String paymentTypeName) {
			this.paymentTypeName = paymentTypeName;
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
		public String getClientAddr() {
			return clientAddr;
		}
		public void setClientAddr(String clientAddr) {
			this.clientAddr = clientAddr;
		}
		public String getAddrType() {
			return addrType;
		}
		public void setAddrType(String addrType) {
			this.addrType = addrType;
		}
		public String getContractNo() {
			return contractNo;
		}
		public void setContractNo(String contractNo) {
			this.contractNo = contractNo;
		}
		public BigDecimal getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(BigDecimal loanAmount) {
			this.loanAmount = loanAmount;
		}
		public Date getRepaymentDate() {
			return repaymentDate;
		}
		public void setRepaymentDate(Date repaymentDate) {
			this.repaymentDate = repaymentDate;
		}
		public Integer getOverdueDay() {
			return overdueDay;
		}
		public void setOverdueDay(Integer overdueDay) {
			this.overdueDay = overdueDay;
		}
		public Long getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(Long paymentId) {
			this.paymentId = paymentId;
		}
		public Long getApplyId() {
			return applyId;
		}
		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}
		public String getCollector() {
			return collector;
		}
		public void setCollector(String collector) {
			this.collector = collector;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getCollectorId() {
			return collectorId;
		}
		public void setCollectorId(String collectorId) {
			this.collectorId = collectorId;
		}
		public String getCollectPhone() {
			return collectPhone;
		}
		public void setCollectPhone(String collectPhone) {
			this.collectPhone = collectPhone;
		}
		public Long getContractId() {
			return contractId;
		}
		public void setContractId(Long contractId) {
			this.contractId = contractId;
		}
		public BigDecimal getRemainderPrincipal() {
			return remainderPrincipal;
		}
		public void setRemainderPrincipal(BigDecimal remainderPrincipal) {
			this.remainderPrincipal = remainderPrincipal;
		}
		public BigDecimal getOverduePrincipal() {
			return overduePrincipal;
		}
		public void setOverduePrincipal(BigDecimal overduePrincipal) {
			this.overduePrincipal = overduePrincipal;
		}
		public BigDecimal getOverdueInterest() {
			return overdueInterest;
		}
		public void setOverdueInterest(BigDecimal overdueInterest) {
			this.overdueInterest = overdueInterest;
		}
		public BigDecimal getOverdueBrokerFee() {
			return overdueBrokerFee;
		}
		public void setOverdueBrokerFee(BigDecimal overdueBrokerFee) {
			this.overdueBrokerFee = overdueBrokerFee;
		}
		public BigDecimal getOverduePenalty() {
			return overduePenalty;
		}
		public void setOverduePenalty(BigDecimal overduePenalty) {
			this.overduePenalty = overduePenalty;
		}
		public BigDecimal getOverdueFailCollectFee() {
			return overdueFailCollectFee;
		}
		public void setOverdueFailCollectFee(BigDecimal overdueFailCollectFee) {
			this.overdueFailCollectFee = overdueFailCollectFee;
		}
		public BigDecimal getClearAmt() {
			return clearAmt;
		}
		public void setClearAmt(BigDecimal clearAmt) {
			this.clearAmt = clearAmt;
		}
		public String getTmplCode() {
			return tmplCode;
		}
		public void setTmplCode(String tmplCode) {
			this.tmplCode = tmplCode;
		}
		public String getTmplName() {
			return tmplName;
		}
		public void setTmplName(String tmplName) {
			this.tmplName = tmplName;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
	    
}
