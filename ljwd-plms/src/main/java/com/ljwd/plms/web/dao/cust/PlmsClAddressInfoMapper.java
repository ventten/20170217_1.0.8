package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfo;
import com.ljwd.plms.web.model.cust.SysAdministrativeRegion;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.web.model.cust.PlmsClAddressInfoExample;

import org.apache.ibatis.annotations.Param;

/**
 * 客户地址信息,plms_cl_address_info
 * */
public interface PlmsClAddressInfoMapper extends GenericDao<PlmsClAddressInfo,Long>{

    int countByExample(PlmsClAddressInfoExample example);

    int deleteByExample(PlmsClAddressInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClAddressInfo record);

    int insertSelective(PlmsClAddressInfo record);

    List<PlmsClAddressInfo> selectByExample(PlmsClAddressInfoExample example);

    PlmsClAddressInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClAddressInfo record, @Param("example") PlmsClAddressInfoExample example);

    int updateByExample(@Param("record") PlmsClAddressInfo record, @Param("example") PlmsClAddressInfoExample example);

    int updateByPrimaryKeySelective(PlmsClAddressInfo record);

    int updateByPrimaryKey(PlmsClAddressInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClAddressInfo> selectByExampleAndPage(Page<PlmsClAddressInfo> page, PlmsClAddressInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的地址信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    List<PlmsClAddressInfo> findMfbmsAddressByDocnoList(List<String> docnoList);

    /**
     * 查询行政区域
     * @param id 记录ID
     * @param pid 上级ID
     * @param rlevel 层级ID
     * @return 实体集
     */
    List<SysAdministrativeRegion> findAddressByMore(@Param("id") Long id,@Param("pid") Long pid,@Param("rlevel") String rlevel);

    /**
     * 通过行政区域ID查询行政区域
     * @param id 行政区域ID
     * @return 实体
     */
    SysAdministrativeRegion findAddreNameById(@Param("id") Long id);

    /**
     * 通过ID查询客户地址信息
     * @param id 记录ID
     * @return PlmsClAddressInfo
     */
    PlmsClAddressInfo findAddressDataOneById(@Param("id") Long id);

    /**
     * @Description: 通过单位信息中的姓名和单位地址查询数据表中是否有重复的地址信息
     * @param info 地址信息
     * @return int
     * @author zhengjizhao
     * @date 2016年11月11日下午4:04:34
     */
    int selectPlmsClAddressInfoCount(PlmsClAddressInfo info);
    /**
     * 
    * @Description: 查询我的外访界面此案件对应主贷人的最新的地址信息 
    * @param map
    * @return
    * @return List<PlmsClAddressInfo>
     */
    List<PlmsClAddressInfo>	selectMyOutVisitAddr(Map<String, Object> map);
}