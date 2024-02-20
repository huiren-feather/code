package com.andystudy.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b=new B();
    }
}
class A {
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}

class B extends A{
    public B() {
        this("abc");
        System.out.println("b");
    }

    public B(String name) {
//        默认此处会输出a
        System.out.println("b name");
    }
}

