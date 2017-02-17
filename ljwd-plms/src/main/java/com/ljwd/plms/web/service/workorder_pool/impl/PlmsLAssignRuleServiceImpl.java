package com.ljwd.plms.web.service.workorder_pool.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.workorder_pool.PlmsLAssignRuleMapper;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRule;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRuleExample;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLAssignRuleService;

@Service
public class PlmsLAssignRuleServiceImpl extends GenericServiceImpl<PlmsLAssignRule, String>
		implements PlmsLAssignRuleService {
	@Resource
	private PlmsLAssignRuleMapper plmsLAssignRuleMapper;
	

	@Override
	public List<PlmsLAssignRule> selectList() {
		PlmsLAssignRuleExample example = new PlmsLAssignRuleExample();
		example.createCriteria().andIsActiveEqualTo("Y");
		return plmsLAssignRuleMapper.selectByExample(example);
	}

	@Override
	public GenericDao<PlmsLAssignRule, String> getDao() {
		return plmsLAssignRuleMapper;
	}

	@Override
	public List<PlmsLAssignRule> selectByExample(PlmsLAssignRuleExample example) {
		return plmsLAssignRuleMapper.selectByExample(example);
	}

	
}
