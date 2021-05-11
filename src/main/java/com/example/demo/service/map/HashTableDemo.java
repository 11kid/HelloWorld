package com.example.demo.service.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("name","zhangsan");
        ht.put("age",null);
        System.out.println(ht);
        if(ht.containsKey("name")){
            System.out.println("true");
        }

        HashMap<String,String> hm = new HashMap<>();
        hm.put("A","jdbc");
        hm.put("B","java");
        hm.put(null,null);
        System.out.println(hm);
        boolean status = hm.containsKey("A");
        boolean status2 = hm.containsValue("java");
        System.out.println(status);
        System.out.println(status2);
    }
}
