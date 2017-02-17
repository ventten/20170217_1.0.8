package com.ljwd.plms.web.service.workorder_pool.inf;

import java.util.List;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.workorder_pool.PlmsLProtectRule;
import com.ljwd.plms.web.vo.workorder_pool.PlmsCircuRuleDto;
import com.ljwd.plms.web.vo.workorder_pool.PlmsProtectRuleDto;

public interface PlmsLProtectRuleService extends GenericService<PlmsLProtectRule, String> {
   
	List<PlmsProtectRuleDto> selectDtoList();
	
	PlmsProtectRuleDto selectDtoById(Long id);

	
}
