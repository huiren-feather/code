package com.andy.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","andy");
        map.put("no2","sun");

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj:set) {
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
