package com.andystudy.pkg;

import java.util.Arrays;

//注意：
//需要使用哪个类，就导入哪个类即可；不建议使用*导入
//import java.util.Scanner;   //表示只会引入java.util 包下的Scanner
//import java.util.*;         //表示将java.util包下的所有类都引入
public class Import01 {
    public static void main(String[] args) {
//        使用系统提供的Arrays完成数组排序
        int[] arr = {-1,2,3,5435,23,325,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//注意事项和使用细节
/*1.package的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一句package
* 2.import指令  位置放在package的下面，在类定义前面，可以有多句且没有顺序要求*/