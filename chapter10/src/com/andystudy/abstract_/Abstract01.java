package com.andystudy.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
//    public void eat(){
//        System.out.println("这是一个动物，但不知道吃什么");
//    }
//    抽象方法：没有方法体
//    当类中存在抽象方法时，需要将类声明为abstract类
//    一般来说，抽象类会被继承，由其子类来实现抽象方法

//    注意事项：
//    1.抽象类不能被实例化
//    2，抽象类可以没有抽象方法，但有抽象方法，一定是抽象类
//    3.abstract只能修饰类和方法
//    4.抽象方法不能有主体{}
//    5.如果一个类继承了抽象类，这个类必须实现所有抽象方法，除非这个类也是抽象类
//    6.抽象方法不能用private,final,static类修饰,因为是和重写相违背的
    public abstract void eat();
}
