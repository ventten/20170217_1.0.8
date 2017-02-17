package com.ljwd.plms.web.dao.case_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectRec;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectRecExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PlmsLaCollectRecMapper extends GenericDao<PlmsLaCollectRec, Long>{
    int countByExample(PlmsLaCollectRecExample example);

    int deleteByExample(PlmsLaCollectRecExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaCollectRec record);

    int insertSelective(PlmsLaCollectRec record);

    List<PlmsLaCollectRec> selectByExample(PlmsLaCollectRecExample example);

    PlmsLaCollectRec selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaCollectRec record, @Param("example") PlmsLaCollectRecExample example);

    int updateByExample(@Param("record") PlmsLaCollectRec record, @Param("example") PlmsLaCollectRecExample example);

    int updateByPrimaryKeySelective(PlmsLaCollectRec record);

    int updateByPrimaryKey(PlmsLaCollectRec record);
    
    List<PlmsLaCollectRec> selectByTime(Map<String,Object> map);

}