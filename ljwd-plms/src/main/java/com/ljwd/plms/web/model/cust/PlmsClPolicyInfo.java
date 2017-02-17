package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.ActiveModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户保单信息,plms_cl_policy_info
 * */
public class PlmsClPolicyInfo extends ActiveModel{

    private Long id;                        //记录id
    private Long clCustId;                  //客户基本信息表ID
    private String srcCode;                 //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applId;                    //贷款申请ID
    private String policyName;              //保险公司
    private String policyAddress;           //投保地点
    private Long policyAddrProvinceId;      //保单地址所在省ID
    private Long policyAddrCityId;          //保单地址所在市ID
    private Long policyAddrAreaId;          //保单地址所在区域ID
    private Date effectiveDate;             //生效日期
    private Integer paymentYears;           //需缴费年数
    private String paymentMethod;           //缴费方式
    private String paymentCategory;         //缴费类别
    private BigDecimal periodGuarantee;     //期缴担保
    private BigDecimal grossline;           //总保额
    private String policyBranch;            //保险类别
    private Integer paidPeriod;             //已缴期数
    private String policyCustName;          //被保险人姓名
    private String contactTel;              //联系电话


    /** 扩展字段 **/
    //text-ext
    private String paymentMethodText;   //缴费方式显示值
    private String paymentCategoryText; //缴费类别显示值
    private String policyBranchText;    //保险类别显示值

    //join-ext
    private String srcVal;              //来源类型值

    //mfbms-ext
    private String docno;           //身份证号

    /**
     * 跑批导入判断数据是否重复
     * @return String
     */
    public String getCheck(){
        String policyNameStr = policyName == null ? "null" : policyName;
        String policyAddressStr = policyAddress == null ? "null" : policyAddress;
        String effectiveDateStr = effectiveDate == null ? "null" : D.parse(effectiveDate);
        String paymentYearsStr = paymentYears == null ? "null" : paymentYears.toString();
        String paymentMethodStr = paymentMethod == null ? "null" : paymentMethod;
        String paymentCategoryStr = paymentCategory == null ? "null" : paymentCategory;
        String periodGuaranteeStr = periodGuarantee == null ? "null" : periodGuarantee.toString();
        String grosslineStr = grossline == null ? "null" : grossline.toString();
        String policyBranchStr = policyBranch == null ? "null" : policyBranch;
        String paidPeriodStr = paidPeriod == null ? "null" : paidPeriod.toString();
        String policyCustNameStr = policyCustName == null ? "null" : policyCustName;
        String contactTelStr = contactTel == null ? "null" : contactTel;
        return "{policyName:" + policyNameStr
                + ",policyAddress:" + policyAddressStr
                + ",effectiveDate:" + effectiveDateStr
                + ",paymentYears:" + paymentYearsStr
                + ",paymentMethod:" + paymentMethodStr
                + ",paymentCategory:" + paymentCategoryStr
                + ",periodGuarantee:" + periodGuaranteeStr
                + ",grossline:" + grosslineStr
                + ",policyBranch:" + policyBranchStr
                + ",paidPeriod:" + paidPeriodStr
                + ",policyCustName:" + policyCustNameStr
                + ",contactTel:" + contactTelStr
                + "}";
    }

    public String getPaymentMethodText() {
        if(paymentMethod == null){
            return "";
        }else if("WHOLE".equals(paymentMethod)){
            return "趸缴";
        }else if("NORMAL".equals(paymentMethod)){
            return "期缴";
        }else {
            return "";
        }
    }

    public String getPaymentCategoryText() {
        if(paymentCategory == null){
            return "";
        }else if("month".equals(paymentCategory)){
            return "月缴";
        }else if("quarter".equals(paymentCategory)){
            return "季缴";
        }else if("halfyear".equals(paymentCategory)){
            return "半年缴";
        }else if("year".equals(paymentCategory)){
            return "年缴";
        }else {
            return "";
        }
    }

    public String getPolicyBranchText() {
        if(policyBranch == null){
            return "";
        }else if("conventional".equals(policyBranch)){
            return "传统型";
        }else if("dividend".equals(policyBranch)){
            return "分红型";
        }else {
            return "";
        }
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

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName == null ? null : policyName.trim();
    }

    public String getPolicyAddress() {
        return policyAddress;
    }

    public void setPolicyAddress(String policyAddress) {
        this.policyAddress = policyAddress == null ? null : policyAddress.trim();
    }

    public Long getPolicyAddrProvinceId() {
        return policyAddrProvinceId;
    }

    public void setPolicyAddrProvinceId(Long policyAddrProvinceId) {
        this.policyAddrProvinceId = policyAddrProvinceId;
    }

    public Long getPolicyAddrCityId() {
        return policyAddrCityId;
    }

    public void setPolicyAddrCityId(Long policyAddrCityId) {
        this.policyAddrCityId = policyAddrCityId;
    }

    public Long getPolicyAddrAreaId() {
        return policyAddrAreaId;
    }

    public void setPolicyAddrAreaId(Long policyAddrAreaId) {
        this.policyAddrAreaId = policyAddrAreaId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Integer getPaymentYears() {
        return paymentYears;
    }

    public void setPaymentYears(Integer paymentYears) {
        this.paymentYears = paymentYears;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public String getPaymentCategory() {
        return paymentCategory;
    }

    public void setPaymentCategory(String paymentCategory) {
        this.paymentCategory = paymentCategory == null ? null : paymentCategory.trim();
    }

    public BigDecimal getPeriodGuarantee() {
        return periodGuarantee;
    }

    public void setPeriodGuarantee(BigDecimal periodGuarantee) {
        this.periodGuarantee = periodGuarantee;
    }

    public BigDecimal getGrossline() {
        return grossline;
    }

    public void setGrossline(BigDecimal grossline) {
        this.grossline = grossline;
    }

    public String getPolicyBranch() {
        return policyBranch;
    }

    public void setPolicyBranch(String policyBranch) {
        this.policyBranch = policyBranch == null ? null : policyBranch.trim();
    }

    public Integer getPaidPeriod() {
        return paidPeriod;
    }

    public void setPaidPeriod(Integer paidPeriod) {
        this.paidPeriod = paidPeriod;
    }

    public String getPolicyCustName() {
        return policyCustName;
    }

    public void setPolicyCustName(String policyCustName) {
        this.policyCustName = policyCustName == null ? null : policyCustName.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
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