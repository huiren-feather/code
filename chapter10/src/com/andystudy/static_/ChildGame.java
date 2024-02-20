package com.andystudy.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count=0;
        Child child1 = new Child("白骨精");
        child1.join();
//        count++;
        child1.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        child2.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
        child3.count++;
        System.out.println(child1.count);
//        可以通过类名来直接访问静态变量
        System.out.println(Child.count);
    }
}
class Child{
    private String name;
//定义一个变量count，是一个类变量（静态变量）static
//    该变量最大的特点就是会被Child类的所有的对象实例共享
    public static int count=0;
    public Child(String name) {
        this.name = name;
    }
    public void  join(){
        System.out.println(name+"加入了游戏。。。");
    }
}