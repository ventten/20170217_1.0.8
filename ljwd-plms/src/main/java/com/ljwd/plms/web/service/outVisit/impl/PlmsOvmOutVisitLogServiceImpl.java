package com.ljwd.plms.web.service.outVisit.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitLogMapper;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitLogService;
import com.ljwd.plms.web.vo.outVisit.OutVisitLogParamDto;

@Service
public class PlmsOvmOutVisitLogServiceImpl extends
		GenericServiceImpl<PlmsOvmOutVisitLog, Long> implements PlmsOvmOutVisitLogService {

	@Resource
	private PlmsOvmOutVisitLogMapper plmsOvmOutVisitLogMapper;


	@Override
	public GenericDao<PlmsOvmOutVisitLog, Long> getDao() {
		return plmsOvmOutVisitLogMapper;
	}


	@Override
	public void insertBatch(List<PlmsOvmOutVisitLog> list) {
		if(list==null||list.size()==0){
			return;
		}
		int comm = 2000;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsOvmOutVisitLog> newList = new ArrayList<PlmsOvmOutVisitLog>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsOvmOutVisitLogMapper.insertBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}
		}else{
			plmsOvmOutVisitLogMapper.insertBatch(list);
		}
	}


	/**
	 * 
	* @Description: 外访日志分页
	* @param pageData
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<PlmsOvmOutVisitLog> selectByExampleAndPage(
			Page<PlmsOvmOutVisitLog> pageData, OutVisitLogParamDto example) {
		plmsOvmOutVisitLogMapper.selectByExampleAndPage(pageData, example);
		return pageData;
	}


}
