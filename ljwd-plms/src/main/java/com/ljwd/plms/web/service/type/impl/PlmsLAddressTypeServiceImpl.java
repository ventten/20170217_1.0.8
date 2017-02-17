package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.PlmsLAddressTypeMapper;
import com.ljwd.plms.web.model.type.PlmsLAddressType;
import com.ljwd.plms.web.model.type.PlmsLAddressTypeExample;
import com.ljwd.plms.web.service.type.inf.PlmsLAddressTypeService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 地址类型,plms_l_address_type
 * */
@Service
public class PlmsLAddressTypeServiceImpl extends GenericServiceImpl<PlmsLAddressType,String> implements PlmsLAddressTypeService {

    @Resource
    private PlmsLAddressTypeMapper plmsLAddressTypeMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLAddressType, String> getDao() {
        return plmsLAddressTypeMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsLAddressTypeService_selectByExample_' + #example.getCacheKey()")
    public List<PlmsLAddressType> selectByExample(PlmsLAddressTypeExample example) {
        return plmsLAddressTypeMapper.selectByExample(example);
    }
}