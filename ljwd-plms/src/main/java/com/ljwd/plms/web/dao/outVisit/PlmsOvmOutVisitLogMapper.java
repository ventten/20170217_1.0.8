package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLogExample;
import com.ljwd.plms.web.vo.outVisit.OutVisitLogParamDto;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsOvmOutVisitLogMapper extends GenericDao<PlmsOvmOutVisitLog,Long>{
    int countByExample(PlmsOvmOutVisitLogExample example);

    int deleteByExample(PlmsOvmOutVisitLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOvmOutVisitLog record);

    int insertSelective(PlmsOvmOutVisitLog record);

    List<PlmsOvmOutVisitLog> selectByExample(PlmsOvmOutVisitLogExample example);

    PlmsOvmOutVisitLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOvmOutVisitLog record, @Param("example") PlmsOvmOutVisitLogExample example);

    int updateByExample(@Param("record") PlmsOvmOutVisitLog record, @Param("example") PlmsOvmOutVisitLogExample example);

    int updateByPrimaryKeySelective(PlmsOvmOutVisitLog record);

    int updateByPrimaryKey(PlmsOvmOutVisitLog record);
    
    /**
	 * 
	* @Description: 外访日志分页
	* @param pageData
	* @param example
	* @return
	* @return Page<PlmsOvmOutVisitLog>
	 */
	 List<PlmsOvmOutVisitLog>  selectByExampleAndPage(Page<PlmsOvmOutVisitLog> pageData, OutVisitLogParamDto example);
}