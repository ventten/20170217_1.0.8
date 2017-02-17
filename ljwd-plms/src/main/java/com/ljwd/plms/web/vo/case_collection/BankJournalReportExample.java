package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.util.Date;

/**
 * Created by zhengzw on 2016/8/23
 * 客户银行认账信息查询条件
 */
public class BankJournalReportExample extends BaseExample{

    private Long applId;                        //借款ID
    private String contractNo;                  //合同编号
    private Date repaymentDateMin;              //实际还款日期
    private Date repaymentDateMax;              //实际还款日期

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Date getRepaymentDateMin() {
        return repaymentDateMin;
    }

    public void setRepaymentDateMin(Date repaymentDateMin) {
        this.repaymentDateMin = repaymentDateMin;
    }

    public Date getRepaymentDateMax() {
        return repaymentDateMax;
    }

    public void setRepaymentDateMax(Date repaymentDateMax) {
        this.repaymentDateMax = repaymentDateMax;
    }

}
