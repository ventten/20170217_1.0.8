package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLog;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLogExample;
import java.util.List;

import com.ljwd.plms.web.vo.outsource.OutsrcLogPageDto;
import com.ljwd.plms.web.vo.outsource.OutsrcLogPageExample;
import org.apache.ibatis.annotations.Param;

/**
 * 委外申请操作日志表,PLMS_LA_APPL_OUTSRC_LOG
 * */
public interface PlmsLaApplOutsrcLogMapper extends GenericDao<PlmsLaApplOutsrcLog,Long>{

    int countByExample(PlmsLaApplOutsrcLogExample example);

    int deleteByExample(PlmsLaApplOutsrcLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaApplOutsrcLog record);

    int insertSelective(PlmsLaApplOutsrcLog record);

    List<PlmsLaApplOutsrcLog> selectByExample(PlmsLaApplOutsrcLogExample example);

    PlmsLaApplOutsrcLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaApplOutsrcLog record, @Param("example") PlmsLaApplOutsrcLogExample example);

    int updateByExample(@Param("record") PlmsLaApplOutsrcLog record, @Param("example") PlmsLaApplOutsrcLogExample example);

    int updateByPrimaryKeySelective(PlmsLaApplOutsrcLog record);

    int updateByPrimaryKey(PlmsLaApplOutsrcLog record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<OutsrcLogPageDto> selectByExampleAndPage(Page<OutsrcLogPageDto> page, OutsrcLogPageExample example);

}