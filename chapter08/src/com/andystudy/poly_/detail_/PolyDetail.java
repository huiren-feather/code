package com.andystudy.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
//        向上转型：父类的引用指向了子类的对象
//        语法：父类类型引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj =  new Cat();

//      可以调用父类的所有成员（须遵守访问权限）
//      但是不能调用子类的特有的方法
//      因为在编译阶段，能调用哪些成员，是由编译类型来决定的
//        animal.catchMouse();  错误
//      最终运行效果，看子类的具体实现，即调用方法时，按照从子类开始查找方法
//        然后调用，规则与前面一致
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        System.out.println("OK ...");

//        老师希望，可以调用Cat的catchMouse 方法
//        多态的向下转型
//        语法：子类类型 引用名 = （子类类型）父类引用

        Cat cat = (Cat)animal;
        cat.catchMouse();
        System.out.println("down...");

//        Dog dog =(Dog)animal;  //这是不可以的

    }
}
