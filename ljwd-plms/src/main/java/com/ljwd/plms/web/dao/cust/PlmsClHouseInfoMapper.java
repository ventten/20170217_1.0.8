package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsClHouseInfo;

import java.util.List;

import com.ljwd.plms.web.model.cust.PlmsClHouseInfoExample;
import org.apache.ibatis.annotations.Param;

/**
 * 客户房产信息,plms_cl_house_info
 * */
public interface PlmsClHouseInfoMapper extends GenericDao<PlmsClHouseInfo,Long>{

    int countByExample(PlmsClHouseInfoExample example);

    int deleteByExample(PlmsClHouseInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClHouseInfo record);

    int insertSelective(PlmsClHouseInfo record);

    List<PlmsClHouseInfo> selectByExample(PlmsClHouseInfoExample example);

    PlmsClHouseInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClHouseInfo record, @Param("example") PlmsClHouseInfoExample example);

    int updateByExample(@Param("record") PlmsClHouseInfo record, @Param("example") PlmsClHouseInfoExample example);

    int updateByPrimaryKeySelective(PlmsClHouseInfo record);

    int updateByPrimaryKey(PlmsClHouseInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClHouseInfo> selectByExampleAndPage(Page<PlmsClHouseInfo> page, PlmsClHouseInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的房产信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClHouseInfo> findMfbmsHouseByDocnoList(List<String> docnoList);

}