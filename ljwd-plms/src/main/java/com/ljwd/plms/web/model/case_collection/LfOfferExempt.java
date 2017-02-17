package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.BaseModel;

import java.util.Date;

/**
 * 免除自动代扣,LF_OFFER_EXEMPT
 * */
public class LfOfferExempt extends BaseModel{

    public static final String STATUS_ADDED = "ADDED";              //状态：新增
    public static final String STATUS_CANCELLED = "CANCELLED";      //状态：取消

    private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private String status;                  //状态：ADDED,CANCELLED
    private Date endDate;                   //结束时间
    private String reqBy;                   //申请人
    private Date reqTime;                   //新增日期
    private String cancelledBy;             //作废人
    private Date cancelTime;                //作废时间

    //join-ext
    private Long applId;                    //借款申请ID
    private String custName;                //主贷人
    private String idCardNo;                //身份证号
    private String cntrctNo;                //合同编号
    private Integer overduePeriod;          //最早逾期期数
    private Integer maxOverduePeriod;       //最大逾期期数
    private String reqByName;               //申请人姓名

    //text-ext
    private Long rowNo;                     //行号
    private String endDateFmt;              //结束时间-格式化
    private String statusText;              //状态-显示值

    public String getEndDateFmt() {
        return D.parse(endDate);
    }

    public String getStatusText() {
        if(status == null){
            return "";
        }else if(STATUS_CANCELLED.equals(status)){
            return "取消";
        }else if(STATUS_ADDED.equals(status)){
            if(endDate != null && D.getSystemCalendar().getTime().compareTo(endDate) > 0){
                return "过期";
            }else {
                return "新增";
            }
        }else {
            return "";
        }
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getReqBy() {
        return reqBy;
    }

    public void setReqBy(String reqBy) {
        this.reqBy = reqBy == null ? null : reqBy.trim();
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public String getCancelledBy() {
        return cancelledBy;
    }

    public void setCancelledBy(String cancelledBy) {
        this.cancelledBy = cancelledBy == null ? null : cancelledBy.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public Integer getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Integer overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public Integer getMaxOverduePeriod() {
        return maxOverduePeriod;
    }

    public void setMaxOverduePeriod(Integer maxOverduePeriod) {
        this.maxOverduePeriod = maxOverduePeriod;
    }

    public String getReqByName() {
        return reqByName;
    }

    public void setReqByName(String reqByName) {
        this.reqByName = reqByName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

}