package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLCollectAbnormity;
import com.ljwd.plms.web.model.type.PlmsLCollectAbnormityExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 个案情况,PLMS_L_COLLECT_ABNORMITY
 * */
public interface PlmsLCollectAbnormityMapper extends GenericDao<PlmsLCollectAbnormity,String>{

    int countByExample(PlmsLCollectAbnormityExample example);

    int deleteByExample(PlmsLCollectAbnormityExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLCollectAbnormity record);

    int insertSelective(PlmsLCollectAbnormity record);

    List<PlmsLCollectAbnormity> selectByExample(PlmsLCollectAbnormityExample example);

    PlmsLCollectAbnormity selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLCollectAbnormity record, @Param("example") PlmsLCollectAbnormityExample example);

    int updateByExample(@Param("record") PlmsLCollectAbnormity record, @Param("example") PlmsLCollectAbnormityExample example);

    int updateByPrimaryKeySelective(PlmsLCollectAbnormity record);

    int updateByPrimaryKey(PlmsLCollectAbnormity record);

}