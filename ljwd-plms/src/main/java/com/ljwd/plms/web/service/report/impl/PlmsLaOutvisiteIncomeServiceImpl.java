package com.ljwd.plms.web.service.report.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.report.PlmsLaOutvisiteIncomeMapper;
import com.ljwd.plms.web.model.report.PlmsLaOutvisiteIncome;
import com.ljwd.plms.web.service.report.inf.PlmsLaOutvisiteIncomeService;

@Service
public class PlmsLaOutvisiteIncomeServiceImpl extends
		GenericServiceImpl<PlmsLaOutvisiteIncome, Long> implements PlmsLaOutvisiteIncomeService {

	@Resource
	private PlmsLaOutvisiteIncomeMapper plmsLaOutvisiteIncomeMapper;
	
	@Override
	public GenericDao<PlmsLaOutvisiteIncome, Long> getDao() {

		return plmsLaOutvisiteIncomeMapper;
	}
	
	@Override
	public int deletePlmsLaOutVisitIncome(Map<String, Object> map) {

		return plmsLaOutvisiteIncomeMapper.deletePlmsLaOutVisitIncome(map);
	}

	

}
