package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 委外申请批次表,PLMS_LA_APPL_OUTSRC_LOT
 * */
public class PlmsLaApplOutsrcLotExample extends BaseExample{

    private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private Long applId;                    //借款ID
    private Long cntrctId;                  //合同ID
    private Long recVer;                    //版本号
    private String status;                  //USE,END

    public Long getId() {
        return id;
    }

    public PlmsLaApplOutsrcLotExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public PlmsLaApplOutsrcLotExample setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public PlmsLaApplOutsrcLotExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public PlmsLaApplOutsrcLotExample setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsLaApplOutsrcLotExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PlmsLaApplOutsrcLotExample setStatus(String status) {
        this.status = (status == null || "".equals(status) || "".equals(status.trim())) ? null : status.trim();
        return this;
    }

}