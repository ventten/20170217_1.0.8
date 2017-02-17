package com.ljwd.plms.web.vo.outsource;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhengzw on 2016/10/24
 * 委外催记Dto查询条件
 */
public class OutsrcCollectPageExample extends BaseExample{

    private Long id;                            //记录ID
    private Long applId;                        //借款ID
    private Long cntrctId;                      //合同ID
    private Long comId;                         //委外机构ID
    private String controlStatus;               //控管状态
    private String cntrctNo;                    //合同编号
    private String custName;                    //主贷人
    private String idCardNo;                    //身份证号

    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("cntrctNo","cntrct.CNTRCT_NO ");
        sortMap.put("custName","cust.CUST_NAME ");
        sortMap.put("idCardNo","cust.ID_CARD_NO ");
        sortMap.put("overduePeriod","collect.OVERDUE_PERIOD ");
        sortMap.put("overdueDays","collect.OVERDUE_DAYS ");
        sortMap.put("comName","com.OUTSRC_COM_NAME ");
        sortMap.put("controlStatusText","control.val ");
        sortMap.put("recivAmt","collect.RECIV_AMT ");
        sortMap.put("recycleAmt","collect.RECYCLE_AMT ");
        sortMap.put("followTimeFmt","collect.FOLLOW_TIME ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }

    public Long getId() {
        return id;
    }

    public OutsrcCollectPageExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public OutsrcCollectPageExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public OutsrcCollectPageExample setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
        return this;
    }

    public Long getComId() {
        return comId;
    }

    public OutsrcCollectPageExample setComId(Long comId) {
        this.comId = comId;
        return this;
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public OutsrcCollectPageExample setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
        return this;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public OutsrcCollectPageExample setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
        return this;
    }

    public String getCustName() {
        return custName;
    }

    public OutsrcCollectPageExample setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public OutsrcCollectPageExample setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
        return this;
    }

}
