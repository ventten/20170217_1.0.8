package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsClAssetsInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClAssetsInfo;
import com.ljwd.plms.web.model.cust.PlmsClAssetsInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsClAssetsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 客户其它资产信息,plms_cl_assets_info
 * */
@Service
public class PlmsClAssetsInfoServiceImpl extends GenericServiceImpl<PlmsClAssetsInfo,Long> implements PlmsClAssetsInfoService {

    @Resource
    private PlmsClAssetsInfoMapper plmsClAssetsInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClAssetsInfo, Long> getDao() {
        return plmsClAssetsInfoMapper;
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClAssetsInfo> selectByExampleAndPage(Page<PlmsClAssetsInfo> page, PlmsClAssetsInfoExample example) {
        plmsClAssetsInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }
}