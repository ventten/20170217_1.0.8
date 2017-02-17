package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.web.model.case_collection.LnCntrct;
import com.ljwd.plms.web.model.case_collection.LnCntrctExample;
import com.ljwd.plms.web.vo.case_collection.CntrctAllocDto;

import java.util.List;

/**
 * 合同信息,LN_CNTRCT
 * */
public interface LnCntrctMapper {

    int countByExample(LnCntrctExample example);

    List<LnCntrct> selectByExample(LnCntrctExample example);

    LnCntrct selectByPrimaryKey(Long id);

    /**
     * 根据合同编号查找
     * @param cntrctNo 合同编号
     * @return 实体
     * */
    LnCntrct selectByCntrctNo(String cntrctNo);

    /**
     * 根据合同编号查找
     * @param cntrctNo 合同编号
     * @return 实体
     * */
    CntrctAllocDto selectCntrctAllocByCntrctNo(String cntrctNo);

}