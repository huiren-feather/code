package com.andystudy.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="sun";
        pupil.age=8;
        pupil.testing();
        pupil.setScore(66.5);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name="andy";
        graduate.age=18;
        graduate.testing();
        graduate.setScore(96.5);
        graduate.showInfo();
    }
}
