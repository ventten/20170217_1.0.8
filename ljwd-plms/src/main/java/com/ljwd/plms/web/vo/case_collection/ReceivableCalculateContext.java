package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.model.case_collection.LfReciv;

import java.math.BigDecimal;

/**
 * Created by zhengzw on 2016/8/15
 */
public class ReceivableCalculateContext {
    private ReceivableContext receivableCtx;
    private Integer periodNumber;
    private LfReciv firstNonePaidRec;
    private int overdueDay;                     //逾期天数
    private BigDecimal remainderAmount;         //剩余本金

    public ReceivableCalculateContext() {
    }

    public ReceivableCalculateContext(ReceivableContext receivableCtx, Integer periodNumber) {
        this.receivableCtx = receivableCtx;
        this.periodNumber = periodNumber;
    }

    public ReceivableContext getReceivableCtx() {
        return receivableCtx;
    }

    public void setReceivableCtx(ReceivableContext receivableCtx) {
        this.receivableCtx = receivableCtx;
    }

    public Integer getPeriodNumber() {
        return periodNumber;
    }

    public void setPeriodNumber(Integer periodNumber) {
        this.periodNumber = periodNumber;
    }

    public LfReciv getFirstNonePaidRec() {
        return firstNonePaidRec;
    }

    public void setFirstNonePaidRec(LfReciv firstNonePaidRec) {
        this.firstNonePaidRec = firstNonePaidRec;
    }

    public int getOverdueDay() {
        return overdueDay;
    }

    public void setOverdueDay(int overdueDay) {
        this.overdueDay = overdueDay;
    }

    public BigDecimal getRemainderAmount() {
        return remainderAmount;
    }

    public void setRemainderAmount(BigDecimal remainderAmount) {
        this.remainderAmount = remainderAmount;
    }
}
