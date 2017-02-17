package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsFuncPerm;
import com.ljwd.plms.web.model.sys_management.PlmsFuncPermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 功能权限表,PLMS_FUNC_PERM
 * */
public interface PlmsFuncPermMapper extends GenericDao<PlmsFuncPerm,Long>{

    int countByExample(PlmsFuncPermExample example);

    int deleteByExample(PlmsFuncPermExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsFuncPerm record);

    int insertSelective(PlmsFuncPerm record);

    List<PlmsFuncPerm> selectByExample(PlmsFuncPermExample example);

    PlmsFuncPerm selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsFuncPerm record, @Param("example") PlmsFuncPermExample example);

    int updateByExample(@Param("record") PlmsFuncPerm record, @Param("example") PlmsFuncPermExample example);

    int updateByPrimaryKeySelective(PlmsFuncPerm record);

    int updateByPrimaryKey(PlmsFuncPerm record);

}