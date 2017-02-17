package com.ljwd.plms.mapp.dao.map;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.mapp.model.PlmsAppMapPoint;
import com.ljwd.plms.web.vo.outVisit.OutVisitMapDisplayParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteParamDto;
import com.ljwd.plms.web.vo.outVisit.PlmsAppMapPointResult;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 位置信息
 * Created by tangjialin on 2016-10-13 0013.
 */
public interface MapPointMapper extends GenericDao<PlmsAppMapPoint, Long> {
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
    List<PlmsAppMapPoint> selectByCreatedUser(@Param("userId") String userId);
    
    /**
     * 
    * @Description: 根据外访员和外访日期查询外访路线
    * @param example
    * @return
    * @return List<PlmsAppMapPoint>
     */
    List<PlmsAppMapPointResult> selectByOutVisitRouteParamDto(OutVisitMapDisplayParamDto example);
}
