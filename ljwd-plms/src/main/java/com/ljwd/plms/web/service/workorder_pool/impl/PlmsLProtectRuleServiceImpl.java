package com.ljwd.plms.web.service.workorder_pool.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.workorder_pool.PlmsLProtectRuleMapper;
import com.ljwd.plms.web.model.workorder_pool.PlmsLProtectRule;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLProtectRuleService;
import com.ljwd.plms.web.vo.workorder_pool.PlmsProtectRuleDto;

@Service
public class PlmsLProtectRuleServiceImpl extends GenericServiceImpl<PlmsLProtectRule, String>
		implements PlmsLProtectRuleService {
	@Resource
	private PlmsLProtectRuleMapper plmsLProtectRuleMapper;
	
	@Override
	public GenericDao<PlmsLProtectRule, String> getDao() {
		return plmsLProtectRuleMapper;
	}

	@Override
	public List<PlmsProtectRuleDto> selectDtoList() {
		return plmsLProtectRuleMapper.selectDtoList();
	}

	@Override
	public PlmsProtectRuleDto selectDtoById(Long id) {
		return plmsLProtectRuleMapper.selectDtoById(id);
	}

	

}
