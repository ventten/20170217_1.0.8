package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class OutVisitDelayParamDto extends BaseExample{

	private String areaId;  //所属城市
	private String auditeStatus;  //审批状态
	private String delaySubmitBy; //延期申请人
	private String cntrctNo;  //合同编号
    private String custName;  //主贷人
    private String docno; //身份证号
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date delayAuditTimeStart; //审批日期开始
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date delayAuditTimeEnd; //审批日期截止
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date submitDateStart; //外访延期申请提交时间开始
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date submitDateEnd; //外访延期申请提交时间截止
    private String delayTimesMin;//已延期次数最小值 
    private String delayTimesMax;//已延期次数最大值 
    
    
    /**
     * 全部外访排序
     */
    private static Map<String,String> sortMap1 = new HashMap<String,String>();
    static {
        sortMap1.put("areaName"," areaName ");
        sortMap1.put("cntrctNo"," cntrctNo ");
        sortMap1.put("custName"," custName ");
        sortMap1.put("docno"," docno ");
        sortMap1.put("assignDate"," assignDate ");
        sortMap1.put("expectCloseTime"," expectCloseTime ");
        sortMap1.put("delaySubmitTime"," delaySubmitTime ");
        sortMap1.put("delaySubmitName"," delaySubmitName ");
        sortMap1.put("delayDuration"," delayDuration ");
        sortMap1.put("delayTimes"," delayTimes ");
        sortMap1.put("visitOverNum"," visitOverNum ");
        sortMap1.put("lastFollowTime","  ");
        sortMap1.put("delayAuditResultName"," delayAuditResultName ");
        sortMap1.put("delayAuditTime"," delayAuditTime ");
        sortMap1.put("delayAuditName"," delayAuditName ");
        sortMap1.put("delayReason"," delayReason ");
        sortMap1.put("delayAuditRefuse"," delayAuditRefuse ");
        
    }
    
    public void setOrderByClause(DataTableParam param){
    		super.setOrderByClause(param,sortMap1);
    	 
    }
    
    
    
    
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAuditeStatus() {
		return auditeStatus;
	}
	public void setAuditeStatus(String auditeStatus) {
		this.auditeStatus = auditeStatus;
	}
	public String getDelaySubmitBy() {
		return delaySubmitBy;
	}
	public void setDelaySubmitBy(String delaySubmitBy) {
		this.delaySubmitBy = delaySubmitBy;
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
	public Date getDelayAuditTimeStart() {
		return delayAuditTimeStart;
	}
	public void setDelayAuditTimeStart(Date delayAuditTimeStart) {
		this.delayAuditTimeStart = delayAuditTimeStart;
	}
	public Date getDelayAuditTimeEnd() {
		return delayAuditTimeEnd;
	}
	public void setDelayAuditTimeEnd(Date delayAuditTimeEnd) {
		this.delayAuditTimeEnd = delayAuditTimeEnd;
	}
	public Date getSubmitDateStart() {
		return submitDateStart;
	}
	public void setSubmitDateStart(Date submitDateStart) {
		this.submitDateStart = submitDateStart;
	}
	public Date getSubmitDateEnd() {
		return submitDateEnd;
	}
	public void setSubmitDateEnd(Date submitDateEnd) {
		this.submitDateEnd = submitDateEnd;
	}
	public String getDelayTimesMin() {
		return delayTimesMin;
	}
	public void setDelayTimesMin(String delayTimesMin) {
		this.delayTimesMin = delayTimesMin;
	}
	public String getDelayTimesMax() {
		return delayTimesMax;
	}
	public void setDelayTimesMax(String delayTimesMax) {
		this.delayTimesMax = delayTimesMax;
	}

    
}
