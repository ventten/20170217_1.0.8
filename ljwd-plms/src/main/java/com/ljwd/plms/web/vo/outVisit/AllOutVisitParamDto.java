package com.ljwd.plms.web.vo.outVisit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;
/**
 * <p>Title: AllOutVisitParamDto</p>
 * @author pangshanxing
 * @date 2016年11月3日下午4:03:11
 * 全部外访查询参数
 */
public class AllOutVisitParamDto extends BaseExample{
	
	private Long areaId; //所属区域Id
  	private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)
    private String status; //案件状态
    private String outVisiter;//外访人员
    private String outVisiterName;//外访人员
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date assignDateStart; //外访分配时间开始
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date assignDateEnd; //外访分配时间截止
  	private String visitType; //外访类型
	private String applyNo; //申请编号
    private String cntrctNo;  //合同编号
    private String custName;  //主贷人
    private String docno; //身份证号
    private String isOfferReplyFail;           //是否当天扣款失败
    
    /**
     * 全部外访排序
     */
    private static Map<String,String> sortMap1 = new HashMap<String,String>();
    static {
        sortMap1.put("outVisitUserName"," outVisitUserName ");
        sortMap1.put("applyNo"," applyNo ");
        sortMap1.put("assignDate"," assignDate ");
        sortMap1.put("expectCloseTime"," expectCloseTime ");
        sortMap1.put("visitType"," visitType ");
        sortMap1.put("custType"," custType ");
        sortMap1.put("statusVal"," statusVal ");
        sortMap1.put("cntrctNo"," cntrctNo ");
        sortMap1.put("custName"," custName ");
        sortMap1.put("idCardNo"," idCardNo ");
        sortMap1.put("loanAmt"," loanAmt ");
        sortMap1.put("remainingPrincipal"," remainingPrincipal ");
        sortMap1.put("overdueDay","overdueDay ");
        sortMap1.put("overdueDayNow"," overdueDayNow ");
        sortMap1.put("planNum"," planNum ");
        sortMap1.put("finishNum"," finishNum ");
        sortMap1.put("historyNum"," historyNum ");
        sortMap1.put("registerOverNum"," registerOverNum ");
        sortMap1.put("houseOverNum"," houseOverNum ");
        sortMap1.put("companyOverNum"," companyOverNum ");
        sortMap1.put("userName"," userName ");
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
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getIsOfferReplyFail() {
		return isOfferReplyFail;
	}
	public void setIsOfferReplyFail(String isOfferReplyFail) {
		this.isOfferReplyFail = isOfferReplyFail;
	}
	

    
}
