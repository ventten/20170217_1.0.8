package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsClHouseInfo;
import com.ljwd.plms.web.model.cust.PlmsClHouseInfoExample;

import java.util.List;

/**
 * 客户房产信息,plms_cl_house_info
 * */
public interface PlmsClHouseInfoService extends GenericService<PlmsClHouseInfo,Long> {

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsClHouseInfoExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsClHouseInfo> selectByExampleAndPage(Page<PlmsClHouseInfo> page, PlmsClHouseInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的房产信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClHouseInfo> findMfbmsHouseByDocnoList(List<String> docnoList);

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    public void insertBatch(List<PlmsClHouseInfo> list);

}