package com.example.kson.reflectannotation;

import com.example.kson.reflectannotation.annotation.MyAnnotation;
import com.example.kson.reflectannotation.annotation.MyAnnotation1;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/08/30
 * Description:
 */
@MyAnnotation(age = 1,name = "person类")
public class Person extends Father{
    @MyAnnotation1(100)
    private String name;
    private int age;
    private double price =  99.99;
    public String desc = "什么也没留下";

    /**
     * 有参构造方法
     * @param name
     * @param age
     * @param price
     */
    @MyAnnotation(age = 1,name = "三个参数的构造器")
    public Person(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }


    public void getDesc() {

        System.out.println("desc:"+desc); ;
    }

    /**
     * 无参构造方法
     */
    @MyAnnotation(age = 1,name = "无参构造器")
    public Person(){

    }

    /**
     * 私有构造方法
     * @param name
     */
    @MyAnnotation(age = 1,name = "私有构造器")
    private Person(String name,int age ){
//        this.name = name;
//        this.age = age;
        System.out.println("name:"+name+" age:"+age);
    }

    /**
     * 方法的作用
     * @param name 姓名
     */
    public void fun(String name){
        System.out.println("name:"+name);
    }


    private String fun1(int age,String name,String type){

        System.out.println("type:"+type);

        return type;
    }

    @Override
    protected void ff() {
        super.ff();
        System.out.println("======");

    }

    /**
     * 此方法不建议使用
     */
    @Deprecated
    public void fff(){

    }
}
