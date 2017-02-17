package com.ljwd.plms.web.service.case_management.inf;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgent;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAgentExample;


public interface PlmsLaCollectAgentService extends GenericService<PlmsLaCollectAgent, Long> {
    
//	List<PlmsLaCollectAgent> selectByExample(PlmsLaCollectAgentExample example);
	
	List<PlmsLaCollectAgent> selectByExample2(Map<String,Object> map);


	void updateBatch(List<PlmsLaCollectAgent> list);
	
	void insertBatch(List<PlmsLaCollectAgent> list);

	/**
	 * 提前移交或委外审核通过、委外结案时结束代理催收员
	 * @param paymentIds 放款IDS
	 * @param userId 操作人
	 * @param time 操作时间
	 */
	void saveEndAgent(List<Long> paymentIds,String userId,Date time);

}
