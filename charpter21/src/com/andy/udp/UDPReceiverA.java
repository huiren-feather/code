package com.andy.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
//        1.创建一个DatagramSocket 对象，准备在9999接受数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
//      2.  g构建一个DatagramPacket 对象，准备接收数据
//        在前面讲解UDP协议时，一个数据包最大64K
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
//        3.准备接收，调用接收方法,将通过网络传输的DatagramPacket 对象，填充到DatagramPacket 对象
//        当有数据包发送到本机的9999端口时，就会接收到数据
//        如果没有数据包发送到本机的9999端口,就会阻塞等待
        System.out.println("接收端A,等待接收数据...");
        datagramSocket.receive(datagramPacket);

//        4.可以把DatagramPacket 进行拆包，取出数据，并显示
        int length = datagramPacket.getLength();//实际接收到的数据长度
        byte[] data = datagramPacket.getData();//接收到数据

        String s = new String(data, 0, length);
        System.out.println(s);

//        回复信息给B端
        data = "好的，明天见".getBytes();
        datagramPacket=new DatagramPacket(data,data.length, InetAddress.getByName("192.168.48.81"),9998);
        datagramSocket.send(datagramPacket);


//        5.关闭资源
        datagramSocket.close();
        System.out.println("A端退出");


    }
}
