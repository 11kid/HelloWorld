package com.example.demo.service.dynamicProxy;

import org.springframework.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(PeopleTalk.class);
//        enhancer.setCallback(new CglibProxy());
//        PeopleTalk peopleTalk = (PeopleTalk) enhancer.create();
//        peopleTalk.talk("业务方法");
        PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk());
        peopleTalk.talk("业务方法");
    }
}
