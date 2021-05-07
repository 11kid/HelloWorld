package com.example.demo.controller;

import Test.TestDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Import(TestDemo.class)
public class HelloController {
    @Autowired
    TestDemo testDemo;

    @RequestMapping("/")
    public char hello() {
        String s = "Hello World";

        return s.charAt(4);
    }
}
