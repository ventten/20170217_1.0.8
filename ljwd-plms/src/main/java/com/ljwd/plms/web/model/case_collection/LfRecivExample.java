package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 应收款项表,LF_RECIV
 * */
public class LfRecivExample extends BaseExample{

    private Long id;                    //记录ID
    private Long cntrctId;              //合同ID
    private Long applId;                //借款申请ID
    private Long paymentId;             //放款ID
    private Boolean isRemoveAdvClear;   //设为true,筛选掉提前结清后的数据
    private String isDeleted;           //是否被删除:Y-已删除、N-未删除

    public Long getId() {
        return id;
    }

    public LfRecivExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public LfRecivExample setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public LfRecivExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public LfRecivExample setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public Boolean getIsRemoveAdvClear() {
        return isRemoveAdvClear;
    }

    public LfRecivExample setIsRemoveAdvClear(Boolean isRemoveAdvClear) {
        this.isRemoveAdvClear = isRemoveAdvClear;
        return this;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public LfRecivExample setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

}