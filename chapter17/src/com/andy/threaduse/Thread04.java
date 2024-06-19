package com.andy.threaduse;

public class Thread04 {
    public static void main(String[] args) {
        Calls calls = new Calls();
        Thread thread = new Thread(calls);
        thread.start();
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



