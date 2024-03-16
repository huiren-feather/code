package com.andy.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Object sun = hashMap.put(1, new Staff(1, "sun", 20000));
        Object andy = hashMap.put(2, new Staff(2, "andy", 30000));
        Object feather = hashMap.put(3, new Staff(3, "feather", 10000));
//        遍历
//        1.使用keySet
        Set keyset = hashMap.keySet();
        for (Object key :keyset) {
//            先获取value
            Staff staff = (Staff) hashMap.get(key);
            if (staff.getSal()>18000){
                System.out.println(staff);
            }
        }
//        2.使用EntrySet 迭代器
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry) iterator.next();
//            通过Entry取得value
            Staff staff1 =(Staff) entry.getValue();
            if (staff1.getSal()>18000) {
                System.out.println(staff1);
            }
        }

    }
}
class Staff{
    private int id;
    private String name;
    private double sal;

    public Staff(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}