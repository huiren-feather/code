package com.andy.threaduse;

public class Thread03 {
    public static void main(String[] args) throws InterruptedException {
        CatCry catCry = new CatCry();
        catCry.run();   //当前线程是main,就是一个普通的方法，执行完run方法之后，才会向下执行
        catCry.start();   //启动一个thread-0线程
//        当main线程启动一个子线程thread-0，主线程不会阻塞，会继续执行
        System.out.println("主线程名称："+ Thread.currentThread().getName());
//        catCry.start();
//        CatCry catCry1 = new CatCry();
//        catCry1.start();
        for (int i = 0;i<40 ; i++) {
            System.out.println("主线程 i = "+i);
            Thread.sleep(1000);//让主线程休眠一秒
        }

    }
}
//源码解读
/*catCry.start()：
* 1.  public synchronized void start() {
*            start0();
      }
* 2.  start0();  是本地方法，是JVM调用，c/c++实现，程序员无法调用
* 真正实现多线程效果，是start0(),而不是 run()
*     private native void start0();
* 3. 最后可以看成是start0() 调用了 run(),虽然在底层我们看不到
* */


class CatCry extends Thread {
    int times=0;
    @Override
    public void run() {
        while (true) {
//            try catch 的快捷键：Ctrl+alt+t
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            times++;
            System.out.println("喵喵，我是小狗"+times+" 线程名称= "+Thread.currentThread().getName());

        }
    }
}