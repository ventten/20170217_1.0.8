package com.ljwd.plms.web.dao.workorder_pool;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.workorder_pool.PlmsProtectRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsProtectRuleSetExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsProtectRuleSetMapper extends GenericDao<PlmsProtectRuleSet, Long>{
    int countByExample(PlmsProtectRuleSetExample example);

    int deleteByExample(PlmsProtectRuleSetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsProtectRuleSet record);

    int insertSelective(PlmsProtectRuleSet record);

    List<PlmsProtectRuleSet> selectByExample(PlmsProtectRuleSetExample example);

    PlmsProtectRuleSet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsProtectRuleSet record, @Param("example") PlmsProtectRuleSetExample example);

    int updateByExample(@Param("record") PlmsProtectRuleSet record, @Param("example") PlmsProtectRuleSetExample example);

    int updateByPrimaryKeySelective(PlmsProtectRuleSet record);

    int updateByPrimaryKey(PlmsProtectRuleSet record);
}