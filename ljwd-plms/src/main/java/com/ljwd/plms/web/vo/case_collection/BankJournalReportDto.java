package com.ljwd.plms.web.vo.case_collection;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/8/23
 * 客户银行认账信息Dto
 */
public class BankJournalReportDto {

    private Long applId;                        //借款ID
    private String contractNo;                  //合同编号
    private String custName;                    //客户姓名
    private String idCardNo;                    //客户身份证号
    private String repaymentName;               //银行账号名
    private BigDecimal repaymentAmount;         //认领金额
    private Date enterAcDate;                   //认领时间
    private Date repaymentDate;                 //实际还款日期
    private String isWriteOff;                  //是否核销：是、否
    private String isAdvanceClear;              //是否提前结清：是、否
    private String isOutsrcCustormer;           //是否外包:外包客户、未外包
    private String outSrcType;                  //外包类型：一手外包、二手外包
    private String enterAcStatus;               //入账状态:UNHANDLED-未处理,ASSIGNED-已认账,CONFRIMED-已确认,POSTED-已入账,ASSIGN_ERROR-认账错误,RETURNED-已退回,CANNCELLED-作废,SUSPENDED-挂起
    private String remark;                      //摘要
    private String errorReason;                 //认账错误原因
    private String handleReason;                //挂账原因

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

    public String getRepaymentName() {
        return repaymentName;
    }

    public void setRepaymentName(String repaymentName) {
        this.repaymentName = repaymentName;
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public Date getEnterAcDate() {
        return enterAcDate;
    }

    public void setEnterAcDate(Date enterAcDate) {
        this.enterAcDate = enterAcDate;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public String getIsWriteOff() {
        return isWriteOff;
    }

    public void setIsWriteOff(String isWriteOff) {
        this.isWriteOff = isWriteOff;
    }

    public String getIsAdvanceClear() {
        return isAdvanceClear;
    }

    public void setIsAdvanceClear(String isAdvanceClear) {
        this.isAdvanceClear = isAdvanceClear;
    }

    public String getIsOutsrcCustormer() {
        return isOutsrcCustormer;
    }

    public void setIsOutsrcCustormer(String isOutsrcCustormer) {
        this.isOutsrcCustormer = isOutsrcCustormer;
    }

    public String getOutSrcType() {
        return outSrcType;
    }

    public void setOutSrcType(String outSrcType) {
        this.outSrcType = outSrcType;
    }

    public String getEnterAcStatus() {
        return enterAcStatus;
    }

    public void setEnterAcStatus(String enterAcStatus) {
        this.enterAcStatus = enterAcStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public String getHandleReason() {
        return handleReason;
    }

    public void setHandleReason(String handleReason) {
        this.handleReason = handleReason;
    }

}
