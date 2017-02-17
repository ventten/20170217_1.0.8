package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.PlmsLCollectControlMapper;
import com.ljwd.plms.web.model.type.PlmsLCollectControl;
import com.ljwd.plms.web.model.type.PlmsLCollectControlExample;
import com.ljwd.plms.web.service.type.inf.PlmsLCollectControlService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by zhengzw on 2016/8/3
 * 控管状态,PLMS_L_COLLECT_CONTROL
 */
@Service
public class PlmsLCollectControlServiceImpl extends GenericServiceImpl<PlmsLCollectControl,String> implements PlmsLCollectControlService {

    @Resource
    private PlmsLCollectControlMapper plmsLCollectControlMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLCollectControl, String> getDao() {
        return plmsLCollectControlMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsLCollectControlService_selectByExample_' + #example.getCacheKey()")
    public List<PlmsLCollectControl> selectByExample(PlmsLCollectControlExample example) {
        return plmsLCollectControlMapper.selectByExample(example);
    }

}
