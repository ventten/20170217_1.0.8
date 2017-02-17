package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户贷款信息,plms_ln_appl_info
 * */
public class PlmsLnApplInfo extends BaseModel{

    public static final String STATUS_TRANSIT = "TRANSIT";  //状态-在途
    public static final String STATUS_SETTLE = "SETTLE";    //状态-结清

    private Long id;                //记录id
    private Long clCustId;          //客户基本信息表ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long applId;            //贷款申请ID
    private String loanCompany;     //贷款公司
    private String applCode;        //申请编号
    private String cntrctNo;        //合同编号
    private Integer loanPeriod;     //贷款期数
    private BigDecimal loanAmt;     //贷款金额
    private String loanState;       //贷款状态：TRANSIT-在途 SETTLE-结清
    private Date applDate;          //申请日期
    private Date payDate;           //放款日期
    private Date clearDate;         //结清日期

    /** 扩展字段 **/
    //join-ext
    private String srcVal;          //来源类型值
    private BigDecimal payAmt;      //放款金额

    //text-ext
    private String loanStateText;   //贷款状态
    private String payDateFmt;      //放款日期
    private String clearDateFmt;    //结清日期

    //mfbms-ext
    private String docno;           //身份证号
    private String salesUser;  //客户经理
    
    public String getSalesUser() {
		return salesUser;
	}

	public void setSalesUser(String salesUser) {
		this.salesUser = salesUser;
	}

	public String getPayDateFmt() {
        return D.parse(payDate);
    }

    public String getClearDateFmt() {
        return D.parse(clearDate);
    }

    public String getLoanStateText() {
        if(loanState == null){
            return "";
        }else if(STATUS_TRANSIT.equals(loanState)){
            return "在途";
        }else if(STATUS_SETTLE.equals(loanState)){
            return "结清";
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

    public String getLoanCompany() {
        return loanCompany;
    }

    public void setLoanCompany(String loanCompany) {
        this.loanCompany = loanCompany == null ? null : loanCompany.trim();
    }

    public String getApplCode() {
        return applCode;
    }

    public void setApplCode(String applCode) {
        this.applCode = applCode == null ? null : applCode.trim();
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo == null ? null : cntrctNo.trim();
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public String getLoanState() {
        return loanState;
    }

    public void setLoanState(String loanState) {
        this.loanState = loanState == null ? null : loanState.trim();
    }

    public Date getApplDate() {
        return applDate;
    }

    public void setApplDate(Date applDate) {
        this.applDate = applDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getClearDate() {
        return clearDate;
    }

    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
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

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

}