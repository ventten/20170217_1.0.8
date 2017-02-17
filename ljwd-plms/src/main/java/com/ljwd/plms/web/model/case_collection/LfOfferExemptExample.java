package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

import java.math.BigDecimal;
import java.util.*;

/**
 * 免除自动代扣,LF_OFFER_EXEMPT
 * */
public class LfOfferExemptExample extends BaseExample{

    private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private String status;                  //状态：ADDED,CANCELLED
    private Date endDateMin;                //免扣结束日期-左
    private Date endDateMax;                //免扣结束日期-右

    private Long applId;                    //借款申请ID
    private String custName;                //主贷人姓名
    private String idCardNo;                //主贷人身份证号
    private String cntrctNo;                //合同编号
    private String reqByName;               //申请人姓名
    private Long orgId;                     //按机构ID递归查询申请人

    private static Map<String,String> sortMap = new HashMap<String,String>();
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
    }

    public Long getId() {
        return id;
    }

    public LfOfferExemptExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public LfOfferExemptExample setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public LfOfferExemptExample setStatus(String status) {
        this.status = status;
        return this;
    }

    public Date getEndDateMin() {
        return endDateMin;
    }

    public LfOfferExemptExample setEndDateMin(Date endDateMin) {
        this.endDateMin = endDateMin;
        return this;
    }

    public Date getEndDateMax() {
        return endDateMax;
    }

    public LfOfferExemptExample setEndDateMax(Date endDateMax) {
        this.endDateMax = endDateMax;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public LfOfferExemptExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public String getCustName() {
        return custName;
    }

    public LfOfferExemptExample setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public LfOfferExemptExample setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
        return this;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public LfOfferExemptExample setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
        return this;
    }

    public String getReqByName() {
        return reqByName;
    }

    public LfOfferExemptExample setReqByName(String reqByName) {
        this.reqByName = reqByName;
        return this;
    }

    public Long getOrgId() {
        return orgId;
    }

    public LfOfferExemptExample setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }

}