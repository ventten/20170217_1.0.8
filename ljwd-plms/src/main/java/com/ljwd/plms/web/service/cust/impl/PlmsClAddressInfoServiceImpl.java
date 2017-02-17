package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsClAddressInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfo;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfoExample;
import com.ljwd.plms.web.model.cust.SysAdministrativeRegion;
import com.ljwd.plms.web.service.cust.inf.PlmsClAddressInfoService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 客户地址信息,plms_cl_address_info
 * */
@Service
public class PlmsClAddressInfoServiceImpl extends GenericServiceImpl<PlmsClAddressInfo,Long> implements PlmsClAddressInfoService {

    @Resource
    private PlmsClAddressInfoMapper plmsClAddressInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsClAddressInfo, Long> getDao() {
        return plmsClAddressInfoMapper;
    }

    /**
     * 插入对象
     * @param plmsClAddressInfo 对象
     */
    @Override
    public int insert(PlmsClAddressInfo plmsClAddressInfo) {
        return plmsClAddressInfoMapper.insert(plmsClAddressInfo);
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsClAddressInfoExample example) {
        return plmsClAddressInfoMapper.countByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsClAddressInfo> selectByExampleAndPage(Page<PlmsClAddressInfo> page, PlmsClAddressInfoExample example) {
        plmsClAddressInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的地址信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsClAddressInfo> findMfbmsAddressByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsClAddressInfoMapper.findMfbmsAddressByDocnoList(docnoList);
    }

    /**
     * 查询行政区域
     * @param id 记录ID
     * @param pid 上级ID
     * @param rlevel 层级ID
     * @return 实体集
     */
    @Override
    @Cacheable(value="typeCache", key="'PlmsClAddressInfoService_findAddressByMore_' + #id + '_' + #pid + '_' + #rlevel")
	public List<SysAdministrativeRegion> findAddressByMore(Long id, Long pid,String rlevel) {
		return plmsClAddressInfoMapper.findAddressByMore(id,pid,rlevel);
	}

    /**
     * 通过行政区域ID查询行政区域
     * @param id 行政区域ID
     * @return SysAdministrativeRegion
     */
	@Override
    @Cacheable(value="typeCache", key="'PlmsClAddressInfoService_findAddreNameById_' + #id")
	public SysAdministrativeRegion findAddreNameById(Long id) {
        if(id == null){
            return null;
        }
		return plmsClAddressInfoMapper.findAddreNameById(id);
	}

	@Override
	public PlmsClAddressInfo findAddressDataOneById(Long id) {
		return plmsClAddressInfoMapper.findAddressDataOneById(id);
	}

	@Override
	public int updateByPrimaryKey(PlmsClAddressInfo record) {
		return plmsClAddressInfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public int selectPlmsClAddressInfoCount(PlmsClAddressInfo record) {
		return plmsClAddressInfoMapper.selectPlmsClAddressInfoCount(record);
	}

}