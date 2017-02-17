package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.PlmsLSourceTypeMapper;
import com.ljwd.plms.web.model.type.PlmsLSourceType;
import com.ljwd.plms.web.model.type.PlmsLSourceTypeExample;
import com.ljwd.plms.web.service.type.inf.PlmsLSourceTypeService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 来源类型,plms_l_source_type
 * */
@Service
public class PlmsLSourceTypeServiceImpl extends GenericServiceImpl<PlmsLSourceType,String> implements PlmsLSourceTypeService {

    @Resource
    private PlmsLSourceTypeMapper plmsLSourceTypeMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLSourceType, String> getDao() {
        return plmsLSourceTypeMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsLSourceTypeService_selectByExample_' + #example.getCacheKey()")
    public List<PlmsLSourceType> selectByExample(PlmsLSourceTypeExample example) {
        return plmsLSourceTypeMapper.selectByExample(example);
    }

}