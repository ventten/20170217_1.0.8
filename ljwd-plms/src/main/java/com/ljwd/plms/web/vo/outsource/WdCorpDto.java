package com.ljwd.plms.web.vo.outsource;

/**
 * Created by zhengzw on 2016/11/3
 * 微贷外包公司Dto
 */
public class WdCorpDto {

    private Long wdCorpId;                      //微贷外包公司表sys_outsrc_corp的ID
    private String wdCorpName;                  //微贷外包公司名称

    public Long getWdCorpId() {
        return wdCorpId;
    }

    public void setWdCorpId(Long wdCorpId) {
        this.wdCorpId = wdCorpId;
    }

    public String getWdCorpName() {
        return wdCorpName;
    }

    public void setWdCorpName(String wdCorpName) {
        this.wdCorpName = wdCorpName;
    }

}
