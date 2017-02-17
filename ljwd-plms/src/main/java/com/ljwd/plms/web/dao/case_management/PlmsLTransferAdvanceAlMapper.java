package com.ljwd.plms.web.dao.case_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvanceAl;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvanceAlExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsLTransferAdvanceAlMapper extends GenericDao<PlmsLTransferAdvanceAl, Long>{
    int countByExample(PlmsLTransferAdvanceAlExample example);

    int deleteByExample(PlmsLTransferAdvanceAlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLTransferAdvanceAl record);

    int insertSelective(PlmsLTransferAdvanceAl record);

    List<PlmsLTransferAdvanceAl> selectByExample(PlmsLTransferAdvanceAlExample example);

    PlmsLTransferAdvanceAl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLTransferAdvanceAl record, @Param("example") PlmsLTransferAdvanceAlExample example);

    int updateByExample(@Param("record") PlmsLTransferAdvanceAl record, @Param("example") PlmsLTransferAdvanceAlExample example);

    int updateByPrimaryKeySelective(PlmsLTransferAdvanceAl record);

    int updateByPrimaryKey(PlmsLTransferAdvanceAl record);
}