package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.dao.case_collection.LnCntrctMapper;
import com.ljwd.plms.web.model.case_collection.LnCntrct;
import com.ljwd.plms.web.service.case_collection.inf.LnCntrctService;
import com.ljwd.plms.web.vo.case_collection.CntrctAllocDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhengzw on 2016/10/25
 * 合同信息,LN_CNTRCT
 */
@Service
public class LnCntrctServiceImpl implements LnCntrctService {

    @Resource
    private LnCntrctMapper lnCntrctMapper;

    /**
     * 根据合同编号查找
     * @param cntrctNo 合同编号
     * @return 实体
     */
    @Override
    public LnCntrct selectByCntrctNo(String cntrctNo) {
        if(StringUtil.isEmpty(cntrctNo)){
            return null;
        }
        return lnCntrctMapper.selectByCntrctNo(cntrctNo);
    }

    /**
     * 根据合同编号查找
     * @param cntrctNo 合同编号
     * @return 实体
     */
    @Override
    public CntrctAllocDto selectCntrctAllocByCntrctNo(String cntrctNo) {
        if(StringUtil.isEmpty(cntrctNo)){
            return null;
        }
        return lnCntrctMapper.selectCntrctAllocByCntrctNo(cntrctNo);
    }

}
