
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lovType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lovType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BANK"/>
 *     &lt;enumeration value="INDUSTRY"/>
 *     &lt;enumeration value="ANNEX"/>
 *     &lt;enumeration value="ANNEX_STYLE"/>
 *     &lt;enumeration value="BACK_REASON"/>
 *     &lt;enumeration value="CAPITAL_SOURCE"/>
 *     &lt;enumeration value="CORPORATION_TYPE"/>
 *     &lt;enumeration value="CRDT_CATEGORY"/>
 *     &lt;enumeration value="CRDT_RPT_TYPE"/>
 *     &lt;enumeration value="CRDT_RPT_STATUS"/>
 *     &lt;enumeration value="CUST_SOURCE"/>
 *     &lt;enumeration value="ID_TYPE"/>
 *     &lt;enumeration value="LOAN_PURPOSE"/>
 *     &lt;enumeration value="MATERIAL"/>
 *     &lt;enumeration value="REJECT_REASON"/>
 *     &lt;enumeration value="RELATIONSHIP"/>
 *     &lt;enumeration value="MARRIAGE"/>
 *     &lt;enumeration value="EDUCATION"/>
 *     &lt;enumeration value="PURCHASE_MTHD"/>
 *     &lt;enumeration value="LIVING_TYPE"/>
 *     &lt;enumeration value="HOUSE_TYPE"/>
 *     &lt;enumeration value="SALARY_PAY_MODE"/>
 *     &lt;enumeration value="STAFF_NUM_TYPE"/>
 *     &lt;enumeration value="PROPERTY_TYPE"/>
 *     &lt;enumeration value="LOAN_STATUS"/>
 *     &lt;enumeration value="SUB_LOAN_STATUS"/>
 *     &lt;enumeration value="TASK_RESULT"/>
 *     &lt;enumeration value="TASK_STATUS"/>
 *     &lt;enumeration value="L_BAD_REC"/>
 *     &lt;enumeration value="MATCH_RESULT"/>
 *     &lt;enumeration value="SS_YEAR"/>
 *     &lt;enumeration value="SS_STATE"/>
 *     &lt;enumeration value="RPMNT_STATE"/>
 *     &lt;enumeration value="BILL_INFO"/>
 *     &lt;enumeration value="PROPRIETARY_TYPE"/>
 *     &lt;enumeration value="ESTATE_PLEDGE_STATE"/>
 *     &lt;enumeration value="AC_TYPE"/>
 *     &lt;enumeration value="RPMNT_MTHD"/>
 *     &lt;enumeration value="PAYMENT_MTHD"/>
 *     &lt;enumeration value="CALC_MTHD"/>
 *     &lt;enumeration value="BASE_VAL"/>
 *     &lt;enumeration value="CHARGE_TIME"/>
 *     &lt;enumeration value="COMPETITOR"/>
 *     &lt;enumeration value="PUBLIC_ORG"/>
 *     &lt;enumeration value="LOAN_TYPE"/>
 *     &lt;enumeration value="RPMNT_STATUS"/>
 *     &lt;enumeration value="COLLECT_MTHD"/>
 *     &lt;enumeration value="COLLECT_RESULT"/>
 *     &lt;enumeration value="FOLLOW_STATUS"/>
 *     &lt;enumeration value="REMARK_TEMPLATE"/>
 *     &lt;enumeration value="PHONE_TYPE"/>
 *     &lt;enumeration value="COLLECT_ABNORMITY"/>
 *     &lt;enumeration value="POSITION"/>
 *     &lt;enumeration value="ORG_TYPE"/>
 *     &lt;enumeration value="FEE_MODE"/>
 *     &lt;enumeration value="HOUSE_INFO_TYPE"/>
 *     &lt;enumeration value="SUPER_AGING"/>
 *     &lt;enumeration value="OUTVISIT_CUST_TYPE"/>
 *     &lt;enumeration value="ASSET_CORP"/>
 *     &lt;enumeration value="ACCWATER_TYPE"/>
 *     &lt;enumeration value="BANKCARD_TYPE"/>
 *     &lt;enumeration value="TURNOVER_ABSTRACT"/>
 *     &lt;enumeration value="TURNOVER_PEER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lovType")
@XmlEnum
public enum LovType {

    BANK,
    INDUSTRY,
    ANNEX,
    ANNEX_STYLE,
    BACK_REASON,
    CAPITAL_SOURCE,
    CORPORATION_TYPE,
    CRDT_CATEGORY,
    CRDT_RPT_TYPE,
    CRDT_RPT_STATUS,
    CUST_SOURCE,
    ID_TYPE,
    LOAN_PURPOSE,
    MATERIAL,
    REJECT_REASON,
    RELATIONSHIP,
    MARRIAGE,
    EDUCATION,
    PURCHASE_MTHD,
    LIVING_TYPE,
    HOUSE_TYPE,
    SALARY_PAY_MODE,
    STAFF_NUM_TYPE,
    PROPERTY_TYPE,
    LOAN_STATUS,
    SUB_LOAN_STATUS,
    TASK_RESULT,
    TASK_STATUS,
    L_BAD_REC,
    MATCH_RESULT,
    SS_YEAR,
    SS_STATE,
    RPMNT_STATE,
    BILL_INFO,
    PROPRIETARY_TYPE,
    ESTATE_PLEDGE_STATE,
    AC_TYPE,
    RPMNT_MTHD,
    PAYMENT_MTHD,
    CALC_MTHD,
    BASE_VAL,
    CHARGE_TIME,
    COMPETITOR,
    PUBLIC_ORG,
    LOAN_TYPE,
    RPMNT_STATUS,
    COLLECT_MTHD,
    COLLECT_RESULT,
    FOLLOW_STATUS,
    REMARK_TEMPLATE,
    PHONE_TYPE,
    COLLECT_ABNORMITY,
    POSITION,
    ORG_TYPE,
    FEE_MODE,
    HOUSE_INFO_TYPE,
    SUPER_AGING,
    OUTVISIT_CUST_TYPE,
    ASSET_CORP,
    ACCWATER_TYPE,
    BANKCARD_TYPE,
    TURNOVER_ABSTRACT,
    TURNOVER_PEER;

    public String value() {
        return name();
    }

    public static LovType fromValue(String v) {
        return valueOf(v);
    }

}
