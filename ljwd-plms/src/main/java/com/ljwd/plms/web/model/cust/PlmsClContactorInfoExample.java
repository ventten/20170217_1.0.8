package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14
 * 客户联系人信息查询条件
 */
public class PlmsClContactorInfoExample extends BaseExample {

    private Long notThisId;         //不等于此ID
    private Long clCustId;          //客户基本信息表ID
    private Long applId;            //贷款申请ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private String name;            //联系人姓名
    private String tel;             //号码
    private boolean isSelectCall;   //设为true,关联呼叫记录表查最近拨打时间、拨通时间
    private Long applIdOrNull;      //查找此借款ID等于此值或借款ID为null的数据
    private String telType;         //号码类型：移动电话、固话、微信、QQ、邮箱、传真
    private String area;            //区号
    private String ext;             //分机号
    private Long clCustIdByApplId;  //根据借款ID查询此客户ID下的数据

    public Long getClCustIdByApplId() {
        return clCustIdByApplId;
    }

    public PlmsClContactorInfoExample setClCustIdByApplId(Long clCustIdByApplId) {
        this.clCustIdByApplId = clCustIdByApplId;
        return this;
    }

    public String getTelType() {
        return telType;
    }

    public PlmsClContactorInfoExample setTelType(String telType) {
        this.telType = telType;
        return this;
    }

    public String getArea() {
        return area;
    }

    public PlmsClContactorInfoExample setArea(String area) {
        this.area = area;
        return this;
    }

    public String getExt() {
        return ext;
    }

    public PlmsClContactorInfoExample setExt(String ext) {
        this.ext = ext;
        return this;
    }

    public Long getNotThisId() {
        return notThisId;
    }

    public PlmsClContactorInfoExample setNotThisId(Long notThisId) {
        this.notThisId = notThisId;
        return this;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public PlmsClContactorInfoExample setClCustId(Long clCustId) {
        this.clCustId = clCustId;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public PlmsClContactorInfoExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public void setSrcCode(String srcCode) {
        this.srcCode = (srcCode == null || "".equals(srcCode) || "".equals(srcCode.trim())) ? null : srcCode.trim();
    }

    public String getName() {
        return name;
    }

    public PlmsClContactorInfoExample setName(String name) {
        this.name = (name == null || "".equals(name) || "".equals(name.trim())) ? null : name.trim();
        return this;
    }

    public boolean isSelectCall() {
        return isSelectCall;
    }

    public PlmsClContactorInfoExample setSelectCall(boolean isSelectCall) {
        this.isSelectCall = isSelectCall;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public PlmsClContactorInfoExample setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public Long getApplIdOrNull() {
        return applIdOrNull;
    }

    public PlmsClContactorInfoExample setApplIdOrNull(Long applIdOrNull) {
        this.applIdOrNull = applIdOrNull;
        return this;
    }

}
