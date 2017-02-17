package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.PlmsLCollectAbnormityMapper;
import com.ljwd.plms.web.model.type.PlmsLCollectAbnormity;
import com.ljwd.plms.web.model.type.PlmsLCollectAbnormityExample;
import com.ljwd.plms.web.service.type.inf.PlmsLCollectAbnormityService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 个案情况,PLMS_L_COLLECT_ABNORMITY
 * */
@Service
public class PlmsLCollectAbnormityServiceImpl extends GenericServiceImpl<PlmsLCollectAbnormity,String> implements PlmsLCollectAbnormityService {

    @Resource
    private PlmsLCollectAbnormityMapper plmsLCollectAbnormityMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLCollectAbnormity, String> getDao() {
        return plmsLCollectAbnormityMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsLCollectAbnormityService_selectByExample_' + #example.getCacheKey()")
    public List<PlmsLCollectAbnormity> selectByExample(PlmsLCollectAbnormityExample example) {
        return plmsLCollectAbnormityMapper.selectByExample(example);
    }

}
