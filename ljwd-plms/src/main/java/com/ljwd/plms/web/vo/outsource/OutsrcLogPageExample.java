package com.ljwd.plms.web.vo.outsource;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/11/11
 * 委外申请操作日志表分页查询条件
 */
public class OutsrcLogPageExample extends BaseExample{

    private Long id;                //记录ID
    private Long applId;            //借款ID
    private Long recVer;            //版本号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Long getRecVer() {
        return recVer;
    }

    public void setRecVer(Long recVer) {
        this.recVer = recVer;
    }

}
