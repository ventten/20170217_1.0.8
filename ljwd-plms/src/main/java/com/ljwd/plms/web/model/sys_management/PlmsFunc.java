package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 功能表,PLMS_FUNC
 * */
public class PlmsFunc extends ActiveModel{

    private Long id;                    //功能id
    private String funcName;            //功能名称
    private Long pFuncId;               //功能上级id

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
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public Long getpFuncId() {
        return pFuncId;
    }

    public void setpFuncId(Long pFuncId) {
        this.pFuncId = pFuncId;
    }

}