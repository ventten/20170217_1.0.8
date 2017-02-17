package com.ljwd.plms.web.service.type.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.type.PlmsLCollectControl;
import com.ljwd.plms.web.model.type.PlmsLCollectControlExample;

import java.util.List;

/**
 * Created by zhengzw on 2016/8/3
 * 控管状态,PLMS_L_COLLECT_CONTROL
 */
public interface PlmsLCollectControlService extends GenericService<PlmsLCollectControl,String>{

    /**
     * 根据查询条件查找
     * @param example 查询条件
     * @return 集合
     * */
    List<PlmsLCollectControl> selectByExample(PlmsLCollectControlExample example);

}
