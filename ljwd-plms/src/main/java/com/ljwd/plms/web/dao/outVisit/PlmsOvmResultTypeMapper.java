package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmResultType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmResultTypeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsOvmResultTypeMapper extends GenericDao<PlmsOvmResultType,String>{
    int countByExample(PlmsOvmResultTypeExample example);

    int deleteByExample(PlmsOvmResultTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsOvmResultType record);

    int insertSelective(PlmsOvmResultType record);

    List<PlmsOvmResultType> selectByExample(PlmsOvmResultTypeExample example);

    PlmsOvmResultType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsOvmResultType record, @Param("example") PlmsOvmResultTypeExample example);

    int updateByExample(@Param("record") PlmsOvmResultType record, @Param("example") PlmsOvmResultTypeExample example);

    int updateByPrimaryKeySelective(PlmsOvmResultType record);

    int updateByPrimaryKey(PlmsOvmResultType record);
}