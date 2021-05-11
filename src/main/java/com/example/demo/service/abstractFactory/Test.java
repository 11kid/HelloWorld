package com.example.demo.service.abstractFactory;

import com.example.demo.service.abstractFactory.factory.PlaneFactory;
import com.example.demo.service.abstractFactory.factory.VehicleFactory;
import com.example.demo.service.abstractFactory.product.Vehicle;

public class Test {
    public static void main(String[] args) {
        VehicleFactory vf = new PlaneFactory();
        Vehicle vehicle = vf.create();
        vehicle.run();
    }
}
