package com.ljwd.plms.web.service.case_management.inf;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAlloc;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectAllocExample;

public interface PlmsLaCollectAllocService extends GenericService<PlmsLaCollectAlloc, Long> {

    List<PlmsLaCollectAlloc> selectByExample(PlmsLaCollectAllocExample example);
    
	void insertBatch(List<PlmsLaCollectAlloc> list);
	
	void updateBatch(List<PlmsLaCollectAlloc> list);

	/**
	* @Description: 根据条件查询最新的分配记录
	* @param map
	* @return List<PlmsLaCollectAlloc>
	 */
	List<PlmsLaCollectAlloc> selectMaxDateByMap(Map<String,Object> map);

	/**
	* @Description: 根据借款ID查询有效的未结束的最新的分配记录
	* @param applId 借款ID
	* @return 实体
	 */
	PlmsLaCollectAlloc selectMaxAllocByApplId(Long applId);

	/**
	 * 提前移交或委外审核通过、委外结案时结束催收员
	 * @param paymentIds 放款IDS
	 * @param userId 操作人
	 * @param time 操作时间
	 */
	void saveEendAlloc(List<Long> paymentIds,String userId,Date time);

}
