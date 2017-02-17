package com.ljwd.plms.web.service.workorder_pool.inf;

import java.util.List;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRule;
import com.ljwd.plms.web.model.workorder_pool.PlmsLAssignRuleExample;

public interface PlmsLAssignRuleService extends GenericService<PlmsLAssignRule, String> {

	List<PlmsLAssignRule> selectByExample(PlmsLAssignRuleExample example);

}
