package com.andystudy.poly_.detail_;



public class PolyDetail01 {
    public static void main(String[] args) {

//        ����û����д֮˵�����Ե�ֵ����������
        Base base = new Sub();
        System.out.println(base.count);//10

        Sub sub = new Sub();
        System.out.println(sub.count);//20
    }
}

class Base {
    int count =10;
}

class Sub extends Base {
    int count = 20;
}