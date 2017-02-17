package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.LBank;
import com.ljwd.plms.web.model.type.LBankExample;

import java.util.List;

/**
 * 银行字典,L_BANK
 * */
public interface LBankService extends GenericService<LBank,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<LBank> selectByExample(LBankExample example);

}