package com.ljwd.plms.mapp.service.map.impl;

import com.ljwd.plms.mapp.dao.map.MapPointMapper;
import com.ljwd.plms.mapp.model.PlmsAppMapPoint;
import com.ljwd.plms.mapp.service.map.inf.MapPointService;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitMapDisplayParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteParamDto;
import com.ljwd.plms.web.vo.outVisit.PlmsAppMapPointResult;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 位置信息
 * Created by tangjialin on 2016-10-13 0013.
 */
@Service
public class MapPointServiceImpl implements MapPointService {
	@Resource
	private MapPointMapper mapPointMapper;

	@Override
	public int insert(PlmsAppMapPoint plmsAppMapPoint) {
		return 0;
	}

	@Override
	public int update(PlmsAppMapPoint plmsAppMapPoint) {
		return 0;
	}

	@Override
	public int delete(Long id) {
		return 0;
	}

	@Override
	public PlmsAppMapPoint selectById(Long id) {
		return null;
	}

	@Override
	public PlmsAppMapPoint selectOne() {
		return null;
	}

	@Override
	public List<PlmsAppMapPoint> selectList() {
		return null;
	}

	@Override
	public void insertBatch(List<PlmsAppMapPoint> list) {
		mapPointMapper.insertBatch(list);
	}

	@Override
	public void updateBatch(List<PlmsAppMapPoint> list) {

	}
	/**
	 * 获取所有创建人信息
	 * TODO 仅测试使用
	 * @return
	 */
	@Override
	public List<String> selectAllGroup() {
		return mapPointMapper.selectAllGroup();
	}
	/**
	 * 获取创建人所有坐标信息
	 * TODO 仅测试使用
	 * @return
	 */
    @Override
    public List<PlmsAppMapPoint> selectByCreatedUser(String userId) {
		return mapPointMapper.selectByCreatedUser(userId);
    }

    /**
     * 
    * @Description: 根据外访员和外访日期查询外访路线
    * @param example
    * @return
    * @return List<PlmsAppMapPointResult>
     */
	@Override
	public Map<Integer,List<PlmsAppMapPointResult>> selectByOutVisitRouteParamDto(
			OutVisitMapDisplayParamDto example) {
		Map<Integer,List<PlmsAppMapPointResult>>  ListMap = new HashMap<Integer,List<PlmsAppMapPointResult>>();

		List<PlmsAppMapPointResult>  mapList = mapPointMapper.selectByOutVisitRouteParamDto(example);
	
		List<Integer> upperIndex = new ArrayList<Integer>();
		List<Integer> buttomIndex = new ArrayList<Integer>();

		//签到开始的点的个数
		if(mapList!= null &&mapList.size()>0){
			for(int i=0;i<mapList.size();i++){
				if(mapList.get(i).getOptions()!=null&&mapList.get(i).getOptions().intValue()==2){
					upperIndex.add(i);
				}else if(mapList.get(i).getOptions()!=null&&mapList.get(i).getOptions().intValue()==3){
					buttomIndex.add(i+1);
				}
			}
			
		}
		
		if(upperIndex!=null&&buttomIndex!=null){
			if(upperIndex.size()==buttomIndex.size()){
				for(int i=0;i<upperIndex.size();i++){
					List<PlmsAppMapPointResult> listSub = mapList.subList(upperIndex.get(i), buttomIndex.get(i));
					ListMap.put(i, listSub);
				}
			}else{
				System.out.println("起点和终点个数不匹配");
				
			}
		}
		
		return ListMap;
	
	}
}
