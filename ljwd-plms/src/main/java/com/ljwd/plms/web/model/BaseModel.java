package com.ljwd.plms.web.model;

import com.ljwd.plms.core.util.D;

import java.util.Date;

/**
 * Created by zhengzw on 2016/6/23
 * model基础
 */
public class BaseModel {

    private String createdBy;       //新增人
    private Date createTime;        //新增日期
    private String updatedBy;       //修改人
    private Date updateTime;        //修改日期
    private Long recVer;            //版本号
    private Long tagSeq;            //Tag

    //join-ext
    private String updatedUserName; //维护人姓名
    private String createTimeFmt;   //新增日期

    public String getCreateTimeFmt() {
        return D.parse(createTime);
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getRecVer() {
        return recVer;
    }

    public void setRecVer(Long recVer) {
        this.recVer = recVer;
    }

    public Long getTagSeq() {
        return tagSeq;
    }

    public void setTagSeq(Long tagSeq) {
        this.tagSeq = tagSeq;
    }

    public String getUpdatedUserName() {
        return updatedUserName;
    }

    public void setUpdatedUserName(String updatedUserName) {
        this.updatedUserName = updatedUserName;
    }

}
