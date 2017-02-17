package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14
 * 客户房产信息查询条件
 */
public class PlmsClHouseInfoExample extends BaseExample {

    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private String hpcNumber;       //房产证编号
    private String addr;            //房产地址
    private Long noThisId;          //排除此记录ID

    public String getHpcNumber() {
        return hpcNumber;
    }

    public PlmsClHouseInfoExample setHpcNumber(String hpcNumber) {
        this.hpcNumber = hpcNumber;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public PlmsClHouseInfoExample setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    public Long getNoThisId() {
        return noThisId;
    }

    public PlmsClHouseInfoExample setNoThisId(Long noThisId) {
        this.noThisId = noThisId;
        return this;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public PlmsClHouseInfoExample setClCustId(Long clCustId) {
        this.clCustId = clCustId;
        return this;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public PlmsClHouseInfoExample setSrcCode(String srcCode) {
        this.srcCode = (srcCode == null || "".equals(srcCode) || "".equals(srcCode.trim())) ? null : srcCode.trim();
        return this;
    }

}
