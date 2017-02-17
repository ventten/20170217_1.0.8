package com.ljwd.plms.core.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by zhengzw on 2016/9/12
 * 数字工具类
 */
public class N {
    private static DecimalFormat df = new DecimalFormat("0.00");

    /**
     * 格式化
     * @param val 数值
     * @return 格式化的字符串
     */
    public static String format(Double val){
        return val == null ? "" : df.format(val);
    }

    /**
     * 除法
     * @param dividend 被除数
     * @param divisor 除数
     * @param len 精确度
     * */
    public static BigDecimal div(BigDecimal dividend,BigDecimal divisor,int len){
        return dividend.divide(divisor,len,BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 除法
     * @param dividend 被除数
     * @param divisor 除数
     * */
    public static BigDecimal div(BigDecimal dividend,BigDecimal divisor){
        return dividend.divide(divisor,BigDecimal.ROUND_HALF_UP);
    }

}
