package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.util.Date;

/**
 * Created by zhengzw on 2016/8/11
 * 银行扣款情况查询条件
 */
public class LoanStuationExample extends BaseExample{

    private Long applId;                        //借款ID
    private Date loanDateMin;                   //银行代扣时间-左
    private Date loanDateMax;                   //银行代扣时间-右

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Date getLoanDateMin() {
        return loanDateMin;
    }

    public void setLoanDateMin(Date loanDateMin) {
        this.loanDateMin = loanDateMin;
    }

    public Date getLoanDateMax() {
        return loanDateMax;
    }

    public void setLoanDateMax(Date loanDateMax) {
        this.loanDateMax = loanDateMax;
    }
}
