package com.ljwd.plms.web.dao.workorder_pool;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSetExample;
import com.ljwd.plms.web.vo.workorder_pool.CollectionCircuDto;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCollectionRuleSetDto;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PlmsCollectionRuleSetMapper extends GenericDao<PlmsCollectionRuleSet, Long>{

    int countByExample(PlmsCollectionRuleSetExample example);

    int deleteByExample(PlmsCollectionRuleSetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsCollectionRuleSet record);

    int insertSelective(PlmsCollectionRuleSet record);

    List<PlmsCollectionRuleSet> selectByExample(PlmsCollectionRuleSetExample example);

    PlmsCollectionRuleSet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsCollectionRuleSet record, @Param("example") PlmsCollectionRuleSetExample example);

    int updateByExample(@Param("record") PlmsCollectionRuleSet record, @Param("example") PlmsCollectionRuleSetExample example);

    int updateByPrimaryKeySelective(PlmsCollectionRuleSet record);

    int updateByPrimaryKey(PlmsCollectionRuleSet record);
    
    List<PlmsCollectionRuleSetDto> selectDtoList();

    /**
    * @Description: 查询有逾期天数限制（上限或下限）的区间 
    * @return List<PlmsCollectionRuleSetDto>
     */
    List<PlmsCollectionRuleSetDto> selectworkOrderPoolRulesList();
    
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
	List<PlmsCollectionRuleSet> selectScopeByUserId(@Param("userId")String userId);

    /**
	* @Description: 查找有效的区间且流转规则overduedays_from不为空的数据
	* @return List<PlmsCollectionRuleSet>
	 */
	List<CollectionCircuDto> selectCollectionCircu(Map<String, Object> map);

}