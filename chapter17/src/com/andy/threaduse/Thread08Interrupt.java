package com.andy.threaduse;

public class Thread08Interrupt {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        t3.setName("小笼包");
        t3.setPriority(Thread.MIN_PRIORITY);

        t3.start();

        System.out.println("默认优先级= "+Thread.currentThread().getPriority());

        Thread.sleep(3000);
        t3.interrupt();
    }
}

class T3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"吃包子。。。"+i);
        }
        try{
            System.out.println(Thread.currentThread().getName()+"休眠中。。。");
            Thread.sleep(20000);
        }catch (InterruptedException e ){
            System.out.println(Thread.currentThread().getName()+"被interrupt了。。。");
        }
    }
}