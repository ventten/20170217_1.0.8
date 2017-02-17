package com.ljwd.plms.web.service.outVisit.inf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;

public interface PlmsOvmOutVisitAreaService extends GenericService<PlmsOvmOutVisitArea,Long>{

	List<PlmsOvmOutVisitArea> selectByExample(PlmsOvmOutVisitAreaExample example);
	
	 /**
     * 
    * @Description:   根据userId查找所属区域的编号  
    * @param userId
    * @return
    * @return String
     */
    String searchAreaCodeByUserId(String userId);
}
