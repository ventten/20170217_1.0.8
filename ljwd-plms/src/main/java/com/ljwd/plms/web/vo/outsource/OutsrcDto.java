package com.ljwd.plms.web.vo.outsource;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/10/13
 * 操作时需要的委外申请信息Dto
 */
public class OutsrcDto {

    private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private Long applId;                    //借款ID
    private Long comId;                     //委外机构ID
    private Long cntrctId;                  //合同ID
    private Date startDate;                 //委外日期
    private Date endDate;                   //预计结案日期
    private Date acutalEndDate;             //实际结案日期
    private BigDecimal feeRate;             //委外费率
    private String outsrcType;              //外包类型:一手,二手
    private BigDecimal recivAmt;            //委外金额
    private String status;                  //委外状态
    private Date acutalStartDate;           //委外实际开始日期
    private Long recVer;                    //版本号
    private Integer overdueDays;            //委外记录字段里的逾期天数
    private String lotNo;                   //批次编号
    private Integer isBack;                 //是否执行退回时新增的记录:null或0-否、1-是
    private String allot;                   //发起申请时案件的催收员
    private String workStatus;              //发起申请时案件的所在区间
    private Integer outsrcCount;            //外包次数
    private Long lastComId;                 //上一家委外公司
    private Integer endMonths;              //预计委外月数,默认为2

    private String submittedBy;             //提交人
    private Date submitTime;                //提交时间
    private String approvedBy;              //审批人
    private Date approveTime;               //审批时间
    private String lastExtentedBy;          //延期人
    private Date lastExtentTime;            //延期时间

    private Long corpId;                    //微贷委外机构表的ID
    private String comIsActive;             //委外公司是否有效

    private String cntrctNo;                //合同编号
    private String idCardNo;                //主贷人身份证号
    private Long overduePeriod;             //最小逾期期数
    private Integer overDaysNum;            //最小期未还期数的逾期天数(实时计算)
    private BigDecimal residueAmount;       //剩余本金
    private String winfoStatus;             //工作流状态/贷款状态
    private Long regionId;                  //区域ID

    private String poolStatus;              //案件当前所在区间
    private String circuRuleCode;           //案件当前所在区间的流转规则code
    private Long poolRecVer;                //案件当前版本号

    private Long maxEndedId;                //一般为null,只有查询条件isMaxEnded设为true,才会根据借款ID查询已结案且ID最大的记录ID

    public Long getLastComId() {
        return lastComId;
    }

    public void setLastComId(Long lastComId) {
        this.lastComId = lastComId;
    }

    public String getComIsActive() {
        return comIsActive;
    }

    public void setComIsActive(String comIsActive) {
        this.comIsActive = comIsActive;
    }

    public Integer getIsBack() {
        return isBack;
    }

    public void setIsBack(Integer isBack) {
        this.isBack = isBack;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Long getMaxEndedId() {
        return maxEndedId;
    }

    public void setMaxEndedId(Long maxEndedId) {
        this.maxEndedId = maxEndedId;
    }

    public Long getPoolRecVer() {
        return poolRecVer;
    }

    public void setPoolRecVer(Long poolRecVer) {
        this.poolRecVer = poolRecVer;
    }

    public String getCircuRuleCode() {
        return circuRuleCode;
    }

    public void setCircuRuleCode(String circuRuleCode) {
        this.circuRuleCode = circuRuleCode;
    }

    public String getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    public Long getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Long overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
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

    public Date getAcutalEndDate() {
        return acutalEndDate;
    }

    public void setAcutalEndDate(Date acutalEndDate) {
        this.acutalEndDate = acutalEndDate;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public String getOutsrcType() {
        return outsrcType;
    }

    public void setOutsrcType(String outsrcType) {
        this.outsrcType = outsrcType;
    }

    public BigDecimal getRecivAmt() {
        return recivAmt;
    }

    public void setRecivAmt(BigDecimal recivAmt) {
        this.recivAmt = recivAmt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAcutalStartDate() {
        return acutalStartDate;
    }

    public void setAcutalStartDate(Date acutalStartDate) {
        this.acutalStartDate = acutalStartDate;
    }

    public Long getRecVer() {
        return recVer;
    }

    public void setRecVer(Long recVer) {
        this.recVer = recVer;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Integer getOverDaysNum() {
        return overDaysNum;
    }

    public void setOverDaysNum(Integer overDaysNum) {
        this.overDaysNum = overDaysNum;
    }

    public BigDecimal getResidueAmount() {
        return residueAmount;
    }

    public void setResidueAmount(BigDecimal residueAmount) {
        this.residueAmount = residueAmount;
    }

    public Integer getOutsrcCount() {
        return outsrcCount;
    }

    public void setOutsrcCount(Integer outsrcCount) {
        this.outsrcCount = outsrcCount;
    }

    public String getWinfoStatus() {
        return winfoStatus;
    }

    public void setWinfoStatus(String winfoStatus) {
        this.winfoStatus = winfoStatus;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getAllot() {
        return allot;
    }

    public void setAllot(String allot) {
        this.allot = allot;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public String getLastExtentedBy() {
        return lastExtentedBy;
    }

    public void setLastExtentedBy(String lastExtentedBy) {
        this.lastExtentedBy = lastExtentedBy;
    }

    public Date getLastExtentTime() {
        return lastExtentTime;
    }

    public void setLastExtentTime(Date lastExtentTime) {
        this.lastExtentTime = lastExtentTime;
    }

    public Integer getEndMonths() {
        return endMonths;
    }

    public void setEndMonths(Integer endMonths) {
        this.endMonths = endMonths;
    }

}
