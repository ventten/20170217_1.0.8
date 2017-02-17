package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14
 * 客户车辆信息查询条件
 */
public class PlmsClCarInfoExample extends BaseExample {

    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private String frameNo;         //车架号
    private String licenseNo;       //车牌号
    private String model;           //车辆型号
    private Long noThisId;          //排除此记录ID

    public String getLicenseNo() {
        return licenseNo;
    }

    public PlmsClCarInfoExample setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }

    public String getModel() {
        return model;
    }

    public PlmsClCarInfoExample setModel(String model) {
        this.model = model;
        return this;
    }

    public Long getNoThisId() {
        return noThisId;
    }

    public PlmsClCarInfoExample setNoThisId(Long noThisId) {
        this.noThisId = noThisId;
        return this;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public PlmsClCarInfoExample setClCustId(Long clCustId) {
        this.clCustId = clCustId;
        return this;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public PlmsClCarInfoExample setSrcCode(String srcCode) {
        this.srcCode = (srcCode == null || "".equals(srcCode) || "".equals(srcCode.trim())) ? null : srcCode.trim();
        return this;
    }

    public String getFrameNo() {
        return frameNo;
    }

    public PlmsClCarInfoExample setFrameNo(String frameNo) {
        this.frameNo = (frameNo == null || "".equals(frameNo) || "".equals(frameNo.trim())) ? null : frameNo.trim();
        return this;
    }
}
