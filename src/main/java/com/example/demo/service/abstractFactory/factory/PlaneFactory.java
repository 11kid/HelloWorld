package com.example.demo.service.abstractFactory.factory;

import com.example.demo.service.abstractFactory.product.Plane;
import com.example.demo.service.abstractFactory.product.Vehicle;

public class PlaneFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        return new Plane();
    }
}
