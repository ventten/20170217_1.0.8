package com.ljwd.plms.web.vo.sys_management;

import java.util.Date;

/**
 * Created by zhengzw on 2016/11/26
 * 微贷的节假日配置Dto
 */
public class HolidayDto {

    private Long id;                    //记录ID
    private Integer year;               //年份
    private Date day;                   //日期
    private String isWorkingDay;        //Y:工作日，N:休息日或假日.组合：星期六/星期天 + Y, or 星期1-5 + N

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getIsWorkingDay() {
        return isWorkingDay;
    }

    public void setIsWorkingDay(String isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

}
