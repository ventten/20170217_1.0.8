package com.ljwd.plms.web.service.type.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.type.LAnnexStyleMapper;
import com.ljwd.plms.web.model.type.LAnnexStyle;
import com.ljwd.plms.web.model.type.LAnnexStyleExample;
import com.ljwd.plms.web.service.type.inf.LAnnexStyleService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 附件类别,L_ANNEX_STYLE
 * */
@Service
public class LAnnexStyleServiceImpl extends GenericServiceImpl<LAnnexStyle,String> implements LAnnexStyleService {

    @Resource
    private LAnnexStyleMapper lAnnexStyleMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<LAnnexStyle, String> getDao() {
        return lAnnexStyleMapper;
    }

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     */
    @Override
    @Cacheable(value="typeCache", key="'LAnnexStyleService_selectByExample_' + #example.getCacheKey()")
    public List<LAnnexStyle> selectByExample(LAnnexStyleExample example) {
        return lAnnexStyleMapper.selectByExample(example);
    }

}
