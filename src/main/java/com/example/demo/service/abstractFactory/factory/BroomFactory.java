package com.example.demo.service.abstractFactory.factory;

import com.example.demo.service.abstractFactory.product.Broom;
import com.example.demo.service.abstractFactory.product.Vehicle;

public class BroomFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        return new Broom();
    }
}
