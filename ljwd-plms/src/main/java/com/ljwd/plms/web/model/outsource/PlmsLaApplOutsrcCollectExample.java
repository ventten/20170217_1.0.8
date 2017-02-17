package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 委外催记表,PLMS_LA_APPL_OUTSRC_COLLECT
 * */
public class PlmsLaApplOutsrcCollectExample extends BaseExample{

    private Long id;                            //记录ID
    private Long applId;                        //借款ID
    private Long cntrctId;                      //合同ID
    private Long comId;                         //委外机构ID
    private String controlStatus;               //控管状态

    public Long getId() {
        return id;
    }

    public PlmsLaApplOutsrcCollectExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public PlmsLaApplOutsrcCollectExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public PlmsLaApplOutsrcCollectExample setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
        return this;
    }

    public Long getComId() {
        return comId;
    }

    public PlmsLaApplOutsrcCollectExample setComId(Long comId) {
        this.comId = comId;
        return this;
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public PlmsLaApplOutsrcCollectExample setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
        return this;
    }

}