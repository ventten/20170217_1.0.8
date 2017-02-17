package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLTelType;

import java.util.List;

import com.ljwd.plms.web.model.type.PlmsLTelTypeExample;
import org.apache.ibatis.annotations.Param;

/**
 * 号码类型,plms_l_tel_type
 * */
public interface PlmsLTelTypeMapper extends GenericDao<PlmsLTelType,String>{

    int countByExample(PlmsLTelTypeExample example);

    int deleteByExample(PlmsLTelTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLTelType record);

    int insertSelective(PlmsLTelType record);

    List<PlmsLTelType> selectByExample(PlmsLTelTypeExample example);

    PlmsLTelType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLTelType record, @Param("example") PlmsLTelTypeExample example);

    int updateByExample(@Param("record") PlmsLTelType record, @Param("example") PlmsLTelTypeExample example);

    int updateByPrimaryKeySelective(PlmsLTelType record);

    int updateByPrimaryKey(PlmsLTelType record);

}