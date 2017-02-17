package com.ljwd.plms.web.service.sys_management.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsSysOutsrcRateMapper;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRate;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRateExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsSysOutsrcRateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 委外费率表,PLMS_SYS_OUTSRC_RATE
 * */
@Service
public class PlmsSysOutsrcRateServiceImpl extends GenericServiceImpl<PlmsSysOutsrcRate,Long> implements PlmsSysOutsrcRateService {

    @Resource
    private PlmsSysOutsrcRateMapper plmsSysOutsrcRateMapper;

    /**
     * 插入对象
     * @param outsrcRate 对象
     */
    @Override
    public int insert(PlmsSysOutsrcRate outsrcRate) {
        return plmsSysOutsrcRateMapper.insert(outsrcRate);
    }

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsSysOutsrcRate, Long> getDao() {
        return plmsSysOutsrcRateMapper;
    }

    /**
     * 根据查询条件计数
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsSysOutsrcRateExample example) {
        return plmsSysOutsrcRateMapper.countByExample(example);
    }

    /**
     * 根据查询条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsSysOutsrcRate> selectByExample(PlmsSysOutsrcRateExample example) {
        return plmsSysOutsrcRateMapper.selectByExample(example);
    }

    /**
     * 根据逾期天数查询有效的费率
     * @param overdueDays Page信息
     * @return 实体
     */
    @Override
    public PlmsSysOutsrcRate selectByOverdueDays(Long overdueDays) {
        if(overdueDays == null || overdueDays < 0){
            return null;
        }
        List<PlmsSysOutsrcRate> list = plmsSysOutsrcRateMapper.selectByOverdueDays(overdueDays);
        if(list == null || list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsSysOutsrcRate> selectByExampleAndPage(Page<PlmsSysOutsrcRate> page, PlmsSysOutsrcRateExample example) {
        plmsSysOutsrcRateMapper.selectByExampleAndPage(page,example);
        return page;
    }

}
