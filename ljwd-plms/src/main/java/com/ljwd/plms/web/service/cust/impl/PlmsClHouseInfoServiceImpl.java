package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsClHouseInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClHouseInfo;
import com.ljwd.plms.web.model.cust.PlmsClHouseInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsClHouseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户房产信息,plms_cl_house_info
 * */
@Service
public class PlmsClHouseInfoServiceImpl extends GenericServiceImpl<PlmsClHouseInfo,Long> implements PlmsClHouseInfoService {

    @Resource
    private PlmsClHouseInfoMapper plmsClHouseInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClHouseInfo, Long> getDao() {
        return plmsClHouseInfoMapper;
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsClHouseInfoExample example) {
        return plmsClHouseInfoMapper.countByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClHouseInfo> selectByExampleAndPage(Page<PlmsClHouseInfo> page, PlmsClHouseInfoExample example) {
        plmsClHouseInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的房产信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsClHouseInfo> findMfbmsHouseByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsClHouseInfoMapper.findMfbmsHouseByDocnoList(docnoList);
    }

}