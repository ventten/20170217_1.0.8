package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfo;

import java.util.List;

import com.ljwd.plms.web.model.cust.PlmsClContactorInfoExample;
import org.apache.ibatis.annotations.Param;

/**
 * 客户联系人信息,plms_cl_contactor_info
 * */
public interface PlmsClContactorInfoMapper extends GenericDao<PlmsClContactorInfo,Long>{

    int countByExample(PlmsClContactorInfoExample example);

    int deleteByExample(PlmsClContactorInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClContactorInfo record);

    int insertSelective(PlmsClContactorInfo record);

    List<PlmsClContactorInfo> selectByExample(PlmsClContactorInfoExample example);

    PlmsClContactorInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClContactorInfo record, @Param("example") PlmsClContactorInfoExample example);

    int updateByExample(@Param("record") PlmsClContactorInfo record, @Param("example") PlmsClContactorInfoExample example);

    int updateByPrimaryKeySelective(PlmsClContactorInfo record);

    int updateByPrimaryKey(PlmsClContactorInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClContactorInfo> selectByExampleAndPage(Page<PlmsClContactorInfo> page, PlmsClContactorInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的联系人信息(从电核表取数)
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    List<PlmsClContactorInfo> findMfbmsContactorByDocnoList(List<String> docnoList);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的联系人信息(从客户信息、职业信息、联系人信息表取数)
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    List<PlmsClContactorInfo> findMfbmsContactorByDocnoList2(List<String> docnoList);

}