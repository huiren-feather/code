package com.andystudy.final_;

public class Final {
    public static void main(String[] args) {
        E e = new E();
//        e.TAX_RATE=1;
    }
}
//如果我们要求A类不能被其他类继承
//可以使用final修饰
final class A{

}
//class B extends A{
//
//}

class C {
//    不希望父类的某个方法被子类覆盖/重写时，可以用final关键字修饰
    public final void h1(){}
}
class D extends C{
//    public void h1(){
//        System.out.println("重写方法");
//    }
}

class E {
//    不希望类的某个属性的值被修改，可以用final修饰
    public  final double TAX_RATE=0.08;
}

class F {
    public void cry(){
//        不希望某个局部变量被修改，可以使用final修饰
//        此时，NUM也被称为局部常量
        final double NUM=0.01;
//        NUM=0.9;
        System.out.println(NUM);
    }
}