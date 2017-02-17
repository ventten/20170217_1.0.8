package com.ljwd.plms.web.service.sys_management.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsUserUpperLimitMapper;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimit;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimitExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsUserUpperLimitService;
import com.ljwd.plms.web.vo.sys_management.PlmsUserUpperLimitResultDto;

@Service
public class PlmsUserUpperLimitServiceImpl extends
		GenericServiceImpl<PlmsUserUpperLimit, Long> implements PlmsUserUpperLimitService {

	@Resource
	private PlmsUserUpperLimitMapper plmsUserUpperLimitMapper;
	
	@Override
	public GenericDao<PlmsUserUpperLimit, Long> getDao() {
		return plmsUserUpperLimitMapper;
	}

	 /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
	@Override
	public Page<PlmsUserUpperLimit> selectByExampleAndPage(
			Page<PlmsUserUpperLimit> page,
			PlmsUserUpperLimitExample example) {
		plmsUserUpperLimitMapper.selectByExampleAndPage(page, example);
		return page;

	}

	@Override
	public List<PlmsUserUpperLimit> selectByExample(
			PlmsUserUpperLimitExample example) {
		return plmsUserUpperLimitMapper.selectByExample(example);
	}

	

	
	
}
