package com.andy.threaduse;

public class Thread06SellTicket {
    public static void main(String[] args) {
//        Ticket ticket = new Ticket();
//        Ticket ticket1 = new Ticket();
//        Ticket ticket2 = new Ticket();
//        ticket.start();
//        ticket1.start();
//        ticket2.start();
        Ticket02 ticket02 = new Ticket02();
        Thread thread = new Thread(ticket02);
        Thread thread1 = new Thread(ticket02);
        Thread thread2 = new Thread(ticket02);
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class Ticket extends Thread {
    private static int ticketnums=5;
    private  boolean loop=true;

    public synchronized void sell(){

            if (ticketnums<=0){
                System.out.println("售票结束。，。");
                loop=false;
                return;
            }
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("窗口 "+Thread.currentThread().getName()
                    +" 售出一张票"+" 剩余票数 "+ (--ticketnums));

    }
    @Override
    public void run() {
        while(loop){
        sell();
        }
    }
}
//实现接口的方式可以保证售票不超；
//继承的方式还是会超出总票数:因为继承会额外新建对象实例，没有锁住；锁本身锁的就是对象
class Ticket02 implements Runnable {
    private static int tickNum = 100;
    private  boolean loop=true;

    public synchronized void sell(){

        if (tickNum<=0){
            System.out.println("售票结束。，。");
            loop=false;
            return;
        }
        try{
            Thread.sleep(50);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("窗口 "+Thread.currentThread().getName()
                +" 售出一张票"+" 剩余票数 "+ (--tickNum));

    }
    @Override
    public void run() {
        while (loop){
            sell();
        }


    }
}