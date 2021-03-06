package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.PlmsLAnnexType;
import com.ljwd.plms.web.model.type.PlmsLAnnexTypeExample;

import java.util.List;

/**
 * 附件类型,PLMS_L_ANNEX_TYPE
 * */
public interface PlmsLAnnexTypeService extends GenericService<PlmsLAnnexType,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLAnnexType> selectByExample(PlmsLAnnexTypeExample example);

}