package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComLog;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 委外机构沟通日志,PLMS_OUTSRC_COM_LOG
 * */
public interface PlmsOutsrcComLogMapper extends GenericDao<PlmsOutsrcComLog,Long>{

    int countByExample(PlmsOutsrcComLogExample example);

    int deleteByExample(PlmsOutsrcComLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOutsrcComLog record);

    int insertSelective(PlmsOutsrcComLog record);

    List<PlmsOutsrcComLog> selectByExample(PlmsOutsrcComLogExample example);

    PlmsOutsrcComLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOutsrcComLog record, @Param("example") PlmsOutsrcComLogExample example);

    int updateByExample(@Param("record") PlmsOutsrcComLog record, @Param("example") PlmsOutsrcComLogExample example);

    int updateByPrimaryKeySelective(PlmsOutsrcComLog record);

    int updateByPrimaryKey(PlmsOutsrcComLog record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsOutsrcComLog> selectByExampleAndPage(Page<PlmsOutsrcComLog> page, PlmsOutsrcComLogExample example);

}