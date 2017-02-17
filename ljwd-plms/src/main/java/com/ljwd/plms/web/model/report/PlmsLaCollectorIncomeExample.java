package com.ljwd.plms.web.model.report;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

/**催收实收明细
 * <p>Title: PlmsLaCollectorIncomeExample</p>
 * @author pangshanxing
 * @date 2017年1月9日下午6:16:06
 */

public class PlmsLaCollectorIncomeExample extends BaseExample{
	
	private String cntrctNo;		//合同编号
	
    private String collector;		//催收员（代理催收员）

    private String outVisit;		//外访员
    
    private String status;			//状态
    
    private String isActive;		//数据有效性
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date repaymentDateStart;	//还款日期开始
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date repaymentDateEnd;		//还款日期截止
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date enterDateStart;		//操作入账日期开始
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date enterDateEnd;			//操作入账日期截止
    
    private String type;				//报表类型
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date createDataDate;		//生成数据的日期
    
    /**
     * 全部外访排序
     */
    private static Map<String,String> sortMap1 = new HashMap<String,String>();
    static {
        sortMap1.put("cntrctNo"," cntrctNo ");
        sortMap1.put("custName"," custName ");
        sortMap1.put("idCard"," idCard ");
        sortMap1.put("collector"," collector ");
        sortMap1.put("collectorAgent"," collectorAgent ");
        sortMap1.put("outVisit","outVisit ");
        sortMap1.put("refundAmt"," refundAmt ");
        sortMap1.put("rpmntAmt"," rpmntAmt ");
        sortMap1.put("rpmntDateFmt"," rpmntDate ");
        sortMap1.put("operationDate"," operationDate ");
        sortMap1.put("updatedTime"," updatedTime ");
        sortMap1.put("status"," status ");
        sortMap1.put("isActive"," isActive ");
    }
    
    public void setOrderByClause(DataTableParam param){
    		super.setOrderByClause(param,sortMap1);
    	 
    }
    
    
    
	public String getCntrctNo() {
		return cntrctNo;
	}
	public void setCntrctNo(String cntrctNo) {
		this.cntrctNo = cntrctNo;
	}
	public String getCollector() {
		return collector;
	}
	public void setCollector(String collector) {
		this.collector = collector;
	}
	
	public String getOutVisit() {
		return outVisit;
	}
	public void setOutVisit(String outVisit) {
		this.outVisit = outVisit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Date getRepaymentDateStart() {
		return repaymentDateStart;
	}
	public void setRepaymentDateStart(Date repaymentDateStart) {
		this.repaymentDateStart = repaymentDateStart;
	}
	public Date getRepaymentDateEnd() {
		return repaymentDateEnd;
	}
	public void setRepaymentDateEnd(Date repaymentDateEnd) {
		this.repaymentDateEnd = repaymentDateEnd;
	}
	public Date getEnterDateStart() {
		return enterDateStart;
	}
	public void setEnterDateStart(Date enterDateStart) {
		this.enterDateStart = enterDateStart;
	}
	public Date getEnterDateEnd() {
		return enterDateEnd;
	}
	public void setEnterDateEnd(Date enterDateEnd) {
		this.enterDateEnd = enterDateEnd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreateDataDate() {
		return createDataDate;
	}
	public void setCreateDataDate(Date createDataDate) {
		this.createDataDate = createDataDate;
	}
	
	
}