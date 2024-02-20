package com.andystudy.single_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance =GirlFriend.getInstance();
        System.out.println(instance);
    }

}
//饿汉式
//有一个类，GirlFriend
//只能有一个女朋友
class GirlFriend {
    private String name;
//为了能够在静态方法中，返回gf对象，需要将其修饰为static
private static GirlFriend gf=new GirlFriend("晓晓");
//如何保证我们只能创建一个对象
    private GirlFriend(String name) {
        this.name = name;
    }
    public  static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}