package com.ljwd.plms.web.service.outVisit.impl;


import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitSignMapper;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitSign;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitSignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PlmsOvmOutVisitSignServiceImpl extends
		GenericServiceImpl<PlmsOvmOutVisitSign, Long> implements PlmsOvmOutVisitSignService {

	@Resource
	private PlmsOvmOutVisitSignMapper plmsOvmOutVisitSignMapper;

	@Override
	public GenericDao<PlmsOvmOutVisitSign, Long> getDao() {
		return plmsOvmOutVisitSignMapper;
	}

}
