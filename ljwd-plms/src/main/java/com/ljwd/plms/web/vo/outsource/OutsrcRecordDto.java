package com.ljwd.plms.web.vo.outsource;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;

import java.util.Date;

/**
 * Created by zhengzw on 2016/11/11
 * 催记页查询委外记录dto
 */
public class OutsrcRecordDto {

    private String status;                  //委外状态
    private Date startDate;                 //委外日期/申请日期
    private Date endDate;                   //退案日期/结案日期
    private Date acutalEndDate;             //实际退案日期/实际结案日期

    private String statusText;              //委外状态
    private String startDateFmt;            //委外日期/申请日期
    private String endDateFmt;              //退案日期
    private String acutalEndDateFmt;        //实际退案日期

    //ext
    public String getStatusText() {
        String text = "";
        if(status == null){
            return text;
        }else if(PlmsLaApplOutsrc.STATUS_AUDIT.equals(status)){
            text = "待审核";
        }else if(PlmsLaApplOutsrc.STATUS_AUDIT_REJECT.equals(status)){
            text = "审核拒绝";
        }else if(PlmsLaApplOutsrc.STATUS_DRAFT.equals(status)){
            text = "待提交";
        }else if(PlmsLaApplOutsrc.STATUS_SUBMITTED.equals(status)){
            text = "待审批";
        }else if(PlmsLaApplOutsrc.STATUS_REJECTED.equals(status)){
            text = "审批拒绝";
        }else if(PlmsLaApplOutsrc.STATUS_APPROVED.equals(status)){
            text = "已审批";
        }else if(PlmsLaApplOutsrc.STATUS_ENDED.equals(status)){
            text = "已结案";
        }
        return text;
    }


    public String getStartDateFmt() {
        return D.parse(startDate);
    }

    public String getEndDateFmt() {
        return D.parse(endDate);
    }

    public String getAcutalEndDateFmt() {
        return D.parse(acutalEndDate);
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getAcutalEndDate() {
        return acutalEndDate;
    }

    public void setAcutalEndDate(Date acutalEndDate) {
        this.acutalEndDate = acutalEndDate;
    }
}
