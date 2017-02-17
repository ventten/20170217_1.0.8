package com.ljwd.plms.web.model;

/**
 * Created by zhengzw on 2016/6/24
 * model基础
 */
public class ActiveModel extends BaseModel{

    private String isActive;        //数据有效性

    //text-ext
    private String isActiveText;    //有效性显示值

    public String getIsActiveText() {
        switch (this.isActive){
            case "Y":
                return "有效";
            default:
                return "无效";
        }
    }


    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

}
