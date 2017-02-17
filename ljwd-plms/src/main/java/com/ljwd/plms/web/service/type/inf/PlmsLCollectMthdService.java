package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.PlmsLCollectMthd;
import com.ljwd.plms.web.model.type.PlmsLCollectMthdExample;

import java.util.List;

/**
 * 催收类型,PLMS_L_COLLECT_MTHD
 * */
public interface PlmsLCollectMthdService extends GenericService<PlmsLCollectMthd,String>{

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLCollectMthd> selectByExample(PlmsLCollectMthdExample example);

}
