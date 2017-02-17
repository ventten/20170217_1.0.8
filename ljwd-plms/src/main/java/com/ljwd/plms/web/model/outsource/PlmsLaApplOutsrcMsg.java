package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/15
 * 委外申请同步记录表,PLMS_LA_APPL_OUTSRC_MSG
 * */
public class PlmsLaApplOutsrcMsg extends BaseModel{

    public static final String MSG_STATUS_NEW = "NEW";                  //同步状态-未同步
    public static final String MSG_STATUS_SEND_FAIL = "SEND_FAIL";     //同步状态-同步失败
    public static final String MSG_STATUS_SEND = "SEND";                //同步状态-同步成功

    private Long id;                        //记录ID
    private Long applId;                    //借款ID
    private Long paymentId;                 //放款ID
    private String cntrctNo;                //合同编号
    private Long corpId;                    //外包公司ID
    private Date startDate;                 //委外日期
    private Date endDate;                   //预计结案日期
    private Date acutalEndDate;             //实际结案日期
    private BigDecimal feeRate;             //服务费率
    private String outsrcType;              //外包类型
    private BigDecimal recivAmt;            //委外金额
    private String status;                  //委外状态
    private String submittedBy;             //提交人
    private Date submitTime;                //提交时间
    private String approvedBy;              //审批人
    private Date approveTime;               //审批时间
    private String lastExtentedBy;          //延期人
    private Date lastExtentTime;            //延期时间
    private Integer overdueDays;            //逾期天数
    private String msgStatus;               //同步状态:NEW-未同步,SEND_FAIL-同步失败,SEND-同步成功
    private String uuNo;                    //唯一的uuNO,做修改的条件

    public PlmsLaApplOutsrcMsg() {

    }

    public PlmsLaApplOutsrcMsg(BaseModel base) {
        setCreatedBy(base.getCreatedBy());
        setCreateTime(base.getCreateTime());
        setUpdatedBy(base.getUpdatedBy());
        setUpdateTime(base.getUpdateTime());
        setRecVer(base.getRecVer());
        setTagSeq(base.getTagSeq());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo == null ? null : cntrctNo.trim();
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
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

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus == null ? null : msgStatus.trim();
    }

    public String getUuNo() {
        return uuNo;
    }

    public void setUuNo(String uuNo) {
        this.uuNo = uuNo;
    }

}