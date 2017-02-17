package com.ljwd.plms.web.dao.case_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAllocExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PlmsLaCollectAllocMapper  extends GenericDao<PlmsLaCollectAlloc, Long>{

    int countByExample(PlmsLaCollectAllocExample example);

    int deleteByExample(PlmsLaCollectAllocExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaCollectAlloc record);

    int insertSelective(PlmsLaCollectAlloc record);

    List<PlmsLaCollectAlloc> selectByExample(PlmsLaCollectAllocExample example);

    PlmsLaCollectAlloc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaCollectAlloc record, @Param("example") PlmsLaCollectAllocExample example);

    int updateByExample(@Param("record") PlmsLaCollectAlloc record, @Param("example") PlmsLaCollectAllocExample example);

    int updateByPrimaryKeySelective(PlmsLaCollectAlloc record);

    int updateByPrimaryKey(PlmsLaCollectAlloc record);

    /**
    * @Description: 根据条件查询最新的分配记录
    * @param map
    * @return List<PlmsLaCollectAlloc>
     */
	List<PlmsLaCollectAlloc> selectMaxDateByMap(Map<String,Object> map);

}