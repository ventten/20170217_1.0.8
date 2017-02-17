package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComLog;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComLogExample;

import java.util.List;

/**
 * 委外机构沟通日志,PLMS_OUTSRC_COM_LOG
 * */
public interface PlmsOutsrcComLogService extends GenericService<PlmsOutsrcComLog,Long> {

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsOutsrcComLog> selectByExampleAndPage(Page<PlmsOutsrcComLog> page, PlmsOutsrcComLogExample example);

}
