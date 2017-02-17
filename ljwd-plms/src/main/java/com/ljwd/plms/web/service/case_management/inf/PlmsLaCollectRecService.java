package com.ljwd.plms.web.service.case_management.inf;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectRec;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectRecExample;

public interface PlmsLaCollectRecService extends GenericService<PlmsLaCollectRec, Long> {
	
	void insertBatch(List<PlmsLaCollectRec> list);

    List<PlmsLaCollectRec> selectByExample(PlmsLaCollectRecExample example);
    /**
     * 
    * @Description: 一定时间段内某区间的回收案件 
    * @param map
    * @return
    * @return List<PlmsLaCollectRec>
     */
    List<PlmsLaCollectRec> selectByTime(Map<String,Object> map);
}
