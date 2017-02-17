package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

import java.util.HashMap;
import java.util.Map;

/**
 * 客户基本信息查询条件
 * */
public class PlmsClCustInfoExample extends BaseExample {

    private Long id;                //记录id
    private String custName;        //主贷人姓名
    private String docno;           //身份证号
    private String mobile;          //手机号码
    private Integer transitCount;   //在途合同数

    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("custName","nlssort(T.cust_name,'NLS_SORT=SCHINESE_PINYIN_M') ");
        sortMap.put("docno","T.docno ");
        sortMap.put("validCount","NVL(T1.validCount,0) ");
        sortMap.put("transitCount","NVL(T1.transitCount,0) ");
        sortMap.put("applCount","NVL(T3.applCount,0) ");
        sortMap.put("rejectCount","NVL(T3.rejectCount,0) ");
        sortMap.put("overCount","NVL(T2.overCount,0) ");
        sortMap.put("overDays","NVL(T2.overDays,0) ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = (custName == null || "".equals(custName) || "".equals(custName.trim())) ? null : custName.trim();
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = (docno == null || "".equals(docno) || "".equals(docno.trim())) ? null : docno.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = (mobile == null || "".equals(mobile) || "".equals(mobile.trim())) ? null : mobile.trim();
    }

    public Integer getTransitCount() {
        return transitCount;
    }

    public void setTransitCount(Integer transitCount) {
        this.transitCount = transitCount;
    }

}