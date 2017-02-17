package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 银行费用明细,LF_RECIV_FEE_DTL
 * */
public class LfRecivFeeDtlExample extends BaseExample{

    private Long id;                        //记录ID
    private Long recivId;                   //应收ID

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecivId() {
        return recivId;
    }

    public void setRecivId(Long recivId) {
        this.recivId = recivId;
    }
}