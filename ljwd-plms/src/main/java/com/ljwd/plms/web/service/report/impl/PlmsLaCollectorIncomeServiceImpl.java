package com.ljwd.plms.web.service.report.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.report.PlmsLaCollectorIncomeMapper;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncome;
import com.ljwd.plms.web.service.report.inf.PlmsLaCollectorIncomeService;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeDto;
@Service
public class PlmsLaCollectorIncomeServiceImpl extends
		GenericServiceImpl<PlmsLaCollectorIncome, Long> implements PlmsLaCollectorIncomeService {

	@Resource
	private PlmsLaCollectorIncomeMapper plmsLaCollectorIncomeMapper;
		
	
	
	@Override
	public GenericDao<PlmsLaCollectorIncome, Long> getDao() {
		
		return plmsLaCollectorIncomeMapper;
	}



	 /**
     * 
    * @Description: 查询昨天的实收情况
    * @param map
    * @return
    * @return List<PlmsLaCollectorIncome>
     */
	@Override
	public List<PlmsLaCollectorIncomeDto> searchYesterdayLfRpmnt(
			Map<String, Object> map) {
		if(map.get("rpmntType").equals("2")){
			return plmsLaCollectorIncomeMapper.searchYesterdayLfRpmnt_weixin(map);
		}else{
			return plmsLaCollectorIncomeMapper.searchYesterdayLfRpmnt(map);
		}
		
	}


	/**
	 * 
	* @Description: 删除当天的实收统计记录 
	* @return
	* @return
	 */
	@Override
	public int deletePlmsLaCollectorIncome(Map<String, Object> map) {

		return plmsLaCollectorIncomeMapper.deletePlmsLaCollectorIncome(map);
	}



	/**
	 * 
	* @Description: 根据条件查询  
	* @param map
	* @return
	* @return
	 */
	@Override
	public List<PlmsLaCollectorIncome> selectByMap(Map<String, Object> map) {

		return plmsLaCollectorIncomeMapper.selectByMap(map);
	}

	
	
}
