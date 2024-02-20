package com.andystudy.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons=new Person[5];
        persons[0]=new Person("andy",22);
        persons[1]=new Student("sun",18,100);
        persons[2]=new Student("yr",27,60);
        persons[3]=new Teacher("stack",45,23340);
        persons[4]=new Teacher("job",31,6334);
//        循环遍历数组，调用say
        for (int i=0;i< persons.length;i++){
//            persons[i]编译类型是Person，运行类型是根据实际情况由JVM判断
            System.out.println(persons[i].say());//动态绑定机制
            if (persons[i] instanceof Student){//判断运行类型是否为Student
                ((Student)persons[i]).study();
            }else if (persons[i] instanceof Teacher){//判断运行类型是否为Teacher
                ((Teacher)persons[i]).teach();
            }
        }

    }
}
