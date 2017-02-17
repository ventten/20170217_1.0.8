package com.ljwd.plms.web.service.outVisit.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitAreaMapper;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitAreaService;

@Service
public class PlmsOvmOutVisitAreaServiceImpl extends
		GenericServiceImpl<PlmsOvmOutVisitArea, Long> implements PlmsOvmOutVisitAreaService {

	@Resource
	private PlmsOvmOutVisitAreaMapper plmsOvmOutVisitAreaMapper;
	
	@Override
	public GenericDao<PlmsOvmOutVisitArea, Long> getDao() {
		return plmsOvmOutVisitAreaMapper;
	}

	@Override
	public List<PlmsOvmOutVisitArea> selectByExample(
			PlmsOvmOutVisitAreaExample example) {
		return plmsOvmOutVisitAreaMapper.selectByExample(example);
	}

	/**
	 * 
	* @Description: 根据userId查找所属区域的编号   
	* @param userId
	* @return
	* @return
	 */
	@Override
	public String searchAreaCodeByUserId(String userId) {
		return plmsOvmOutVisitAreaMapper.searchAreaCodeByUserId(userId);
	}

	

}
