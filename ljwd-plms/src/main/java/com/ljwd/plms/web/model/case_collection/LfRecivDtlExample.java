package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 应收款明细,LF_RECIV_DTL
 * */
public class LfRecivDtlExample extends BaseExample{

    private Long id;                //记录ID
    private Long recivId;           //应收记录ID
    private String recivIds;        //应收记录IDs

    public Long getId() {
        return id;
    }

    public LfRecivDtlExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRecivId() {
        return recivId;
    }

    public LfRecivDtlExample setRecivId(Long recivId) {
        this.recivId = recivId;
        return this;
    }

    public String getRecivIds() {
        return recivIds;
    }

    public LfRecivDtlExample setRecivIds(String recivIds) {
        this.recivIds = recivIds;
        return this;
    }

}