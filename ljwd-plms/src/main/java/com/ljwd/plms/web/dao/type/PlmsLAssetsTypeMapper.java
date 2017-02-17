package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLAssetsType;

import java.util.List;

import com.ljwd.plms.web.model.type.PlmsLAssetsTypeExample;
import org.apache.ibatis.annotations.Param;

/**
 * 资产类型,plms_l_assets_type
 * */
public interface PlmsLAssetsTypeMapper extends GenericDao<PlmsLAssetsType,String>{

    int countByExample(PlmsLAssetsTypeExample example);

    int deleteByExample(PlmsLAssetsTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLAssetsType record);

    int insertSelective(PlmsLAssetsType record);

    List<PlmsLAssetsType> selectByExample(PlmsLAssetsTypeExample example);

    PlmsLAssetsType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLAssetsType record, @Param("example") PlmsLAssetsTypeExample example);

    int updateByExample(@Param("record") PlmsLAssetsType record, @Param("example") PlmsLAssetsTypeExample example);

    int updateByPrimaryKeySelective(PlmsLAssetsType record);

    int updateByPrimaryKey(PlmsLAssetsType record);

}