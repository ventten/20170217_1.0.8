package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.util.List;

/**
 * 合同概要表,LF_APPL_AC
 * */
public class LfApplAcExample extends BaseExample {

    private Long paymentId;                         //放款记录ID
    private Long applId;                            //贷款申请记录ID
    private Long cntrctId;                          //合同记录ID
    private String isOverdue;                       //是否逾期
    private List<Long> applIds;                     //借款IDS
    private List<Long> paymentIds;                  //放款IDS

    public Long getPaymentId() {
        return paymentId;
    }

    public LfApplAcExample setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public LfApplAcExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public LfApplAcExample setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
        return this;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public LfApplAcExample setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
        return this;
    }

    public List<Long> getApplIds() {
        return applIds;
    }

    public LfApplAcExample setApplIds(List<Long> applIds) {
        this.applIds = applIds;
        return this;
    }

    public List<Long> getPaymentIds() {
        return paymentIds;
    }

    public LfApplAcExample setPaymentIds(List<Long> paymentIds) {
        this.paymentIds = paymentIds;
        return this;
    }
}