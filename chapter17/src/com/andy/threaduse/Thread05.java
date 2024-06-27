package com.andy.threaduse;

public class Thread05 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        new Thread(t1).start();
        new Thread(t2).start();
    }
}

class T1 implements Runnable {
    int count=0;
    @Override
    public void run() {
//        每隔一秒输出helloworld，输出10次

        while (true) {

            try {
                System.out.println("hello world" + (++count));
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
            if (count>=10){
                break;
            }
        }
    }
}

class T2 implements Runnable {
    int count=0;
    @Override
    public void run() {
//        每隔一秒输出hi，输出5次

        while (true) {
            System.out.println("hi" + (++count));
            try {

                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (count>=5){
                break;
            }
        }
    }
}