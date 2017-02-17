package com.ljwd.plms.web.dao.workorder_pool;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRule;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRuleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsLAssignRuleMapper extends GenericDao<PlmsLAssignRule, String>{
    int countByExample(PlmsLAssignRuleExample example);

    int deleteByExample(PlmsLAssignRuleExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLAssignRule record);

    int insertSelective(PlmsLAssignRule record);

    List<PlmsLAssignRule> selectByExample(PlmsLAssignRuleExample example);

    PlmsLAssignRule selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLAssignRule record, @Param("example") PlmsLAssignRuleExample example);

    int updateByExample(@Param("record") PlmsLAssignRule record, @Param("example") PlmsLAssignRuleExample example);

    int updateByPrimaryKeySelective(PlmsLAssignRule record);

    int updateByPrimaryKey(PlmsLAssignRule record);
}