package com.andystudy.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("哈哈哈哈111");
        person.setAge(280);
        person.setSalary(9900.16);
        System.out.println(person.info());

//        若我们直接使用构造器指定属性
        Person andy = new Person("andy", 230, 22222);
        System.out.println(andy.info());

    }
}

//不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置
//否则给默认年龄,必须在1-150,年龄、工资不能直接查看，name的长度在2-6字符之间
class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//      问题：若直接使用构造器指定属性，验证就失效了
//      解决：将set方法写在构造器中，这样就可以验证了
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    //    自己写set get太慢，使用快捷键

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1-150之间");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //        加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要在2-6个字符之间");
            this.name = "无名";
        }
    }
    public String info() {
        return this.name + "的年龄是" + this.age + ",薪水是" + this.salary;
    }
}