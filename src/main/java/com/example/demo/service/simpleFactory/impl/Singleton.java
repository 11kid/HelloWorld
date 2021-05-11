package com.example.demo.service.simpleFactory.impl;

public class Singleton {
    private static Singleton singleton;

    /*
    用private修饰构造器，为了不让其他类通过构造器创建它的实例
     */
    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
