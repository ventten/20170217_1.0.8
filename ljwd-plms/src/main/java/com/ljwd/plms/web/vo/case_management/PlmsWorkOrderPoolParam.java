package com.ljwd.plms.web.vo.case_management;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class PlmsWorkOrderPoolParam extends BaseExample {
	
	private Long id;
	
	private String status;
	
    private String queue;

    private String cntrctNo;

    private String custName;

    private String docno;
    
    private String prdNo;

    private Long overDaysFrom;

    private Long overDaysTo;

    private String collector;
    
    private String collectorName;
    
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date allocDateStart;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date allocDateEnd;
    
    private String isAlloc;
    
    private String isConflict;
    
    private String siteCode; //所属网点
    
    private String queryPerm; //查询范围
    
    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("cntrctNo","Pool.Cntrct_No ");
        sortMap.put("custName","Pool.Cust_Name ");
        sortMap.put("docno","Pool.Docno ");
        sortMap.put("loanAmt","Pool.Loan_Amt ");
        sortMap.put("overDays","Temp.Overdueday ");
        sortMap.put("overdueAmount","Overdueamount ");
        sortMap.put("remainingPrincipal","Remainingprincipal ");
        sortMap.put("collectorName","collectorName ");
        sortMap.put("agentName","agentName ");
        sortMap.put("bizCategory","pool.BIZ_CATEGORY ");
        sortMap.put("proName","Pool.PRD_NO ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
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

	public String getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public Long getOverDaysFrom() {
		return overDaysFrom;
	}

	public void setOverDaysFrom(Long overDaysFrom) {
		this.overDaysFrom = overDaysFrom;
	}

	public Long getOverDaysTo() {
		return overDaysTo;
	}

	public void setOverDaysTo(Long overDaysTo) {
		this.overDaysTo = overDaysTo;
	}
	public Date getAllocDateStart() {
		return allocDateStart;
	}

	public void setAllocDateStart(Date allocDateStart) {
		this.allocDateStart = allocDateStart;
	}

	public Date getAllocDateEnd() {
		return allocDateEnd;
	}

	public void setAllocDateEnd(Date allocDateEnd) {
		this.allocDateEnd = allocDateEnd;
	}

	public String getIsAlloc() {
		return isAlloc;
	}

	public void setIsAlloc(String isAlloc) {
		this.isAlloc = isAlloc;
	}
	
	public String getIsConflict() {
		return isConflict;
	}

	public void setIsConflict(String isConflict) {
		this.isConflict = isConflict;
	}

	public String getCollector() {
		return collector;
	}

	public void setCollector(String collector) {
		this.collector = collector;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getQueryPerm() {
		return queryPerm;
	}

	public void setQueryPerm(String queryPerm) {
		this.queryPerm = queryPerm;
	}
	public String getCollectorName() {
		return collectorName;
	}
	public void setCollectorName(String collectorName) {
        this.collectorName = (collectorName == null || "".equals(collectorName) || "".equals(collectorName.trim())) ? null : collectorName.trim();

	}
	
	

	
    
}
