package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.web.vo.sys_management.HolidayDto;

import java.util.List;

/**
 * 查询微贷系统相关配置的Mapper
 * */
public interface SystemMapper{

    /**
     * 查找大于等于系统时间的节假日
     * @return 实体集
     */
    List<HolidayDto> selectHoliday();

    /**
     * 根据参数code从贷后系统参数表获取参数val
     * @param paramCode 参数code
     * @return val
     */
    String selectParamValByCode(String paramCode);

}
