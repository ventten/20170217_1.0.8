package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsClUnitInfo;
import com.ljwd.plms.web.model.cust.PlmsClUnitInfoExample;

import java.util.List;

/**
 * 客户单位信息,plms_cl_unit_info
 * */
public interface PlmsClUnitInfoService extends GenericService<PlmsClUnitInfo,Long> {

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsClUnitInfoExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsClUnitInfo> selectByExampleAndPage(Page<PlmsClUnitInfo> page, PlmsClUnitInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的单位信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClUnitInfo> findMfbmsUnitByDocnoList(List<String> docnoList);

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    public void insertBatch(List<PlmsClUnitInfo> list);
    /**
     * 
     * @Description: 通过ID查询客户单位信息
     * @param @param id
     * @param @return   
     * @return PlmsClUnitInfo  
     * @throws
     * @author zhengjizhao
     * @date 2016年11月10日下午3:56:45
     */
    public PlmsClUnitInfo selectByPrimaryKey(Long id);

}