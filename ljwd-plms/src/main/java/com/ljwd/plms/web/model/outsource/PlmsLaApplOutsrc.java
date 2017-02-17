package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 委外申请表,PLMS_LA_APPL_OUTSRC
 * */
public class PlmsLaApplOutsrc extends BaseModel {

    public static final String OUT_SRC_TYPE_FIRST = "FIRST_HAND";       //外包类型:一手外包
    public static final String OUT_SRC_TYPE_SECOND = "SECOND_HAND";     //外包类型:二手外包

    public static final String CREATE_TYPE_AUTO = "AUTO";               //创建方式:系统跑批时创建
    public static final String CREATE_TYPE_HAND = "HAND";               //创建方式:催收员手动申请

    public static final String STATUS_AUDIT = "AUDIT";                  //状态:待审核
    public static final String STATUS_AUDIT_REJECT = "AUDIT_REJECT";    //状态:审核拒绝
    public static final String STATUS_DRAFT = "DRAFT";                  //状态:待提交
    public static final String STATUS_SUBMITTED = "SUBMITTED";          //状态:待审批(已提交)
    public static final String STATUS_REJECTED = "REJECTED";            //状态:审批拒绝
    public static final String STATUS_APPROVED = "APPROVED";            //状态:已审批
    public static final String STATUS_ENDED = "ENDED";                  //状态:已结案

    private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private Long applId;                    //借款ID
    private Long comId;                     //委外机构ID
    private Long cntrctId;                  //合同ID
    private Date startDate;                 //委外日期/申请日期
    private Date endDate;                   //退案日期
    private Date acutalEndDate;             //实际退案日期
    private BigDecimal feeRate;             //服务费率
    private String outsrcType;              //外包类型:一手,二手
    private BigDecimal recivAmt;            //应收总金额
    private String status;                  //委外状态:AUDIT,AUDIT_REJECT,DRAFT,SUBMITTED, APPROVED,ENDED,REJECTED
    private String submittedBy;             //提交人
    private Date submitTime;                //提交时间
    private String approvedBy;              //审批人
    private Date approveTime;               //审批时间
    private String lastExtentedBy;          //延期人
    private Date lastExtentTime;            //延期时间
    private String feedback;                //同行反馈
    private String reason;                  //委外原因
    private String remark;                  //备注
    private Integer overdueDays;            //逾期天数
    private String auditBy;                 //审核人
    private Date auditTime;                 //审核时间
    private Date acutalStartDate;           //委外实际开始日期
    private String lotNo;                   //批次编号
    private Integer isBack;                 //是否执行退回时新增的记录:null或0-否、1-是
    private String allot;                   //发起申请时案件的催收员
    private String workStatus;              //发起申请时案件的所在区间
    private String createType;              //创建方式:AUTO-系统跑批时创建,HAND-催收员手动申请
    private Integer outsrcCount;            //外包次数
    private Long lastComId;                 //上一家委外公司
    private Integer endMonths;              //预计委外月数,默认为2

    //join-ext
    private String cntrctNo;                //合同编号

    private Boolean isSetAcutalEndDateNull; //设为true时,批量修改时会将acutalEndDate改为null

    private Long regionId;                  //区域ID

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Integer getIsBack() {
        return isBack;
    }

    public void setIsBack(Integer isBack) {
        this.isBack = isBack;
    }

    public Boolean getIsSetAcutalEndDateNull(){
        return isSetAcutalEndDateNull;
    }

    public void setIsSetAcutalEndDateNull(Boolean isSetAcutalEndDateNull) {
        this.isSetAcutalEndDateNull = isSetAcutalEndDateNull;
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
        this.outsrcType = outsrcType == null ? null : outsrcType.trim();
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
        this.status = status == null ? null : status.trim();
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy == null ? null : submittedBy.trim();
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
        this.approvedBy = approvedBy == null ? null : approvedBy.trim();
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
        this.lastExtentedBy = lastExtentedBy == null ? null : lastExtentedBy.trim();
    }

    public Date getLastExtentTime() {
        return lastExtentTime;
    }

    public void setLastExtentTime(Date lastExtentTime) {
        this.lastExtentTime = lastExtentTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getAuditBy() {
        return auditBy;
    }

    public void setAuditBy(String auditBy) {
        this.auditBy = auditBy == null ? null : auditBy.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public Date getAcutalStartDate() {
        return acutalStartDate;
    }

    public void setAcutalStartDate(Date acutalStartDate) {
        this.acutalStartDate = acutalStartDate;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
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

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public Integer getOutsrcCount() {
        return outsrcCount;
    }

    public void setOutsrcCount(Integer outsrcCount) {
        this.outsrcCount = outsrcCount;
    }

    public Long getLastComId() {
        return lastComId;
    }

    public void setLastComId(Long lastComId) {
        this.lastComId = lastComId;
    }

    public Integer getEndMonths() {
        return endMonths;
    }

    public void setEndMonths(Integer endMonths) {
        this.endMonths = endMonths;
    }

}