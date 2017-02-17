package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outsource.PlmsOutsrcComRegionMapper;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComRegion;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComRegionExample;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComRegionService;
import com.ljwd.plms.web.vo.outsource.SiteRegionDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 委外机构辐射区域表,PLMS_OUTSRC_COM_REGION
 * */
@Service
public class PlmsOutsrcComRegionServiceImpl extends GenericServiceImpl<PlmsOutsrcComRegion,Long> implements PlmsOutsrcComRegionService {

    @Resource
    private PlmsOutsrcComRegionMapper plmsOutsrcComRegionMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsOutsrcComRegion, Long> getDao() {
        return plmsOutsrcComRegionMapper;
    }

    /**
     * 查找网点区域
     */
    @Override
    public List<SiteRegionDto> selectSiteRegion() {
        return plmsOutsrcComRegionMapper.selectSiteRegion();
    }

    /**
     * 根据条件删除
     * @param example 条件
     * @return 删除记录数
     */
    @Override
    public int deleteByExample(PlmsOutsrcComRegionExample example) {
        return plmsOutsrcComRegionMapper.deleteByExample(example);
    }

}
