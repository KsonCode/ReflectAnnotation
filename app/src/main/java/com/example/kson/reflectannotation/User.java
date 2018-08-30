package com.example.kson.reflectannotation;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/08/30
 * Description:
 */
public class User<T, K, V, NIHAO, HELLO, HAHAHA> {
    public T t;

    public User(T t) {
        this.t = t;
    }

    public T fun(T t1) {
        return t1;
    }

    public T getT() {
        return t;
    }

    public <M> void fun1(M m) {

    }
}
