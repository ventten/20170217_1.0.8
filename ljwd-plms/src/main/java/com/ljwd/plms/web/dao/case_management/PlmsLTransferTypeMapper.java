package com.ljwd.plms.web.dao.case_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsLTransferType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferTypeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 移交类型表,PLMS_L_TRANSFER_TYPE
 * */
public interface PlmsLTransferTypeMapper extends GenericDao<PlmsLTransferType, String>{

    int countByExample(PlmsLTransferTypeExample example);

    int deleteByExample(PlmsLTransferTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLTransferType record);

    int insertSelective(PlmsLTransferType record);

    List<PlmsLTransferType> selectByExample(PlmsLTransferTypeExample example);

    PlmsLTransferType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLTransferType record, @Param("example") PlmsLTransferTypeExample example);

    int updateByExample(@Param("record") PlmsLTransferType record, @Param("example") PlmsLTransferTypeExample example);

    int updateByPrimaryKeySelective(PlmsLTransferType record);

    int updateByPrimaryKey(PlmsLTransferType record);

}