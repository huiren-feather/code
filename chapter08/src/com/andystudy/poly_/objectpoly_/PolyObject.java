package com.andystudy.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
//        体验多态
//      animal 编译类型是  Animal  ，运行类型  Dog
        Animal animal = new Dog();
        //因为运行时，执行到该行时，animal运行类型是Dog，所以cry就是Dog的cry
        animal.cry();//Dog cry()...小狗在叫。。。

//      animal 编译类型 Animal ，运行类型是Cat
        animal = new Cat();
        animal.cry();//Cat cry()... 小猫喵喵叫。。。
    }

}
