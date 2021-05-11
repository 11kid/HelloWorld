package com.example.demo;

import com.example.demo.service.abstractFactory.product.Broom;
import com.example.demo.service.abstractFactory.product.Plane;
import com.example.demo.service.abstractFactory.product.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultConfiguration {
    @Bean
    public Plane newPlane(){
        return new Plane();
    }

    @Bean
    public Broom newBroom(){
        return new Broom();
    }
}
