package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.PlmsLAddressType;
import com.ljwd.plms.web.model.type.PlmsLAddressTypeExample;

import java.util.List;

/**
 * 地址类型,plms_l_address_type
 * */
public interface PlmsLAddressTypeService extends GenericService<PlmsLAddressType,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLAddressType> selectByExample(PlmsLAddressTypeExample example);

}