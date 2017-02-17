package com.ljwd.plms.web.service.sys_management.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsFuncMapper;
import com.ljwd.plms.web.model.sys_management.PlmsFunc;
import com.ljwd.plms.web.model.sys_management.PlmsFuncExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsFuncService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能表,PLMS_FUNC
 * */
@Service
public class PlmsFuncServiceImpl extends GenericServiceImpl<PlmsFunc, Long> implements PlmsFuncService {

    @Resource
    private PlmsFuncMapper plmsFuncMapper;

    @Override
    public GenericDao<PlmsFunc, Long> getDao() {
        return plmsFuncMapper;
    }

    /**
     * 条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsFunc> selectByExample(PlmsFuncExample example) {
        return plmsFuncMapper.selectByExample(example);
    }

}
