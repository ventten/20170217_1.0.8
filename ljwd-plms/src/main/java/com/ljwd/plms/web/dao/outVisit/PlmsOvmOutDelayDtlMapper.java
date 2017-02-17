package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtl;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtlExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsOvmOutDelayDtlMapper extends GenericDao<PlmsOvmOutDelayDtl,Long>{
    int countByExample(PlmsOvmOutDelayDtlExample example);

    int deleteByExample(PlmsOvmOutDelayDtlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOvmOutDelayDtl record);

    int insertSelective(PlmsOvmOutDelayDtl record);

    List<PlmsOvmOutDelayDtl> selectByExample(PlmsOvmOutDelayDtlExample example);

    PlmsOvmOutDelayDtl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOvmOutDelayDtl record, @Param("example") PlmsOvmOutDelayDtlExample example);

    int updateByExample(@Param("record") PlmsOvmOutDelayDtl record, @Param("example") PlmsOvmOutDelayDtlExample example);

    int updateByPrimaryKeySelective(PlmsOvmOutDelayDtl record);

    int updateByPrimaryKey(PlmsOvmOutDelayDtl record);
}