package com.ljwd.plms.web.vo.outsource;

/**
 * Created by zhengzw on 2016/10/13
 * 发起委外申请时查找借款信息
 */
public class AddOutsrcApplDto {

    private Long applId;                            //贷款申请记录ID
    private Long paymentId;                         //放款记录ID
    private Long cntrctId;                          //合同记录ID
    private String cntrctNo;                        //合同编号
    private Long overduePeriod;                     //最小逾期期数

    private String poolStatus;                      //工单池所在区间
    private String allot;                           //原催收员

    private String wfStatus;                        //贷款状态

    private String idCardNo;                        //身份证号(跑批流入委外区间时用到)
    private Long overDays;                          //逾期天数(跑批流入委外区间时用到)
    private Long regionId;                          //区域ID(跑批流入委外区间时用到)

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getOverDays() {
        return overDays;
    }

    public void setOverDays(Long overDays) {
        this.overDays = overDays;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
    }

    public Long getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Long overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public String getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    public String getAllot() {
        return allot;
    }

    public void setAllot(String allot) {
        this.allot = allot;
    }

    public String getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(String wfStatus) {
        this.wfStatus = wfStatus;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

}
