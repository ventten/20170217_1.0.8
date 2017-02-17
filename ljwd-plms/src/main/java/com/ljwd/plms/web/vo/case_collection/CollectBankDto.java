package com.ljwd.plms.web.vo.case_collection;

/**
 * Created by zhengzw on 2016/8/10
 * 扣款银行账号Dto
 */
public class CollectBankDto {

    private Integer seqNum;                     //顺序,从1开始
    private Long applId;                        //借款申请ID
    private Long cntrctId;                      //合同ID
    private String bankCode;                    //银行Code
    private String bankAccountName;             //账户名称
    private String bankCardNo;                  //银行卡号
    private String bankName;                    //银行名称

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
