package com.ljwd.plms.web.service.report.inf;

import java.util.Map;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.report.PlmsLaOutvisiteIncome;

public interface PlmsLaOutvisiteIncomeService extends GenericService<PlmsLaOutvisiteIncome,Long>{

	/**
     * 
    * @Description: 删除指定日期的数据 
    * @param map
    * @return
    * @return int
     */
    int deletePlmsLaOutVisitIncome(Map<String, Object> map);
}
