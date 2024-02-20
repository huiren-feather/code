package com.andystudy.override.exercise;

public class Override02 {
    public static void main(String[] args) {
        Person andy = new Person("andy", 18);
        Student sun = new Student("sun", 28, 123, 99);
        System.out.println(andy.say());
        System.out.println(sun.say());

    }
}
