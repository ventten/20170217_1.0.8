package com.ljwd.plms.web.service.messageSystem.impl;


import com.ljwd.plms.web.model.messageSystem.ApplicationInfo;
import com.ljwd.plms.web.service.messageSystem.inf.ApplicationInfoService;
import com.ljwd.plms.web.wsdl.webservice.channelService.CustomerDto;

public class ApplicationInfoServiceImpl implements ApplicationInfoService{
	@Override
	public ApplicationInfo getApplicationInfoById(long applInfoId) {
		return null;//applInfoRepo.findOne(applInfoId);
	}

	@Override
	public CustomerDto getCustomerDtoByapplId(long applId) {
		return null;
	}

}
