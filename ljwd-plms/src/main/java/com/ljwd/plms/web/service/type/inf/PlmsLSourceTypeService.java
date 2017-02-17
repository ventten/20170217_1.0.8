package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.PlmsLSourceType;
import com.ljwd.plms.web.model.type.PlmsLSourceTypeExample;

import java.util.List;

/**
 * 来源类型,plms_l_source_type
 * */
public interface PlmsLSourceTypeService extends GenericService<PlmsLSourceType,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLSourceType> selectByExample(PlmsLSourceTypeExample example);

}