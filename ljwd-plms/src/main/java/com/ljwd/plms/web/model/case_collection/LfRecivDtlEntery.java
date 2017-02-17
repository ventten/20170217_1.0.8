package com.ljwd.plms.web.model.case_collection;

import java.math.BigDecimal;

/**
 * ClassName: LfRecivDtlEntery
 * @Description: 催记页面应收款项数据实体
 * @author zhengjizhao
 * @date 2016年12月15日上午9:36:23
 */
public class LfRecivDtlEntery {

	private BigDecimal principal; 			//本金/保证金
	private BigDecimal interest;  			//利息
	private BigDecimal brokerFee; 			//居间费
	private BigDecimal handlingFee; 		//服务费
	private BigDecimal penalty;				//违约金
	private BigDecimal overdueInterest;		//逾期利息
	private BigDecimal failCollectFee;		//代扣费
	private BigDecimal extendFee;			//展期费
	private BigDecimal collectCost;			//催收费
	private BigDecimal delayFee;			//延期费
	private BigDecimal houseQueryFee;		//房产查询费用
	private BigDecimal surveyFee;			//实地考察费用
	private BigDecimal ttlFee;				//总费用(含月利率)（趸交业务模式用）
	private BigDecimal creditQueryFee;		//征信查询用/划扣手续费
	private BigDecimal advanceFee;			//预交费用/预付款
	private BigDecimal houseSurveyFee;		//房产调查费
	private BigDecimal agencyHandlingFee;	//贷款手续费
	private BigDecimal gpsCost;				//GPS费用
	private BigDecimal returnGpsCost;		//退还GPS费用
	private BigDecimal riskDeposit;			//风险保证金
	private BigDecimal estimationFee;		//检测评估费
	private BigDecimal mortgageFee;			//抵押登记费
	private BigDecimal vehicleChadangFee;	//车辆查档费
	private BigDecimal otherFee;			//其它
	private BigDecimal parkingFee;			//停车费
	private BigDecimal towingFee;			//拖车费
	
	private BigDecimal clearAmt;			//应还金额

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getBrokerFee() {
		return brokerFee;
	}

	public void setBrokerFee(BigDecimal brokerFee) {
		this.brokerFee = brokerFee;
	}

	public BigDecimal getHandlingFee() {
		return handlingFee;
	}

	public void setHandlingFee(BigDecimal handlingFee) {
		this.handlingFee = handlingFee;
	}

	public BigDecimal getPenalty() {
		return penalty;
	}

	public void setPenalty(BigDecimal penalty) {
		this.penalty = penalty;
	}

	public BigDecimal getOverdueInterest() {
		return overdueInterest;
	}

	public void setOverdueInterest(BigDecimal overdueInterest) {
		this.overdueInterest = overdueInterest;
	}

	public BigDecimal getFailCollectFee() {
		return failCollectFee;
	}

	public void setFailCollectFee(BigDecimal failCollectFee) {
		this.failCollectFee = failCollectFee;
	}

	public BigDecimal getExtendFee() {
		return extendFee;
	}

	public void setExtendFee(BigDecimal extendFee) {
		this.extendFee = extendFee;
	}

	public BigDecimal getCollectCost() {
		return collectCost;
	}

	public void setCollectCost(BigDecimal collectCost) {
		this.collectCost = collectCost;
	}

	public BigDecimal getDelayFee() {
		return delayFee;
	}

	public void setDelayFee(BigDecimal delayFee) {
		this.delayFee = delayFee;
	}

	public BigDecimal getHouseQueryFee() {
		return houseQueryFee;
	}

	public void setHouseQueryFee(BigDecimal houseQueryFee) {
		this.houseQueryFee = houseQueryFee;
	}

	public BigDecimal getSurveyFee() {
		return surveyFee;
	}

	public void setSurveyFee(BigDecimal surveyFee) {
		this.surveyFee = surveyFee;
	}

	public BigDecimal getTtlFee() {
		return ttlFee;
	}

	public void setTtlFee(BigDecimal ttlFee) {
		this.ttlFee = ttlFee;
	}

	public BigDecimal getCreditQueryFee() {
		return creditQueryFee;
	}

	public void setCreditQueryFee(BigDecimal creditQueryFee) {
		this.creditQueryFee = creditQueryFee;
	}

	public BigDecimal getAdvanceFee() {
		return advanceFee;
	}

	public void setAdvanceFee(BigDecimal advanceFee) {
		this.advanceFee = advanceFee;
	}

	public BigDecimal getHouseSurveyFee() {
		return houseSurveyFee;
	}

	public void setHouseSurveyFee(BigDecimal houseSurveyFee) {
		this.houseSurveyFee = houseSurveyFee;
	}

	public BigDecimal getAgencyHandlingFee() {
		return agencyHandlingFee;
	}

	public void setAgencyHandlingFee(BigDecimal agencyHandlingFee) {
		this.agencyHandlingFee = agencyHandlingFee;
	}

	public BigDecimal getGpsCost() {
		return gpsCost;
	}

	public void setGpsCost(BigDecimal gpsCost) {
		this.gpsCost = gpsCost;
	}

	public BigDecimal getReturnGpsCost() {
		return returnGpsCost;
	}

	public void setReturnGpsCost(BigDecimal returnGpsCost) {
		this.returnGpsCost = returnGpsCost;
	}

	public BigDecimal getRiskDeposit() {
		return riskDeposit;
	}

	public void setRiskDeposit(BigDecimal riskDeposit) {
		this.riskDeposit = riskDeposit;
	}

	public BigDecimal getEstimationFee() {
		return estimationFee;
	}

	public void setEstimationFee(BigDecimal estimationFee) {
		this.estimationFee = estimationFee;
	}

	public BigDecimal getMortgageFee() {
		return mortgageFee;
	}

	public void setMortgageFee(BigDecimal mortgageFee) {
		this.mortgageFee = mortgageFee;
	}

	public BigDecimal getVehicleChadangFee() {
		return vehicleChadangFee;
	}

	public void setVehicleChadangFee(BigDecimal vehicleChadangFee) {
		this.vehicleChadangFee = vehicleChadangFee;
	}

	public BigDecimal getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(BigDecimal otherFee) {
		this.otherFee = otherFee;
	}

	public BigDecimal getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(BigDecimal parkingFee) {
		this.parkingFee = parkingFee;
	}

	public BigDecimal getTowingFee() {
		return towingFee;
	}

	public void setTowingFee(BigDecimal towingFee) {
		this.towingFee = towingFee;
	}

	public BigDecimal getClearAmt() {
		return clearAmt;
	}

	public void setClearAmt(BigDecimal clearAmt) {
		this.clearAmt = clearAmt;
	}

}
