package com.ljwd.plms.web.dao.workorder_pool;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignMethod;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignMethodExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsLAssignMethodMapper extends GenericDao<PlmsLAssignMethod, String> {
    int countByExample(PlmsLAssignMethodExample example);

    int deleteByExample(PlmsLAssignMethodExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLAssignMethod record);

    int insertSelective(PlmsLAssignMethod record);

    List<PlmsLAssignMethod> selectByExample(PlmsLAssignMethodExample example);

    PlmsLAssignMethod selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLAssignMethod record, @Param("example") PlmsLAssignMethodExample example);

    int updateByExample(@Param("record") PlmsLAssignMethod record, @Param("example") PlmsLAssignMethodExample example);

    int updateByPrimaryKeySelective(PlmsLAssignMethod record);

    int updateByPrimaryKey(PlmsLAssignMethod record);
    
}