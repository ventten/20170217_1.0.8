package com.ljwd.plms.web.dao.workorder_pool;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsLCircuRule;
import com.ljwd.plms.web.model.workorder_pool.PlmsLCircuRuleExample;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCircuRuleDto;

public interface PlmsLCircuRuleMapper extends GenericDao<PlmsLCircuRule, String>{
    int countByExample(PlmsLCircuRuleExample example);

    int deleteByExample(PlmsLCircuRuleExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLCircuRule record);

    int insertSelective(PlmsLCircuRule record);

    List<PlmsLCircuRule> selectByExample(PlmsLCircuRuleExample example);

    PlmsLCircuRule selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLCircuRule record, @Param("example") PlmsLCircuRuleExample example);

    int updateByExample(@Param("record") PlmsLCircuRule record, @Param("example") PlmsLCircuRuleExample example);

    int updateByPrimaryKeySelective(PlmsLCircuRule record);

    int updateByPrimaryKey(PlmsLCircuRule record);
    
    List<PlmsCircuRuleDto> selectListByExample();
    
    PlmsCircuRuleDto selectDtoByID(@Param("id")Long id);

}