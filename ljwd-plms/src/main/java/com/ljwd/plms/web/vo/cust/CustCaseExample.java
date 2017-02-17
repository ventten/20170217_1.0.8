package com.ljwd.plms.web.vo.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/7/15
 * 个案查询页查询条件
 */
public class CustCaseExample extends BaseExample {

    private String cntrctNo;            //合同编号
    private String custName;            //主贷人
    private String idCardNo;            //证件号码
    private String tel;                 //电话号码

    public String getCntrctNo() {
        return cntrctNo;
    }

    public CustCaseExample setCntrctNo(String cntrctNo) {
        this.cntrctNo = (cntrctNo == null || "".equals(cntrctNo) || "".equals(cntrctNo.trim())) ? null : cntrctNo.trim();
        return this;
    }

    public String getCustName() {
        return custName;
    }

    public CustCaseExample setCustName(String custName) {
        this.custName = (custName == null || "".equals(custName) || "".equals(custName.trim())) ? null : custName.trim();
        return this;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public CustCaseExample setIdCardNo(String idCardNo) {
        this.idCardNo = (idCardNo == null || "".equals(idCardNo) || "".equals(idCardNo.trim())) ? null : idCardNo.trim();
        return this;
    }

    public String getTel() {
        return tel;
    }

    public CustCaseExample setTel(String tel) {
        this.tel = (tel == null || "".equals(tel) || "".equals(tel.trim())) ? null : tel.trim();
        return this;
    }

}
