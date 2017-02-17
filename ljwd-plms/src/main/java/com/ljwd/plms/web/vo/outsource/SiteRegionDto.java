package com.ljwd.plms.web.vo.outsource;

/**
 * Created by zhengzw on 2016/9/14
 * 网点区域Dto
 */
public class SiteRegionDto {

    private Long regionId;                  //区域ID
    private String regionName;              //区域名称

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

}
