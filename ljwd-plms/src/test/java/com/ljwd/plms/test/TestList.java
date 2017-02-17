package com.ljwd.plms.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.dao.case_management.PlmsEmpCollectSetMapper;
import com.ljwd.plms.web.dao.case_management.PlmsWorkOrderPoolMapper;
import com.ljwd.plms.web.dao.report.LfRpmntMapper;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectRecService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.job.inf.PlmsDayIncomeService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsUserUpperLimitService;



public class TestList extends TestSupport{

	@Resource
	private PlmsLaCollectRecService plmsLaCollectRecService;
	@Resource
	private PlmsLaCollectAllocService plmsLaCollectAllocService;
	@Resource
	private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
	@Resource
	private PlmsUserUpperLimitService plmsUserUpperLimitService;
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private PlmsWorkOrderPoolMapper plmsWorkOrderPoolMapper;
	@Resource
	private LfRpmntMapper   lfRpmntMapper;
	@Resource
	private PlmsDayIncomeService plmsDayIncomeService;
	@Resource
	private PlmsEmpCollectSetMapper plmsEmpCollectSetMapper;
	
	
	@Test
	public void test01(){
	/*	PlmsLaCollectRecExample exp = new PlmsLaCollectRecExample();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,-2);
	    Date endDate = cal.getTime();
	    System.out.println(endDate);
		exp.createCriteria().andRecDateGreaterThanOrEqualTo(endDate).andStatusEqualTo("2").andIsActiveEqualTo("Y");
		List<PlmsLaCollectRec> recList = plmsLaCollectRecService.selectByExample(exp);
		System.out.println("----------------------------"+recList.size());*/
	/*	
	 	PlmsLaCollectAllocExample exapAlloc = new PlmsLaCollectAllocExample();
        exapAlloc.createCriteria().andAllocEndDateIsNull().andIsActiveEqualTo("Y");
		List<PlmsLaCollectAlloc> allocList = plmsLaCollectAllocService.selectByExample(exapAlloc);
		System.out.println(allocList.size());*/
	}
	
	
	@Test
	public void test02(){
		int upperLimit = 0;
		/*PlmsUserUpperLimitExample exampUpper= new PlmsUserUpperLimitExample();
		exampUpper.setOrgNo("G05");
		List<PlmsUserUpperLimit> limitList = plmsUserUpperLimitService.selectByExample(exampUpper);
		if(limitList!=null&&limitList.size()>0){
			upperLimit = limitList.get(0).getUpperLimit().intValue();
		}
		System.out.println(upperLimit);*/
	}
	
	@Test
	public void test03(){
		String[] info =  new String[]{"1|w|1","2|w|2","3|w|1","4|w|2","5|w|3","6|w|4","7|w|4","8|w|4","9|w|5","10|w|5","11|w|1","12|w|1","13|w|1"};
		//plmsOvmOutVisitInfoService.outVisitAutoAssign(info, "");
		//plmsOvmOutVisitInfoService.outVisitAutoAssign(info, null);
	}
	
	/*@Test
	public void test04(){
		PlmsWorkOrderPoolExample example = new PlmsWorkOrderPoolExample();
		List<PlmsWorkOrderPool> allList = plmsWorkOrderPoolMapper.selectByExample(example);
		for(PlmsWorkOrderPool p:allList){
			PlmsWorkOrderPool pool = plmsWorkOrderPoolMapper.selectSiteCode(p.getApplId());
			p.setBizCategory(pool.getBizCategory());
			p.setSiteCode(pool.getSiteCode());
		}
		plmsWorkOrderPoolService.updateBatch(allList);
	}*/
	
	/*@Test
	public void test05(){
		Map<String,Object> map = new HashMap<String,Object>();
		//统计昨天实收
		List<LfRpmnt> lfRpmntList = lfRpmntMapper.searchYesterdayLfRpmnt(map);
		System.out.println(lfRpmntList.size());
	}*/
	@Test
	public void test06(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("groupId", 1);
		map.put("status", "1");
		map.put("circuRuleCode", "OPERD");
	//	map.put("collectors", collectorIds);
		plmsEmpCollectSetMapper.selectDtoByExampleList(map);
		
		Map<String,Object> map2 = new HashMap<String,Object>();
		map2.put("status", "1");
		map2.put("time", "month");
		plmsEmpCollectSetMapper.selectDtoByExampleList02(map2);
		
		
		Map<String,Object> map3 = new HashMap<String,Object>();
		map3.put("groupId", 1);
		map3.put("status", "1");
		plmsEmpCollectSetMapper.getAllCollector01(map3);
		plmsEmpCollectSetMapper.getAllCollector02(map3);
		
		Map<String,Object> map4 = new HashMap<String,Object>();
		map4.put("groupId", 1);
		map4.put("status", "1");
		map4.put("circuRuleCode", "OPERD");
		plmsEmpCollectSetMapper.selectCollectorByExampleList(map4);
		
		System.out.println("ok");
		
	}

	@Test
	public void test07(){
		plmsDayIncomeService.updatePlmsLaIncomeOutVisitUser();
	}
}
