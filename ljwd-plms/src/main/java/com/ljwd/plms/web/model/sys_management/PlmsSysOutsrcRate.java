package com.ljwd.plms.web.model.sys_management;

import com.ljwd.plms.core.util.N;
import com.ljwd.plms.web.model.ActiveModel;
import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 委外费率表,PLMS_SYS_OUTSRC_RATE
 * */
public class PlmsSysOutsrcRate extends ActiveModel{

    private Long id;                                //记录ID
    private String aging;                           //账龄阶段
    private Integer overdueDaysFrom;                //逾期天数（起）
    private Integer overdueDaysTo;                  //逾期天数（止）
    @Deprecated
    private BigDecimal outsrcRate;                  //委外费率
    private BigDecimal serviceRate;                 //服务费率


    //text-ext
    private BigDecimal outsrcRateFmt;               //委外费率
    private String serviceRateFmt;                  //服务费率

    @Deprecated
    public BigDecimal getOutsrcRateFmt() {
        return outsrcRate == null ? null : outsrcRate.multiply(BigDecimal.valueOf(100));
    }

    public String getServiceRateFmt() {
        return serviceRate == null ? "" : N.format(serviceRate.multiply(BigDecimal.valueOf(100)).doubleValue());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAging() {
        return aging;
    }

    public void setAging(String aging) {
        this.aging = aging;
    }

    public Integer getOverdueDaysFrom() {
        return overdueDaysFrom;
    }

    public void setOverdueDaysFrom(Integer overdueDaysFrom) {
        this.overdueDaysFrom = overdueDaysFrom;
    }

    public Integer getOverdueDaysTo() {
        return overdueDaysTo;
    }

    public void setOverdueDaysTo(Integer overdueDaysTo) {
        this.overdueDaysTo = overdueDaysTo;
    }

    @Deprecated
    public BigDecimal getOutsrcRate() {
        return outsrcRate;
    }

    @Deprecated
    public void setOutsrcRate(BigDecimal outsrcRate) {
        this.outsrcRate = outsrcRate;
    }

    public BigDecimal getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(BigDecimal serviceRate) {
        this.serviceRate = serviceRate;
    }

}