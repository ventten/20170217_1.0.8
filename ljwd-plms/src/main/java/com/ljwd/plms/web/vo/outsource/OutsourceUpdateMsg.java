package com.ljwd.plms.web.vo.outsource;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/16
 * 同步委外信息时发送到微贷的实体
 */
@XmlRootElement
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class OutsourceUpdateMsg implements Serializable {

    @XmlAttribute
    private String contractNo;              //合同编号
    @XmlAttribute
    private Long corpId;                    //外包公司ID
    @XmlAttribute
    private Date startDate;                 //委外日期
    @XmlAttribute
    private Date endDate;                   //预计退案日期
    @XmlAttribute
    private Date acutalEndDate;             //实际退案日期
    @XmlAttribute
    private BigDecimal feeRate;             //服务费率
    @XmlAttribute
    private String outsourceTypeCode;       //外包类型
    @XmlAttribute
    private BigDecimal receivableAmount;    //委外金额
    @XmlAttribute
    private String status;                  //委外状态
    @XmlAttribute
    private String submittedBy;             //提交人
    @XmlAttribute
    private Date submitTime;                //提交时间
    @XmlAttribute
    private String approvedBy;              //审批人
    @XmlAttribute
    private Date approveTime;               //审批时间
    @XmlAttribute
    private String lastExtentedBy;          //延期人
    @XmlAttribute
    private Date lastExtentTime;            //延期时间
    @XmlAttribute
    private Integer overdueDays;            //逾期天数

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
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

    public String getOutsourceTypeCode() {
        return outsourceTypeCode;
    }

    public void setOutsourceTypeCode(String outsourceTypeCode) {
        this.outsourceTypeCode = outsourceTypeCode;
    }

    public BigDecimal getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(BigDecimal receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }
}
