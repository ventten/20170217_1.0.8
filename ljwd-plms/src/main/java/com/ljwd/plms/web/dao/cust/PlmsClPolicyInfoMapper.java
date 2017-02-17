package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsClPolicyInfo;

import java.util.List;

import com.ljwd.plms.web.model.cust.PlmsClPolicyInfoExample;
import org.apache.ibatis.annotations.Param;

/**
 * 客户保单信息,plms_cl_policy_info
 * */
public interface PlmsClPolicyInfoMapper extends GenericDao<PlmsClPolicyInfo,Long>{

    int countByExample(PlmsClPolicyInfoExample example);

    int deleteByExample(PlmsClPolicyInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClPolicyInfo record);

    int insertSelective(PlmsClPolicyInfo record);

    List<PlmsClPolicyInfo> selectByExample(PlmsClPolicyInfoExample example);

    PlmsClPolicyInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClPolicyInfo record, @Param("example") PlmsClPolicyInfoExample example);

    int updateByExample(@Param("record") PlmsClPolicyInfo record, @Param("example") PlmsClPolicyInfoExample example);

    int updateByPrimaryKeySelective(PlmsClPolicyInfo record);

    int updateByPrimaryKey(PlmsClPolicyInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClPolicyInfo> selectByExampleAndPage(Page<PlmsClPolicyInfo> page, PlmsClPolicyInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的保单信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClPolicyInfo> findMfbmsPolicyByDocnoList(List<String> docnoList);

}