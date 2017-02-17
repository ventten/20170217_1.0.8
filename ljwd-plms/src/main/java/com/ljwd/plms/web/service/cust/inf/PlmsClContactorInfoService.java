package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfo;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfoExample;
import com.ljwd.plms.web.model.cust.PlmsLnPolyInfoExample;

import java.util.List;

/**
 * 客户联系人信息,plms_cl_contactor_info
 * */
public interface PlmsClContactorInfoService extends GenericService<PlmsClContactorInfo,Long> {

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsClContactorInfoExample example);

    /**
     * 条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsClContactorInfo> selectByExample(PlmsClContactorInfoExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsClContactorInfo> selectByExampleAndPage(Page<PlmsClContactorInfo> page, PlmsClContactorInfoExample example);

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

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    void insertBatch(List<PlmsClContactorInfo> list);

}