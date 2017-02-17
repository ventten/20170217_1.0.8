package com.ljwd.plms.web.service.case_management.inf;

import java.util.List;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_management.PlmsLTransferType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferTypeExample;

/**
 * 移交类型表,PLMS_L_TRANSFER_TYPE
 * */
public interface PlmsLTransferTypeService extends GenericService<PlmsLTransferType, String>{

    List<PlmsLTransferType> selectByExample(PlmsLTransferTypeExample example);

}
