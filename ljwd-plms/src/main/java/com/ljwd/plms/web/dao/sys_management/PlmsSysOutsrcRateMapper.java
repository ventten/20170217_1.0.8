package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRate;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRateExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 委外费率表,PLMS_SYS_OUTSRC_RATE
 * */
public interface PlmsSysOutsrcRateMapper extends GenericDao<PlmsSysOutsrcRate,Long>{

    int countByExample(PlmsSysOutsrcRateExample example);

    int deleteByExample(PlmsSysOutsrcRateExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(PlmsSysOutsrcRate record);

    int insertSelective(PlmsSysOutsrcRate record);

    List<PlmsSysOutsrcRate> selectByExample(PlmsSysOutsrcRateExample example);

    PlmsSysOutsrcRate selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") PlmsSysOutsrcRate record, @Param("example") PlmsSysOutsrcRateExample example);

    int updateByExample(@Param("record") PlmsSysOutsrcRate record, @Param("example") PlmsSysOutsrcRateExample example);

    int updateByPrimaryKeySelective(PlmsSysOutsrcRate record);

    int updateByPrimaryKey(PlmsSysOutsrcRate record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsSysOutsrcRate> selectByExampleAndPage(Page<PlmsSysOutsrcRate> page, PlmsSysOutsrcRateExample example);

    /**
     * 根据逾期天数查询有效的费率
     * @param overdueDays Page信息
     * @return 实体
     */
    List<PlmsSysOutsrcRate> selectByOverdueDays(Long overdueDays);

}