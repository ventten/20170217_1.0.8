package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLot;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLotExample;

import java.util.List;

/**
 * 委外申请批次表,PLMS_LA_APPL_OUTSRC_LOT
 * */
public interface PlmsLaApplOutsrcLotService extends GenericService<PlmsLaApplOutsrcLot,Long>{

    /**
     * 插入对象
     * @param plmsLaApplOutsrcLot 对象
     * @return 新纪录ID
     */
    public Long insertLot(PlmsLaApplOutsrcLot plmsLaApplOutsrcLot);

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsLaApplOutsrcLotExample example);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsLaApplOutsrcLot> selectByExample(PlmsLaApplOutsrcLotExample example);

}
