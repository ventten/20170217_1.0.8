package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;

public class OutVisitAssignResult extends PageRowNo{

	 	private Long id;            //plms_ovm_out_visit_info的ID    
	    
	    private Long applId;        //贷款申请ID
	    
	    private Date submitDate; //外访申请提交时间

	  	private String visitType; //外访类型
	  	
        private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)
	    
	    private String custTypeName; ///客户所属类别 
	    
	    private String areaName; //所属区域名称
	    
	    private Long areaId; //所属区域Id
	    
	    private String custName;  //主贷人
	    	    
	  	private String applyNo; //申请编号

	  	private String cntrctNo;  //合同编号
	    
	    private String proName; //贷款产品
	    
	    private String submitBy; //外访申请提交人
	        	    
	    private String visitBy; //外访人员

	    private String assignStatus; //分配状态
	    	    
	    private Date assignDate; //外访分配时间
	    
	    private String outVisitStatus; //外访状态
	    
	    private String outVisitStatusName; //外访状态名称
	    
	    private Date auditDate; //外访申请审核时间

	    private String siteName;	//签约网点
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

		public Date getSubmitDate() {
			return submitDate;
		}

		public void setSubmitDate(Date submitDate) {
			this.submitDate = submitDate;
		}

		
		public String getVisitType() {
			return visitType;
		}

		public void setVisitType(String visitType) {
			this.visitType = visitType;
		}

		public String getCustType() {
			return custType;
		}

		public void setCustType(String custType) {
			this.custType = custType;
		}

		public String getCustTypeName() {
			return custTypeName;
		}

		public void setCustTypeName(String custTypeName) {
			this.custTypeName = custTypeName;
		}

		public String getAreaName() {
			return areaName;
		}

		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
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

		public String getProName() {
			return proName;
		}

		public void setProName(String proName) {
			this.proName = proName;
		}

		public String getSubmitBy() {
			return submitBy;
		}

		public void setSubmitBy(String submitBy) {
			this.submitBy = submitBy;
		}

		public String getVisitBy() {
			return visitBy;
		}

		public void setVisitBy(String visitBy) {
			this.visitBy = visitBy;
		}

		public String getAssignStatus() {
			return assignStatus;
		}

		public void setAssignStatus(String assignStatus) {
			this.assignStatus = assignStatus;
		}

		public Date getAssignDate() {
			return assignDate;
		}

		public void setAssignDate(Date assignDate) {
			this.assignDate = assignDate;
		}

		public Long getAreaId() {
			return areaId;
		}

		public void setAreaId(Long areaId) {
			this.areaId = areaId;
		}

		public String getOutVisitStatus() {
			return outVisitStatus;
		}

		public void setOutVisitStatus(String outVisitStatus) {
			this.outVisitStatus = outVisitStatus;
		}

		public String getOutVisitStatusName() {
			return outVisitStatusName;
		}

		public void setOutVisitStatusName(String outVisitStatusName) {
			this.outVisitStatusName = outVisitStatusName;
		}

		public Date getAuditDate() {
			return auditDate;
		}

		public void setAuditDate(Date auditDate) {
			this.auditDate = auditDate;
		}

		public String getSiteName() {
			return siteName;
		}

		public void setSiteName(String siteName) {
			this.siteName = siteName;
		}
		
		
}
