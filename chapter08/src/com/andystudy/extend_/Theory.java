package com.andystudy.extend_;

/*
* 讲解继承的本质
* */
public class Theory {
    public static void main(String[] args) {
    Son son = new Son();//此时内存发生了什么
//        先在栈中创建main，
//        在方法区中依次创建类： Object  GrandPa father son
//        在堆中创建son对象实例：方法区中存放属性
        System.out.println(son.name);
//        按查找关系来返回信息
//        1.若子类有此属性且可以访问,就返回信息
//        2.若子类无,则找上一级,有则返回信息,无则继续;
//          若有但不能访问，不再继续查找并报错
//        3.直到找到Object
        System.out.println(son.age);
//        System.out.println(son.hobby);
    }
}
class GrandPa {
    String name="爷爷";
    String hobby="旅游";

}
class Father extends GrandPa {
    String name="爸爸";
    int age =49;
    private String hobby = "钓鱼";

}class Son  extends Father{
    String name="儿子";
}