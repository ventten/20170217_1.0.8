package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLot;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLotExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 委外申请批次表,PLMS_LA_APPL_OUTSRC_LOT
 * */
public interface PlmsLaApplOutsrcLotMapper extends GenericDao<PlmsLaApplOutsrcLot,Long>{

    int countByExample(PlmsLaApplOutsrcLotExample example);

    int deleteByExample(PlmsLaApplOutsrcLotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaApplOutsrcLot record);

    int insertSelective(PlmsLaApplOutsrcLot record);

    List<PlmsLaApplOutsrcLot> selectByExample(PlmsLaApplOutsrcLotExample example);

    PlmsLaApplOutsrcLot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaApplOutsrcLot record, @Param("example") PlmsLaApplOutsrcLotExample example);

    int updateByExample(@Param("record") PlmsLaApplOutsrcLot record, @Param("example") PlmsLaApplOutsrcLotExample example);

    int updateByPrimaryKeySelective(PlmsLaApplOutsrcLot record);

    int updateByPrimaryKey(PlmsLaApplOutsrcLot record);

}