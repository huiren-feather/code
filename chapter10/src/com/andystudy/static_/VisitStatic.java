package com.andystudy.static_;

public class VisitStatic {
    public static void main(String[] args) {
//        System.out.println(A.name);
//        A a = new A();
//        System.out.println(a.name);
        System.out.println(A.getName());

    }
}
class A {
     private static String name="向阳学习";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        A.name = name;
    }
}
