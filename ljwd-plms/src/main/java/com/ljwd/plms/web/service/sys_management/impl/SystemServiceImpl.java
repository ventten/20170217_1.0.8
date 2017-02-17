package com.ljwd.plms.web.service.sys_management.impl;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.dao.sys_management.SystemMapper;
import com.ljwd.plms.web.service.sys_management.inf.SystemService;
import com.ljwd.plms.web.vo.sys_management.HolidayDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/26
 * 查询微贷系统相关配置的Service
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Resource
    private SystemMapper systemMapper;

    /**
     * 查找下一个工作日
     * @return 下一个工作日
     */
    @Override
    public Date selectNextWorkDay() {
        //查找大于等于系统时间的节假日
        List<HolidayDto> holidayList = systemMapper.selectHoliday();
        //工作日集合
        List<Date> workDayList = new ArrayList<Date>();
        //休息日集合
        List<Date> restDatList = new ArrayList<Date>();
        if(holidayList != null && holidayList.size() > 0){
            for(HolidayDto dto : holidayList){
                if("Y".equals(dto.getIsWorkingDay())){
                    workDayList.add(dto.getDay());
                }else {
                    restDatList.add(dto.getDay());
                }
            }
        }

        //当天0时0分0秒0毫秒
        Calendar calendar = D.getSystemCalendar();

        do {
            calendar.add(Calendar.DATE,1);
            //如果是工作日
            if(workDayList.contains(calendar.getTime())){
                return calendar.getTime();
            }
        }while (restDatList.contains(calendar.getTime()) || calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7);

        return calendar.getTime();
    }

    /**
     * 获取保留截止日期
     * @param prdNo    产品类型
     * @param overDays 逾期天数
     * @return 保留日
     */
    @Override
    public Date getKeepDay(String prdNo, Integer overDays) {
        //如果是月光神器或医美分期产品且逾期天数小于15,保留截止日期计算到逾期天数第16天那一天
        if(("ML".equals(prdNo) || "YM".equals(prdNo)) && overDays != null && overDays - 15 < 0){
            //当天0时0分0秒0毫秒
            Calendar calendar = D.getSystemCalendar();
            calendar.add(Calendar.DATE,16 - overDays);
            return calendar.getTime();
        }else {
            //查找下一个工作日
            return this.selectNextWorkDay();
        }
    }

    /**
     * 根据参数code从贷后系统参数表获取参数val
     * @param paramCode 参数code
     * @return val
     */
    @Override
    public String selectParamValByCode(String paramCode) {
        if(StringUtil.isEmpty(paramCode)){
            return null;
        }
        return systemMapper.selectParamValByCode(paramCode);
    }

}
