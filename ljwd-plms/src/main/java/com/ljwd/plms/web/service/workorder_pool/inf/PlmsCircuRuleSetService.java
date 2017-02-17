package com.ljwd.plms.web.service.workorder_pool.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSetExample;

import java.util.List;

public interface PlmsCircuRuleSetService extends GenericService<PlmsCircuRuleSet, Long> {

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsCircuRuleSet> selectByExample(PlmsCircuRuleSetExample example);
    
    /**
     * 
    * @Description: 根据区间值查找逾期天数范围
    * @param status
    * @return
    * @return List<PlmsCircuRuleSet>
     */
    PlmsCircuRuleSet searchOverDaysByStatus(String status);

}
