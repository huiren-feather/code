package com.andystudy.Object;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;//此时 car对象是个垃圾，垃圾回收器就会回收这个对象
//        在销毁对象前,会调用finalize方法
//        程序员就可以在finalize中，写自己的业务逻辑代码（比如释放资源，数据库连接，打开文件等）
//        可以通过System.gc()  主动触发垃圾回收机制
        System.gc();
        System.out.println("程序退出了、、、");
    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
//    重写finalize  还是快捷键

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车"+name);
        System.out.println("释放了某些资源");
    }
}