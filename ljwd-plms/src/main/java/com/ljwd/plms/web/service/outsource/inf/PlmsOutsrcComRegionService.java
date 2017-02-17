package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComRegion;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComRegionExample;
import com.ljwd.plms.web.vo.outsource.SiteRegionDto;

import java.util.List;

/**
 * 委外机构辐射区域表,PLMS_OUTSRC_COM_REGION
 * */
public interface PlmsOutsrcComRegionService extends GenericService<PlmsOutsrcComRegion,Long> {

    /**
     * 查找网点区域
     * */
    List<SiteRegionDto> selectSiteRegion();

    /**
     * 根据条件删除
     * @param example 条件
     * @return 删除记录数
     */
    int deleteByExample(PlmsOutsrcComRegionExample example);

}
