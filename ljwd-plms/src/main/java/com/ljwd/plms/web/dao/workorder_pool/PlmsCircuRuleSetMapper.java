package com.ljwd.plms.web.dao.workorder_pool;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSetExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsCircuRuleSetMapper extends GenericDao<PlmsCircuRuleSet, Long>{
    int countByExample(PlmsCircuRuleSetExample example);

    int deleteByExample(PlmsCircuRuleSetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsCircuRuleSet record);

    int insertSelective(PlmsCircuRuleSet record);

    List<PlmsCircuRuleSet> selectByExample(PlmsCircuRuleSetExample example);

    PlmsCircuRuleSet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsCircuRuleSet record, @Param("example") PlmsCircuRuleSetExample example);

    int updateByExample(@Param("record") PlmsCircuRuleSet record, @Param("example") PlmsCircuRuleSetExample example);

    int updateByPrimaryKeySelective(PlmsCircuRuleSet record);

    int updateByPrimaryKey(PlmsCircuRuleSet record);
    
    /**
     * 
    * @Description: 根据区间值查找逾期天数范围
    * @param status
    * @return
    * @return List<PlmsCircuRuleSet>
     */
    PlmsCircuRuleSet searchOverDaysByStatus(@Param("status")String status);
}