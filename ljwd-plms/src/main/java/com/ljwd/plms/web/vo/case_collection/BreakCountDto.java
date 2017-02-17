package com.ljwd.plms.web.vo.case_collection;

/**
 * Created by zhengzw on 2016/8/9
 * 破坏承诺次数Dto
 */
public class BreakCountDto {

    private Integer breakTotalCount;            //累计破坏承诺次数
    private Integer breakThisCount;             //本期破坏承诺次数

    public Integer getBreakTotalCount() {
        return breakTotalCount == null ? 0 : breakTotalCount;
    }

    public void setBreakTotalCount(Integer breakTotalCount) {
        this.breakTotalCount = breakTotalCount;
    }

    public Integer getBreakThisCount() {
        return breakThisCount == null ? 0 : breakThisCount;
    }

    public void setBreakThisCount(Integer breakThisCount) {
        this.breakThisCount = breakThisCount;
    }

}
