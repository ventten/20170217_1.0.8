package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsClAssetsInfo;
import com.ljwd.plms.web.model.cust.PlmsClAssetsInfoExample;

/**
 * 客户其它资产信息,plms_cl_assets_info
 * */
public interface PlmsClAssetsInfoService extends GenericService<PlmsClAssetsInfo,Long> {

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsClAssetsInfo> selectByExampleAndPage(Page<PlmsClAssetsInfo> page, PlmsClAssetsInfoExample example);

}