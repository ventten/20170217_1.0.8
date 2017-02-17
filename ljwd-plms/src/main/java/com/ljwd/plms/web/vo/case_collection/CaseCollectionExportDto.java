package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.vo.PageRowNo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2017/01/10
 * 全部案件导出Dto,字段顺序有要求
 */
public class CaseCollectionExportDto {

    private Long rowNo;                         //行号
    private String cntrctNo;                    //合同编号
    private String custName;                    //主贷人
    private String docno;                       //证件号码
    private String mobile;                      //联系电话
    private BigDecimal loanAmt;                 //贷款金额
    private String overduePeriodText;           //逾期期数
    private Integer overDays;                   //逾期天数
    private BigDecimal remainingPrincipal;      //剩余本金/保证金
    private String isFollowed;                  //是否跟进-显示值
    private String collectMthdText;             //催收类型-显示值
    private String statusText;                  //跟进情况状态-显示值
    private String resultText;                  //催收代码-显示值
    private String controlStatusText;           //控管状态-显示值
    private Date assignTime;                    //分配时间
    private String collectorName;               //催收员名字
    private String agentName;                   //代理催收员名字
    private String agentEndDateFmt;             //代理催结束日期

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public String getOverduePeriodText() {
        return overduePeriodText;
    }

    public void setOverduePeriodText(String overduePeriodText) {
        this.overduePeriodText = overduePeriodText;
    }

    public Integer getOverDays() {
        return overDays;
    }

    public void setOverDays(Integer overDays) {
        this.overDays = overDays;
    }

    public BigDecimal getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public String getIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(String isFollowed) {
        this.isFollowed = isFollowed;
    }

    public String getCollectMthdText() {
        return collectMthdText;
    }

    public void setCollectMthdText(String collectMthdText) {
        this.collectMthdText = collectMthdText;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    public String getControlStatusText() {
        return controlStatusText;
    }

    public void setControlStatusText(String controlStatusText) {
        this.controlStatusText = controlStatusText;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentEndDateFmt() {
        return agentEndDateFmt;
    }

    public void setAgentEndDateFmt(String agentEndDateFmt) {
        this.agentEndDateFmt = agentEndDateFmt;
    }

}
