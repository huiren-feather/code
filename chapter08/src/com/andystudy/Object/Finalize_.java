package com.andystudy.Object;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("����");
        bmw = null;//��ʱ car�����Ǹ������������������ͻ�����������
//        �����ٶ���ǰ,�����finalize����
//        ����Ա�Ϳ�����finalize�У�д�Լ���ҵ���߼����루�����ͷ���Դ�����ݿ����ӣ����ļ��ȣ�
//        ����ͨ��System.gc()  ���������������ջ���
        System.gc();
        System.out.println("�����˳��ˡ�����");
    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
//    ��дfinalize  ���ǿ�ݼ�

    @Override
    protected void finalize() throws Throwable {
        System.out.println("������������"+name);
        System.out.println("�ͷ���ĳЩ��Դ");
    }
}