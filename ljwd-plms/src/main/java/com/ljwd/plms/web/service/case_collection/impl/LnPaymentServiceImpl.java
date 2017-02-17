package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.web.dao.case_collection.LnPaymentMapper;
import com.ljwd.plms.web.model.case_collection.LnPayment;
import com.ljwd.plms.web.model.case_collection.LnPaymentExample;
import com.ljwd.plms.web.service.case_collection.inf.LnPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 付款申请单信息,用于记录付款申请单信息,LN_PAYMENT
 * */
@Service
public class LnPaymentServiceImpl implements LnPaymentService {

    @Resource
    private LnPaymentMapper lnPaymentMapper;

    /**
     * 根据ID查询
     * @param id 记录ID
     * @return 实体
     */
    @Override
    public LnPayment selectByPrimaryKey(Long id) {
        return lnPaymentMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<LnPayment> selectByExample(LnPaymentExample example) {
        return lnPaymentMapper.selectByExample(example);
    }

    /**
     * 根据借款申请ID查询
     * @param applId 借款申请ID
     * @return 实体
     */
    @Override
    public LnPayment selectByApplId(Long applId) {
        if(applId == null){
            return null;
        }
        List<LnPayment> list = lnPaymentMapper.selectByExample(new LnPaymentExample().setApplId(applId));
        if(list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
    }

}
