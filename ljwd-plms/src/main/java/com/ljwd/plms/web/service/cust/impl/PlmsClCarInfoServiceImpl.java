package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsClCarInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClCarInfo;
import com.ljwd.plms.web.model.cust.PlmsClCarInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsClCarInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户车辆信息,plms_cl_car_info
 * */
@Service
public class PlmsClCarInfoServiceImpl extends GenericServiceImpl<PlmsClCarInfo,Long> implements PlmsClCarInfoService {

    @Resource
    private PlmsClCarInfoMapper plmsClCarInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClCarInfo, Long> getDao() {
        return plmsClCarInfoMapper;
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsClCarInfoExample example) {
        return plmsClCarInfoMapper.countByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClCarInfo> selectByExampleAndPage(Page<PlmsClCarInfo> page, PlmsClCarInfoExample example) {
        plmsClCarInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的车辆信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsClCarInfo> findMfbmsCarByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsClCarInfoMapper.findMfbmsCarByDocnoList(docnoList);
    }

}