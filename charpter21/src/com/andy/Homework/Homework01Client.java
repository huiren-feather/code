package com.andy.Homework;

import com.andy.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//文件下的客户端
public class Homework01Client {
    public static void main(String[] args) throws Exception {

//        1.接受用户输入，指定下载的文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名：");
        String downloadFilename = scanner.next();
//        2.客户端连接服务端，准备发送
        Socket socket = new Socket(InetAddress.getByName("192.168.48.81"), 9999);
//        3.获取和socket关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFilename.getBytes());
//        4.设置写入结束的标志
        socket.shutdownOutput();

//        5.读取服务端返回的文件（字节数组）
        BufferedInputStream bis =
                new BufferedInputStream(socket.getInputStream());

        byte[] bytes = StreamUtils.streamToByteArray(bis);
//        6.得到一个输出流，准备讲bytes写入到磁盘中
//       比如你下载的是 高山流水 =》 下载的就是高山流水.mp3
//        你下载的是 Andy  =》 下载的就是 无名.mp3    文件名：Andy.mp3
        String filePath = "Z:\\Java\\" + downloadFilename + ".mp3";
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

//        7.关闭资源
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();

        System.out.println("客户端下载完毕，正确退出。。。");

    }
}
