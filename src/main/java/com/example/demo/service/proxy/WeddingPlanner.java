package com.example.demo.service.proxy;

public class WeddingPlanner implements ProxyInterface{

    private ProxyInterface proxyInterface;
    public WeddingPlanner(ProxyInterface proxyInterface){
        this.proxyInterface = proxyInterface;
    }

    @Override
    public void marry() {
        System.out.println("婚庆公司...");
        System.out.println("策划婚礼流程...");
        System.out.println("彩排...");
        System.out.println("采买礼物...");
        System.out.println("婚礼开始...");
        proxyInterface.marry();
        System.out.println("收尾...");
    }
}
