package com.andy.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
//        Map接口实现类的特点
//
        Map map = new HashMap();
        map.put("1","andy");
        map.put("2","andy");
        map.put("one","sun");
        map.put("one","huiren");//有相同的K，会替换value
        System.out.println(map);
//        get方法通过Key获取value
        System.out.println(map.get("2"));
    }
}
