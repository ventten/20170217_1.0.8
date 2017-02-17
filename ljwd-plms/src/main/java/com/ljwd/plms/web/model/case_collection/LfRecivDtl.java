package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 应收款明细,LF_RECIV_DTL
 * */
public class LfRecivDtl extends BaseModel{

    //帐目代码
    public final static String PRINCIPAL = "PRINCIPAL";                     //本金/保证金
    public final static String INTEREST = "INTEREST";                       //利息
    public final static String BROKER_FEE = "BROKER_FEE";                   //居间费
    public final static String HANDLING_FEE = "HANDLING_FEE";               //服务费
    public final static String PENALTY = "PENALTY";                         //违约金
    public final static String OVERDUE_INTEREST = "OVERDUE_INTEREST";       //逾期利息
    public final static String FAIL_COLLECT_FEE = "FAIL_COLLECT_FEE";       //代扣费
    public final static String EXTEND_FEE = "EXTEND_FEE";                   //展期费
    public final static String COLLECT_COST = "COLLECT_COST";               //催收费
    public final static String DELAY_FEE = "DELAY_FEE";                     //延期费
    public final static String HOUSE_QUERY_FEE = "HOUSE_QUERY_FEE";         //房产查询费用
    public final static String SURVEY_FEE = "SURVEY_FEE";                   //实地考察费用
    public final static String TTL_FEE = "TTL_FEE";                         //总费用(含月利率)（趸交业务模式用）
    public static final String CREDIT_QUERY_FEE = "CREDIT_QUERY_FEE";       //征信查询用/划扣手续费
    public static final String ADVANCE_FEE = "ADVANCE_FEE";                 //预交费用/预付款
    public static final String HOUSE_SURVEY_FEE = "HOUSE_SURVEY_FEE";       //房产调查费
    public static final String AGENCY_HANDLING_FEE = "AGENCY_HANDLING_FEE"; //贷款手续费
    public static final String GPS_COST = "GPS_COST";                       //GPS费用
    public static final String RETURN_GPS_COST = "RETURN_GPS_COST";         //退还GPS费用
    public static final String RISK_DEPOSIT = "RISK_DEPOSIT";               //风险保证金
    public static final String ESTIMATION_FEE = "ESTIMATION_FEE";           //检测评估费
    public static final String MORTGAGE_FEE = "MORTGAGE_FEE";               //抵押登记费
    public static final String VEHICLE_CHADANG_FEE = "VEHICLE_CHADANG_FEE"; //车辆查档费
    public static final String OTHER_FEE = "OTHER_FEE";                     //其它
    public static final String PARKING_FEE = "PARKING_FEE";                 //停车费
    public static final String TOWING_FEE = "TOWING_FEE";                   //拖车费

    private Long id;                //记录ID
    private Long recivId;           //应收记录ID
    private String ledgerCode;      //帐目代码
    private BigDecimal recivAmt;    //应收款
    private BigDecimal actualAmt;   //实收总款
    private BigDecimal waivedAmt;   //减免金额

    //dto
    private String ledgerName;  //账目名称
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecivId() {
        return recivId;
    }

    public void setRecivId(Long recivId) {
        this.recivId = recivId;
    }

    public String getLedgerCode() {
        return ledgerCode;
    }

    public void setLedgerCode(String ledgerCode) {
        this.ledgerCode = ledgerCode == null ? null : ledgerCode.trim();
    }

    public BigDecimal getRecivAmt() {
        return recivAmt;
    }

    public void setRecivAmt(BigDecimal recivAmt) {
        this.recivAmt = recivAmt;
    }

    public BigDecimal getActualAmt() {
        return actualAmt;
    }

    public void setActualAmt(BigDecimal actualAmt) {
        this.actualAmt = actualAmt;
    }

    public BigDecimal getWaivedAmt() {
        return waivedAmt;
    }

    public void setWaivedAmt(BigDecimal waivedAmt) {
        this.waivedAmt = waivedAmt;
    }

	public String getLedgerName() {
		return ledgerName;
	}

	public void setLedgerName(String ledgerName) {
		this.ledgerName = ledgerName;
	}

    
}