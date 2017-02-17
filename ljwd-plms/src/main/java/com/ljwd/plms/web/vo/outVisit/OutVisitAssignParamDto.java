package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class OutVisitAssignParamDto extends BaseExample{
	
		private String loginUser; //当前登录人员

	  	private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)
	  	
	  	private Long areaId; //所属区域Id
	  	
	  	private String assignStatus; //分配状态
	  	
	  	private String prdNo; //产品编号
	  	
	  	private String visitType; //外访类型
	  	
	  	private String applyNo; //申请编号

	    private String cntrctNo;  //合同编号
	    
	    private String custName;  //主贷人
	    
	    private String docno; //身份证号
	    
	    private String outVisiter; //外访人员
	    
	    private String outVisiterName;//外访人员
	    	    
	    @DateTimeFormat( pattern = "yyyy-MM-dd" )
	    private Date assignDateStart; //外访分配时间开始
	    @DateTimeFormat( pattern = "yyyy-MM-dd" )
	    private Date assignDateEnd; //外访分配时间截止
	    @DateTimeFormat( pattern = "yyyy-MM-dd" )
	    private Date submitDateStart; //外访申请提交时间开始
	    @DateTimeFormat( pattern = "yyyy-MM-dd" )
	    private Date submitDateEnd; //外访申请提交时间截止
	    
	    private String caseType; //案件状态
	    
	    private String status; //案件状态（我的外访）
	    
	    private String isSetUp; //是否创建计划
	    
	    /**
	     * 外访分配排序
	     */
	    private static Map<String,String> sortMap1 = new HashMap<String,String>();
	    static {
	        sortMap1.put("submitDate"," submitDate ");
	        sortMap1.put("visitType"," visitType ");
	        sortMap1.put("custType"," custType ");
	        sortMap1.put("areaName"," areaname ");
	        sortMap1.put("custName"," custname ");
	        sortMap1.put("applyNo"," applyNo ");
	        sortMap1.put("cntrctNo"," cntrctNo ");
	        sortMap1.put("custTypeName"," custTypeName ");
	        sortMap1.put("proName"," proName ");
	        sortMap1.put("siteName"," siteName ");
	        sortMap1.put("submitBy"," submitby ");
	        sortMap1.put("visitBy"," visitby ");
	        sortMap1.put("assignStatus"," assignStatus ");
	        sortMap1.put("outVisitStatusName"," outVisitStatus ");
	        sortMap1.put("assignDate","assignDate ");
	        sortMap1.put("auditDate"," auditDate ");
	    }
	    /**
	     * 我的外访分配
	     */
	    private static Map<String,String> sortMap2 = new HashMap<String,String>();
	    static {
	        sortMap2.put("assignDate"," assignDate ");
	        sortMap2.put("expectCloseTime"," expectCloseTime ");
	        sortMap2.put("visitType"," visitType ");
	        sortMap2.put("custType"," custType ");
	        sortMap2.put("statusVal"," status ");
	        sortMap2.put("isSetUp"," isSetUp ");
	        sortMap2.put("applyNo"," applyNo ");
	        sortMap2.put("cntrctNo"," cntrctNo ");
	        sortMap2.put("custName"," custName ");
	        sortMap2.put("overdueDay"," overdueday ");
	        sortMap2.put("overdueDayNow"," overduedayNow ");
	        sortMap2.put("planNum"," planNum ");
	        sortMap2.put("finishNum"," finishNum ");
	        sortMap2.put("historyNum","historyNum ");
	        sortMap2.put("casetypeName"," casetypeName ");
	    }
	    
	    public void setOrderByClause(DataTableParam param,String page){
	    	if(page.equals("assign")){
	    		super.setOrderByClause(param,sortMap1);
	    	}else if(page.equals("myOutVisit")){
	    		super.setOrderByClause(param,sortMap2);
	    	}
	        
	    }
	    
	    
	    
	    
		public String getCustType() {
			return custType;
		}
		public void setCustType(String custType) {
			this.custType = custType;
		}
		public Long getAreaId() {
			return areaId;
		}
		public void setAreaId(Long areaId) {
			this.areaId = areaId;
		}
		public String getAssignStatus() {
			return assignStatus;
		}
		public void setAssignStatus(String assignStatus) {
			this.assignStatus = assignStatus;
		}
		public String getPrdNo() {
			return prdNo;
		}
		public void setPrdNo(String prdNo) {
			this.prdNo = prdNo;
		}
		
		public String getVisitType() {
			return visitType;
		}
		public void setVisitType(String visitType) {
			this.visitType = visitType;
		}
		public String getApplyNo() {
			return applyNo;
		}
		public void setApplyNo(String applyNo) {
			this.applyNo = applyNo;
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
		public String getOutVisiter() {
			return outVisiter;
		}
		public void setOutVisiter(String outVisiter) {
			this.outVisiter = outVisiter;
		}
		public Date getAssignDateStart() {
			return assignDateStart;
		}
		public void setAssignDateStart(Date assignDateStart) {
			this.assignDateStart = assignDateStart;
		}
		public Date getAssignDateEnd() {
			return assignDateEnd;
		}
		public void setAssignDateEnd(Date assignDateEnd) {
			this.assignDateEnd = assignDateEnd;
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
		public String getCaseType() {
			return caseType;
		}
		public void setCaseType(String caseType) {
			this.caseType = caseType;
		}
		public String getLoginUser() {
			return loginUser;
		}
		public void setLoginUser(String loginUser) {
			this.loginUser = loginUser;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getOutVisiterName() {
			return outVisiterName;
		}
		public void setOutVisiterName(String outVisiterName) {
			this.outVisiterName = outVisiterName;
		}
		public String getIsSetUp() {
			return isSetUp;
		}
		public void setIsSetUp(String isSetUp) {
			this.isSetUp = isSetUp;
		}
	    
	    
}
