package com.andystudy.override.exercise;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){
        return "my name is "+this.name+" i am "+this.age +" years old";
    }
}
