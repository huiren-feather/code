package com.andy.api;
import java.net.InetAddress;
import java.net.UnknownHostException;
/*
* 演示InetAddress 类的使用
* */

public class API_ {
    public static void main(String[] args) throws UnknownHostException {

//        获取本机的InetAddress
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
//        根据主机名，获取InetAddress 对象
        InetAddress byName = InetAddress.getByName("yuan--hhctx");
        System.out.println(byName);
//        根据域名,返回InetAddress对象，比如www.baidu.com
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);
//        通过InetAddress对象，获取对应地址
        String hostAddress = byName1.getHostAddress();
        System.out.println(hostAddress);
//        通过InetAddress对象，获取对应域名/主机名
        String hostName = byName1.getHostName();
        System.out.println(hostName);

    }
}
