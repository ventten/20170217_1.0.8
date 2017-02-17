package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsClUnitInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClUnitInfo;
import com.ljwd.plms.web.model.cust.PlmsClUnitInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsClUnitInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 客户单位信息,plms_cl_unit_info
 * */
@Service
public class PlmsClUnitInfoServiceImpl extends GenericServiceImpl<PlmsClUnitInfo,Long> implements PlmsClUnitInfoService {

    @Resource
    private PlmsClUnitInfoMapper plmsClUnitInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClUnitInfo, Long> getDao() {
        return plmsClUnitInfoMapper;
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsClUnitInfoExample example) {
        return plmsClUnitInfoMapper.countByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClUnitInfo> selectByExampleAndPage(Page<PlmsClUnitInfo> page, PlmsClUnitInfoExample example) {
        plmsClUnitInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的单位信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsClUnitInfo> findMfbmsUnitByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.isEmpty()){
            return null;
        }
        return plmsClUnitInfoMapper.findMfbmsUnitByDocnoList(docnoList);
    }

	@Override
	public PlmsClUnitInfo selectByPrimaryKey(Long id) {
		return plmsClUnitInfoMapper.selectByPrimaryKey(id);
	}

}