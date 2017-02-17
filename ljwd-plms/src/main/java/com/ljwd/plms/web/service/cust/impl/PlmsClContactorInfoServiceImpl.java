package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsClContactorInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfo;
import com.ljwd.plms.web.model.cust.PlmsClContactorInfoExample;
import com.ljwd.plms.web.model.cust.PlmsLnPolyInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsClContactorInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户联系人信息,plms_cl_contactor_info
 * */
@Service
public class PlmsClContactorInfoServiceImpl extends GenericServiceImpl<PlmsClContactorInfo,Long> implements PlmsClContactorInfoService {

    @Resource
    private PlmsClContactorInfoMapper plmsClContactorInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClContactorInfo, Long> getDao() {
        return plmsClContactorInfoMapper;
    }

    /**
     * 插入对象
     * @param plmsClContactorInfo 对象
     */
    @Override
    public int insert(PlmsClContactorInfo plmsClContactorInfo) {
        return plmsClContactorInfoMapper.insert(plmsClContactorInfo);
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsClContactorInfoExample example) {
        return plmsClContactorInfoMapper.countByExample(example);
    }

    /**
     * 条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsClContactorInfo> selectByExample(PlmsClContactorInfoExample example) {
        return plmsClContactorInfoMapper.selectByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClContactorInfo> selectByExampleAndPage(Page<PlmsClContactorInfo> page, PlmsClContactorInfoExample example) {
        plmsClContactorInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的联系人信息(从电核表取数)
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsClContactorInfo> findMfbmsContactorByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsClContactorInfoMapper.findMfbmsContactorByDocnoList(docnoList);
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的联系人信息(从客户信息、职业信息、联系人信息表取数)
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsClContactorInfo> findMfbmsContactorByDocnoList2(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsClContactorInfoMapper.findMfbmsContactorByDocnoList2(docnoList);
    }

}