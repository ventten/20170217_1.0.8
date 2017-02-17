package com.ljwd.plms.web.vo.case_collection;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/8/9
 * 银行扣款情况Dto
 */
public class LoanStuationDto {

    private Long applId;                        //借款ID
    private BigDecimal loanMoney;               //发起扣款金额
    private Date loanDate;                      //银行代扣时间
    private BigDecimal loanRealMoney;           //实际扣款金额
    private String loanRemark;                  //结果备注(银行反馈)
    private String loanType;                    //扣款结果:扣款失败、扣款成功、扣款中
    private Date createTime;                    //创建时间(最后扣款时间)

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
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

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
