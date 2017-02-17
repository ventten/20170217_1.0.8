package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsClUnitInfo;

import java.util.List;

import com.ljwd.plms.web.model.cust.PlmsClUnitInfoExample;
import org.apache.ibatis.annotations.Param;

/**
 * 客户单位信息,plms_cl_unit_info
 * */
public interface PlmsClUnitInfoMapper extends GenericDao<PlmsClUnitInfo,Long>{

    int countByExample(PlmsClUnitInfoExample example);

    int deleteByExample(PlmsClUnitInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClUnitInfo record);

    int insertSelective(PlmsClUnitInfo record);

    List<PlmsClUnitInfo> selectByExample(PlmsClUnitInfoExample example);

    PlmsClUnitInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClUnitInfo record, @Param("example") PlmsClUnitInfoExample example);

    int updateByExample(@Param("record") PlmsClUnitInfo record, @Param("example") PlmsClUnitInfoExample example);

    int updateByPrimaryKeySelective(PlmsClUnitInfo record);

    int updateByPrimaryKey(PlmsClUnitInfo record);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的单位信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClUnitInfo> findMfbmsUnitByDocnoList(List<String> docnoList);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClUnitInfo> selectByExampleAndPage(Page<PlmsClUnitInfo> page, PlmsClUnitInfoExample example);

}