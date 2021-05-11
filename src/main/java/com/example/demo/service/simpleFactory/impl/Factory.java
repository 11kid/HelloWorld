package com.example.demo.service.simpleFactory.impl;


import com.example.demo.service.simpleFactory.Car;

public class Factory {
    public static Car getCarInstance(String type){
        Car c = null;
        if("Benz".equals(type)){
            c = new Benz();
        }
        if("Ford".equals(type)){
            c = new Ford();
        }
        return c;
    }
}

