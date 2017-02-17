package com.ljwd.plms.web.model.correspondence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;
/**
 * 逾期客户信函生成参数Dto
 * @author zhengjizhao
 *
 */
public class PlmsOverdueClientLetterGenerateParamDto extends BaseExample{

		private String siteCode;//网点 (所属城市)
		private String addrType;//地址类型
	 	private String contractNo;//合同编号
	    private String loanName;//客户名称 （主贷人）
	    private String loanCardId;//证件号码 （身份证号）
	    private Date repaymentFrom;//应还款日期
	    private Date repaymentTo;//
	    //private String paymentType;//放款类别
	    private Integer overdueDayFrom;//逾期天数
	    private Integer overdueDayTo;//
	    
	    private static Map<String,String> sortMap = new HashMap<String,String>();
	    static {
	        sortMap.put("siteName"," CASE WHEN CUSTOMER.ADDR_CITY_ID = '2151' THEN '深圳' ELSE '其他' END ");
	        sortMap.put("addrType"," CUSTOMER.ADDRTYPE ");
	        sortMap.put("paymentTypeName"," PAYMENTTYPE.TYPE_NAME ");
	        sortMap.put("clientName"," CUSTOMER.CUST_NAME ");
	        sortMap.put("contractNo"," CONTRACT.CNTRCT_NO ");
	        sortMap.put("idCardNo"," CUSTOMER.ID_CARD_NO ");
	        sortMap.put("loanAmount"," CONTRACT.LOAN_AMT ");
	        sortMap.put("repaymentDateFmt"," SUMRECEIVABEOVERDUE.RPMNT_DATE ");
	        sortMap.put("overdueDay"," SUMRECEIVABEOVERDUE.OVERDUEDAY ");
	        sortMap.put("clientAddr"," CUSTOMER.ADDR ");
	    }

	    public void setOrderByClause(DataTableParam param){
	        super.setOrderByClause(param,sortMap);
	    }
		public String getContractNo() {
			return contractNo;
		}
		public void setContractNo(String contractNo) {
			this.contractNo = contractNo;
		}
		public String getLoanName() {
			return loanName;
		}
		public void setLoanName(String loanName) {
			this.loanName = loanName;
		}
		public String getLoanCardId() {
			return loanCardId;
		}
		public void setLoanCardId(String loanCardId) {
			this.loanCardId = loanCardId;
		}
		
		public Date getRepaymentFrom() {
			return repaymentFrom;
		}
		public void setRepaymentFrom(Date repaymentFrom) {
			this.repaymentFrom = repaymentFrom;
		}
		public Date getRepaymentTo() {
			return repaymentTo;
		}
		public void setRepaymentTo(Date repaymentTo) {
			this.repaymentTo = repaymentTo;
		}
		public String getSiteCode() {
			return siteCode;
		}
		public void setSiteCode(String siteCode) {
			this.siteCode = siteCode;
		}
		public Integer getOverdueDayFrom() {
			return overdueDayFrom;
		}
		public void setOverdueDayFrom(Integer overdueDayFrom) {
			this.overdueDayFrom = overdueDayFrom;
		}
		public Integer getOverdueDayTo() {
			return overdueDayTo;
		}
		public void setOverdueDayTo(Integer overdueDayTo) {
			this.overdueDayTo = overdueDayTo;
		}
		public String getAddrType() {
			return addrType;
		}
		public void setAddrType(String addrType) {
			this.addrType = addrType;
		}
	    
}
