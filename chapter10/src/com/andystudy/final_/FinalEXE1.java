package com.andystudy.final_;

public class FinalEXE1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.calArea());
    }
}
class Circle {
    private final double PI=3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calArea(){
        return PI*radius*radius;
    }
}