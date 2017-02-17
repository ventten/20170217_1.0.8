package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.enums.PurchaseMode;
import com.ljwd.plms.web.model.ActiveModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户房产信息,plms_cl_house_info
 * */
public class PlmsClHouseInfo extends ActiveModel{

    private Long id;                //记录id
    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applId;            //贷款申请ID
    private String hpcNumber;       //房产证编号
    private String addr;            //由省市区详细地址拼接的总地址
    private PurchaseMode purchaseMode;//购买方式:DISPOSABLE:一次性支付, MORTGAGE.:按揭购买
    private BigDecimal loanAmt;     //贷款金额
    private BigDecimal monRpmnt;    //月供
    private Date mortgageDate;      //抵押时间
    private String mortgageBank;    //抵押银行
    private Date rpmntDate;          //还款时间
    private BigDecimal estimationAmt;//评估金额
    private Long addrProvinceId;    //地址所在省ID
    private Long addrCityId;        //地址所在市ID
    private Long addrAreaId;        //地址所在区域ID
    private String addrDetails;     //详细地址

    /** 扩展字段 **/
    //text-ext
    private String purchaseModeText;//购买方式显示值

    //join-ext
    private String srcVal;          //来源类型值

    //mfbms-ext
    private String docno;           //身份证号

    //ext
    private Boolean monRpmntIsNull;     //月供，设为true时修改时将改为null
    private Boolean mortgageDateIsNull; //抵押时间，设为true时修改时将改为null
    private Boolean rpmntDateIsNull;    //还款时间，设为true时修改时将改为null
    private Boolean estimationAmtIsNull;//评估金额，设为true时修改时将改为null

    /**
     * 跑批导入判断数据是否重复
     * @return String
     */
    public String getCheck(){
        String hpcNumberStr = hpcNumber == null ? "null" : hpcNumber;
        String addrStr = addr == null ? "null" : addr;
        return "{hpcNumber:" + hpcNumberStr + ",addr:" + addrStr + "}";
    }

    public String getPurchaseModeText() {
        return this.purchaseMode == null ? null : this.purchaseMode.getType();
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

    public String getHpcNumber() {
        return hpcNumber;
    }

    public void setHpcNumber(String hpcNumber) {
        this.hpcNumber = hpcNumber == null ? null : hpcNumber.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public PurchaseMode getPurchaseMode() {
        return purchaseMode;
    }

    public void setPurchaseMode(PurchaseMode purchaseMode) {
        this.purchaseMode = purchaseMode;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public BigDecimal getMonRpmnt() {
        return monRpmnt;
    }

    public void setMonRpmnt(BigDecimal monRpmnt) {
        this.monRpmnt = monRpmnt;
    }

    public Date getMortgageDate() {
        return mortgageDate;
    }

    public void setMortgageDate(Date mortgageDate) {
        this.mortgageDate = mortgageDate;
    }

    public String getMortgageBank() {
        return mortgageBank;
    }

    public void setMortgageBank(String mortgageBank) {
        this.mortgageBank = mortgageBank == null ? null : mortgageBank.trim();
    }

    public Date getRpmntDate() {
        return rpmntDate;
    }

    public void setRpmntDate(Date rpmntDate) {
        this.rpmntDate = rpmntDate;
    }

    public BigDecimal getEstimationAmt() {
        return estimationAmt;
    }

    public void setEstimationAmt(BigDecimal estimationAmt) {
        this.estimationAmt = estimationAmt;
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

    public Long getAddrProvinceId() {
        return addrProvinceId;
    }

    public void setAddrProvinceId(Long addrProvinceId) {
        this.addrProvinceId = addrProvinceId;
    }

    public Long getAddrCityId() {
        return addrCityId;
    }

    public void setAddrCityId(Long addrCityId) {
        this.addrCityId = addrCityId;
    }

    public Long getAddrAreaId() {
        return addrAreaId;
    }

    public void setAddrAreaId(Long addrAreaId) {
        this.addrAreaId = addrAreaId;
    }

    public String getAddrDetails() {
        return addrDetails;
    }

    public void setAddrDetails(String addrDetails) {
        this.addrDetails = addrDetails;
    }

    public Boolean getMonRpmntIsNull() {
        return monRpmntIsNull;
    }

    public void setMonRpmntIsNull(Boolean monRpmntIsNull) {
        this.monRpmntIsNull = monRpmntIsNull;
    }

    public Boolean getMortgageDateIsNull() {
        return mortgageDateIsNull;
    }

    public void setMortgageDateIsNull(Boolean mortgageDateIsNull) {
        this.mortgageDateIsNull = mortgageDateIsNull;
    }

    public Boolean getRpmntDateIsNull() {
        return rpmntDateIsNull;
    }

    public void setRpmntDateIsNull(Boolean rpmntDateIsNull) {
        this.rpmntDateIsNull = rpmntDateIsNull;
    }

    public Boolean getEstimationAmtIsNull() {
        return estimationAmtIsNull;
    }

    public void setEstimationAmtIsNull(Boolean estimationAmtIsNull) {
        this.estimationAmtIsNull = estimationAmtIsNull;
    }

}