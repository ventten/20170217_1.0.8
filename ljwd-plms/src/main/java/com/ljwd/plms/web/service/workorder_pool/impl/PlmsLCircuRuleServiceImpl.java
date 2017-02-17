package com.ljwd.plms.web.service.workorder_pool.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.workorder_pool.PlmsLCircuRuleMapper;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsLCircuRule;
import com.ljwd.plms.web.model.workorder_pool.PlmsLCircuRuleExample;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLCircuRuleService;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCircuRuleDto;

@Service
public class PlmsLCircuRuleServiceImpl extends GenericServiceImpl<PlmsLCircuRule, String>
		implements PlmsLCircuRuleService {

	@Resource
	private PlmsLCircuRuleMapper plmsLCircuRuleMapper;
	
	
	
	@Override
	public List<PlmsLCircuRule> selectList() {
		PlmsLCircuRuleExample example = new PlmsLCircuRuleExample();
		example.setOrderByClause("seq");	
		return plmsLCircuRuleMapper.selectByExample(example);
	}

	@Override
	public GenericDao<PlmsLCircuRule, String> getDao() {
		return plmsLCircuRuleMapper;
	}

	@Override
	public List<PlmsCircuRuleDto> selectListByExample() {
		return plmsLCircuRuleMapper.selectListByExample();
	}

	@Override
	public PlmsCircuRuleDto selectDtoById(Long id) {
		
		return plmsLCircuRuleMapper.selectDtoByID(id);
	}

	@Override
	public PlmsLCircuRule selectByCode(String code) {
		PlmsLCircuRuleExample example = new PlmsLCircuRuleExample();
		example.setCode(code);
		return plmsLCircuRuleMapper.selectByExample(example).get(0);
	}

	
}
