package com.ljwd.plms.web.enums;

/**
 * Created by zhengzw on 2016/6/17
 * 购买方式
 */
public enum PurchaseMode {

    DISPOSABLE("一次性支付"),
    MORTGAGE("按揭购买");

    private String type;

    PurchaseMode(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }

}
