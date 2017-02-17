package com.ljwd.plms.web.dao.report;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.web.model.report.LfRpmnt;




public interface LfRpmntMapper {
    
	/**
	 * 
	* @Description: 根据map中的查询条件查询 
	* @param map
	* @return
	* @return List<LfRpmnt>
	 */
	List<LfRpmnt> selectByMap(Map<String,Object> map);
}