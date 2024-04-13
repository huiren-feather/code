package com.andy.threaduse;

public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Thread thread = new Thread(dog);
//        thread.start();
        Tiger tiger = new Tiger();
        Proxy proxy = new Proxy(tiger);
        proxy.start();
    }
}
class Animal {}
class Tiger  extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("老虎嗷嗷嗷");
    }
}
//线程代理类,模拟了一个极简的Thread
class Proxy implements Runnable {
    private  Runnable target = null;
    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }

    public Proxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}

class Dog implements Runnable {
    int count=0;
    @Override
    public void run() {
        while (true) {
            System.out.println("汪汪，我是小狗"+(++count)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }
        }

    }
}