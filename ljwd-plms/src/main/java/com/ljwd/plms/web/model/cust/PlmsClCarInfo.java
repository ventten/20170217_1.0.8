package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.enums.PurchaseMode;
import com.ljwd.plms.web.model.ActiveModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户车辆信息,plms_cl_car_info
 * */
public class PlmsClCarInfo extends ActiveModel{

    private Long id;                    //记录id
    private Long clCustId;              //客户基本信息表ID
    private String srcCode;             //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applId;                //贷款申请ID
    private String licenseNo;           //车牌号
    private String frameNo;             //车架号
    private String model;               //车辆型号
    private Date productionDate;        //出厂日期
    private PurchaseMode purchaseMode;  //购买方式:DISPOSABLE:一次性支付, MORTGAGE:按揭购买
    private BigDecimal monRpmnt;        //月供
    private Date mortgageDate;          //抵押时间
    private String mortgageBank;        //抵押银行
    private Date rpmntDate;             //还款时间
    private BigDecimal estimationAmt;   //评估金额
    private String remark;              //无效原因

    //ext
    private Boolean monRpmntIsNull;     //月供，设为true时修改时将改为null
    private Boolean mortgageDateIsNull; //抵押时间，设为true时修改时将改为null
    private Boolean rpmntDateIsNull;    //还款时间，设为true时修改时将改为null
    private Boolean estimationAmtIsNull;//评估金额，设为true时修改时将改为null

    /** 扩展字段 **/
    //text-ext
    private String purchaseModeText;    //购买方式显示值
    private String productionDateFmt;   //出厂日期-格式化
    private String mortgageDateFmt;     //抵押时间-格式化
    private String rpmntDateFmt;        //还款时间-格式化

    //join-ext
    private String srcVal;              //来源类型值

    //mfbms-ext
    private String docno;               //身份证号

    /**
     * 跑批导入判断数据是否重复
     * @return String
     */
    public String getCheck(){
        String licenseNoStr = licenseNo == null ? "null" : licenseNo;
        String frameNoStr = frameNo == null ? "null" : frameNo;
        String modelStr = model == null ? "null" : model;
        return "{licenseNo:" + licenseNoStr + ",frameNo:" + frameNoStr + ",model:" + modelStr + "}";
    }

    public String getPurchaseModeText() {
        return this.purchaseMode == null ? null : this.purchaseMode.getType();
    }

    public String getProductionDateFmt() {
        return D.parse(productionDate);
    }

    public String getMortgageDateFmt() {
        return D.parse(mortgageDate);
    }

    public String getRpmntDateFmt() {
        return D.parse(rpmntDate);
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

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo == null ? null : licenseNo.trim();
    }

    public String getFrameNo() {
        return frameNo;
    }

    public void setFrameNo(String frameNo) {
        this.frameNo = frameNo == null ? null : frameNo.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public PurchaseMode getPurchaseMode() {
        return purchaseMode;
    }

    public void setPurchaseMode(PurchaseMode purchaseMode) {
        this.purchaseMode = purchaseMode;
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

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
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