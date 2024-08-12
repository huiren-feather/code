package com.andy.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
//        1.客户端连接服务端，得到Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
//        2.创建读取磁盘文件的输入流
        String filePath = "d:\\1.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
//        3.bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
//        通过Socket获取到输出流，将bytes数据发送给服务器
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//将文件对应的字节数组的内容，写入到数据通道
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

//        关闭相关的流
        bos.close();
        socket.close();
    }
}