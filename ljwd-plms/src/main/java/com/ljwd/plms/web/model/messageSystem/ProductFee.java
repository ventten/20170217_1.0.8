package com.ljwd.plms.web.model.messageSystem;


/**
 * 
* @ClassName: ProductFee 
* @Description: TODO(SYS_PRD_FEE) 
* @author A18ccms a18ccms_gmail_com 
* @date 2016年9月8日 下午4:13:18 
*
 */
public class ProductFee{

    private Long id;
    private Long chargeSchemaId;  //SCHEMA_ID
    private String ledgerTypeCode; //FEE_CODE
    private String chargeTime;  //CHARGE_TIME
    private String calcMethod;  //CALC_MTHD
    private String baseValue;  //BASE_VAL
    private String valueType;  //VAL_TYPE
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getChargeSchemaId() {
		return chargeSchemaId;
	}
	public void setChargeSchemaId(Long chargeSchemaId) {
		this.chargeSchemaId = chargeSchemaId;
	}
	public String getLedgerTypeCode() {
		return ledgerTypeCode;
	}
	public void setLedgerTypeCode(String ledgerTypeCode) {
		this.ledgerTypeCode = ledgerTypeCode;
	}
	public String getChargeTime() {
		return chargeTime;
	}
	public void setChargeTime(String chargeTime) {
		this.chargeTime = chargeTime;
	}
	public String getCalcMethod() {
		return calcMethod;
	}
	public void setCalcMethod(String calcMethod) {
		this.calcMethod = calcMethod;
	}
	public String getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(String baseValue) {
		this.baseValue = baseValue;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

    
    
}
