package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 贷款还款计划信息,用于记录贷款还款计划信息,LN_RPMNT_PLAN
 * */
public class LnRpmntPlanExample extends BaseExample{

    private Long id;                        //记录ID
    private Long applId;                    //贷款申请单记录ID
    private Long paymentId;                 //放款记录ID

    public Long getId() {
        return id;
    }

    public LnRpmntPlanExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public LnRpmntPlanExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public LnRpmntPlanExample setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
        return this;
    }
}