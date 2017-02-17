package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.ActiveModel;

/**
 * 委外机构沟通日志,PLMS_OUTSRC_COM_LOG
 * */
public class PlmsOutsrcComLog extends ActiveModel{

    private Long id;                            //记录ID
    private Long outsrcComId;                   //委外机构ID
    private String content;                     //沟通内容

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOutsrcComId() {
        return outsrcComId;
    }

    public void setOutsrcComId(Long outsrcComId) {
        this.outsrcComId = outsrcComId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

}