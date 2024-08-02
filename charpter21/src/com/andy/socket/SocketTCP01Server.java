package com.andy.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 服务端
* */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
//        1、在本机的9999端口监听，等待链接
//        要求：在本机没有其他服务在监听9999
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待链接。。。。");
//       /2、当没有客户端链接9999端口时，程序会阻塞，等待链接
//        如果有客户端连接，则会返回Socket对象，程序继续
        Socket accept = serverSocket.accept();
        System.out.println("服务端 socket = " + accept.getClass());
//        3、通过socket.getInputStream()读取客户端写入到数据通道的数据，显示
        InputStream inputStream = accept.getInputStream();
//        4.IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
//        5.获取相关联的输出流
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello,client".getBytes());
//        6.设置结束标记
        accept.shutdownOutput();
//        5.关闭流和Socket
        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
