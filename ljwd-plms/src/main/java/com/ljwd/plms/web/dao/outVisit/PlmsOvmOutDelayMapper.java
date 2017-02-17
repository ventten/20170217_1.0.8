package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelay;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayExample;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitDelayResult;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PlmsOvmOutDelayMapper extends GenericDao<PlmsOvmOutDelay,Long>{
    int countByExample(PlmsOvmOutDelayExample example);

    int deleteByExample(PlmsOvmOutDelayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOvmOutDelay record);

    int insertSelective(PlmsOvmOutDelay record);

    List<PlmsOvmOutDelay> selectByExample(PlmsOvmOutDelayExample example);

    PlmsOvmOutDelay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOvmOutDelay record, @Param("example") PlmsOvmOutDelayExample example);

    int updateByExample(@Param("record") PlmsOvmOutDelay record, @Param("example") PlmsOvmOutDelayExample example);

    int updateByPrimaryKeySelective(PlmsOvmOutDelay record);

    int updateByPrimaryKey(PlmsOvmOutDelay record);
    
    List<PlmsOvmOutDelay> searchDelayByInfoId(Map<String,Object> map);
    
    /**
	 * 
	* @Description: 外访延期分页 
	* @param pageData
	* @param example
	* @return
	* @return Page<OutVisitDelayResult>
	 */
	List<OutVisitDelayResult> selectDelayByExampleAndPage(
			Page<OutVisitDelayResult> pageData, OutVisitDelayParamDto example);

}