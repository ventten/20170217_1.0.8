package com.ljwd.plms.web.vo.outsource;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.vo.PageRowNo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/10/24
 * 委外催记Dto
 */
public class OutsrcCollectPageDto extends PageRowNo{

    private Long id;                            //记录ID
    private Long applId;                        //借款ID
    private Long cntrctId;                      //合同ID
    private Long comId;                         //委外机构ID
    private Integer overduePeriod;              //逾期期数
    private Integer overdueDays;                //逾期天数
    private String controlStatus;               //控管状态code
    private BigDecimal recivAmt;                //委外金额
    private BigDecimal recycleAmt;              //回收金额
    private Date followTime;                    //最后跟进时间

    private String cntrctNo;                    //合同编号
    private String custName;                    //主贷人
    private String idCardNo;                    //身份证号
    private String comName;                     //委外机构名称
    private String controlStatusText;           //控管状态值

    //ext
    private String followTimeFmt;               //最后跟进时间

    public String getFollowTimeFmt() {
        return D.parse(followTime);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Integer getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Integer overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
    }

    public BigDecimal getRecivAmt() {
        return recivAmt;
    }

    public void setRecivAmt(BigDecimal recivAmt) {
        this.recivAmt = recivAmt;
    }

    public BigDecimal getRecycleAmt() {
        return recycleAmt;
    }

    public void setRecycleAmt(BigDecimal recycleAmt) {
        this.recycleAmt = recycleAmt;
    }

    public Date getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Date followTime) {
        this.followTime = followTime;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getControlStatusText() {
        return controlStatusText;
    }

    public void setControlStatusText(String controlStatusText) {
        this.controlStatusText = controlStatusText;
    }
}
