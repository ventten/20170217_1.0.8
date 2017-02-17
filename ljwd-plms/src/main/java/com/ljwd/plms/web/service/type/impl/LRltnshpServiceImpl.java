package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.LRltnshpMapper;
import com.ljwd.plms.web.model.type.LRltnshp;
import com.ljwd.plms.web.model.type.LRltnshpExample;
import com.ljwd.plms.web.service.type.inf.LRltnshpService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 客户亲属关系,l_rltnshp
 * */
@Service
public class LRltnshpServiceImpl extends GenericServiceImpl<LRltnshp,String> implements LRltnshpService {

    @Resource
    private LRltnshpMapper lRltnshpMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<LRltnshp, String> getDao() {
        return lRltnshpMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'LRltnshpService_selectByExample_' + #example.getCacheKey()")
    public List<LRltnshp> selectByExample(LRltnshpExample example) {
        return lRltnshpMapper.selectByExample(example);
    }

}