package com.ljwd.plms.web.dao.report;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.report.PlmsLaOutvisiteIncome;
import com.ljwd.plms.web.model.report.PlmsLaOutvisiteIncomeExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PlmsLaOutvisiteIncomeMapper extends GenericDao<PlmsLaOutvisiteIncome,Long>{
    int countByExample(PlmsLaOutvisiteIncomeExample example);

    int deleteByExample(PlmsLaOutvisiteIncomeExample example);

    int deleteByPrimaryKey(Long rpmntId);

    int insert(PlmsLaOutvisiteIncome record);

    int insertSelective(PlmsLaOutvisiteIncome record);

    List<PlmsLaOutvisiteIncome> selectByExample(PlmsLaOutvisiteIncomeExample example);

    PlmsLaOutvisiteIncome selectByPrimaryKey(Long rpmntId);

    int updateByExampleSelective(@Param("record") PlmsLaOutvisiteIncome record, @Param("example") PlmsLaOutvisiteIncomeExample example);

    int updateByExample(@Param("record") PlmsLaOutvisiteIncome record, @Param("example") PlmsLaOutvisiteIncomeExample example);

    int updateByPrimaryKeySelective(PlmsLaOutvisiteIncome record);

    int updateByPrimaryKey(PlmsLaOutvisiteIncome record);
    /**
     * 
    * @Description: 删除指定日期的数据 
    * @param map
    * @return
    * @return int
     */
    int deletePlmsLaOutVisitIncome(Map<String, Object> map);
}