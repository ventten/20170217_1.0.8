package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.PlmsLTelTypeMapper;
import com.ljwd.plms.web.model.type.PlmsLTelType;
import com.ljwd.plms.web.model.type.PlmsLTelTypeExample;
import com.ljwd.plms.web.service.type.inf.PlmsLTelTypeService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 号码类型,plms_l_tel_type
 * */
@Service
public class PlmsLTelTypeServiceImpl extends GenericServiceImpl<PlmsLTelType,String> implements PlmsLTelTypeService {

    @Resource
    private PlmsLTelTypeMapper plmsLTelTypeMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLTelType, String> getDao() {
        return plmsLTelTypeMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsLTelTypeService_selectByExample_' + #example.getCacheKey()")
    public List<PlmsLTelType> selectByExample(PlmsLTelTypeExample example) {
        return plmsLTelTypeMapper.selectByExample(example);
    }

}