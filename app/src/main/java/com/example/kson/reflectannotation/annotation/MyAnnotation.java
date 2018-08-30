package com.example.kson.reflectannotation.annotation;

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
 * Description:自定义myannotaion注解
 */
@Retention(RetentionPolicy.RUNTIME)//三个重要生命周期阶段，三选其一
@Target({ElementType.CONSTRUCTOR,ElementType.TYPE})//修饰的元素：类，方法，成员变量等等
@Documented//javadoc里面
@Inherited//是否存在继承性
public @interface MyAnnotation {

    int age() default 100;

    String name() default "kson";



}
