package com.ljwd.plms.web.service.report.inf;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncome;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeDto;


public interface PlmsLaCollectorIncomeService extends GenericService<PlmsLaCollectorIncome, Long> {

	 /**
     * 
    * @Description: 查询昨天的实收情况
    * @param map
    * @return
    * @return List<PlmsLaCollectorIncome>
     */
    List<PlmsLaCollectorIncomeDto> searchYesterdayLfRpmnt(Map<String, Object> map);
    
    
    
    /**
     * 
     */
    int deletePlmsLaCollectorIncome(Map<String, Object> map);
    
    /**
	 * 
	* @Description: 根据条件查询 
	* @param map
	* @return
	* @return List<PlmsLaCollectorIncome>
	 */
    List<PlmsLaCollectorIncome> selectByMap(Map<String,Object> map);
}
