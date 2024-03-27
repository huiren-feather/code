package com.andy.generic_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class GenericExercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("andy",30000,new MyDate(1994,10,17)));
        employees.add(new Employee("sun",20000,new MyDate(2000,11,17)));
        employees.add(new Employee("sun",35555,new MyDate(2000,11,15)));
        System.out.println(employees);
        System.out.println("==对雇员进行排序==");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }
//                比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0){
                    return i;
                }
//                下面是对birthday的比较，我们最好把这个比较，放在MyDate中
                return emp1.getBirthday().compareTo(emp2.getBirthday());

            }
        });
//        排序后
        System.out.println(employees);
    }
}
