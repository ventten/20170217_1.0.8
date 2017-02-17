package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseExample;

import java.util.Date;
import java.util.List;

/**
 * 委外申请表,PLMS_LA_APPL_OUTSRC
 * */
public class PlmsLaApplOutsrcExample extends BaseExample{

    private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private Long applId;                    //借款ID
    private Long comId;                     //委外机构ID
    private Long cntrctId;                  //合同ID
    private Long recVer;                    //版本号
    private String status;                  //状态
    private String lotNo;                   //批次编号:借款ID_时间戳

    private Long noThisId;                  //排除此记录ID

    private boolean isCheck;                //发起委外申请时检查,设为true时,startDate,applIds,statusS不能传空
    private Date startDate;                 //委外日期
    private List<Long> applIds;             //借款IDS
    private List<String> statusS;           //状态集合
    private String cntrctNo;                //合同编号

    private List<Long> ids;                 //委外申请IDS

    private Long minId;                     //查找ID比此参数大的数据

    public Long getNoThisId() {
        return noThisId;
    }

    public PlmsLaApplOutsrcExample setNoThisId(Long noThisId) {
        this.noThisId = noThisId;
        return this;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public Long getMinId() {
        return minId;
    }

    public PlmsLaApplOutsrcExample setMinId(Long minId) {
        this.minId = minId;
        return this;
    }

    public Long getId() {
        return id;
    }

    public PlmsLaApplOutsrcExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public PlmsLaApplOutsrcExample setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public PlmsLaApplOutsrcExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getComId() {
        return comId;
    }

    public PlmsLaApplOutsrcExample setComId(Long comId) {
        this.comId = comId;
        return this;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public PlmsLaApplOutsrcExample setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsLaApplOutsrcExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PlmsLaApplOutsrcExample setStatus(String status) {
        this.status = (status == null || "".equals(status) || "".equals(status.trim())) ? null : status.trim();
        return this;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public PlmsLaApplOutsrcExample setCheck(boolean isCheck) {
        this.isCheck = isCheck;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public PlmsLaApplOutsrcExample setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public List<Long> getApplIds() {
        return applIds;
    }

    public PlmsLaApplOutsrcExample setApplIds(List<Long> applIds) {
        this.applIds = applIds;
        return this;
    }

    public List<String> getStatusS() {
        return statusS;
    }

    public PlmsLaApplOutsrcExample setStatusS(List<String> statusS) {
        this.statusS = statusS;
        return this;
    }

    public List<Long> getIds() {
        return ids;
    }

    public PlmsLaApplOutsrcExample setIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public String getLotNo() {
        return lotNo;
    }

    public PlmsLaApplOutsrcExample setLotNo(String lotNo) {
        this.lotNo = lotNo;
        return this;
    }

}