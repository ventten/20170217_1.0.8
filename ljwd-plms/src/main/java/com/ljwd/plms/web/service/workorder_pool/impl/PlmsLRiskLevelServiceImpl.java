package com.ljwd.plms.web.service.workorder_pool.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.workorder_pool.PlmsLRiskLevelMapper;
import com.ljwd.plms.web.model.workorder_pool.PlmsLRiskLevel;
import com.ljwd.plms.web.model.workorder_pool.PlmsLRiskLevelExample;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLRiskLevelService;
@Service
public class PlmsLRiskLevelServiceImpl extends GenericServiceImpl<PlmsLRiskLevel, String>
		implements PlmsLRiskLevelService {
	@Resource
	private PlmsLRiskLevelMapper plmsLRiskLevelMapper;
	

	@Override
	public List<PlmsLRiskLevel> selectList() {
		PlmsLRiskLevelExample  example =  new PlmsLRiskLevelExample();
		return plmsLRiskLevelMapper.selectByExample(example);
	}

	@Override
	public GenericDao<PlmsLRiskLevel, String> getDao() {
		return plmsLRiskLevelMapper;
	}

}
