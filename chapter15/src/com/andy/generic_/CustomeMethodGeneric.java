package com.andy.generic_;
@SuppressWarnings("all")
public class CustomeMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100);//调用方法时，参数就会确定类型
        System.out.println("======");
        car.fly(300,100.1);//调用方法时，参数就会确定类型

    }
}

//
class Car {
    public void run() {//普通方法

    }
    public<T,R> void fly(T t , R r) {//泛型方法
//<T,R> 就是泛型
//        是提供给fly使用的
        System.out.println(t.getClass());
        System.out.println(r.getClass().getSimpleName());
    }
}

class Fish<T,R> {//泛型类
    public void run(){

    }
    public<U,M> void eat(U u,M m){//泛型方法，最好和类的泛型区分开

    }
}
