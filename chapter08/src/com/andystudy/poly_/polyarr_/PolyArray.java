package com.andystudy.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons=new Person[5];
        persons[0]=new Person("andy",22);
        persons[1]=new Student("sun",18,100);
        persons[2]=new Student("yr",27,60);
        persons[3]=new Teacher("stack",45,23340);
        persons[4]=new Teacher("job",31,6334);
//        ѭ���������飬����say
        for (int i=0;i< persons.length;i++){
//            persons[i]����������Person�����������Ǹ���ʵ�������JVM�ж�
            System.out.println(persons[i].say());//��̬�󶨻���
            if (persons[i] instanceof Student){//�ж����������Ƿ�ΪStudent
                ((Student)persons[i]).study();
            }else if (persons[i] instanceof Teacher){//�ж����������Ƿ�ΪTeacher
                ((Teacher)persons[i]).teach();
            }
        }

    }
}
