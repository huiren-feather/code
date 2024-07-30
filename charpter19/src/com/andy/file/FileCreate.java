package com.andy.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/*
* 演示创建文件
* */
public class FileCreate {
    public static void main(String[] args) {

    }
//    方法1 new File(String pathname)
    @Test
    public void create01(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    方式2 new File(File parent, String child)
    @Test
    public void create02(){
        File parentFile = new File("d:\\");
        String filename = "news2.txt";
//        这里的File对象，在Java程序中，只是一个对象
//        只有执行了createNewFile 方法，才会真正的在磁盘创建该文件
        File file = new File(parentFile, filename);
        try {
            file.createNewFile();
            System.out.println("文件创建成功2");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//    方式3 new File (String parent ,String child)
    @Test
    public void create03() {
        String parentPath = "d:\\";
//        两种路径写法都可以，建议上一种
        String parentPath1 = "d:/";
        String fileName = "news3.txt";

        String fileName1 = "news4.txt";
        File file = new File(parentPath, fileName);
        File file1 = new File(parentPath1, fileName1);
        try {
            file.createNewFile();
            System.out.println("文件创建成功3");
            file1.createNewFile();
            System.out.println("文件创建成功3");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
