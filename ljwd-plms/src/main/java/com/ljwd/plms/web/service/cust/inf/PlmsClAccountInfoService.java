package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsClAccountInfo;
import com.ljwd.plms.web.model.cust.PlmsClAccountInfoExample;

import java.util.List;

/**
 * 客户流水账号信息,plms_cl_account_info
 * */
public interface PlmsClAccountInfoService extends GenericService<PlmsClAccountInfo, Long> {

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsClAccountInfoExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsClAccountInfo> selectByExampleAndPage(Page<PlmsClAccountInfo> page, PlmsClAccountInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的流水信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClAccountInfo> findMfbmsAccountByDocnoList(List<String> docnoList);

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    public void insertBatch(List<PlmsClAccountInfo> list);

}