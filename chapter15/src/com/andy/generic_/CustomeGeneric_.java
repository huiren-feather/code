package com.andy.generic_;

public class CustomeGeneric_ {
    public static void main(String[] args) {

    }
}
//1.Tiger后面泛型，把Tiger称为自定义泛型类
//2.T,R,M为泛型标识符，大写，可以有多个
//3.普通成员,方法可以使用泛型
//4.泛型数组不允许初始化
//5.静态方法、属性不能使用泛型：类加载时，对象还没有创建，静态方法、属性无法初始化
class Tiger<T,R,M>{
    String name;
    T t;
    M m;
    R r;
    T[] ta;
//    T[] a = new T[8];

    public Tiger(String name, T t, M m, R r) {
        this.name = name;
        this.t = t;
        this.m = m;
        this.r = r;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }
    public void aa(T t){

    }
//    public static bb(T t){
//
//    }

}