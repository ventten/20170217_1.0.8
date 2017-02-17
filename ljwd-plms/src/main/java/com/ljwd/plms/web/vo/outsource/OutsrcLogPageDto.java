package com.ljwd.plms.web.vo.outsource;

import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLog;
import com.ljwd.plms.web.vo.PageRowNo;

import java.util.Date;

/**
 * Created by zhengzw on 2016/11/11
 * 委外申请操作日志表分页Dto
 */
public class OutsrcLogPageDto extends PageRowNo {

    private String type;            //操作类型
    private String content;         //操作内容
    private String updatedUserName; //维护人姓名
    private Date updateTime;        //修改日期

    //ext
    public String typeText;         //操作类型

    public String getTypeText() {
        String text = "";
        if(type == null){
            return text;
        }else if(PlmsLaApplOutsrcLog.TYPE_ADD.equals(type)){
            text = "申请";
        }else if(PlmsLaApplOutsrcLog.TYPE_AUDIT.equals(type)){
            text = "审核";
        }else if(PlmsLaApplOutsrcLog.TYPE_SUBMIT.equals(type)){
            text = "提交";
        }else if(PlmsLaApplOutsrcLog.TYPE_APPROVED.equals(type)){
            text = "审批";
        }else if(PlmsLaApplOutsrcLog.TYPE_MODIFY.equals(type)){
            text = "修改";
        }else if(PlmsLaApplOutsrcLog.TYPE_EXTENTED.equals(type)){
            text = "延期";
        }else if(PlmsLaApplOutsrcLog.TYPE_ENDED.equals(type)){
            text = "结案";
        }else if(PlmsLaApplOutsrcLog.TYPE_UN_DO_ENDED.equals(type)){
            text = "撤销结案";
        }else if(PlmsLaApplOutsrcLog.TYPE_TO_NORMAL.equals(type)){
            text = "转正常";
        }else if(PlmsLaApplOutsrcLog.TYPE_BACK.equals(type)){
            text = "退回";
        }
        return text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUpdatedUserName() {
        return updatedUserName;
    }

    public void setUpdatedUserName(String updatedUserName) {
        this.updatedUserName = updatedUserName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
