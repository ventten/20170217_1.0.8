package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimit;
import com.ljwd.plms.web.model.sys_management.PlmsUserUpperLimitExample;
import com.ljwd.plms.web.vo.sys_management.PlmsUserUpperLimitResultDto;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsUserUpperLimitMapper extends GenericDao<PlmsUserUpperLimit, Long> {
    int countByExample(PlmsUserUpperLimitExample example);

    int deleteByExample(PlmsUserUpperLimitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsUserUpperLimit record);

    int insertSelective(PlmsUserUpperLimit record);

    List<PlmsUserUpperLimit> selectByExample(PlmsUserUpperLimitExample example);

    PlmsUserUpperLimit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsUserUpperLimit record, @Param("example") PlmsUserUpperLimitExample example);

    int updateByExample(@Param("record") PlmsUserUpperLimit record, @Param("example") PlmsUserUpperLimitExample example);

    int updateByPrimaryKeySelective(PlmsUserUpperLimit record);

    int updateByPrimaryKey(PlmsUserUpperLimit record);
    
    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
	List<PlmsUserUpperLimit> selectByExampleAndPage(Page<PlmsUserUpperLimit> page, PlmsUserUpperLimitExample example);
}