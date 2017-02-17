package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 客户流水账号信息,plms_cl_account_info
 * */
public class PlmsClAccountInfo extends ActiveModel{

    private Long id;                //记录id
    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applId;            //贷款申请ID
    private String type;            //流水类别
    private String name;            //账号户名
    private String cardno;          //卡号/账户
    private String bankname;        //开户行
    private String banknameremark; //开户行备注

    /** 扩展字段 **/
    //text-ext
//    private String typeText;        //流水类别显示值

    //join-ext
    private String srcVal;          //来源类型值

    //mfbms-ext
    private String docno;           //身份证号

//    public String getTypeText() {
//        if(this.type == null){
//            return "";
//        }
//        switch (this.type){
//            case "WORK":
//                return "工资流水";
//            case "PERSONFIRST":
//                return "个人流水-主流水";
//            case "PERSONSECOND":
//                return "个人流水-次流水";
//            case "PUBLIC":
//                return "对公流水";
//            case "PEER":
//                return "同行代扣卡";
//            default:
//                return "";
//        }
//    }

    /**
     * 跑批导入判断数据是否重复
     * @return String
     */
    public String getCheck(){
        String typeStr = type == null ? "null" : type;
        String banknameStr = bankname == null ? "null" : bankname;
        String nameStr = name == null ? "null" : name;
        String cardnoStr = cardno == null ? "null" : cardno;
        return "{type:" + typeStr + ",bankname:" + banknameStr + ",name:" + nameStr + ",cardno:" + cardnoStr + "}";
    }

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

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBanknameremark() {
        return banknameremark;
    }

    public void setBanknameremark(String banknameremark) {
        this.banknameremark = banknameremark == null ? null : banknameremark.trim();
    }

    public String getSrcVal() {
        return srcVal;
    }

    public void setSrcVal(String srcVal) {
        this.srcVal = srcVal;
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

}