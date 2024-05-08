package com.andy.method;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
//测试相关方法
        T t = new T();
        t.setName("Andy");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

//        主线程打印5个hi，然后我就中断子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+ i);
        }
        System.out.println(t.getName() + " 线程的优先级 = " + t.getPriority() );//1
        t.interrupt();//中断t线程的休眠
        System.out.println(t.getName());
    }
}

class T extends  Thread {//自定义线程类
    @Override
    public void run() {
        while(true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 吃饱了~~");
            }
            try {
                System.out.println(Thread.currentThread().getName() + " 休眠中。。。");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " 被interrupt。。。");
            }
        }
    }
}