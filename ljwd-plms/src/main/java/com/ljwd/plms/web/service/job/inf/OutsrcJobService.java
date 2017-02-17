package com.ljwd.plms.web.service.job.inf;

/**
 * Created by zhengzw on 2016/10/26
 * 委外管理定时器
 */
public interface OutsrcJobService {

    /**
     * 委外管理-预计结案日期到期自动结案
     * */
    String doEndedOutsrc();

    /**
     * 委外管理-将同步失败的委外信息发送到微贷
     * */
    String doSendOutsrcToMfbms();

}
