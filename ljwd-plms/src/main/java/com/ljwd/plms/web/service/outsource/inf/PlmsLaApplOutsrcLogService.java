package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLog;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLogExample;
import com.ljwd.plms.web.vo.outsource.OutsrcLogPageDto;
import com.ljwd.plms.web.vo.outsource.OutsrcLogPageExample;

import java.util.List;

/**
 * Created by zhengzw on 2016/11/11
 * 委外申请操作日志表,PLMS_LA_APPL_OUTSRC_LOG
 */
public interface PlmsLaApplOutsrcLogService extends GenericService<PlmsLaApplOutsrcLog,Long> {

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsLaApplOutsrcLogExample example);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsLaApplOutsrcLog> selectByExample(PlmsLaApplOutsrcLogExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<OutsrcLogPageDto> selectByExampleAndPage(Page<OutsrcLogPageDto> page, OutsrcLogPageExample example);

}
