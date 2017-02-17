package com.ljwd.plms.web.vo.outsource;

import com.ljwd.plms.web.model.BaseExample;

import java.util.List;

/**
 * Created by zhengzw on 2016/10/13
 * 操作时需要的委外申请信息Dto
 */
public class OutsrcExample extends BaseExample {

    private String outsrcType;                  //外包类型:一手,二手
    private String status;                      //委外状态
    private Long regionId;                      //区域ID
    private String cntrctNo;                    //合同编号
    private Long comId;                         //委外机构ID
    private String winfoStatus;                 //工作流状态/贷款状态

    private String lotNo;                       //批次编号:借款ID_时间戳
    private Long applId;                        //借款ID

    private List<Long> ids;                     //委外申请IDS

    private boolean hasOverDaysNum;             //设为true,查询逾期天数大于0的
    private boolean isMaxId;                    //设为true,查询根据借款ID分组查询最新的记录,且关联案件表查询在委外区间的数据(委外专员发起委外申请时用)
    private boolean isMaxEnded;                 //设为true,根据借款ID查询已结案且ID最大的记录ID(案件退回时用)
    private Long idMax;                         //查询记录ID小于此值的记录
    private boolean isEnd;                      //设为true,查询已审批且(系统时间大于预计结案日期或已结清)的数据

    public boolean isEnd() {
        return isEnd;
    }

    public OutsrcExample setEnd(boolean isEnd) {
        this.isEnd = isEnd;
        return this;
    }

    public String getLotNo() {
        return lotNo;
    }

    public OutsrcExample setLotNo(String lotNo) {
        this.lotNo = lotNo;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public OutsrcExample setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public Long getIdMax() {
        return idMax;
    }

    public OutsrcExample setIdMax(Long idMax) {
        this.idMax = idMax;
        return this;
    }

    public boolean isMaxEnded() {
        return isMaxEnded;
    }

    public OutsrcExample setMaxEnded(boolean isMaxEnded) {
        this.isMaxEnded = isMaxEnded;
        return this;
    }

    public String getOutsrcType() {
        return outsrcType;
    }

    public void setOutsrcType(String outsrcType) {
        this.outsrcType = outsrcType;
    }

    public String getStatus() {
        return status;
    }

    public OutsrcExample setStatus(String status) {
        this.status = status;
        return this;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public Long getComId() {
        return comId;
    }

    public OutsrcExample setComId(Long comId) {
        this.comId = comId;
        return this;
    }

    public String getWinfoStatus() {
        return winfoStatus;
    }

    public OutsrcExample setWinfoStatus(String winfoStatus) {
        this.winfoStatus = winfoStatus;
        return this;
    }

    public List<Long> getIds() {
        return ids;
    }

    public OutsrcExample setIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public boolean isHasOverDaysNum() {
        return hasOverDaysNum;
    }

    public OutsrcExample setHasOverDaysNum(boolean hasOverDaysNum) {
        this.hasOverDaysNum = hasOverDaysNum;
        return this;
    }

    public boolean isMaxId() {
        return isMaxId;
    }

    public OutsrcExample setMaxId(boolean isMaxId) {
        this.isMaxId = isMaxId;
        return this;
    }

}
