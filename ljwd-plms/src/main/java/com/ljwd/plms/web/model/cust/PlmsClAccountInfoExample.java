package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 客户流水账号信息查询条件
 * */
public class PlmsClAccountInfoExample extends BaseExample {

    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private String type;            //流水类别
    private String name;            //账号户名
    private String cardno;          //卡号/账户
    private String bankname;        //开户行
    private Long noThisId;          //排除此记录ID

    public String getType() {
        return type;
    }

    public PlmsClAccountInfoExample setType(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public PlmsClAccountInfoExample setName(String name) {
        this.name = name;
        return this;
    }

    public String getCardno() {
        return cardno;
    }

    public PlmsClAccountInfoExample setCardno(String cardno) {
        this.cardno = cardno;
        return this;
    }

    public String getBankname() {
        return bankname;
    }

    public PlmsClAccountInfoExample setBankname(String bankname) {
        this.bankname = bankname;
        return this;
    }

    public Long getNoThisId() {
        return noThisId;
    }

    public PlmsClAccountInfoExample setNoThisId(Long noThisId) {
        this.noThisId = noThisId;
        return this;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public PlmsClAccountInfoExample setClCustId(Long clCustId) {
        this.clCustId = clCustId;
        return this;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public PlmsClAccountInfoExample setSrcCode(String srcCode) {
        this.srcCode = (srcCode == null || "".equals(srcCode) || "".equals(srcCode.trim())) ? null : srcCode.trim();
        return this;
    }
}
