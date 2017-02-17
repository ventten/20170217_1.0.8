package com.ljwd.plms.web.dao.workorder_pool;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.workorder_pool.PlmsLRiskLevel;
import com.ljwd.plms.web.model.workorder_pool.PlmsLRiskLevelExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsLRiskLevelMapper extends GenericDao<PlmsLRiskLevel, String>{
    int countByExample(PlmsLRiskLevelExample example);

    int deleteByExample(PlmsLRiskLevelExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLRiskLevel record);

    int insertSelective(PlmsLRiskLevel record);

    List<PlmsLRiskLevel> selectByExample(PlmsLRiskLevelExample example);

    PlmsLRiskLevel selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLRiskLevel record, @Param("example") PlmsLRiskLevelExample example);

    int updateByExample(@Param("record") PlmsLRiskLevel record, @Param("example") PlmsLRiskLevelExample example);

    int updateByPrimaryKeySelective(PlmsLRiskLevel record);

    int updateByPrimaryKey(PlmsLRiskLevel record);
}