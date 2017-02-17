package com.ljwd.plms.web.service.job.inf;

import com.ljwd.plms.web.model.report.PlmsLaCollectorIncomeExample;


public interface PlmsDayIncomeService {

	/**
	 * 
	* @Description: 每天跑批统计昨天的催收员，外访员的实收
	* @return
	* @return String
	 */
	void updatePlmsLaIncome_yesterday();
	
	/**
	 * 
	* @Description: 手动生成指定日期实收统计 
	* @return void
	 */
	void updatePlmsLaIncome_today(PlmsLaCollectorIncomeExample example,String userId);
	
	
	/**
	 * 
	* @Description: 每天跑批生成昨天外访员的实收 
	* @return void
	 */
	void updatePlmsLaIncomeOutVisitUser();
	
	/**
	 * 
	* @Description: 手动生成指定日期外访人员实收统计  
	* @param example
	* @param userId
	* @return void
	 */
	void updatePlmsLaIncomeOutVisitUser_today(PlmsLaCollectorIncomeExample example,String userId);
}
