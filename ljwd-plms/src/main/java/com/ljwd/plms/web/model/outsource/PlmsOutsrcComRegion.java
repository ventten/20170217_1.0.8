package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 委外机构辐射区域表,PLMS_OUTSRC_COM_REGION
 * */
public class PlmsOutsrcComRegion extends ActiveModel{

    private Long id;                    //记录ID
    private Long outsrcComId;           //委外机构ID
    private Long regionId;              //sys_administrative_region 区域表ID

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOutsrcComId() {
        return outsrcComId;
    }

    public void setOutsrcComId(Long outsrcComId) {
        this.outsrcComId = outsrcComId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

}