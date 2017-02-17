package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.enums.RepayType;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/17
 * 发起再扣时请求参数实体
 */
public class RecollectVo {

    private Long applId;                        //借款ID
    private Long paymentId;                     //放款ID
    private String cntrctNo;                    //合同编号
    private Integer overduePeriod;              //最小逾期期数
    private Date repaymentDate;                 //再扣日期
    private RepayType payType;                  //还款方式
    private BigDecimal collectAmt;              //再扣金额

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public Integer getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Integer overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public RepayType getPayType() {
        return payType;
    }

    public void setPayType(RepayType payType) {
        this.payType = payType;
    }

    public BigDecimal getCollectAmt() {
        return collectAmt;
    }

    public void setCollectAmt(BigDecimal collectAmt) {
        this.collectAmt = collectAmt;
    }

}
