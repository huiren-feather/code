package com.andystudy.extend_;

public class ExtendDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
//        sub.sayOK();
        System.out.println("=======");
        Sub sub2 = new Sub("Andy");
        System.out.println("=======");

        Sub sub3 = new Sub("Andy",23);
    }
}
