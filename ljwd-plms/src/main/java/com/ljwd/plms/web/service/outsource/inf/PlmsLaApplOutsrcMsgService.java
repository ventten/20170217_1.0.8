package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsgExample;

import java.util.List;

/**
 * Created by zhengzw on 2016/11/15
 * 委外申请同步记录表,PLMS_LA_APPL_OUTSRC_MSG
 */
public interface PlmsLaApplOutsrcMsgService extends GenericService<PlmsLaApplOutsrcMsg,Long>{

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsLaApplOutsrcMsg> selectByExample(PlmsLaApplOutsrcMsgExample example);

}
