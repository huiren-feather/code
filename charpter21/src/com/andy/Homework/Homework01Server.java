package com.andy.Homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import com.andy.upload.StreamUtils;
/*
* 先写文件下载的服务端
*
* */
public class Homework01Server {
    public static void main(String[] args) throws Exception {
//        1.监听  9999端口，等待客户端链接，并发送下载文件的名称
        ServerSocket serverSocket = new ServerSocket(9999);
//        2.等待客户端连接
        System.out.println("服务端，在9999端口监听，等待链接。。。。");
        Socket accept = serverSocket.accept();
        System.out.println("服务端 socket = " + accept.getClass());
//        3.读取客户端发送要下载的文件名
//        这里老师使用了while循环读取文件名，是考虑精力客户端发送的数据较大的情况
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len =0;
        String downloadFilename = "";
        while ((len = inputStream.read(bytes))!=-1){
            downloadFilename += new String(bytes,0,len);
        }
        System.out.println("客户端希望下载的文件名 = "+downloadFilename);

//      老师在服务器上有两个文件，无名.mp3, 高山流水.mp3
//        如果客户下载的是高山流水，我们就返回该文件，否则一律返回无名
        String resFilename = "";
        if ("高山流水".equals(downloadFilename)){
            resFilename = "Z:\\Java附带课件\\资料\\分享资料\\高山流水.mp3";
        }else {
            resFilename = "Z:\\Java附带课件\\资料\\分享资料\\无名.mp3";
        }
//        4.创建一个输入流，创建文件
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(resFilename));

//        5.使用工具类 StreamUtils ,读取文件到一个字节数组
        byte[] bytes1 = StreamUtils.streamToByteArray(bis);

//        6.得到Socket关联的输出流
        BufferedOutputStream bos =
                new BufferedOutputStream(accept.getOutputStream());
//        7.写入到数据通道，返回给客户端
        bos.write(bytes1);
        accept.shutdownOutput();//很关键，不写的话，客户端会一直等待
//        8.关闭相关的资源
        bis.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
