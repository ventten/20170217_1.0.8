package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitSign;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitSignExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsOvmOutVisitSignMapper extends GenericDao<PlmsOvmOutVisitSign, Long> {
    int countByExample(PlmsOvmOutVisitSignExample example);

    int deleteByExample(PlmsOvmOutVisitSignExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOvmOutVisitSign record);

    int insertSelective(PlmsOvmOutVisitSign record);

    List<PlmsOvmOutVisitSign> selectByExample(PlmsOvmOutVisitSignExample example);

    PlmsOvmOutVisitSign selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOvmOutVisitSign record, @Param("example") PlmsOvmOutVisitSignExample example);

    int updateByExample(@Param("record") PlmsOvmOutVisitSign record, @Param("example") PlmsOvmOutVisitSignExample example);

    int updateByPrimaryKeySelective(PlmsOvmOutVisitSign record);

    int updateByPrimaryKey(PlmsOvmOutVisitSign record);
}