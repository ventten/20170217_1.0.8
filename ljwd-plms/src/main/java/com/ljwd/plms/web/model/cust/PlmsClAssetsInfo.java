package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.ActiveModel;

import java.math.BigDecimal;

/**
 * 客户其它资产信息,plms_cl_assets_info
 * */
public class PlmsClAssetsInfo extends ActiveModel{

    private Long id;                //记录id
    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private String assetsType;      //资产类型
    private Long applId;            //贷款申请ID
    private BigDecimal estimationAmt;//评估金额
    private String remark;          //详情

    /** 扩展字段 **/
    //text-ext

    //join-ext
    private String srcVal;          //来源类型值
    private String assetsTypeVal;   //资产类型值

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public void setClCustId(Long clCustId) {
        this.clCustId = clCustId;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public void setSrcCode(String srcCode) {
        this.srcCode = srcCode == null ? null : srcCode.trim();
    }

    public String getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(String assetsType) {
        this.assetsType = assetsType == null ? null : assetsType.trim();
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public BigDecimal getEstimationAmt() {
        return estimationAmt;
    }

    public void setEstimationAmt(BigDecimal estimationAmt) {
        this.estimationAmt = estimationAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSrcVal() {
        return srcVal;
    }

    public void setSrcVal(String srcVal) {
        this.srcVal = srcVal;
    }

    public String getAssetsTypeVal() {
        return assetsTypeVal;
    }

    public void setAssetsTypeVal(String assetsTypeVal) {
        this.assetsTypeVal = assetsTypeVal;
    }

}