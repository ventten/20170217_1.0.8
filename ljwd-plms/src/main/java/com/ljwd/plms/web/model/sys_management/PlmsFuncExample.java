package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 功能表,PLMS_FUNC
 * */
public class PlmsFuncExample extends BaseExample{

    private Long id;                    //功能id
    private String funcName;            //功能名称
    private Long pFuncId;               //功能上级id
    private String isActive;            //数据有效性

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = (funcName == null || "".equals(funcName) || "".equals(funcName.trim())) ? null : funcName.trim();
    }

    public Long getpFuncId() {
        return pFuncId;
    }

    public void setpFuncId(Long pFuncId) {
        this.pFuncId = pFuncId;
    }

    public String getIsActive() {
        return isActive;
    }

    public PlmsFuncExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

}