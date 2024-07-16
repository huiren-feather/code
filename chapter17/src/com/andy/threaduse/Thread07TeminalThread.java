package com.andy.threaduse;


public class Thread07TeminalThread {
    public static void main(String[] args){
        T0 t0 = new T0();
        Thread thread = new Thread(t0);
        thread.start();
        for (int i = 0; i < 60; i++) {
            try{
                Thread.sleep(50);
            }catch (InterruptedException e ){
                e.printStackTrace();
            }
            System.out.println("主线程运行中。。。"+i);
            if (i==30){
                t0.setLoop(false);
            }
        }
    }
}

class T0 implements Runnable{
    private boolean loop=true;
    private int i=0;
    @Override
    public void run() {
        while (loop){
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("T0 线程运行中。。。"+(++i));
        }
    }
    public void setLoop(boolean loop){
        this.loop = loop;
    }
}