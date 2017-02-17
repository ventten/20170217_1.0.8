package com.ljwd.plms.web.vo.cust;

import java.math.BigDecimal;

/**
 * Created by zhengzw on 2016/7/14
 * 个案查询Dto
 */
public class CustCaseDto {

    private Long custId;                //微贷用户ID
    private Long applId;                //借款ID
    private String cntrctNo;            //合同编号
    private String custName;            //主贷人
    private String idCardNo;            //证件号码
    private BigDecimal apprAmt;         //批核金额
    private Integer loanPeriod;         //贷款期数
    private Integer paidPeriod;         //已还期数
    private Integer overCount;          //逾期期数
    private Integer overDays;           //逾期天数
    private Integer prdId;              //贷款产品ID
    private String prdName;             //贷款产品名字
    private String inputSiteCode;       //所属网点code
    private String siteName;            //所属网点名字
    private String bizCategory;         //业务类型
    private String applStatus;          //贷款情况
    private Integer entrust;            //委外机构

    //ext
    private String bizCategoryText;     //业务类型显示值

    public String getBizCategoryText() {
        switch (this.bizCategory){
            case "MATURE_PAYMENT":
                return "平缴";
            case "WHOLE":
                return "趸缴";
            case "NORMAL":
                return "等本等息";
            default:
                return "";
        }
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public BigDecimal getApprAmt() {
        return apprAmt;
    }

    public void setApprAmt(BigDecimal apprAmt) {
        this.apprAmt = apprAmt;
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public Integer getPaidPeriod() {
        return paidPeriod;
    }

    public void setPaidPeriod(Integer paidPeriod) {
        this.paidPeriod = paidPeriod;
    }

    public Integer getOverCount() {
        return overCount;
    }

    public void setOverCount(Integer overCount) {
        this.overCount = overCount;
    }

    public Integer getOverDays() {
        return overDays;
    }

    public void setOverDays(Integer overDays) {
        this.overDays = overDays;
    }

    public Integer getPrdId() {
        return prdId;
    }

    public void setPrdId(Integer prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public String getInputSiteCode() {
        return inputSiteCode;
    }

    public void setInputSiteCode(String inputSiteCode) {
        this.inputSiteCode = inputSiteCode;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getBizCategory() {
        return bizCategory;
    }

    public void setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory;
    }

    public String getApplStatus() {
        return applStatus;
    }

    public void setApplStatus(String applStatus) {
        this.applStatus = applStatus;
    }

    public Integer getEntrust() {
        return entrust;
    }

    public void setEntrust(Integer entrust) {
        this.entrust = entrust;
    }

}
