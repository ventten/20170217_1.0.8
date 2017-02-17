package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimit;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimitExample;

public interface PlmsUserUpperLimitService extends GenericService<PlmsUserUpperLimit, Long> {

	 /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
	Page<PlmsUserUpperLimit> selectByExampleAndPage(Page<PlmsUserUpperLimit> page, PlmsUserUpperLimitExample example);
	
    List<PlmsUserUpperLimit> selectByExample(PlmsUserUpperLimitExample example);

}
