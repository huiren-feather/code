package com.andy.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","andy");
        map.put("no2","sun");
        map.put(new Car(),new Person());

/*
* 1、k-v最后是 HashMap$Node node= newNode(hash,key,value,null)
2、k-v为了方便程序员的遍历，还会创建 EntrySet 集合，该集合存放的元素的类型Entry，而一个Entry对象就有k,v EntrySet<Entry<K,V>> 即：transient Set<Map.Entry<K,V>> entrySet;
3、entrySet中，定义的类型 Map.Entry，但是实际上存放的还是 HashMap$Node
这时因为 static class Node<K,V> implements Map.Entry<K,V>
4、当把 HashMap$Node 对象 存放到 entrySet 就方便我们的遍历，因为Map.Entry 提供了重要方法getKey(),getValue();
5、
* */
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj:set) {
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        Set set1 = map.keySet();
        Collection values = map.values();
        System.out.println(set1.getClass());
        System.out.println(values.getClass());

    }
}
class Car{

}
class Person{

}