package com.andystudy.Object;

import com.sun.deploy.perf.PerfRollup;
import jdk.nashorn.internal.ir.CallNode;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("andy", 20, '男');
        Person person2 = new Person("andy", 20, '男');
        //未重写equals方法时,Object的方法是比较是否为同一个对象，所以是false
        System.out.println(person1.equals(person2));
//        重写equals方法后，是true

        System.out.println(person1.getName().toString());
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    重新Object的equals方法
    public boolean equals(Object obj){
//        1.判断是否为同一个对象
        if (this==obj){
            return true;
        }
//        2.判断是否是Person对象，否则没有比较的必要
        if (obj instanceof Person){
//        3.进行向下转型，因为我需要得到obj的各个属性
            Person p=(Person)obj;
//            name是字符串，所以需要用方法比较
            return this.name .equals(p.name)&& this.age==p.age
                    && this.gender==p.gender;
        }
//    若不是Person ，直接返回false
      return false;
    }
}
