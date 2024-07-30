package com.andy.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if (file.delete()){
                System.out.println(filePath + " 删除成功");
            }else {
                System.out.println(filePath + " 删除失败");

            }
        }else {
            System.out.println("该文件不存在");
        }
    }
//    体会：在Java编程中，目录也被当成文件
    @Test
    public void m2(){
        String filePath = "d:\\demo02";
        File file = new File(filePath);
        if(file.exists()){
            if (file.delete()){
                System.out.println(filePath + " 删除成功");
            }else {
                System.out.println(filePath + " 删除失败");

            }
        }else {
            System.out.println("该目录不存在");
        }
    }
    @Test
    public void m3(){
        String directoryPath = "d:\\demo0\\a\\b\\c";
        File file = new File(directoryPath);
        if(file.exists()){
            System.out.println(directoryPath + "目录存在");
        }else {
            if (file.mkdirs()){//创建多级目录；
//                创建一级目录 mkdir
                System.out.println(directoryPath+"目录创建成功");
            }else {
                System.out.println(directoryPath+"创建失败");
            }
        }
    }
}
