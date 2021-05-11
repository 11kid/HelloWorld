package com.example.demo.service.map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("name","张三");
        treeMap.put("age","18");
        treeMap.put("gender","男");
        System.out.println(treeMap);
    }
}
