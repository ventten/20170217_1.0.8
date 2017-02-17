package com.ljwd.plms.web.service.sys_management.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRate;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRateExample;

import java.util.List;

/**
 * 委外费率表,PLMS_SYS_OUTSRC_RATE
 * */
public interface PlmsSysOutsrcRateService extends GenericService<PlmsSysOutsrcRate,Long>{

    /**
     * 根据查询条件计数
     * @param example 查询条件
     * @return 数量
     * */
    int countByExample(PlmsSysOutsrcRateExample example);

    /**
     * 根据查询条件查询
     * @param example 查询条件
     * @return 实体集
     * */
    List<PlmsSysOutsrcRate> selectByExample(PlmsSysOutsrcRateExample example);

    /**
     * 根据逾期天数查询有效的费率
     * @param overdueDays Page信息
     * @return 实体
     */
    PlmsSysOutsrcRate selectByOverdueDays(Long overdueDays);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsSysOutsrcRate> selectByExampleAndPage(Page<PlmsSysOutsrcRate> page, PlmsSysOutsrcRateExample example);

}
