package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;
/**
 * 
 * ClassName: CalculateSummaryReceivableParamDto 
 * @Description: 查询还款明细数据的参数实体
 * @author zhengjizhao
 * @date 2017年1月11日上午11:49:40
 */
public class CalculateSummaryReceivableParamMyDto extends BaseExample{

	    private Date repaymentDate;	//应还款日期
	    private String contractNo;  //合同编号
	    private String customerName;  //主贷人
	    private String idCardNo;  //主贷人身份证号
	    private String repaymentWay;  //还款方式
	    private Boolean isInAdvanceRepayment;
	    private Boolean isRenewLoanRepayment;
	    private BigDecimal renewLoanPenaltyRate;
	    
	    
	    /*private static Map<String,String> sortMap = new HashMap<String,String>();
	    static {
	        sortMap.put("cntrctNo","cntrct.cntrct_no ");
	        sortMap.put("custName","cust.cust_name ");
	        sortMap.put("idCardNo","cust.id_card_no ");
	        sortMap.put("overduePeriod","overReciv.overduePeriod ");
	        sortMap.put("endDateFmt","T.END_DATE ");
	        sortMap.put("reqByName","nlssort(reqUser.user_name,'NLS_SORT=SCHINESE_PINYIN_M') ");
	        sortMap.put("reqTime","T.REQ_TIME ");
	        sortMap.put("statusText","T.STATUS ");
	    }

	    public void setOrderByClause(DataTableParam param){
	        super.setOrderByClause(param,sortMap);
	    }*/
		public String getRepaymentWay() {
			return repaymentWay;
		}
		public void setRepaymentWay(String repaymentWay) {
			this.repaymentWay = repaymentWay;
		}
		public Date getRepaymentDate() {
			return repaymentDate;
		}
		public void setRepaymentDate(Date repaymentDate) {
			this.repaymentDate = repaymentDate;
		}
		public String getContractNo() {
			return contractNo;
		}
		public void setContractNo(String contractNo) {
			this.contractNo = contractNo;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getIdCardNo() {
			return idCardNo;
		}
		public void setIdCardNo(String idCardNo) {
			this.idCardNo = idCardNo;
		}
		public Boolean getIsInAdvanceRepayment() {
			return isInAdvanceRepayment;
		}
		public void setIsInAdvanceRepayment(Boolean isInAdvanceRepayment) {
			this.isInAdvanceRepayment = isInAdvanceRepayment;
		}
		public Boolean getIsRenewLoanRepayment() {
			return isRenewLoanRepayment;
		}
		public void setIsRenewLoanRepayment(Boolean isRenewLoanRepayment) {
			this.isRenewLoanRepayment = isRenewLoanRepayment;
		}
		public BigDecimal getRenewLoanPenaltyRate() {
			return renewLoanPenaltyRate;
		}
		public void setRenewLoanPenaltyRate(BigDecimal renewLoanPenaltyRate) {
			this.renewLoanPenaltyRate = renewLoanPenaltyRate;
		}
	    
	    
}
