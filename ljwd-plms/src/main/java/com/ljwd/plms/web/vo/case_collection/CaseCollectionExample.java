package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhengzw on 2016/7/26
 * 我的案件、全部案件查询条件
 */
public class CaseCollectionExample extends BaseExample{

    private String collector;                   //催收员ID
    private String queue;                       //所属队列：主队列-MainQueue、代理队列-ProxyQueue、新增客户队列-NewQueue、提前移交队列-AdvanceQueue、核销队列-CancelQueue、逾期90天内队列-OverdueDayIn90、逾期90天以上队列-OverdueDayOut90
    private String controlStatus;               //控管状态
    private Integer overDaysMin;                //逾期天数-左
    private Integer overDaysMax;                //逾期天数-右
    private Boolean isFollowed;                 //是否跟进
    private String repaymentStatus;             //还款状态:null或""-空、OVERDUE-逾期、SETTLE-结清
    private String cntrctNo;                    //合同编号
    private String custName;                    //主贷人
    private String docno;                       //身份证号
    private String mobile;						//手机号
    private Boolean isNormal;                   //案件是否正常,等于false时查询不正常的案件
    private String collectorName;               //催收员姓名
    private Long orgId;                         //按机构ID递归查询催收员

    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("cntrctNo","Pool.Cntrct_No ");
        sortMap.put("custName","nlssort(Pool.Cust_Name,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("docno","Pool.Docno ");
        sortMap.put("mobile","Cust.mobile ");
        sortMap.put("loanAmt","Pool.Loan_Amt ");
        sortMap.put("overduePeriod","overReciv.overduePeriod ");
        sortMap.put("overDays","overReciv.overDays ");
        sortMap.put("remainingPrincipal","(CNTRCT.LOAN_AMT - NVL(applAccount.REPAID_PRINCIPAL,0)) ");
        sortMap.put("isFollowed","NVL(Followed.followedCount,0) ");
        sortMap.put("collectMthdText","Record.collect_mthd ");
        sortMap.put("statusText","Record.status ");
        sortMap.put("bizCategory"," Pool.Biz_Category ");
        sortMap.put("resultText","Record.result ");
        sortMap.put("lastFollowedDate"," Record.CREATE_TIME ");
        sortMap.put("controlStatusText","Record.control_status ");
        sortMap.put("assignTime","AllocAndAgent.ASSIGN_TIME ");
        sortMap.put("collectorName","nlssort(AssignUser.User_Name,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("agentName","nlssort(AgentUser.User_Name,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("agentEndDateFmt","AllocAndAgent.Alloc_End_Date ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }

    public String getCollector() {
        return collector;
    }

    public CaseCollectionExample setCollector(String collector) {
        this.collector = (collector == null || "".equals(collector) || "".equals(collector.trim())) ? null : collector.trim();
        return this;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = (queue == null || "".equals(queue) || "".equals(queue.trim())) ? null : queue.trim();
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(String controlStatus) {
        this.controlStatus = (controlStatus == null || "".equals(controlStatus) || "".equals(controlStatus.trim())) ? null : controlStatus.trim();
    }

    public Integer getOverDaysMin() {
        return overDaysMin;
    }

    public void setOverDaysMin(Integer overDaysMin) {
        this.overDaysMin = overDaysMin;
    }

    public Integer getOverDaysMax() {
        return overDaysMax;
    }

    public void setOverDaysMax(Integer overDaysMax) {
        this.overDaysMax = overDaysMax;
    }

    public Boolean getIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(Boolean isFollowed) {
        this.isFollowed = isFollowed;
    }

    public String getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(String repaymentStatus) {
        this.repaymentStatus = (repaymentStatus == null || "".equals(repaymentStatus) || "".equals(repaymentStatus.trim())) ? null : repaymentStatus.trim();
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = (cntrctNo == null || "".equals(cntrctNo) || "".equals(cntrctNo.trim())) ? null : cntrctNo.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = (custName == null || "".equals(custName) || "".equals(custName.trim())) ? null : custName.trim();
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = (docno == null || "".equals(docno) || "".equals(docno.trim())) ? null : docno.trim();
    }

    public Boolean getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Boolean isNormal) {
        this.isNormal = isNormal;
    }

    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = (collectorName == null || "".equals(collectorName) || "".equals(collectorName.trim())) ? null : collectorName.trim();
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
    
}
