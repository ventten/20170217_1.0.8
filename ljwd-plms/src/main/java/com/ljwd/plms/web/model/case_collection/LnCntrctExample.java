package com.ljwd.plms.web.model.case_collection;

/**
 * 合同信息,LN_CNTRCT
 * */
public class LnCntrctExample {

    private Long id;                    //记录ID,由序列Seq_Contract_ID产生
    private Long applId;                //贷款申请单记录ID
    private String cntrctNo;            //合同编号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

}