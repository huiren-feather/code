package com.andystudy.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
//        �����̬
//      animal ����������  Animal  ����������  Dog
        Animal animal = new Dog();
        //��Ϊ����ʱ��ִ�е�����ʱ��animal����������Dog������cry����Dog��cry
        animal.cry();//Dog cry()...С���ڽС�����

//      animal �������� Animal ������������Cat
        animal = new Cat();
        animal.cry();//Cat cry()... Сè�����С�����
    }

}
