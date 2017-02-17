package com.ljwd.plms.mapp.filter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Controller的方法上添加此注解,接口请求加解密策略
 * <pre>
 *     注解应用于控制层每一个请求方法上
 *     控制器方法上不注解此注解,则其认为全部属性为true
 * </pre>
 * @author tangjialin on 2016-10-26 0026.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AESAuthen {

    /** 验证请求合法性.true:需要验证;false:不验证 */
    boolean requestCheck() default true;
    /** 验证请求合法性时,签名参数包含请求正文.true:包含;false:不包含(当requestCheck为true时,此属性生效,否则此属性无效.) */
    boolean requestCheckAndBody() default true;
    /** 请求内容解密.true:解密;false:不解密(当requestCheck为true时,此属性生效,否则此属性无效.) */
    boolean requestDecrypt() default true;
    /** 请求内容日志记录.true:记录;false:不记录 */
    boolean requestLog() default true;

    /** 响应内容加密.true:加密;false:不加密 */
    boolean responseEncrypt() default true;
    /** 响应内容日志记录.true:记录;false:不记录 */
    boolean responseLog() default true;

}