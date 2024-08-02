package com.andy.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
//        1.链接服务器（IP，端口）
//        链接本机的9999端口，如果链接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端 socket 返回 ="+socket.getClass());
//        链接上后，生成Socket，通过socket.getOutputStream()
//        得到 和 Socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
//        3.通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());
//        4.设置结束标记
        socket.shutdownOutput();
//        4.获取socket关联的输入流，读取并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen =0;
        while ((readLen = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
//        4.关闭流对象和Socket，必须关闭，否则资源浪费
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
