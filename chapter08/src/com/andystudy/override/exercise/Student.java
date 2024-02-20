package com.andystudy.override.exercise;

public class Student extends Person{
    private int id;
    private float score;

    public Student(String name, int age, int id, float score) {
        super(name, age);
       setId(id);
       setScore(score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    public String say(){
        return super.say()+" my id is " + this.id + " my score is "+this.score;
    }
}
