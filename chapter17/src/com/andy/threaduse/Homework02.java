package com.andy.threaduse;

public class Homework02 {
    public static void main(String[] args) {
        User user = new User();
        Thread thread = new Thread(user);
        Thread thread1 = new Thread(user);

        thread.start();
        thread1.start();

    }
}
//取款的线程
class User implements Runnable {
    private int money = 10000;

    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                money -= 1000;

                System.out.println(Thread.currentThread().getName() + " 取出了1000块" +
                        "当前余额= " + money);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}