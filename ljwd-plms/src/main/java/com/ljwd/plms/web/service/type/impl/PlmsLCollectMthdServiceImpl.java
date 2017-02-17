package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.PlmsLCollectMthdMapper;
import com.ljwd.plms.web.model.type.PlmsLCollectMthd;
import com.ljwd.plms.web.model.type.PlmsLCollectMthdExample;
import com.ljwd.plms.web.service.type.inf.PlmsLCollectMthdService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 催收类型,PLMS_L_COLLECT_MTHD
 * */
@Service
public class PlmsLCollectMthdServiceImpl extends GenericServiceImpl<PlmsLCollectMthd,String> implements PlmsLCollectMthdService {

    @Resource
    private PlmsLCollectMthdMapper plmsLCollectMthdMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLCollectMthd, String> getDao() {
        return plmsLCollectMthdMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsLCollectMthdService_selectByExample_' + #example.getCacheKey()")
    public List<PlmsLCollectMthd> selectByExample(PlmsLCollectMthdExample example) {
        return plmsLCollectMthdMapper.selectByExample(example);
    }

}
