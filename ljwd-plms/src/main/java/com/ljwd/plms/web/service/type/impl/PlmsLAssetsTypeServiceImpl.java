package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.PlmsLAssetsTypeMapper;
import com.ljwd.plms.web.model.type.PlmsLAssetsType;
import com.ljwd.plms.web.model.type.PlmsLAssetsTypeExample;
import com.ljwd.plms.web.service.type.inf.PlmsLAssetsTypeService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 资产类型,plms_l_assets_type
 * */
@Service
public class PlmsLAssetsTypeServiceImpl extends GenericServiceImpl<PlmsLAssetsType,String> implements PlmsLAssetsTypeService {

    @Resource
    private PlmsLAssetsTypeMapper plmsLAssetsTypeMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLAssetsType, String> getDao() {
        return plmsLAssetsTypeMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsLAssetsTypeService_selectByExample_' + #example.getCacheKey()")
    public List<PlmsLAssetsType> selectByExample(PlmsLAssetsTypeExample example) {
        return plmsLAssetsTypeMapper.selectByExample(example);
    }

}