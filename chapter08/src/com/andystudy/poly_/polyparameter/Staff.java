package com.andystudy.poly_.polyparameter;

public class Staff extends Employee {
    public Staff(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("Ա���ڹ���������");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
