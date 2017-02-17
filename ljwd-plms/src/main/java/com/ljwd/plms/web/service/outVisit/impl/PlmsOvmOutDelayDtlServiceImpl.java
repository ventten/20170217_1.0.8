package com.ljwd.plms.web.service.outVisit.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutDelayDtlMapper;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutDelayDtl;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutDelayDtlService;
@Service
public class PlmsOvmOutDelayDtlServiceImpl extends
		GenericServiceImpl<PlmsOvmOutDelayDtl, Long> implements PlmsOvmOutDelayDtlService {

	@Resource
	private PlmsOvmOutDelayDtlMapper plmsOvmOutDelayDtlMapper;

	@Override
	public GenericDao<PlmsOvmOutDelayDtl, Long> getDao() {

		return plmsOvmOutDelayDtlMapper;
	}
	
	
	@Override
	public void updateBatch(List<PlmsOvmOutDelayDtl> list) {
		if(list == null || list.isEmpty()){
            return;
        }
		int comm = 2000;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsOvmOutDelayDtl> newList = new ArrayList<PlmsOvmOutDelayDtl>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsOvmOutDelayDtlMapper.updateBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}	
		}else{
			plmsOvmOutDelayDtlMapper.updateBatch(list);
		}

	}


	
}
