package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14
 */
public class PlmsPermissionExample extends BaseExample {

    private String isActive;        //数据有效性

    public String getIsActive() {
        return isActive;
    }

    public PlmsPermissionExample setIsActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

}
