package com.ljwd.plms.web.service.job.inf;

/**
 * 外访过期,委外处理
 * <p>Title: PlmsOutVisitOverduedService</p>
 * @author pangshanxing
 * @date 2016年11月9日下午2:04:21
 */
public interface PlmsOutVisitOverduedService {

	/**
	 * 当前日期大于外访预计结案日期时，此外访状态为已过期
	 * 当前案件进入委外区间是，此外访状态为已委外
	* @Description: TODO 
	* @return void
	 */
	void updateOutVisitStatus();
}
