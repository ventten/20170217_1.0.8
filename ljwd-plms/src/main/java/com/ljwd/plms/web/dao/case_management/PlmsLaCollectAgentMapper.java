package com.ljwd.plms.web.dao.case_management;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgent;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgentExample;


public interface PlmsLaCollectAgentMapper  extends GenericDao<PlmsLaCollectAgent, Long>{
    int countByExample(PlmsLaCollectAgentExample example);

    int deleteByExample(PlmsLaCollectAgentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaCollectAgent record);

    int insertSelective(PlmsLaCollectAgent record);

    List<PlmsLaCollectAgent> selectByExample(PlmsLaCollectAgentExample example);

    PlmsLaCollectAgent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaCollectAgent record, @Param("example") PlmsLaCollectAgentExample example);

    int updateByExample(@Param("record") PlmsLaCollectAgent record, @Param("example") PlmsLaCollectAgentExample example);

    int updateByPrimaryKeySelective(PlmsLaCollectAgent record);

    int updateByPrimaryKey(PlmsLaCollectAgent record);
   
    List<PlmsLaCollectAgent> selectByExample2(Map<String,Object> map);

}