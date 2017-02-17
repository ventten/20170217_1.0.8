package com.ljwd.plms.web.service.workorder_pool.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.workorder_pool.PlmsProtectRuleSetMapper;
import com.ljwd.plms.web.model.workorder_pool.PlmsProtectRuleSet;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsProtectRuleSetService;

@Service
public class PlmsProtectRuleSetServiceImpl extends
		GenericServiceImpl<PlmsProtectRuleSet, Long> implements PlmsProtectRuleSetService {
	@Resource
	private PlmsProtectRuleSetMapper plmsProtectRuleSetMapper;
	

	@Override
	public GenericDao<PlmsProtectRuleSet, Long> getDao() {
		return plmsProtectRuleSetMapper;
	}

}
