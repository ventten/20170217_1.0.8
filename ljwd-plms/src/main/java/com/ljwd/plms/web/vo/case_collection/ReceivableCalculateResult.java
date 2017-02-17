package com.ljwd.plms.web.vo.case_collection;

import java.math.BigDecimal;

/**
 * Created by zhengzw on 2016/8/15
 */
public class ReceivableCalculateResult {
    private BigDecimal calculateAmt;
    private BigDecimal calculateRate;

    public ReceivableCalculateResult() {
    }

    public ReceivableCalculateResult(BigDecimal calculateAmt, BigDecimal calculateRate) {
        this.calculateAmt = calculateAmt;
        this.calculateRate = calculateRate;
    }

    public BigDecimal getCalculateAmt() {
        return calculateAmt;
    }

    public void setCalculateAmt(BigDecimal calculateAmt) {
        this.calculateAmt = calculateAmt;
    }

    public BigDecimal getCalculateRate() {
        return calculateRate;
    }

    public void setCalculateRate(BigDecimal calculateRate) {
        this.calculateRate = calculateRate;
    }
}
