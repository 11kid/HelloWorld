package com.example.demo.service.abstractFactory.product;

public class Plane implements Vehicle {
    @Override
    public void run() {
        System.out.println("Plane起飞！");
    }
}
