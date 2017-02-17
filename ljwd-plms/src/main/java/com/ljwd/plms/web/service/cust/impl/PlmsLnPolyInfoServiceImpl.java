package com.ljwd.plms.web.service.cust.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.web.model.cust.PlmsLnApplInfo;
import com.ljwd.plms.web.model.cust.PlmsLnPolyInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsLnPolyInfoService;
import com.ljwd.plms.web.wsdl.webservice.service.Contact;
import com.ljwd.plms.web.wsdl.webservice.util.WebServiceUtil;

@Service
public class PlmsLnPolyInfoServiceImpl implements PlmsLnPolyInfoService{

	@Resource
	private WebServiceUtil webServiceUtil;

	@Override
	public List<Contact> selectByExampleAndPage(PlmsLnPolyInfoExample example) {
		List<Contact> list= webServiceUtil.findPoly(example.getApplId());
		return list;
	}

}
