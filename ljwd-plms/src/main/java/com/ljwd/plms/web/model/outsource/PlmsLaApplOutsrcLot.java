package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseModel;

/**
 * 委外申请批次表,PLMS_LA_APPL_OUTSRC_LOT
 * */
public class PlmsLaApplOutsrcLot extends BaseModel {

    public static final String STATUS_USE = "USE";                  //状态:使用中
    public static final String STATUS_END = "END";                  //状态:结束

    private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private Long applId;                    //借款ID
    private Long cntrctId;                  //合同ID
    private String status;                  //USE,END
    private String lotNo;                   //批次编号

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

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

}