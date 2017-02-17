package com.ljwd.plms.web.model.messageSystem;

import java.math.BigDecimal;

/**
 * 
* @ClassName: ChargeSchema 
* @Description: TODO(SYS_CHARGE_SCHEMA) 
* @author zhengjizhao
* @date 2016年9月8日 上午9:48:32 
*
 */
public class ChargeSchema implements java.io.Serializable {

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -627313378582021665L;
	private Long id;
    private String schemaCode;  //模式编码
    private String schemaName;  //模式名称
    private String schemaDescription;  //说明
    private String repaymentMethod;  //还款方式,1:按期还息到期还本、2:等额本息、3:等额本金、4:一次性还本付息、5:预收利息一次性还本、6:按月还息按期还本、7:按月还息任意还本,8.按月还息到期还本(提前收息),9平息
    private BigDecimal interestRate;  //贷款月利率
    private BigDecimal interestRateYear;  //年利率
    private String calculatingInterestType ;  //计算利息方式(FIRST,LAST, BOTH), 算头不算尾，算尾不算头，算头又算尾
    private Integer decimalPlace = 0;  //小数位，默认为0
    private Integer baseDays = 360;  //日利率计算基数。360
    private String roundingMode = "HALF_UP";  //取整。HALF_UP, UP,DOWN
    private Boolean adjustInterestDecimal = true;  //调整每期利息的小数至第1期。
    private Boolean adjustPrincipalDecimal = true;  //调整每期本金的小数至第1期。
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSchemaCode() {
		return schemaCode;
	}
	public void setSchemaCode(String schemaCode) {
		this.schemaCode = schemaCode;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public String getSchemaDescription() {
		return schemaDescription;
	}
	public void setSchemaDescription(String schemaDescription) {
		this.schemaDescription = schemaDescription;
	}
	public String getRepaymentMethod() {
		return repaymentMethod;
	}
	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	public BigDecimal getInterestRateYear() {
		return interestRateYear;
	}
	public void setInterestRateYear(BigDecimal interestRateYear) {
		this.interestRateYear = interestRateYear;
	}
	public String getCalculatingInterestType() {
		return calculatingInterestType;
	}
	public void setCalculatingInterestType(String calculatingInterestType) {
		this.calculatingInterestType = calculatingInterestType;
	}
	public Integer getDecimalPlace() {
		return decimalPlace;
	}
	public void setDecimalPlace(Integer decimalPlace) {
		this.decimalPlace = decimalPlace;
	}
	public Integer getBaseDays() {
		return baseDays;
	}
	public void setBaseDays(Integer baseDays) {
		this.baseDays = baseDays;
	}
	public String getRoundingMode() {
		return roundingMode;
	}
	public void setRoundingMode(String roundingMode) {
		this.roundingMode = roundingMode;
	}
	public Boolean getAdjustInterestDecimal() {
		return adjustInterestDecimal;
	}
	public void setAdjustInterestDecimal(Boolean adjustInterestDecimal) {
		this.adjustInterestDecimal = adjustInterestDecimal;
	}
	public Boolean getAdjustPrincipalDecimal() {
		return adjustPrincipalDecimal;
	}
	public void setAdjustPrincipalDecimal(Boolean adjustPrincipalDecimal) {
		this.adjustPrincipalDecimal = adjustPrincipalDecimal;
	}
    

}
