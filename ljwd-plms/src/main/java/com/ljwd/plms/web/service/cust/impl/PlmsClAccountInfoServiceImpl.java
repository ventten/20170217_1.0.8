package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsClAccountInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClAccountInfo;
import com.ljwd.plms.web.model.cust.PlmsClAccountInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsClAccountInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户流水账号信息,plms_cl_account_info
 * */
@Service
public class PlmsClAccountInfoServiceImpl extends GenericServiceImpl<PlmsClAccountInfo, Long> implements PlmsClAccountInfoService {

    @Resource
    private PlmsClAccountInfoMapper plmsClAccountInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClAccountInfo, Long> getDao() {
        return plmsClAccountInfoMapper;
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsClAccountInfoExample example) {
        return plmsClAccountInfoMapper.countByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClAccountInfo> selectByExampleAndPage(Page<PlmsClAccountInfo> page, PlmsClAccountInfoExample example) {
        plmsClAccountInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的流水信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsClAccountInfo> findMfbmsAccountByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsClAccountInfoMapper.findMfbmsAccountByDocnoList(docnoList);
    }

}