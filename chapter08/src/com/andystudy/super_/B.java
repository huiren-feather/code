package com.andystudy.super_;

public class B extends C {

    public int n1=88;

    public  void hi() {
        System.out.println(super.n1+" "+super.n2+" "+super.n3);

    }
    public void ok() {
        super.test100();
        super.test200();
        super.test300();

    }
    public  B() {
        super();
    }

    public void sum(){
        System.out.println("B类的sum（）方法。。。");

        cal();
        this.cal();//和cal()等价
        super.cal();// 希望调用父类A  的cal方法，直接查找父类，若无，则继续查找父类的父类其他逻辑一样
    }

    public void cal() {
        System.out.println("B类的cal()方法");
    }

//
}
