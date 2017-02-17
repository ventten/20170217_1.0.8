package com.ljwd.plms.web.service.sys_management.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsFuncPerm;
import com.ljwd.plms.web.model.sys_management.PlmsFuncPermExample;

import java.util.List;

/**
 * 功能权限表,PLMS_FUNC_PERM
 * */
public interface PlmsFuncPermService extends GenericService<PlmsFuncPerm, Long> {

    /**
     * 条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsFuncPerm> selectByExample(PlmsFuncPermExample example);

}
