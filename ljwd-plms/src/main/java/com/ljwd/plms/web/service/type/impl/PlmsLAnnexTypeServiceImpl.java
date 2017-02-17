package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.PlmsLAnnexTypeMapper;
import com.ljwd.plms.web.model.type.PlmsLAnnexType;
import com.ljwd.plms.web.model.type.PlmsLAnnexTypeExample;
import com.ljwd.plms.web.service.type.inf.PlmsLAnnexTypeService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 附件类型,PLMS_L_ANNEX_TYPE
 * */
@Service
public class PlmsLAnnexTypeServiceImpl extends GenericServiceImpl<PlmsLAnnexType,String> implements PlmsLAnnexTypeService {

    @Resource
    private PlmsLAnnexTypeMapper plmsLAnnexTypeMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLAnnexType, String> getDao() {
        return plmsLAnnexTypeMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsLAnnexTypeService_selectByExample_' + #example.getCacheKey()")
    public List<PlmsLAnnexType> selectByExample(PlmsLAnnexTypeExample example) {
        return plmsLAnnexTypeMapper.selectByExample(example);
    }

}
