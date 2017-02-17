package com.ljwd.plms.web.service.sys_management.inf;

import java.util.Date;

/**
 * Created by zhengzw on 2016/11/26
 * 查询微贷系统相关配置的Service
 */
public interface SystemService {

    /**
     * 查找下一个工作日
     * @return 下一个工作日
     */
    Date selectNextWorkDay();

    /**
     * 获取保留截止日期
     * @param  prdNo 产品类型
     * @param  overDays 逾期天数
     * @return 保留日
     */
    Date getKeepDay(String prdNo,Integer overDays);

    /**
     * 根据参数code从贷后系统参数表获取参数val
     * @param paramCode 参数code
     * @return val
     */
    String selectParamValByCode(String paramCode);

}
