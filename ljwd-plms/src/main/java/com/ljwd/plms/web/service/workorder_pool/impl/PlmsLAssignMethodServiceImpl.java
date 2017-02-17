package com.ljwd.plms.web.service.workorder_pool.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.workorder_pool.PlmsLAssignMethodMapper;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignMethod;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignMethodExample;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsLAssignMethodService;
@Service
public class PlmsLAssignMethodServiceImpl extends GenericServiceImpl<PlmsLAssignMethod, String>
		implements PlmsLAssignMethodService {
	@Resource
	private PlmsLAssignMethodMapper plmsLAssignMethodMapper;


	@Override
	public List<PlmsLAssignMethod> selectList() {
		PlmsLAssignMethodExample example= new PlmsLAssignMethodExample();
		example.createCriteria().andIsActiveEqualTo("Y");
		return plmsLAssignMethodMapper.selectByExample(example);
	}

	@Override
	public GenericDao<PlmsLAssignMethod, String> getDao() {
		return plmsLAssignMethodMapper;
	}

	

}
