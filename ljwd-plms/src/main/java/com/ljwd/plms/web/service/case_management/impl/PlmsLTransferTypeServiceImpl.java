package com.ljwd.plms.web.service.case_management.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_management.PlmsLTransferTypeMapper;
import com.ljwd.plms.web.model.case_management.PlmsLTransferType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferTypeExample;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferTypeService;

/**
 * 移交类型表,PLMS_L_TRANSFER_TYPE
 * */
@Service
public class PlmsLTransferTypeServiceImpl extends GenericServiceImpl<PlmsLTransferType, String> implements PlmsLTransferTypeService {

	@Resource
	private PlmsLTransferTypeMapper plmsLTransferTypeMapper;
	
	@Override
	public List<PlmsLTransferType> selectByExample(
			PlmsLTransferTypeExample example) {
		return plmsLTransferTypeMapper.selectByExample(example);
	}

	@Override
	public GenericDao<PlmsLTransferType, String> getDao() {
		return plmsLTransferTypeMapper;
	}

}
