package com.andystudy.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
//        ����ת�ͣ����������ָ��������Ķ���
//        �﷨���������������� = new ��������();
        Animal animal = new Cat();
        Object obj =  new Cat();

//      ���Ե��ø�������г�Ա�������ط���Ȩ�ޣ�
//      ���ǲ��ܵ�����������еķ���
//      ��Ϊ�ڱ���׶Σ��ܵ�����Щ��Ա�����ɱ���������������
//        animal.catchMouse();  ����
//      ��������Ч����������ľ���ʵ�֣������÷���ʱ�����մ����࿪ʼ���ҷ���
//        Ȼ����ã�������ǰ��һ��
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        System.out.println("OK ...");

//        ��ʦϣ�������Ե���Cat��catchMouse ����
//        ��̬������ת��
//        �﷨���������� ������ = ���������ͣ���������

        Cat cat = (Cat)animal;
        cat.catchMouse();
        System.out.println("down...");

//        Dog dog =(Dog)animal;  //���ǲ����Ե�

    }
}
