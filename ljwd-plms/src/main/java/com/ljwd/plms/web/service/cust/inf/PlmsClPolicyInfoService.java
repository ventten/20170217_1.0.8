package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsClPolicyInfo;
import com.ljwd.plms.web.model.cust.PlmsClPolicyInfoExample;

import java.util.List;

/**
 * 客户保单信息,plms_cl_policy_info
 * */
public interface PlmsClPolicyInfoService extends GenericService<PlmsClPolicyInfo,Long> {

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsClPolicyInfo> selectByExampleAndPage(Page<PlmsClPolicyInfo> page, PlmsClPolicyInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的保单信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClPolicyInfo> findMfbmsPolicyByDocnoList(List<String> docnoList);

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    public void insertBatch(List<PlmsClPolicyInfo> list);

}