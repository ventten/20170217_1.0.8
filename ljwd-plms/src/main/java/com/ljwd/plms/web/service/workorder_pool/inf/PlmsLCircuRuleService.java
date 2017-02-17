package com.ljwd.plms.web.service.workorder_pool.inf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.workorder_pool.PlmsCircuRuleSet;
import com.ljwd.plms.web.model.workorder_pool.PlmsLCircuRule;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCircuRuleDto;

public interface PlmsLCircuRuleService extends GenericService<PlmsLCircuRule, String> {

	List<PlmsCircuRuleDto> selectListByExample();

	PlmsCircuRuleDto selectDtoById(Long id);
	
	PlmsLCircuRule selectByCode(String code);
	
	
}
