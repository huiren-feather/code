package com.andy.udp;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
//        1、创建DatagramSocket 对象，准备发送数据
//        准备在9998端口接受数据
        DatagramSocket datagramSocket = new DatagramSocket(9998);

//        2.将需要发送的数据，封装到 DatagramPacket 对象
        byte[] data = "hello 明天吃火锅。。。".getBytes();
//        说明：封装的 DatagramPacket 对象，data内容字节数组，data.length,主机（IP），端口
        DatagramPacket datagramPacket =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.48.81"), 9999);

        datagramSocket.send(datagramPacket);


//        接收A端的信息
        byte[] buf = new byte[64];
        datagramPacket= new DatagramPacket(buf, buf.length);
        datagramSocket.receive(datagramPacket);
        byte[] data1 = datagramPacket.getData();
        int length = datagramPacket.getLength();
        String s = new String(data1, 0, data1.length);
        System.out.println(s);

//        3.关闭资源
        datagramSocket.close();
        System.out.println("B端退出");

    }
}

