package com.ljwd.plms.web.model.case_collection;

import java.math.BigDecimal;

/**
 * SYS_CHARGE_SCHEMA
 * */
public class SysChargeSchema {

    private Long id;                            //记录ID
    private String schemaCode;                  //模式编码
    private String schemaName;                  //模式名称
    private String schemaDesc;                  //说明
    private String rpmntMthd;                   //还款方式,1:按期还息到期还本、2:等额本息、3:等额本金、4:一次性还本付息、5:预收利息一次性还本、6:按月还息按期还本、7:按月还息任意还本,8.按月还息到期还本(提前收息),9平息
    private BigDecimal intRate;                 //贷款月利率
    private BigDecimal intRateYear;             //年利率
    private String CALC_INT_TYPE;               //计算利息方式(FIRST,LAST, BOTH), 算头不算尾，算尾不算头，算头又算尾
    private Integer DECIMAL_PLACE;              //小数位，默认为0
    private Integer BASE_DAYS;                  //日利率计算基数。360
    private String ROUND_MODE;                  //取整。HALF_UP, UP,DOWN
    private String ADJUST_INT_DECIMAL;          //调整每期利息的小数至第1期。
    private String ADJUST_PRINCIPAL_DECIMAL;    //调整每期本金的小数至第1期。

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchemaCode() {
        return schemaCode;
    }

    public void setSchemaCode(String schemaCode) {
        this.schemaCode = schemaCode == null ? null : schemaCode.trim();
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName == null ? null : schemaName.trim();
    }

    public String getSchemaDesc() {
        return schemaDesc;
    }

    public void setSchemaDesc(String schemaDesc) {
        this.schemaDesc = schemaDesc == null ? null : schemaDesc.trim();
    }

    public String getRpmntMthd() {
        return rpmntMthd;
    }

    public void setRpmntMthd(String rpmntMthd) {
        this.rpmntMthd = rpmntMthd == null ? null : rpmntMthd.trim();
    }

    public BigDecimal getIntRate() {
        return intRate;
    }

    public void setIntRate(BigDecimal intRate) {
        this.intRate = intRate;
    }

    public BigDecimal getIntRateYear() {
        return intRateYear;
    }

    public void setIntRateYear(BigDecimal intRateYear) {
        this.intRateYear = intRateYear;
    }

    public String getCALC_INT_TYPE() {
        return CALC_INT_TYPE;
    }

    public void setCALC_INT_TYPE(String CALC_INT_TYPE) {
        this.CALC_INT_TYPE = CALC_INT_TYPE;
    }

    public Integer getDECIMAL_PLACE() {
        return DECIMAL_PLACE;
    }

    public void setDECIMAL_PLACE(Integer DECIMAL_PLACE) {
        this.DECIMAL_PLACE = DECIMAL_PLACE;
    }

    public Integer getBASE_DAYS() {
        return BASE_DAYS;
    }

    public void setBASE_DAYS(Integer BASE_DAYS) {
        this.BASE_DAYS = BASE_DAYS;
    }

    public String getROUND_MODE() {
        return ROUND_MODE;
    }

    public void setROUND_MODE(String ROUND_MODE) {
        this.ROUND_MODE = ROUND_MODE;
    }

    public String getADJUST_INT_DECIMAL() {
        return ADJUST_INT_DECIMAL;
    }

    public void setADJUST_INT_DECIMAL(String ADJUST_INT_DECIMAL) {
        this.ADJUST_INT_DECIMAL = ADJUST_INT_DECIMAL;
    }

    public String getADJUST_PRINCIPAL_DECIMAL() {
        return ADJUST_PRINCIPAL_DECIMAL;
    }

    public void setADJUST_PRINCIPAL_DECIMAL(String ADJUST_PRINCIPAL_DECIMAL) {
        this.ADJUST_PRINCIPAL_DECIMAL = ADJUST_PRINCIPAL_DECIMAL;
    }
}