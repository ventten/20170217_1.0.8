package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 客户单位信息,plms_cl_unit_info
 * */
public class PlmsClUnitInfo extends ActiveModel{

    private Long id;                //记录id
    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applId;            //贷款申请ID
    private String rltnshp;         //与主贷人关系:配偶、朋友、公司、同事、亲戚
    private String name;            //姓名
    private String unitName;        //单位名称
    private String unitAddr;        //单位地址
    private String remark;          //经营/在职情况
    private Long unitAddrProvinceId;//单位地址所在省ID
    private Long unitAddrCityId;    //单位地址所在市ID
    private Long unitAddrAreaId;    //单位地址所在区域ID
    private String unitAddrDetails; //单位详细地址
    private String position;        //职位

    /** 扩展字段 **/
    //text-ext

    //join-ext
    private String srcVal;          //来源类型值
    private String rltnshpVal;      //关系类型值

    //mfbms-ext
    private String docno;                       //身份证号

    /**
     * 跑批导入判断数据是否重复
     * @return String
     */
    public String getCheck(){
        String nameStr = name == null ? "null" : name;
        String unitNameStr = unitName == null ? "null" : unitName;
        String unitAddrStr = unitAddr == null ? "null" : unitAddr;
        return "{name:" + nameStr + ",unitName:" + unitNameStr + ",unitAddr:" + unitAddrStr + "}";
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

    public Long getUnitAddrProvinceId() {
        return unitAddrProvinceId;
    }

    public void setUnitAddrProvinceId(Long unitAddrProvinceId) {
        this.unitAddrProvinceId = unitAddrProvinceId;
    }

    public Long getUnitAddrCityId() {
        return unitAddrCityId;
    }

    public void setUnitAddrCityId(Long unitAddrCityId) {
        this.unitAddrCityId = unitAddrCityId;
    }

    public Long getUnitAddrAreaId() {
        return unitAddrAreaId;
    }

    public void setUnitAddrAreaId(Long unitAddrAreaId) {
        this.unitAddrAreaId = unitAddrAreaId;
    }

    public String getUnitAddrDetails() {
        return unitAddrDetails;
    }

    public void setUnitAddrDetails(String unitAddrDetails) {
        this.unitAddrDetails = unitAddrDetails;
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

    public String getRltnshp() {
        return rltnshp;
    }

    public void setRltnshp(String rltnshp) {
        this.rltnshp = rltnshp == null ? null : rltnshp.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getUnitAddr() {
        return unitAddr;
    }

    public void setUnitAddr(String unitAddr) {
        this.unitAddr = unitAddr == null ? null : unitAddr.trim();
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

    public String getRltnshpVal() {
        return rltnshpVal;
    }

    public void setRltnshpVal(String rltnshpVal) {
        this.rltnshpVal = rltnshpVal;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}