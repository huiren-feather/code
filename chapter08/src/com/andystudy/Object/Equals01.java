package com.andystudy.Object;

public class Equals01 {
    public static void main(String[] args) {
        int i=10;
        double d=10.0;
        System.out.println(i==d);

        A a = new A();
        A b= a;
        A c=b;
        System.out.println(a==b);
        System.out.println(c==b);
        System.out.println(a==c);

        B bObj = a;
        System.out.println(a==bObj);

        "hello".equals("abc");
        "hello".equals("hello");
    }
}
class A extends B {}
class B {}

/*  String重写equals
首先判断对象是否为同一个；否则，再判断是否String，在判断是否内容一样
*     public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
* */