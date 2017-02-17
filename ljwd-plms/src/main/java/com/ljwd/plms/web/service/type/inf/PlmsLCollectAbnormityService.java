package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.PlmsLCollectAbnormity;
import com.ljwd.plms.web.model.type.PlmsLCollectAbnormityExample;

import java.util.List;

/**
 * 个案情况,PLMS_L_COLLECT_ABNORMITY
 * */
public interface PlmsLCollectAbnormityService extends GenericService<PlmsLCollectAbnormity,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLCollectAbnormity> selectByExample(PlmsLCollectAbnormityExample example);

}
