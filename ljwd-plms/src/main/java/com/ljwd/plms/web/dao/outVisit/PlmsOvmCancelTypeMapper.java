package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmCancelType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmCancelTypeExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsOvmCancelTypeMapper extends GenericDao<PlmsOvmCancelType,String>{
    int countByExample(PlmsOvmCancelTypeExample example);

    int deleteByExample(PlmsOvmCancelTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsOvmCancelType record);

    int insertSelective(PlmsOvmCancelType record);

    List<PlmsOvmCancelType> selectByExample(PlmsOvmCancelTypeExample example);

    PlmsOvmCancelType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsOvmCancelType record, @Param("example") PlmsOvmCancelTypeExample example);

    int updateByExample(@Param("record") PlmsOvmCancelType record, @Param("example") PlmsOvmCancelTypeExample example);

    int updateByPrimaryKeySelective(PlmsOvmCancelType record);

    int updateByPrimaryKey(PlmsOvmCancelType record);
}