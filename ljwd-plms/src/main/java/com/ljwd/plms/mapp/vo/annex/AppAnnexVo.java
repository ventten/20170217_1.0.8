package com.ljwd.plms.mapp.vo.annex;

/**
 * 附件信息
 * Created by tangjialin on 2016-11-14 0014.
 */
public class AppAnnexVo {
    private Long   id;       // 记录id
    private String topic;    // 附件主题(文件名称)
    private String remark;   // 备注

    public Long getId() {
        return id;
    }

    public AppAnnexVo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTopic() {
        return topic;
    }

    public AppAnnexVo setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public AppAnnexVo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
}
