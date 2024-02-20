package com.andystudy.extend_;
//父类
public class Base extends TopBase{
    public int n1 = 100;
    protected int n2 = 200;
    int n3=300;
    private int n4=400;
    public Base(){   //无参构造器
        System.out.println("Base()...");
    }
    public Base(String name,int age){
        System.out.println("父类Base（name，age）被调用。。。");
    }
    public Base(String name ){
        System.out.println("父类Base（name）被调用。。。");
    }
    public void test100(){
        System.out.println("test100()...");
    }
    protected void test200(){
        System.out.println("test200()...");
    }
    void test300(){
        System.out.println("test300()...");
    }
    private void test400(){
        System.out.println("test400()...");
    }
//    父类提供一个public的方法,用来访问私有属性
    public int getN4(){
        return n4;
    }
//    父类提供一个public方法，用来调用私有方法
    public void callTest400(){
        test400();
    }
}
