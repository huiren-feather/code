package com.andy.threaduse;

public class Thread04 {
    public static void main(String[] args) {
//        Calls calls = new Calls();
//        Thread thread = new Thread(calls);
//        thread.start();
        Dog1 dog = new Dog1();
        ThreadProxy threadProxy = new ThreadProxy(dog);
        threadProxy.start();

    }
}
class Animal1 {}

class Dog1 extends Animal1 implements Runnable {
    @Override
    public void run() {
        System.out.println("小狗嗷嗷叫！");
    }
}



//线程代理类，模拟了最简单的
class  ThreadProxy implements  Runnable {//可以把ThreadProxy，当做线程类

    private  Runnable target = null;
    @Override
    public void run() {
        if (target != null){
            target.run();//动态绑定（运行类型Tiger）
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }
    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}

class Calls implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("hi! i= "+i+" 线程名称="+Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}



