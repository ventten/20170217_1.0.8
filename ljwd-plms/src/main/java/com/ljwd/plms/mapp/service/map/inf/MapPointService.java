package com.ljwd.plms.mapp.service.map.inf;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.mapp.model.PlmsAppMapPoint;
import com.ljwd.plms.web.vo.outVisit.OutVisitMapDisplayParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteParamDto;
import com.ljwd.plms.web.vo.outVisit.PlmsAppMapPointResult;

import java.util.List;
import java.util.Map;

/**
 * 位置信息
 * Created by tangjialin on 2016-10-13 0013.
 */
public interface MapPointService extends GenericService<PlmsAppMapPoint, Long> {
    /**
     * 获取所有创建人信息
     * TODO 仅测试使用
     * @return
     */
    List<String> selectAllGroup();

    /**
     * 获取创建人所有坐标信息
     * TODO 仅测试使用
     * @return
     */
    List<PlmsAppMapPoint> selectByCreatedUser(String userId);
    /**
     * 
    * @Description: 根据外访员和外访日期查询外访路线
    * @param example
    * @return
    * @return List<PlmsAppMapPoint>
     */
    Map<Integer,List<PlmsAppMapPointResult>> selectByOutVisitRouteParamDto(OutVisitMapDisplayParamDto example);
}
