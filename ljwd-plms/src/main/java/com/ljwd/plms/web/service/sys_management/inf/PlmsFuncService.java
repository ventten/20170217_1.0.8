package com.ljwd.plms.web.service.sys_management.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsFunc;
import com.ljwd.plms.web.model.sys_management.PlmsFuncExample;

import java.util.List;

/**
 * 功能表,PLMS_FUNC
 * */
public interface PlmsFuncService extends GenericService<PlmsFunc, Long> {

    /**
     * 条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsFunc> selectByExample(PlmsFuncExample example);

}
