package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsClCarInfo;

import java.util.List;

import com.ljwd.plms.web.model.cust.PlmsClCarInfoExample;
import org.apache.ibatis.annotations.Param;

/**
 * 客户车辆信息,plms_cl_car_info
 * */
public interface PlmsClCarInfoMapper extends GenericDao<PlmsClCarInfo,Long>{

    int countByExample(PlmsClCarInfoExample example);

    int deleteByExample(PlmsClCarInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClCarInfo record);

    int insertSelective(PlmsClCarInfo record);

    List<PlmsClCarInfo> selectByExample(PlmsClCarInfoExample example);

    PlmsClCarInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClCarInfo record, @Param("example") PlmsClCarInfoExample example);

    int updateByExample(@Param("record") PlmsClCarInfo record, @Param("example") PlmsClCarInfoExample example);

    int updateByPrimaryKeySelective(PlmsClCarInfo record);

    int updateByPrimaryKey(PlmsClCarInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClCarInfo> selectByExampleAndPage(Page<PlmsClCarInfo> page, PlmsClCarInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的车辆信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClCarInfo> findMfbmsCarByDocnoList(List<String> docnoList);

}