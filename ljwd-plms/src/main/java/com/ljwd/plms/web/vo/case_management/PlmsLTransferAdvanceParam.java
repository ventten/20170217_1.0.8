package com.ljwd.plms.web.vo.case_management;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.ljwd.plms.web.model.BaseExample;

public class PlmsLTransferAdvanceParam extends BaseExample {

	 //移交类型
    private String transfertype;
    //状态
    private String status;
    //合同编号
    private String cntrctNo;
    //主贷人
    private String custName;
    //移交申请日期起始
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date applyDateStart;
    //移交申请日期截止
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date applyDateEnd;
    //区间值
    private List<String> scopeList;

	public String getTransfertype() {
		return transfertype;
	}

	public void setTransfertype(String transfertype) {
		this.transfertype = transfertype;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Date getApplyDateStart() {
		return applyDateStart;
	}

	public void setApplyDateStart(Date applyDateStart) {
		this.applyDateStart = applyDateStart;
	}

	public Date getApplyDateEnd() {
		return applyDateEnd;
	}

	public void setApplyDateEnd(Date applyDateEnd) {
		this.applyDateEnd = applyDateEnd;
	}

	public List<String> getScopeList() {
		return scopeList;
	}

	public void setScopeList(List<String> scopeList) {
		this.scopeList = scopeList;
	}

	
	
    
    

}
