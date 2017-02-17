package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * Created by zhengzw on 2016/6/14.
 * 客户贷款信息查询条件
 */
public class PlmsLnApplInfoExample extends BaseExample {

    private Long clCustId;          //客户基本信息表ID
    private Long applId;            //贷款申请ID
    private String srcCode;         //来源：微贷、聚信立、网络、外部机构、客户来电
    private Long clCustIdByApplId;  //根据借款ID查询此客户ID下的数据

    public Long getClCustIdByApplId() {
        return clCustIdByApplId;
    }

    public void setClCustIdByApplId(Long clCustIdByApplId) {
        this.clCustIdByApplId = clCustIdByApplId;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public void setClCustId(Long clCustId) {
        this.clCustId = clCustId;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public void setSrcCode(String srcCode) {
        this.srcCode = (srcCode == null || "".equals(srcCode) || "".equals(srcCode.trim())) ? null : srcCode.trim();
    }

}
