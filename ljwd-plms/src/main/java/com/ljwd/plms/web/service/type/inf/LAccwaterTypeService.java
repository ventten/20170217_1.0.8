package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.LAccwaterType;
import com.ljwd.plms.web.model.type.LAccwaterTypeExample;

import java.util.List;

/**
 * 账户流水类型,l_accwater_type
 * */
public interface LAccwaterTypeService extends GenericService<LAccwaterType,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<LAccwaterType> selectByExample(LAccwaterTypeExample example);

}