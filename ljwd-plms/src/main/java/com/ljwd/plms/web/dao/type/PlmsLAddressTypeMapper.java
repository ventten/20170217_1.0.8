package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLAddressType;

import java.util.List;

import com.ljwd.plms.web.model.type.PlmsLAddressTypeExample;
import org.apache.ibatis.annotations.Param;

/**
 * 地址类型,plms_l_address_type
 * */
public interface PlmsLAddressTypeMapper extends GenericDao<PlmsLAddressType,String>{

    int countByExample(PlmsLAddressTypeExample example);

    int deleteByExample(PlmsLAddressTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLAddressType record);

    int insertSelective(PlmsLAddressType record);

    List<PlmsLAddressType> selectByExample(PlmsLAddressTypeExample example);

    PlmsLAddressType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLAddressType record, @Param("example") PlmsLAddressTypeExample example);

    int updateByExample(@Param("record") PlmsLAddressType record, @Param("example") PlmsLAddressTypeExample example);

    int updateByPrimaryKeySelective(PlmsLAddressType record);

    int updateByPrimaryKey(PlmsLAddressType record);

}