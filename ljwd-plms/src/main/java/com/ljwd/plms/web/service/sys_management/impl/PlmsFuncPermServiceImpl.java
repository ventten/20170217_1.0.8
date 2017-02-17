package com.ljwd.plms.web.service.sys_management.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsFuncPermMapper;
import com.ljwd.plms.web.model.sys_management.PlmsFuncPerm;
import com.ljwd.plms.web.model.sys_management.PlmsFuncPermExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsFuncPermService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能权限表,PLMS_FUNC_PERM
 * */
@Service
public class PlmsFuncPermServiceImpl extends GenericServiceImpl<PlmsFuncPerm, Long> implements PlmsFuncPermService {

    @Resource
    private PlmsFuncPermMapper PlmsFuncPermMapper;

    @Override
    public GenericDao<PlmsFuncPerm, Long> getDao() {
        return PlmsFuncPermMapper;
    }

    /**
     * 条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsFuncPerm> selectByExample(PlmsFuncPermExample example) {
        return PlmsFuncPermMapper.selectByExample(example);
    }

}
