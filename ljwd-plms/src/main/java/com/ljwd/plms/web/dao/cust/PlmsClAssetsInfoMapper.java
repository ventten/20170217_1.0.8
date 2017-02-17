package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsClAssetsInfo;

import java.util.List;

import com.ljwd.plms.web.model.cust.PlmsClAssetsInfoExample;
import org.apache.ibatis.annotations.Param;

/**
 * 客户其它资产信息,plms_cl_assets_info
 * */
public interface PlmsClAssetsInfoMapper extends GenericDao<PlmsClAssetsInfo,Long>{

    int countByExample(PlmsClAssetsInfoExample example);

    int deleteByExample(PlmsClAssetsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClAssetsInfo record);

    int insertSelective(PlmsClAssetsInfo record);

    List<PlmsClAssetsInfo> selectByExample(PlmsClAssetsInfoExample example);

    PlmsClAssetsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClAssetsInfo record, @Param("example") PlmsClAssetsInfoExample example);

    int updateByExample(@Param("record") PlmsClAssetsInfo record, @Param("example") PlmsClAssetsInfoExample example);

    int updateByPrimaryKeySelective(PlmsClAssetsInfo record);

    int updateByPrimaryKey(PlmsClAssetsInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClAssetsInfo> selectByExampleAndPage(Page<PlmsClAssetsInfo> page, PlmsClAssetsInfoExample example);

}