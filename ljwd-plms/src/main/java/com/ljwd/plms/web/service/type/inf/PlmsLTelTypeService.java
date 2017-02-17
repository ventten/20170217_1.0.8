package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.PlmsLTelType;
import com.ljwd.plms.web.model.type.PlmsLTelTypeExample;

import java.util.List;

/**
 * 号码类型,plms_l_tel_type
 * */
public interface PlmsLTelTypeService extends GenericService<PlmsLTelType,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLTelType> selectByExample(PlmsLTelTypeExample example);

}