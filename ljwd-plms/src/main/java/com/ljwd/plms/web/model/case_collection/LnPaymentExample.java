package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 付款申请单信息,用于记录付款申请单信息,LN_PAYMENT
 * */
public class LnPaymentExample extends BaseExample {

    private Long id;                    //记录ID
    private Long applId;                //贷款申请单记录ID,贷款申请单信息表的记录ID
    private Long cntrctId;              //合同记录ID

    public Long getId() {
        return id;
    }

    public LnPaymentExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public LnPaymentExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public LnPaymentExample setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
        return this;
    }
}