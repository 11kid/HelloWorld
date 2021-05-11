package com.example.demo.service.proxy;

public class Test {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new WeddingPlanner(new CommonFamily());
        proxyInterface.marry();
    }
}
