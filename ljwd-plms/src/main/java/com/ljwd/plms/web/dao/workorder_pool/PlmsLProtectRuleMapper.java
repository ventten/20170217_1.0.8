package com.ljwd.plms.web.dao.workorder_pool;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.workorder_pool.PlmsLProtectRule;
import com.ljwd.plms.web.model.workorder_pool.PlmsLProtectRuleExample;
import com.ljwd.plms.web.vo.workorder_pool.PlmsProtectRuleDto;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsLProtectRuleMapper extends GenericDao<PlmsLProtectRule, String>{
    int countByExample(PlmsLProtectRuleExample example);

    int deleteByExample(PlmsLProtectRuleExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLProtectRule record);

    int insertSelective(PlmsLProtectRule record);

    List<PlmsLProtectRule> selectByExample(PlmsLProtectRuleExample example);

    PlmsLProtectRule selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLProtectRule record, @Param("example") PlmsLProtectRuleExample example);

    int updateByExample(@Param("record") PlmsLProtectRule record, @Param("example") PlmsLProtectRuleExample example);

    int updateByPrimaryKeySelective(PlmsLProtectRule record);

    int updateByPrimaryKey(PlmsLProtectRule record);
    
	public List<PlmsProtectRuleDto> selectDtoList();
	
	PlmsProtectRuleDto selectDtoById(@Param("id")Long id );
	

}