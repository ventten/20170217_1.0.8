package com.ljwd.plms.test.service;

import javax.annotation.Resource;

import org.junit.Test;

import com.ljwd.plms.test.TestSupport;
import com.ljwd.plms.web.service.job.inf.PlmsOutVisitOverduedService;

public class OutVisitServiceTest extends TestSupport{

	@Resource
	private PlmsOutVisitOverduedService plmsOutVisitOverduedService;
	
	
	@Test
	public void testOutVisitOverdue(){
		
		plmsOutVisitOverduedService.updateOutVisitStatus();
		
		
	}
}
