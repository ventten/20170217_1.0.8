package com.ljwd.plms.web.model.correspondence;

import java.math.BigDecimal;
import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;

/**
 * 查询出信涵生成记录实体
 * @author zhengjizhao
 * table : PLMS_LN_DOC_GEN_LOG
 */
public class PlmsDocumentGenLogDto extends PageRowNo{

	    private Long id; //主id
	    private String documentCode;//文档编码
	    private String documentName;//文档名称 （信函类别）
	    private Date genTime;//生成时间
	    private String genBy;//生成人
	    private Long contractId;//合同id
	    private Date cutoffDate;//截止日期
	    private BigDecimal principal;//剩余本金(逾期本金)
	    private BigDecimal interest;//剩余利息(逾期利息)
	    private BigDecimal brokerFee;//居间费
	    private BigDecimal overdueInterest;//逾期利息(逾期违约金)
	    private BigDecimal brokerFeeAndOverdueInterest; //利息和居间费  （********是利息和 剩余利息的和  不是和 逾期利息的和）
	    private BigDecimal failCollectFee;//扣款失败手续费
	    private BigDecimal collectCost;//催收费
	    private BigDecimal totalAmount;//总金额
	    private Integer overdueDay;//逾期天数
	    private String parameter;//其它参数 地址类别 和客户地址拼接参数
	    private String remark;//备注
	    private String genByName;//生成人姓名
	    private String contractNo;//合同编号
	    private String clientName;//客户名称
	    private String idCardNo;//身份证号码
	    private String loanName;//贷款人(值和clientName一样)
	    private String collector;//催收员名字
	    private String collectorApell;//催收员称呼
	    private String collectorId;//催收员Id
	    private String collectPhone;//催收员电话号码
	    private String gender;//催收员性别
	    private Integer coStatus;//信函状态
	    //下面三个属性是拆分其他参数 parameter ，方便数据查询
	    private String addrType;//地址类型
	    private String addres;//详细地址
	    private BigDecimal clearAmount; //结清金额= 总金额的和
	    //----------
	    private String clientPhone;//客户联系号码
	    private String corresCode; //信函编号
	    private Long applyId; //贷款ID
	    //----add by zjz date:2016-12-05
		private String rebackTypeInfo; //退回类型信息文字
		private Date rebackDate; //退回日期
		private String rebackInfo; //退回备注信息
		private String followedBy; //跟进人姓名（用做新增催记的时候）
		private BigDecimal creaditFee;  //划扣手续费
		
		private String coStatusFmt; //信函状态 转文字
		
		
		public String getCoStatusFmt() {
			if (coStatus == 0) {
                return "已生成";
            } else if (coStatus == 1) {
                return "已寄送";
            }else if (coStatus == 2) {
                return "已退回";
            } else {
                return "";
            }
		}
		public BigDecimal getCreaditFee() {
			return creaditFee;
		}
		public void setCreaditFee(BigDecimal creaditFee) {
			this.creaditFee = creaditFee;
		}
		public String getFollowedBy() {
			return followedBy;
		}
		public void setFollowedBy(String followedBy) {
			this.followedBy = followedBy;
		}
		public String getRebackTypeInfo() {
			return rebackTypeInfo;
		}
		public void setRebackTypeInfo(String rebackTypeInfo) {
			this.rebackTypeInfo = rebackTypeInfo;
		}
		public Date getRebackDate() {
			return rebackDate;
		}
		public void setRebackDate(Date rebackDate) {
			this.rebackDate = rebackDate;
		}
		public String getRebackInfo() {
			return rebackInfo;
		}
		public void setRebackInfo(String rebackInfo) {
			this.rebackInfo = rebackInfo;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDocumentCode() {
			return documentCode;
		}
		public void setDocumentCode(String documentCode) {
			this.documentCode = documentCode;
		}
		public String getDocumentName() {
			return documentName;
		}
		public void setDocumentName(String documentName) {
			this.documentName = documentName;
		}
		public Date getGenTime() {
			return genTime;
		}
		public void setGenTime(Date genTime) {
			this.genTime = genTime;
		}
		public String getGenBy() {
			return genBy;
		}
		public void setGenBy(String genBy) {
			this.genBy = genBy;
		}
		public Long getContractId() {
			return contractId;
		}
		public void setContractId(Long contractId) {
			this.contractId = contractId;
		}
		public Date getCutoffDate() {
			return cutoffDate;
		}
		public void setCutoffDate(Date cutoffDate) {
			this.cutoffDate = cutoffDate;
		}
		public BigDecimal getPrincipal() {
			return principal;
		}
		public void setPrincipal(BigDecimal principal) {
			this.principal = principal;
		}
		public BigDecimal getInterest() {
			return interest;
		}
		public void setInterest(BigDecimal interest) {
			this.interest = interest;
		}
		public BigDecimal getBrokerFee() {
			return brokerFee;
		}
		public void setBrokerFee(BigDecimal brokerFee) {
			this.brokerFee = brokerFee;
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
		public BigDecimal getCollectCost() {
			return collectCost;
		}
		public void setCollectCost(BigDecimal collectCost) {
			this.collectCost = collectCost;
		}
		public BigDecimal getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(BigDecimal totalAmount) {
			this.totalAmount = totalAmount;
		}
		public Integer getOverdueDay() {
			return overdueDay;
		}
		public void setOverdueDay(Integer overdueDay) {
			this.overdueDay = overdueDay;
		}
		public String getParameter() {
			return parameter;
		}
		public void setParameter(String parameter) {
			this.parameter = parameter;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getGenByName() {
			return genByName;
		}
		public void setGenByName(String genByName) {
			this.genByName = genByName;
		}
		public String getContractNo() {
			return contractNo;
		}
		public void setContractNo(String contractNo) {
			this.contractNo = contractNo;
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
		public String getLoanName() {
			return loanName;
		}
		public void setLoanName(String loanName) {
			this.loanName = loanName;
		}
		public String getCollector() {
			return collector;
		}
		public void setCollector(String collector) {
			this.collector = collector;
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Integer getCoStatus() {
			return coStatus;
		}
		public void setCoStatus(Integer coStatus) {
			this.coStatus = coStatus;
		}
		public BigDecimal getBrokerFeeAndOverdueInterest() {
			return brokerFeeAndOverdueInterest;
		}
		public void setBrokerFeeAndOverdueInterest(
				BigDecimal brokerFeeAndOverdueInterest) {
			this.brokerFeeAndOverdueInterest = brokerFeeAndOverdueInterest;
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
		public BigDecimal getClearAmount() {
			return clearAmount;
		}
		public void setClearAmount(BigDecimal clearAmount) {
			this.clearAmount = clearAmount;
		}
		public String getClientPhone() {
			return clientPhone;
		}
		public void setClientPhone(String clientPhone) {
			this.clientPhone = clientPhone;
		}
		public String getCorresCode() {
			return corresCode;
		}
		public void setCorresCode(String corresCode) {
			this.corresCode = corresCode;
		}
		public String getCollectorApell() {
			return collectorApell;
		}
		public void setCollectorApell(String collectorApell) {
			this.collectorApell = collectorApell;
		}
		public Long getApplyId() {
			return applyId;
		}
		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}
	    
}
