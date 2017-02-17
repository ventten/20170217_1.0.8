package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/15
 * 委外申请同步记录表,PLMS_LA_APPL_OUTSRC_MSG
 * */
public class PlmsLaApplOutsrcMsgExample extends BaseExample{

    private Long id;                        //记录ID
    private Long applId;                    //借款ID
    private Long paymentId;                 //放款ID
    private String cntrctNo;                //合同编号
    private Long corpId;                    //外包公司ID
    private String msgStatus;               //同步状态:NEW-未同步,SEND-已同步
    private Long recVer;                    //版本号

    public Long getId() {
        return id;
    }

    public PlmsLaApplOutsrcMsgExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public PlmsLaApplOutsrcMsgExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public PlmsLaApplOutsrcMsgExample setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public PlmsLaApplOutsrcMsgExample setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
        return this;
    }

    public Long getCorpId() {
        return corpId;
    }

    public PlmsLaApplOutsrcMsgExample setCorpId(Long corpId) {
        this.corpId = corpId;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsLaApplOutsrcMsgExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public PlmsLaApplOutsrcMsgExample setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus;
        return this;
    }

}