package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsClPolicyInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClPolicyInfo;
import com.ljwd.plms.web.model.cust.PlmsClPolicyInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsClPolicyInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户保单信息,plms_cl_policy_info
 * */
@Service
public class PlmsClPolicyInfoServiceImpl extends GenericServiceImpl<PlmsClPolicyInfo,Long> implements PlmsClPolicyInfoService {

    @Resource
    private PlmsClPolicyInfoMapper plmsClPolicyInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClPolicyInfo, Long> getDao() {
        return plmsClPolicyInfoMapper;
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClPolicyInfo> selectByExampleAndPage(Page<PlmsClPolicyInfo> page, PlmsClPolicyInfoExample example) {
        plmsClPolicyInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的保单信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsClPolicyInfo> findMfbmsPolicyByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsClPolicyInfoMapper.findMfbmsPolicyByDocnoList(docnoList);
    }

}