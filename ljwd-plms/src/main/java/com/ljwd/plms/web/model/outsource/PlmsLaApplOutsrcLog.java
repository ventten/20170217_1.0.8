package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 委外申请操作日志表,PLMS_LA_APPL_OUTSRC_LOG
 * */
public class PlmsLaApplOutsrcLog extends BaseModel{

    public static final String TYPE_ADD = "ADD";                    //操作类型：申请
    public static final String TYPE_AUDIT = "AUDIT";                //操作类型：审核
    public static final String TYPE_SUBMIT = "SUBMIT";              //操作类型：提交
    public static final String TYPE_APPROVED = "APPROVED";          //操作类型：审批
    public static final String TYPE_MODIFY = "MODIFY";              //操作类型：修改
    public static final String TYPE_EXTENTED = "EXTENTED";          //操作类型：延期
    public static final String TYPE_ENDED = "ENDED";                //操作类型：结案
    public static final String TYPE_UN_DO_ENDED = "UN_DO_ENDED";    //操作类型：撤销结案
    public static final String TYPE_TO_NORMAL = "TO_NORMAL";        //操作类型：转正常
    public static final String TYPE_BACK = "BACK";                  //操作类型：退回

    public static final int RESULT_PASS = 1;                        //操作结果：通过
    public static final int RESULT_REJECTED = 2;                    //操作结果：拒绝

    private Long id;                //记录ID
    private Long applId;            //借款ID
    private String type;            //操作类型
    private Integer result;         //操作(审核或审批)结果:1-通过、2-拒绝
    private String content;         //操作内容

    public PlmsLaApplOutsrcLog() {

    }

    public PlmsLaApplOutsrcLog(BaseModel base) {
        setCreatedBy(base.getCreatedBy());
        setCreateTime(base.getCreateTime());
        setUpdatedBy(base.getUpdatedBy());
        setUpdateTime(base.getUpdateTime());
        setRecVer(base.getRecVer());
        setTagSeq(base.getTagSeq());
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

}