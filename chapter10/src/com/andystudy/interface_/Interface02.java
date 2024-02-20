package com.andystudy.interface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}
interface Interface01{
//    写属性方法
    public int n1=100;
//    在接口中，抽象方法可以省略abstract关键字
    public void hi();
//    jdk8后，可以有默认实现方法,需要使用default关键字修饰
    default public void ok(){
        System.out.println("默认方法，最前面加default修饰");
    }
//    jdk8后，可以有静态方法
    public static void cry(){
        System.out.println("静态方法");
    }
}
class  A implements Interface01 {
    @Override
    public void hi() {
        System.out.println("实现接口中的hi方法");
    }
}