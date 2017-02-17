package com.ljwd.plms.web.vo.outsource;

import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw on 2016/9/27
 * 发起委外申请封装VO类
 */
public class AddOutsrcApplVo {

    private Date startDate;             //委外日期
    private String reason;              //委外原因
    private List<Long> applIds;         //选中的案件借款IDS

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Long> getApplIds() {
        return applIds;
    }

    public void setApplIds(List<Long> applIds) {
        this.applIds = applIds;
    }

}
