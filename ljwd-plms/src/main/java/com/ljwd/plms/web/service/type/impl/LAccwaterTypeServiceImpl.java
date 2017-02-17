package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.LAccwaterTypeMapper;
import com.ljwd.plms.web.model.type.LAccwaterType;
import com.ljwd.plms.web.model.type.LAccwaterTypeExample;
import com.ljwd.plms.web.service.type.inf.LAccwaterTypeService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 账户流水类型,l_accwater_type
 * */
@Service
public class LAccwaterTypeServiceImpl extends GenericServiceImpl<LAccwaterType,String> implements LAccwaterTypeService {

    @Resource
    private LAccwaterTypeMapper lAccwaterTypeMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<LAccwaterType, String> getDao() {
        return lAccwaterTypeMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'LAccwaterTypeService_selectByExample_' + #example.getCacheKey()")
    public List<LAccwaterType> selectByExample(LAccwaterTypeExample example) {
        return lAccwaterTypeMapper.selectByExample(example);
    }

}
