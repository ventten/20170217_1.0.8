package com.ljwd.plms.web.vo.outsource;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhengzw on 2016/9/30
 * 委外申请分页查询条件
 */
public class OutsrcPageExample extends BaseExample{

    private Date startDateMin;                  //委外日期
    private Date startDateMax;                  //委外日期
    private String outsrcType;                  //外包类型:一手,二手
    private String status;                      //委外状态
    private Long regionId;                      //区域ID

    private Date endDateMin;                    //预计结案日期
    private Date endDateMax;                    //预计结案日期
    private String cntrctNo;                    //合同编号
    private String custName;                    //主贷人姓名
    private String idCardNo;                    //主贷人身份证号
    private Boolean isNotApplAgain;             //是否查询未再委案
    //private Integer overDayMin;                 //逾期天数-左
    //private Integer overDayMax;                 //逾期天数-右

    private Long comId;                         //委外机构ID
    private String winfoStatus;                 //工作流状态/贷款状态

    private Long orgId;                         //机构ID,查询待审核状态的数据时用

    private Integer overDaysNum;                //最小期未还期数的逾期天数

    private boolean hasOverDaysNum;             //设为true,查询逾期天数大于0的
    private boolean isMaxId;                    //设为true,查询根据借款ID分组查询最新的记录,且关联案件表查询在委外区间的数据(查询未再委案时用)
    private boolean isExportDetail;             //导出委外明细时用,设为true时会查询主贷人单位名称和主贷人职位

    private List<Long> ids;                     //委外申请IDS

    private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("regionName","region.rname ");
        sortMap.put("cntrctNo","cntrct.CNTRCT_NO ");
        sortMap.put("custName","cust.CUST_NAME ");
        sortMap.put("idCardNo","cust.ID_CARD_NO ");
        sortMap.put("winfoStatusText","wfinfo.STATUS ");
        sortMap.put("overDay","( case when outSrc.STATUS = 'APPROVED' or outSrc.STATUS = 'ENDED' then outSrc.OVERDUE_DAYS else maxDueDate.maxDueDaysNum end )");
        sortMap.put("outsrcInterval","( case when outSrc.STATUS = 'APPROVED' or outSrc.STATUS = 'ENDED' then outSrc.OVERDUE_DAYS else maxDueDate.maxDueDaysNum end )");
        sortMap.put("outsrcCount","outSrc.OUTSRC_COUNT ");
        sortMap.put("lastComName","lastCom.OUTSRC_COM_NAME ");
        sortMap.put("outsrcComName","outCom.OUTSRC_COM_NAME ");
        sortMap.put("startDateFmt","outSrc.START_DATE ");
        sortMap.put("endDateFmt","outSrc.END_DATE ");
        sortMap.put("acutalEndDateFmt","outSrc.ACUTAL_END_DATE ");
        sortMap.put("residueAmount","(cntrct.LOAN_AMT - NVL(ac.REPAID_PRINCIPAL,0) ");
        sortMap.put("statusText","outSrc.STATUS ");
        sortMap.put("recivAmt","outSrc.RECIV_AMT ");
        sortMap.put("feeRateFmt","outSrc.FEE_RATE ");
        sortMap.put("outsrcTypeText","outSrc.OUTSRC_TYPE ");
        sortMap.put("prdName","prd.PRD_NAME ");
        sortMap.put("bizCategoryText","applyInfo.BIZ_CATEGORY ");
        sortMap.put("loanDateFmt","payment.PAY_DATE ");
        sortMap.put("loanAmt","cntrct.LOAN_AMT ");
        sortMap.put("loanPeriod","cntrct.LOAN_PERIOD ");
        sortMap.put("siteName","site.site_name ");
        sortMap.put("createTime","outSrc.CREATE_TIME ");
        sortMap.put("submittedName","submit_user.USER_NAME ");
        sortMap.put("createName","create_user.user_name ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }

    public Boolean getNotApplAgain() {
        return isNotApplAgain;
    }

    public void setNotApplAgain(Boolean notApplAgain) {
        isNotApplAgain = notApplAgain;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Date getStartDateMin() {
        return startDateMin;
    }

    public void setStartDateMin(Date startDateMin) {
        this.startDateMin = startDateMin;
    }

    public Date getStartDateMax() {
        return startDateMax;
    }

    public void setStartDateMax(Date startDateMax) {
        this.startDateMax = startDateMax;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Date getEndDateMin() {
        return endDateMin;
    }

    public void setEndDateMin(Date endDateMin) {
        this.endDateMin = endDateMin;
    }

    public Date getEndDateMax() {
        return endDateMax;
    }

    public void setEndDateMax(Date endDateMax) {
        this.endDateMax = endDateMax;
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

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public String getWinfoStatus() {
        return winfoStatus;
    }

    public void setWinfoStatus(String winfoStatus) {
        this.winfoStatus = winfoStatus;
    }

    public List<Long> getIds() {
        return ids;
    }

    public OutsrcPageExample setIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public boolean isMaxId() {
        return isMaxId;
    }

    public OutsrcPageExample setMaxId(boolean isMaxId) {
        this.isMaxId = isMaxId;
        return this;
    }

    public Integer getOverDaysNum() {
        return overDaysNum;
    }

    public OutsrcPageExample setOverDaysNum(Integer overDaysNum) {
        this.overDaysNum = overDaysNum;
        return this;
    }

    public boolean isHasOverDaysNum() {
        return hasOverDaysNum;
    }

    public OutsrcPageExample setHasOverDaysNum(boolean hasOverDaysNum) {
        this.hasOverDaysNum = hasOverDaysNum;
        return this;
    }

    public boolean isExportDetail() {
        return isExportDetail;
    }

    public OutsrcPageExample setExportDetail(boolean exportDetail) {
        isExportDetail = exportDetail;
        return this;
    }

}
