package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsFunc;
import com.ljwd.plms.web.model.sys_management.PlmsFuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 功能表,PLMS_FUNC
 * */
public interface PlmsFuncMapper extends GenericDao<PlmsFunc,Long>{

    int countByExample(PlmsFuncExample example);

    int deleteByExample(PlmsFuncExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsFunc record);

    int insertSelective(PlmsFunc record);

    List<PlmsFunc> selectByExample(PlmsFuncExample example);

    PlmsFunc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsFunc record, @Param("example") PlmsFuncExample example);

    int updateByExample(@Param("record") PlmsFunc record, @Param("example") PlmsFuncExample example);

    int updateByPrimaryKeySelective(PlmsFunc record);

    int updateByPrimaryKey(PlmsFunc record);

}