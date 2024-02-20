package com.andystudy.poly_.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Manager man = new Manager("andy",25000,70000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(man);
        polyParameter.toWork(man);
    }

    public  void showEmpAnnual(Employee e){
            System.out.println("Ա��"+e.getName()+"���깤��="+e.getAnnual());
    }
    public void toWork(Employee e){
        if (e instanceof Manager){
            ((Manager) e).manage();
        }else if (e instanceof Staff){
            ((Staff) e).work();
        }else {
            System.out.println("������Ĳ���һ��Ա��");
        }
    }
}
