package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.web.model.case_collection.LnCntrct;
import com.ljwd.plms.web.vo.case_collection.CntrctAllocDto;

/**
 * Created by zhengzw on 2016/10/25
 * 合同信息,LN_CNTRCT
 */
public interface LnCntrctService {

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
