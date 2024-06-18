package com.andy.threaduse;

public class Thread03 {
    public static void main(String[] args) {
        CatCry catCry = new CatCry();
        catCry.run();
    }
}

class CatCry extends Thread {

    @Override
    public void run() {
        while (true) {
//            try catch 的快捷键：Ctrl+alt+t
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

                System.out.println("喵喵，我是小狗");

        }
    }
}