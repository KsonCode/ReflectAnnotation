package com.example.kson.reflectannotation.butterknife;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/08/30
 * Description:
 */
@Retention(RetentionPolicy.RUNTIME)//运行时的注解
@Target(ElementType.FIELD)
@Documented
@Inherited
public @interface MyBindView {
    int value();
}
