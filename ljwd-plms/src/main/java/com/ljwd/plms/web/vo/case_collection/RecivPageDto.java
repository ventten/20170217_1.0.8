package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.model.case_collection.LfRecivDtl;
import com.ljwd.plms.web.vo.PageRowNo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/12
 * 应收记录分页Dto
 */
public class RecivPageDto extends PageRowNo{

    private Long recivId;                           //应收记录ID
    private Long cntrctId;                          //合同ID
    private Long applId;                            //借款ID
    private Long paymentId;                         //放款ID
    private Long repaymentPlanId;                   //还款计划ID
    private Integer periodNum;                      //期数
    private BigDecimal ttlRecivAmt;                 //该期总应收款
    private BigDecimal ttlActualAmt;                //总实收款
    private BigDecimal ttlWaivedAmt;                //总减免金额
    private Date actualRpmntDate;                   //实际还款日期
    private String isOverdue;                       //是否逾期
    private Date startDate;                         //起息日期
    private Date endDate;                           //结息日期
    private Date rpmntDate;                         //应还日期
    private Date maxRpmntDate;                      //最大应还日期
    private Integer failCollectNum;                 //代扣失败次数
    private Date reCollectDate;                     //重扣日期
    private Date lastCalcTime;                      //最后一次计算时间
    private String status;                          //还款状态
    private String statusVal;						//还款状态

    private String cntrctNo;                        //合同编号
    private BigDecimal loanAmount;                  //贷款金额
    private Date payDate;                           //放款日期
    private String custName;                        //主贷人
    private String idCardNo;                        //主贷人身份证
    private Integer overdueDays;                    //逾期天数

    private String bizCategory;                     //业务类型
    //应收明细
    private List<LfRecivDtl> receivableDetails = new ArrayList<LfRecivDtl>();
	public Long getRecivId() {
		return recivId;
	}
	public void setRecivId(Long recivId) {
		this.recivId = recivId;
	}
	public Long getCntrctId() {
		return cntrctId;
	}
	public void setCntrctId(Long cntrctId) {
		this.cntrctId = cntrctId;
	}
	public Long getApplId() {
		return applId;
	}
	public void setApplId(Long applId) {
		this.applId = applId;
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Long getRepaymentPlanId() {
		return repaymentPlanId;
	}
	public void setRepaymentPlanId(Long repaymentPlanId) {
		this.repaymentPlanId = repaymentPlanId;
	}
	public Integer getPeriodNum() {
		return periodNum;
	}
	public void setPeriodNum(Integer periodNum) {
		this.periodNum = periodNum;
	}
	public BigDecimal getTtlRecivAmt() {
		return ttlRecivAmt;
	}
	public void setTtlRecivAmt(BigDecimal ttlRecivAmt) {
		this.ttlRecivAmt = ttlRecivAmt;
	}
	public BigDecimal getTtlActualAmt() {
		return ttlActualAmt;
	}
	public void setTtlActualAmt(BigDecimal ttlActualAmt) {
		this.ttlActualAmt = ttlActualAmt;
	}
	public BigDecimal getTtlWaivedAmt() {
		return ttlWaivedAmt;
	}
	public void setTtlWaivedAmt(BigDecimal ttlWaivedAmt) {
		this.ttlWaivedAmt = ttlWaivedAmt;
	}
	public Date getActualRpmntDate() {
		return actualRpmntDate;
	}
	public void setActualRpmntDate(Date actualRpmntDate) {
		this.actualRpmntDate = actualRpmntDate;
	}
	public String getIsOverdue() {
		return isOverdue;
	}
	public void setIsOverdue(String isOverdue) {
		this.isOverdue = isOverdue;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getRpmntDate() {
		return rpmntDate;
	}
	public void setRpmntDate(Date rpmntDate) {
		this.rpmntDate = rpmntDate;
	}
	public Date getMaxRpmntDate() {
		return maxRpmntDate;
	}
	public void setMaxRpmntDate(Date maxRpmntDate) {
		this.maxRpmntDate = maxRpmntDate;
	}
	public Integer getFailCollectNum() {
		return failCollectNum;
	}
	public void setFailCollectNum(Integer failCollectNum) {
		this.failCollectNum = failCollectNum;
	}
	public Date getReCollectDate() {
		return reCollectDate;
	}
	public void setReCollectDate(Date reCollectDate) {
		this.reCollectDate = reCollectDate;
	}
	public Date getLastCalcTime() {
		return lastCalcTime;
	}
	public void setLastCalcTime(Date lastCalcTime) {
		this.lastCalcTime = lastCalcTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCntrctNo() {
		return cntrctNo;
	}
	public void setCntrctNo(String cntrctNo) {
		this.cntrctNo = cntrctNo;
	}
	public BigDecimal getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
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
	public Integer getOverdueDays() {
		return overdueDays;
	}
	public void setOverdueDays(Integer overdueDays) {
		this.overdueDays = overdueDays;
	}
	public String getBizCategory() {
		return bizCategory;
	}
	public void setBizCategory(String bizCategory) {
		this.bizCategory = bizCategory;
	}
	public List<LfRecivDtl> getReceivableDetails() {
		return receivableDetails;
	}
	public void setReceivableDetails(List<LfRecivDtl> receivableDetails) {
		this.receivableDetails = receivableDetails;
	}
	public String getStatusVal() {
		return statusVal;
	}
	public void setStatusVal(String statusVal) {
		this.statusVal = statusVal;
	}
    
    

}
