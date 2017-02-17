package com.ljwd.plms.web.service.job.inf;

/**
 * Created by zhengzw on 2016/6/6
 * 客户信息管理-跑批
 */
public interface MfbmsOverDueJobService {

    /**
     * 将微贷系统贷款的状态同步到贷后系统
     * */
    public String doMfbmsApplyStatus();

    /**
     * 将微贷系统逾期客户的全部信息导入系统
     * */
    public String doMfbmsOverDueCust();

}
