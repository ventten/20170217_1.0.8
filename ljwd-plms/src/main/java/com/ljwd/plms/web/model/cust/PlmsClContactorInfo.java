package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.ActiveModel;

import java.util.Date;

/**
 * 客户联系人信息,plms_cl_contactor_info
 * */
public class PlmsClContactorInfo extends ActiveModel{

    private Long id;                //记录id
    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applId;            //贷款申请ID
    private String rltnshp;         //关系:配偶、朋友、公司、同事、亲戚
    private String name;            //联系人姓名
    private String telType;         //号码类型：移动电话、固话、微信、QQ、邮箱、传真
    private String area;            //区号
    private String tel;             //号码
    private String ext;             //分机号

    /** 扩展字段 **/
    //text-ext

    //join-ext
    private String srcVal;          //来源类型值
    private String rltnshpVal;      //关系类型值
    private String telTypeVal;      //号码类型值

    private Date maxCreateTime;     //最近拨打时间
    private Date maxCallDate;       //最近拨通时间

    //mfbms-ext
    private String docno;           //身份证号
    private String ifTelForType;    //如果不是移动码号时,固话的类型,导入通讯信息时用到

    /**
     * 跑批导入判断数据是否重复
     * @return String
     */
    public String getCheck(){
        String telTypeStr = telType == null ? "null" : telType;
        String nameStr = name == null ? "null" : name;
        String areaStr = area == null ? "null" : area;
        String telStr = tel == null ? "null" : tel;
        String extStr = ext == null ? "null" : ext;
        return "{telType:" + telTypeStr + ",name:" + nameStr + ",area:" + areaStr + ",tel:" + telStr + ",ext:" + extStr + "}";
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

    public String getTelType() {
        return telType;
    }

    public void setTelType(String telType) {
        this.telType = telType == null ? null : telType.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getSrcVal() {
        return srcVal;
    }

    public void setSrcVal(String srcVal) {
        this.srcVal = srcVal;
    }

    public String getTelTypeVal() {
        return telTypeVal;
    }

    public void setTelTypeVal(String telTypeVal) {
        this.telTypeVal = telTypeVal;
    }

    public String getRltnshpVal() {
        return rltnshpVal;
    }

    public void setRltnshpVal(String rltnshpVal) {
        this.rltnshpVal = rltnshpVal;
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

    public Date getMaxCreateTime() {
        return maxCreateTime;
    }

    public void setMaxCreateTime(Date maxCreateTime) {
        this.maxCreateTime = maxCreateTime;
    }

    public Date getMaxCallDate() {
        return maxCallDate;
    }

    public void setMaxCallDate(Date maxCallDate) {
        this.maxCallDate = maxCallDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getIfTelForType() {
        return ifTelForType;
    }

    public void setIfTelForType(String ifTelForType) {
        this.ifTelForType = ifTelForType;
    }

}