package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.LBankMapper;
import com.ljwd.plms.web.model.type.LBank;
import com.ljwd.plms.web.model.type.LBankExample;
import com.ljwd.plms.web.service.type.inf.LBankService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 银行字典,L_BANK
 * */
@Service
public class LBankServiceImpl extends GenericServiceImpl<LBank,String> implements LBankService {

    @Resource
    private LBankMapper lBankMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<LBank, String> getDao() {
        return lBankMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'LBankService_selectByExample_' + #example.getCacheKey()")
    public List<LBank> selectByExample(LBankExample example) {
        return lBankMapper.selectByExample(example);
    }

}