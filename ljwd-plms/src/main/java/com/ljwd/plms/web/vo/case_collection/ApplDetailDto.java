package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.core.util.D;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/8/4
 * 借款详细统计信息Dto
 */
public class ApplDetailDto {

    private Long custId;                        //微贷用户ID
    private Long applId;                        //借款ID
    private String applCode;                    //借款申请编号
    private Long paymentId;                     //放款记录ID
    private Integer prdId;                      //贷款产品ID
    private String mobile;                      //联系电话

    private String cntrctNo;                    //合同编号
    private String custName;                    //主贷人
    private String idCardNo;                    //证件号码
    private String prdNo;                       //贷款产品编号
    private String prdName;                     //贷款产品名字
    private String paymentName;                 //放款渠道

    private BigDecimal loanAmt;                 //贷款金额
    private String bizCategory;                 //业务类型
    private Integer loanPeriod;                 //贷款期数
    private Integer paidPeriod;                 //已还期数
    private BigDecimal remainingPrincipal;      //剩余本金/保证金

    private BigDecimal firstAmt;                //首期期款
    private BigDecimal secondAmt;               //后每期期款
    private Integer overDays;                   //逾期天数
    private Integer overDaysTotal;              //累计逾期天数
    private Integer overDaysMax;                //最长逾期天数

    private BreakCountDto breakCount;           //破坏承诺次数Dto

    private String bankNameOne;                 //扣款银行1
    private String bankCardNoOne;               //扣款账号1
    private String bankNameTwo;                 //扣款银行2
    private String bankCardNoTwo;               //扣款账号2
    private String bankNameThree;               //扣款银行3
    private String bankCardNoThree;             //扣款账号3

    private Date lastLoanDate;                  //最后扣款时间
    private BigDecimal loanMoney;               //发起扣款金额
    private BigDecimal loanRealMoney;           //实际扣款金额
    private String loanRemark;                  //银行反馈

    private String redeemStatus;                //赎回状态

    //ext
    private String bizCategoryText;             //业务类型显示值
    private String lastLoanDateFmt;             //最后扣款时间-格式化

    public String getLastLoanDateFmt() {
        return lastLoanDate == null ? "" : D.parse(lastLoanDate,D.PATTERN_SECONDS);
    }

    public String getBizCategoryText() {
        if(this.bizCategory == null){
            return "";
        }
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

    public String getApplCode() {
        return applCode;
    }

    public void setApplCode(String applCode) {
        this.applCode = applCode;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getPrdId() {
        return prdId;
    }

    public void setPrdId(Integer prdId) {
        this.prdId = prdId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public String getBizCategory() {
        return bizCategory;
    }

    public void setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory;
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

    public BigDecimal getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public BigDecimal getFirstAmt() {
        return firstAmt;
    }

    public void setFirstAmt(BigDecimal firstAmt) {
        this.firstAmt = firstAmt;
    }

    public BigDecimal getSecondAmt() {
        return secondAmt;
    }

    public void setSecondAmt(BigDecimal secondAmt) {
        this.secondAmt = secondAmt;
    }

    public Integer getOverDays() {
        return overDays;
    }

    public void setOverDays(Integer overDays) {
        this.overDays = overDays;
    }

    public Integer getOverDaysTotal() {
        return overDaysTotal;
    }

    public void setOverDaysTotal(Integer overDaysTotal) {
        this.overDaysTotal = overDaysTotal;
    }

    public Integer getOverDaysMax() {
        return overDaysMax;
    }

    public void setOverDaysMax(Integer overDaysMax) {
        this.overDaysMax = overDaysMax;
    }

    public BreakCountDto getBreakCount() {
        if(breakCount == null){
            breakCount = new BreakCountDto();
        }
        return breakCount;
    }

    public void setBreakCount(BreakCountDto breakCount) {
        this.breakCount = breakCount;
    }

    public Date getLastLoanDate() {
        return lastLoanDate;
    }

    public void setLastLoanDate(Date lastLoanDate) {
        this.lastLoanDate = lastLoanDate;
    }

    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    public BigDecimal getLoanRealMoney() {
        return loanRealMoney;
    }

    public void setLoanRealMoney(BigDecimal loanRealMoney) {
        this.loanRealMoney = loanRealMoney;
    }

    public String getLoanRemark() {
        return loanRemark;
    }

    public void setLoanRemark(String loanRemark) {
        this.loanRemark = loanRemark;
    }

    public String getBankNameOne() {
        return bankNameOne;
    }

    public void setBankNameOne(String bankNameOne) {
        this.bankNameOne = bankNameOne;
    }

    public String getBankCardNoOne() {
        return bankCardNoOne;
    }

    public void setBankCardNoOne(String bankCardNoOne) {
        this.bankCardNoOne = bankCardNoOne;
    }

    public String getBankNameTwo() {
        return bankNameTwo;
    }

    public void setBankNameTwo(String bankNameTwo) {
        this.bankNameTwo = bankNameTwo;
    }

    public String getBankCardNoTwo() {
        return bankCardNoTwo;
    }

    public void setBankCardNoTwo(String bankCardNoTwo) {
        this.bankCardNoTwo = bankCardNoTwo;
    }

    public String getBankNameThree() {
        return bankNameThree;
    }

    public void setBankNameThree(String bankNameThree) {
        this.bankNameThree = bankNameThree;
    }

    public String getBankCardNoThree() {
        return bankCardNoThree;
    }

    public void setBankCardNoThree(String bankCardNoThree) {
        this.bankCardNoThree = bankCardNoThree;
    }

    public String getRedeemStatus() {
        return redeemStatus;
    }

    public void setRedeemStatus(String redeemStatus) {
        this.redeemStatus = redeemStatus;
    }
}
