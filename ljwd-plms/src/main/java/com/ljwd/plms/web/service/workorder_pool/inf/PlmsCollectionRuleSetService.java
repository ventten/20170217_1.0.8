package com.ljwd.plms.web.service.workorder_pool.inf;


import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.vo.workorder_pool.CollectionCircuDto;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCollectionRuleSetDto;

public interface PlmsCollectionRuleSetService extends GenericService<PlmsCollectionRuleSet, Long> {
	
	int updateCheckExit(PlmsCollectionRuleSet set);
	
	List<PlmsCollectionRuleSetDto> selectDtoList();
	
	List<PlmsCollectionRuleSetDto> selectworkOrderPoolRulesList();

	/**
	* @Description: 根据流转规则查询区间状态(单个)
	* @param code 流转规则code
	* @return PlmsCollectionRuleSet
	 */
	PlmsCollectionRuleSet selectByCircuCode(String code);

	/**
	* @Description: 根据流转规则查询区间状态值
	* @param code 流转规则code
	* @return 区间状态值
	 */
    String selectStatusByCircuCode(String code);

	
	List<PlmsCollectionRuleSet> selectByExampleList(PlmsCollectionRuleSetExample example);

	//验证流转规则唯一性
	String checkcircuRule(String circuRule);
	
	 /**
    * @Description: 具有上限并具有下限的区间
    * @return List<PlmsCollectionRuleSetDto>
     */
    List<PlmsCollectionRuleSetDto> hasOverduedaysScope();
	
    /**
	* @Description: 根据用户id查找此用户的数据区间
	* @param userId
	* @return List<PlmsCollectionRuleSet>
	 */
	List<PlmsCollectionRuleSet> selectScopeByUserId(String userId);

    /**
     * @Description: 查找有效的区间且流转规则overduedays_from不为空的数据
     * @return List<PlmsCollectionRuleSet>
     */
    List<CollectionCircuDto> selectCollectionCircu(Map<String, Object> map);

}
