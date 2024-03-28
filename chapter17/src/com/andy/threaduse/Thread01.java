package com.andy.threaduse;

public class Thread01 {
    public static void main(String[] args) {
//        创建一个Cat对象
        Cat cat = new Cat();
        cat.start();//启动线程

    }
}
//继承了Thread，就可以把他当线程来用
class Cat extends Thread {
    int times =0;

    @Override
    public void run() {//重写run方法，写自己的逻辑
        while (true) {
            System.out.println("喵喵，我是小猫咪"+(++times)+"线程名="+Thread.currentThread().getName());
//        休眠一秒 ctrl+alt+T
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times==8){
                break;//8时就退出循环，这时线程也就退出了
            }
        }
    }
}