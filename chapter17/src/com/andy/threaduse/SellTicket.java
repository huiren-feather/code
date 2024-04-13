package com.andy.threaduse;

public class SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        sellTicket01.start();
//        SellTicket02 sellTicket02 = new SellTicket02();
//        Thread thread = new Thread(sellTicket02);
//        thread.start();
        new SellTicket01().start();

    }
}

class SellTicket01 extends Thread {
    private static int tickNum = 100;

    @Override
    public void run() {
        while (true){
            if (tickNum<=0){
                System.out.println("01售票结束。");
                break;
            }
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("窗口 "+Thread.currentThread().getName()+" 售出一张票"
                    +" 剩余票数="+(--tickNum));
        }


    }
}

class SellTicket02 implements Runnable {
    private static int tickNum = 100;

    @Override
    public void run() {
        while (true){
            if (tickNum<=0){
                System.out.println("02售票结束。");
                break;
            }
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("窗口 "+Thread.currentThread().getName()+" 售出一张票"
                    +" 剩余票数="+(--tickNum));
        }


    }
}