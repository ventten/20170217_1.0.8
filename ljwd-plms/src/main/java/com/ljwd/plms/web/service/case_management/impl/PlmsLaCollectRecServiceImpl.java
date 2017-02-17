package com.ljwd.plms.web.service.case_management.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_management.PlmsLaCollectRecMapper;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectRec;
import com.ljwd.plms.web.model.case_management.PlmsLaCollectRecExample;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectRecService;

@Service
public class PlmsLaCollectRecServiceImpl extends GenericServiceImpl<PlmsLaCollectRec, Long>
		implements PlmsLaCollectRecService {
	@Resource
	private PlmsLaCollectRecMapper plmsLaCollectRecMapper;

	@Override
	public void insertBatch(List<PlmsLaCollectRec> list) {
		if(list == null || list.isEmpty()) return;
		int comm = 2000;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsLaCollectRec> newList = new ArrayList<PlmsLaCollectRec>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsLaCollectRecMapper.insertBatch(newList);
					newList.clear();
					System.out.println("------------------插入条数："+(i+1));
				}else{
					newList.add(list.get(i));
				}
			}
		}else{
			plmsLaCollectRecMapper.insertBatch(list);
		}
	}

	@Override
	public GenericDao<PlmsLaCollectRec, Long> getDao() {
		return plmsLaCollectRecMapper;
	}

	@Override
	public List<PlmsLaCollectRec> selectByExample(
			PlmsLaCollectRecExample example) {
		return plmsLaCollectRecMapper.selectByExample(example);
	}

	/**
     * 
    * @Description: 一定时间段内某区间的回收案件 
    * @param map
    * @return
    * @return List<PlmsLaCollectRec>
     */
	@Override
	public List<PlmsLaCollectRec> selectByTime(Map<String, Object> map) {
		return plmsLaCollectRecMapper.selectByTime(map);
	}

}
