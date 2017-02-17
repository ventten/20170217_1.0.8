package com.ljwd.plms.web.vo.report;

import java.math.BigDecimal;
import java.util.Date;
/**催收实收明细结果
 * <p>Title: PlmsLaCollectorIncomeResult</p>
 * @author pangshanxing
 * @date 2017年1月10日上午10:19:47
 */
public class PlmsLaOutVisitPersonIncomeResult {
	
	private Long rowNo;	//序号
	private String cntrctNo;		//合同编号
	private String custName;		//主贷人
	private String idCard;			//身份证号
    private String outVisit;		//外访员
    private BigDecimal refundAmt;//退款金额
    private BigDecimal rpmntAmt;//入帐金额
    private String rpmntDateFmt;	//还款日期
    private Date operationDate;	//录入时间
    private Date updatedTime;        //修改日期
    private String status;			//状态
    private String isActive;		//数据有效性
	public Long getRowNo() {
		return rowNo;
	}
	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getOutVisit() {
		return outVisit;
	}
	public void setOutVisit(String outVisit) {
		this.outVisit = outVisit;
	}
	public BigDecimal getRefundAmt() {
		return refundAmt;
	}
	public void setRefundAmt(BigDecimal refundAmt) {
		this.refundAmt = refundAmt;
	}
	public BigDecimal getRpmntAmt() {
		return rpmntAmt;
	}
	public void setRpmntAmt(BigDecimal rpmntAmt) {
		this.rpmntAmt = rpmntAmt;
	}
	
	public String getRpmntDateFmt() {
		return rpmntDateFmt;
	}
	public void setRpmntDateFmt(String rpmntDateFmt) {
		this.rpmntDateFmt = rpmntDateFmt;
	}
	public Date getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
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
    
    
}
