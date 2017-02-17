package com.ljwd.plms.web.vo.outVisit;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class OutVisitAuditParamDto extends BaseExample{

    private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)

    private String cntrctNo;  //合同编号
    
    private String custName;  //主贷人
    
    private String docno; //身份证号
    
    private String auditeStatus; //审核状态
    
    private Long orgId; //所属机构
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date submitDateStart; //外访申请提交时间开始
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date submitDateEnd; //外访申请提交时间截止
    
    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("cntrctNo"," cntrct.CNTRCT_NO ");
        sortMap.put("custName"," cust.CUST_NAME ");
        sortMap.put("submitBy"," sys_user.user_name ");
        sortMap.put("submitOrgName"," sysOrg.ORG_NAME ");
        sortMap.put("submitDate"," outVisitInfo.SUBMIT_DATE ");
        sortMap.put("siteName"," site.SITE_NAME ");
        sortMap.put("loanAmt"," payment.PAY_AMT ");
        sortMap.put("custTypeName"," custTypeName");
        sortMap.put("remainingPrincipal"," remainingPrincipal ");
        sortMap.put("overDays"," overDays ");
        sortMap.put("auditStatusName"," auditStatusName ");
        sortMap.put("auditDate"," auditDate ");
        sortMap.put("submitdNum"," submitdNum ");
        sortMap.put("auditedNum"," ");
        sortMap.put("remark"," remark ");
    }
    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }
	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
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

	public String getAuditeStatus() {
		return auditeStatus;
	}

	public void setAuditeStatus(String auditeStatus) {
		this.auditeStatus = auditeStatus;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
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
    
    

}
