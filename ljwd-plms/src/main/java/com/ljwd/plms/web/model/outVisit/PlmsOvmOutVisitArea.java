package com.ljwd.plms.web.model.outVisit;


import com.ljwd.plms.web.model.ActiveModel;
/**
 * 
 * ClassName: PlmsOvmOutVisitArea 
 * @Description: 外访区域实体  table:PLMS_OVM_OUT_VISIT_AREA
 * @author panshangxing
 * @date 2017年2月10日下午4:23:53
 */
public class PlmsOvmOutVisitArea extends ActiveModel{
    private Long id; 	//id

    private Long areaId; 	//行政区域ID，对应SYS_ADMINISTRATIVE_REGION表中ID

    private Long pid;	//外访区域父ID，对应plms_OVM_OUT_VISIT_AREA表中ID

    private String areaName;	//外访区域名

    private String remarks;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

   }