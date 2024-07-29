package com.andy.threaduse;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();

        B b = new B(a);
//        输入字符后需要立刻回车，才会生效
        a.start();
        b.start();
    }
}

class A extends Thread {
    private boolean loop = true;
    @Override
    public void run() {

//        输出1-100数字
        while (loop){
            System.out.println((int)(Math.random() * 100 + 1) );
            //        休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a线程退出");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
//读取键盘
class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);
    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
//        接受到用户的输入
            System.out.println("请输入你的指令：(Q)表示退出");
            char key = scanner.next().toUpperCase().charAt(0);
            System.out.println(key);
            if (key == 'Q') {
//            已通知的方式结束A
                a.setLoop(false);
                System.out.println("b线程退出");
                break;
            }
        }
    }


}