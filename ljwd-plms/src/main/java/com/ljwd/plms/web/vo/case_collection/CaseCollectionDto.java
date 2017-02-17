package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.vo.PageRowNo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/7/26
 * 我的案件、全部案件Dto
 */
public class CaseCollectionDto extends PageRowNo {

    private Long applId;                        //借款ID
    private Long paymentId;                     //放款记录ID
    private String cntrctNo;                    //合同编号
    private String custName;                    //主贷人
    private String docno;                       //证件号码
    private String mobile;                      //联系电话

    private BigDecimal loanAmt;                 //贷款金额
    private String prdNo;                       //贷款产品编码
    private String prdName;                     //贷款产品名称

    private Integer overduePeriod;              //最早逾期期数
    private Integer maxOverduePeriod;           //最大逾期期数
    private Integer overDays;                   //逾期天数
    private BigDecimal remainingPrincipal;      //剩余本金/保证金
    //private BigDecimal overdueAmount;           //逾期金额

    private Integer followedCount;              //是否跟进(大于0表示已跟进)
    private String isFollowed;                  //是否跟进-显示值
    private String collectMthd;                 //催收类型
    private String collectMthdText;             //催收类型-显示值
    private String bizCategory;					//业务类型
    private String status;                      //跟进情况状态
    private String statusText;                  //跟进情况状态-显示值
    private Date lastFollowedDate;				//最后跟进时间（最后创建催收记录的时间）
    private String result;                      //催收代码
    private String resultText;                  //催收代码-显示值
    private String controlStatus;               //控管状态
    private String controlStatusText;           //控管状态-显示值

    private Date assignTime;                    //分配时间
    private String collector;                   //催收员ID
    private String collectorName;               //催收员名字
    private String agent;                       //代理催收员ID
    private String agentName;                   //代理催收员名字
    private Date agentEndDate;                  //代理催结束日期

    private String agentEndDateFmt;             //代理催结束日期

    public String getAgentEndDateFmt() {
        return D.parse(agentEndDate);
    }
    public String getIsFollowed() {
        if(followedCount > 0){
            return "已跟进";
        }else {
            return "未跟进";
        }
    }

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

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public Integer getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Integer overduePeriod) {
        this.overduePeriod = overduePeriod;
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

    public Integer getFollowedCount() {
        return followedCount;
    }

    public void setFollowedCount(Integer followedCount) {
        this.followedCount = followedCount;
    }

    public String getCollectMthd() {
        return collectMthd;
    }

    public void setCollectMthd(String collectMthd) {
        this.collectMthd = collectMthd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Date getAgentEndDate() {
        return agentEndDate;
    }

    public void setAgentEndDate(Date agentEndDate) {
        this.agentEndDate = agentEndDate;
    }

    public Integer getMaxOverduePeriod() {
        return maxOverduePeriod;
    }

    public void setMaxOverduePeriod(Integer maxOverduePeriod) {
        this.maxOverduePeriod = maxOverduePeriod;
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

	public String getBizCategory() {
		return bizCategory;
	}

	public void setBizCategory(String bizCategory) {
		this.bizCategory = bizCategory;
	}

	public Date getLastFollowedDate() {
		return lastFollowedDate;
	}

	public void setLastFollowedDate(Date lastFollowedDate) {
		this.lastFollowedDate = lastFollowedDate;
	}
    
}
