package com.andystudy.Object;

public class ToString_ {
    public static void main(String[] args) {

//        Object��toString����Դ��
/*  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*/
        Monster monster = new Monster("С���", "Ѳɽ", 1000);
        System.out.println(monster.toString()+"  hashcode="+monster.hashCode());

        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

//    ��дtoString������������������
//    ʹ�ÿ�ݼ����� alt+insert

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
