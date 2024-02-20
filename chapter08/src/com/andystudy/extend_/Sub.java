package com.andystudy.extend_;
//Base 的子类
//Ctrl+H  可以查看类的继承关系
public class Sub extends Base {
//    1.子类继承了所有的属性和方法，但是私有属性不能在子类直接访问，
//    要通过公共的方法去访问

    public Sub() {
//        super(); //默认调用父类的无参构造器
//        若父类没有提供无参构造器，则必须在子类的构造器中用super， 去指定使用父类的哪个构造器，完成对父类的初始化工作，否则，编译不会通过
        super("sun",10);
        System.out.println("sub()...");
    }
//当创建子类对象时，不管使用子类的哪个构造器，默认情况下，总会去调用父类的无参构造器
    public Sub(String name){
//        nothing
        super("sunny",10);

        System.out.println("子类Sub（name）被调用。。。");
    }
//    4.如果希望指定去调用父类的某个构造器，则显式的调用一下
    public Sub(String name,int age){
//        super(); //调用无参构造器，或者不写
        super("nooo");//调用父类带一个参数的构造器
        System.out.println("子类Sub（name，age）被调用。。。");
    }
    public void sayOK(){
//        非私有的属性和方法可以在子类直接访问
        System.out.println(n1+" "+n2+" "+n3+" ");
        test100();
        test200();
        test300();

        System.out.println("n4 = "+getN4());
        callTest400();
    }
}
