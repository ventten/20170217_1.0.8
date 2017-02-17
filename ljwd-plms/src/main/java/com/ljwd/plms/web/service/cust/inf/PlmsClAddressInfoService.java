package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfo;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfoExample;
import com.ljwd.plms.web.model.cust.SysAdministrativeRegion;

import java.util.List;

/**
 * 客户地址信息,plms_cl_address_info
 * */
public interface PlmsClAddressInfoService extends GenericService<PlmsClAddressInfo,Long> {

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsClAddressInfoExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsClAddressInfo> selectByExampleAndPage(Page<PlmsClAddressInfo> page, PlmsClAddressInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的地址信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    List<PlmsClAddressInfo> findMfbmsAddressByDocnoList(List<String> docnoList);

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    void insertBatch(List<PlmsClAddressInfo> list);

    /**
     * 查询行政区域
     * @param id 记录ID
     * @param pid 上级ID
     * @param rlevel 层级ID
     * @return 实体集
     */
    List<SysAdministrativeRegion> findAddressByMore(Long id,Long pid,String rlevel);

    /**
     * 通过行政区域ID查询行政区域
     * @param id 行政区域ID
     * @return 实体
     */
    SysAdministrativeRegion findAddreNameById(Long id);

    /**
     * 通过ID查询客户地址信息
     * @param id 记录ID
     * @return
     */
    PlmsClAddressInfo findAddressDataOneById(Long id);

    /**
     * @Description: 根据主键ID更新实体
     * @return int
     * @author zhengjizhao
     * @date 2016年11月8日下午4:32:29
     */
    int updateByPrimaryKey(PlmsClAddressInfo record);

    /**
     * @Description: 根据信息中的姓名和地址查询是否有重复的地址
     * @return int
     * @author zhengjizhao
     * @date 2016年11月11日下午3:59:58
     */
    int selectPlmsClAddressInfoCount(PlmsClAddressInfo record);

}