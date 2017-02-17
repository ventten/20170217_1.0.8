package com.ljwd.plms.web.service.outVisit.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.vo.outVisit.OutVisitLogParamDto;
import com.ljwd.plms.web.vo.outsource.OutsrcLogPageDto;

public interface PlmsOvmOutVisitLogService extends GenericService<PlmsOvmOutVisitLog, Long> {

	/**
	 * 
	* @Description: 外访日志分页
	* @param pageData
	* @param example
	* @return
	* @return Page<PlmsOvmOutVisitLog>
	 */
	 Page<PlmsOvmOutVisitLog>  selectByExampleAndPage(Page<PlmsOvmOutVisitLog> pageData, OutVisitLogParamDto example);
}
