package com.example.demo.service;

import com.example.demo.service.simpleFactory.impl.Factory;
import com.example.demo.service.simpleFactory.Car;

public class TestFactory {
    public static void main(String[] args) {
        Car c = Factory.getCarInstance("Benz");
        if(c != null){
            c.run();
            c.stop();
        } else {
            System.out.println("造不了这种车...");
        }
    }
}
