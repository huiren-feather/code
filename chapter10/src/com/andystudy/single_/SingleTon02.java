package com.andystudy.single_;

/*
* 懒汉式单例模式
* */
public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
    }
}

//在程序运行过程中，只能创建一个Cat对象
class Cat {
    private String name;
    public static int n=999;
    private static Cat cat;
//    步骤：
//    1.仍然构造器私有化
//    2.定义一个static静态属性对象
//    3.提供一个public的static方法，可以返回一个Cat对象
//    4.懒汉式，只有当用户使用getinstance时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象
    private Cat(String name) {
        System.out.println("构造器被调用。。。");
        this.name = name;
    }
    public static Cat getInstance(){
        if (cat==null){
            cat=new Cat("小可爱");
        }
        return cat;
    }
}