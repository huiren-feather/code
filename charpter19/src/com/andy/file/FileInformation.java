package com.andy.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileInformation {
    public static void main(String[] args) {

    }
//    获取文件信息
    @Test
    public void info() {
//        先创建文件对象
        File file = new File("d:\\news1.txt");
//        调用对于的方法，得到对应信息
        System.out.println("文件名称= "+file.getName());
        System.out.println("文件绝对路径="+file.getAbsolutePath());
        try {
            System.out.println("文件规范路径="+file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件父级目录="+file.getParent());
        System.out.println("文件大小（字节）="+file.length());
        System.out.println("文件是否存在="+file.exists());
        System.out.println("是不是一个文件="+file.isFile());
        System.out.println("是不是一个目录="+file.isDirectory());
    }
}
