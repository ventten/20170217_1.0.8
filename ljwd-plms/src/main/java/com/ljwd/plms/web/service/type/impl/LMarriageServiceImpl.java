package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.LMarriageMapper;
import com.ljwd.plms.web.model.type.LMarriage;
import com.ljwd.plms.web.model.type.LMarriageExample;
import com.ljwd.plms.web.service.type.inf.LMarriageService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 婚姻状况,l_marriage
 * */
@Service
public class LMarriageServiceImpl extends GenericServiceImpl<LMarriage,String> implements LMarriageService {

    @Resource
    private LMarriageMapper lMarriageMapper;


    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<LMarriage, String> getDao() {
        return lMarriageMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'LMarriageService_selectByExample_' + #example.getCacheKey()")
    public List<LMarriage> selectByExample(LMarriageExample example) {
        return lMarriageMapper.selectByExample(example);
    }

}