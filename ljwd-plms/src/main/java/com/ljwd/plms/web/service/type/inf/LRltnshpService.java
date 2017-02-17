package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.LRltnshp;
import com.ljwd.plms.web.model.type.LRltnshpExample;

import java.util.List;

/**
 * 客户亲属关系,l_rltnshp
 * */
public interface LRltnshpService extends GenericService<LRltnshp,String> {

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<LRltnshp> selectByExample(LRltnshpExample example);

}