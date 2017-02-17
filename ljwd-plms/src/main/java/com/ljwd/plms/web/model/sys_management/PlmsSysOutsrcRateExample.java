package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 委外费率表,PLMS_SYS_OUTSRC_RATE
 * */
public class PlmsSysOutsrcRateExample extends BaseExample{

    private String isActive;                         //是否有效(Y/N)
    private String aging;                            //账龄阶段
    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("aging","aging ");
        sortMap.put("overdueDaysFrom","T.OVERDUE_DAYS_FROM ");
        sortMap.put("overdueDaysTo","T.OVERDUE_DAYS_TO ");
        sortMap.put("serviceRateFmt","T.SERVICE_RATE ");
        sortMap.put("isActiveText","T.IS_ACTIVE ");
        sortMap.put("updatedBy","T.UPDATED_BY ");
        sortMap.put("updateTime","T.UPDATE_TIME ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }
    public String getIsActive() {
        return isActive;
    }

    public PlmsSysOutsrcRateExample setIsActive(String isActive) {
        this.isActive = (isActive == null || "".equals(isActive) || "".equals(isActive.trim())) ? null : isActive.trim();
        return this;
    }

    public String getAging() {
        return aging;
    }

    public PlmsSysOutsrcRateExample setAging(String aging) {
        this.aging = (aging == null || "".equals(aging) || "".equals(aging.trim())) ? null : aging.trim();
        return this;
    }

}