package com.use;

import com.andy.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);

        com.sun.Dog dog1 = new com.sun.Dog();
        System.out.println(dog1);
    }
}
