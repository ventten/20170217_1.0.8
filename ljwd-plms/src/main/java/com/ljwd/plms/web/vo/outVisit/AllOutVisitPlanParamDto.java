package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class AllOutVisitPlanParamDto  extends BaseExample{

	
	private Long areaId; //所属区域Id
	private String outVisiter;//外访人员
	private String outVisiterName;//外访人员
	private String planStatus; //计划状态
	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date planDateStart; //计划时间开始
	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date planDateEnd; //计划时间截止
	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date assignDateStart; //外访分配时间开始
	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date assignDateEnd; //外访分配时间截止
	private String visitType; //外访类型
    private String cntrctNo;  //合同编号
    private String custName;  //主贷人
    private String docno; //身份证号
    
    /**
     * 全部外访排序
     */
    private static Map<String,String> sortMap1 = new HashMap<String,String>();
    static {
        sortMap1.put("planCode"," planCode ");
        sortMap1.put("planStartTime"," planStartTime ");
        sortMap1.put("visitType"," visitType ");
        sortMap1.put("custName"," custName ");
        sortMap1.put("addressType"," addressType ");
        sortMap1.put("outVisiterName"," outVisiterName ");
        sortMap1.put("planStatusName"," planStatusName ");
        sortMap1.put("addressValidity"," addressValidity ");
        sortMap1.put("followupResults"," followupResults ");
        sortMap1.put("expectCloseTime"," expectCloseTime ");

    }
    
    public void setOrderByClause(DataTableParam param){
    		super.setOrderByClause(param,sortMap1);
    	 
    }
    
    
    
    
	
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public String getOutVisiter() {
		return outVisiter;
	}
	public void setOutVisiter(String outVisiter) {
		this.outVisiter = outVisiter;
	}
	public String getOutVisiterName() {
		return outVisiterName;
	}
	public void setOutVisiterName(String outVisiterName) {
		this.outVisiterName = outVisiterName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public Date getPlanDateStart() {
		return planDateStart;
	}
	public void setPlanDateStart(Date planDateStart) {
		this.planDateStart = planDateStart;
	}
	public Date getPlanDateEnd() {
		return planDateEnd;
	}
	public void setPlanDateEnd(Date planDateEnd) {
		this.planDateEnd = planDateEnd;
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
	public String getVisitType() {
		return visitType;
	}
	public void setVisitType(String visitType) {
		this.visitType = visitType;
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

    
}
