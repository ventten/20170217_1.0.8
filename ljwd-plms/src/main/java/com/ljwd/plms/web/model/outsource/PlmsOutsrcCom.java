package com.ljwd.plms.web.model.outsource;

import com.ljwd.plms.web.model.ActiveModel;
import com.ljwd.plms.web.vo.outsource.SiteRegionDto;

import java.math.BigDecimal;
import java.util.List;

/**
 * 委外机构,PLMS_OUTSRC_COM
 * */
public class PlmsOutsrcCom extends ActiveModel{

    private Long id;                            //记录ID
    private String outsrcComName;               //机构名称
    private BigDecimal weight;                  //优先级
    private String brief;                       //公司简要
    private Long wdCorpId;                      //微贷外包公司表sys_outsrc_corp的ID

    //join-ext
    private String wdCorpName;                  //微贷外包公司名称
    private String content;                     //最新沟通日志
    private List<SiteRegionDto> regionList;     //辐射区域集合

    private Integer isOutsrc;                   //是否委外过:0-否,1-是
    private Integer approvedCount;              //二手案件在户数

    private Long rowNo;                         //行号

    public String getWdCorpName() {
        return wdCorpName;
    }

    public void setWdCorpName(String wdCorpName) {
        this.wdCorpName = wdCorpName;
    }

    public Long getWdCorpId() {
        return wdCorpId;
    }

    public void setWdCorpId(Long wdCorpId) {
        this.wdCorpId = wdCorpId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutsrcComName() {
        return outsrcComName;
    }

    public void setOutsrcComName(String outsrcComName) {
        this.outsrcComName = outsrcComName == null ? null : outsrcComName.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<SiteRegionDto> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<SiteRegionDto> regionList) {
        this.regionList = regionList;
    }

    public Integer getIsOutsrc() {
        return isOutsrc;
    }

    public void setIsOutsrc(Integer isOutsrc) {
        this.isOutsrc = isOutsrc;
    }

    public Integer getApprovedCount() {
        return approvedCount;
    }

    public void setApprovedCount(Integer approvedCount) {
        this.approvedCount = approvedCount;
    }

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

}