package com.andystudy.Object;

import com.sun.deploy.perf.PerfRollup;
import jdk.nashorn.internal.ir.CallNode;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("andy", 20, '��');
        Person person2 = new Person("andy", 20, '��');
        //δ��дequals����ʱ,Object�ķ����ǱȽ��Ƿ�Ϊͬһ������������false
        System.out.println(person1.equals(person2));
//        ��дequals��������true

        System.out.println(person1.getName().toString());
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    ����Object��equals����
    public boolean equals(Object obj){
//        1.�ж��Ƿ�Ϊͬһ������
        if (this==obj){
            return true;
        }
//        2.�ж��Ƿ���Person���󣬷���û�бȽϵı�Ҫ
        if (obj instanceof Person){
//        3.��������ת�ͣ���Ϊ����Ҫ�õ�obj�ĸ�������
            Person p=(Person)obj;
//            name���ַ�����������Ҫ�÷����Ƚ�
            return this.name .equals(p.name)&& this.age==p.age
                    && this.gender==p.gender;
        }
//    ������Person ��ֱ�ӷ���false
      return false;
    }
}
