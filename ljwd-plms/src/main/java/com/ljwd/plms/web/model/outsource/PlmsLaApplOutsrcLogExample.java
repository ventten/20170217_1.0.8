package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 委外申请操作日志表,PLMS_LA_APPL_OUTSRC_LOG
 * */
public class PlmsLaApplOutsrcLogExample extends BaseExample{

    private Long id;                //记录ID
    private Long applId;            //借款ID
    private Long recVer;            //版本号

    public Long getId() {
        return id;
    }

    public PlmsLaApplOutsrcLogExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public PlmsLaApplOutsrcLogExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsLaApplOutsrcLogExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }
}