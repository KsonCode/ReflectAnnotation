package com.example.kson.reflectannotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/08/30
 * Description:
 */
public class Test
{
    public static void main(String[] a) throws ClassNotFoundException {
        Person person = new Person();
//        person.fun();


        //创建person类的类实例子（类的类型），三种获取方式
        Class<Person> c1 = Person.class;
        Class<Person> c2 = (Class<Person>) Class.forName("com.example.kson.reflectannotation.Person");
        Class<Person> c3 = (Class<Person>) person.getClass();

        System.out.println("c1:"+c1+" c2:"+c2);

//        //获取无参构造函数,public
//        try {
//            Constructor constructor = c1.getConstructor(null);
//            Person person1 = (Person) constructor.newInstance(null);
//            person1.fun("kson");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        //获取构造函数，private，protected
//        try {
//            Constructor constructor = c3.getDeclaredConstructor(String.class,int.class);
//            constructor.setAccessible(true);//设置可访问，强制可见
//            Person person1 = (Person) constructor.newInstance("kson",100);
////            person1.fun();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        //获取成员变量，并修改成员变量的值,public
//        try {
//            Constructor constructor = c1.getConstructor(null);
//            Person person1 = (Person) constructor.newInstance(null);
//            Field[] fields = c1.getFields();
//            if (fields!=null&&fields.length>0){
//                System.out.println(fields.length);
//                for (Field field : fields) {
//
//                    System.out.println(field.getName());
//
//                    field.set(person1,"11111111111");
//
//                }
//
//            }
//            person1.getDesc();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //获取public方法
        try {
            //获取方法实例
            Method method = c2.getMethod("fun",String.class);
            //创建构造方法
            Constructor constructor = c1.getConstructor(null);
            //通过反射的newinstance方法，得到此对象的实例
            Person person1 = (Person) constructor.newInstance(null);
//            person.fun("kson");之前调用
            method.invoke(person1,"kson");//通过反射机制，调用方法

        } catch (Exception e) {
            e.printStackTrace();
        }

//
        try {
            Method method = c1.getDeclaredMethod("fun1", new Class[]{int.class,String.class,String.class});
            Object obj = c1.getConstructor(null).newInstance(null);
            method.setAccessible(true);
            method.invoke(obj,100,"kson","1");
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Person().fff();





    }
}
