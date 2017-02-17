package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLSourceType;

import java.util.List;

import com.ljwd.plms.web.model.type.PlmsLSourceTypeExample;
import org.apache.ibatis.annotations.Param;

/**
 * 来源类型,plms_l_source_type
 * */
public interface PlmsLSourceTypeMapper extends GenericDao<PlmsLSourceType,String>{

    int countByExample(PlmsLSourceTypeExample example);

    int deleteByExample(PlmsLSourceTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLSourceType record);

    int insertSelective(PlmsLSourceType record);

    List<PlmsLSourceType> selectByExample(PlmsLSourceTypeExample example);

    PlmsLSourceType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLSourceType record, @Param("example") PlmsLSourceTypeExample example);

    int updateByExample(@Param("record") PlmsLSourceType record, @Param("example") PlmsLSourceTypeExample example);

    int updateByPrimaryKeySelective(PlmsLSourceType record);

    int updateByPrimaryKey(PlmsLSourceType record);

}