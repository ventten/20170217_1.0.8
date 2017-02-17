package com.ljwd.plms.mapp.vo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

/**
 * 客户贷款信息
 */
public class APPApplInfoVo {
    private Long       id;            // 贷款订单主键
    @JsonIgnore                       // 在转成JSON字符串时忽略此属性
    private String     idCardNo;      // 身份证号码
    private String     cntrctNo;      // 合同编号
    private Integer    loanPeriod;    // 贷款期数
    private BigDecimal loanAmt;       // 贷款金额(协催)/合同金额(考查)

    /** 协催 */
    private BigDecimal clearAmt;      // 结清金额
    private BigDecimal receivableAmt; // 应还金额
    private Integer    paidPeriod;    // 已还期数
    private Integer    overdueDays;   // 逾期天数

    /** 考查 */
    private String applCode;          // 申请编号
    private String applAmt;           // 申请额度

    public Long getId() {
        return id;
    }

    public APPApplInfoVo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public APPApplInfoVo setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
        return this;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public APPApplInfoVo setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
        return this;
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public APPApplInfoVo setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
        return this;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public APPApplInfoVo setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
        return this;
    }

    public BigDecimal getClearAmt() {
        return clearAmt;
    }

    public APPApplInfoVo setClearAmt(BigDecimal clearAmt) {
        this.clearAmt = clearAmt;
        return this;
    }

    public BigDecimal getReceivableAmt() {
        return receivableAmt;
    }

    public APPApplInfoVo setReceivableAmt(BigDecimal receivableAmt) {
        this.receivableAmt = receivableAmt;
        return this;
    }

    public Integer getPaidPeriod() {
        return paidPeriod;
    }

    public APPApplInfoVo setPaidPeriod(Integer paidPeriod) {
        this.paidPeriod = paidPeriod;
        return this;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public APPApplInfoVo setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
        return this;
    }

    public String getApplCode() {
        return applCode;
    }

    public APPApplInfoVo setApplCode(String applCode) {
        this.applCode = applCode;
        return this;
    }

    public String getApplAmt() {
        return applAmt;
    }

    public APPApplInfoVo setApplAmt(String applAmt) {
        this.applAmt = applAmt;
        return this;
    }
}