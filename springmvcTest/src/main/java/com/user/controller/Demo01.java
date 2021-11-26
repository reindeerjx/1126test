package com.user.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "张三");
        map.put("age", "24");
        map.put("sex", "男");
        /*Set<String> key = map.keySet();
        for (String s : key) {
            System.out.println(s+":"+map.get(s));
        }*/
        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }*/
        /*map.forEach((key, val) -> {
            System.out.println(key+":"+val);
        });*/
    }
}
