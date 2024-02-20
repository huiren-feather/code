package com.andystudy.encap;
/*练习封装
* 在com.andystudy.encap包中定义两个类：Account 和 AccountTest
* 1.Account类要求具有属性：姓名（长度为2、3、4位）、余额（必须>20）、
    密码（必须是6位），若不满足，则给出提示信息，并给默认值（自己定）
  2.通过setXxx的方法给Account的属性赋值
* 3.在AccountTest中测试
*
* */

public class Account {
    String name;
    private double amount;
    private String password;

    public Account() {
    }

    public Account(String name, double amount, String password) {
        setName(name);
        setAmount(amount);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length()<=4) {
            this.name = name;
        }else {
            System.out.println(name + "，此姓名输入不规范，长度必须在2-4位之间，系统将给默认值:佚名");
            this.name = "佚名";
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount>20){
            this.amount = amount;
        }else {
            System.out.println(name+"的余额输入无效，必须大于20，系统将给默认值100");
            this.amount =100;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==6 ){
            this.password = password;
        }else {
            System.out.println(name+" 的密码输入不规范，长度必须为6，系统将给默认值000000");
            this.password="000000";
        }
    }

    public void accountInfo(){
        System.out.println(name+" 的账户上有 "+amount+" 元，账户密码是 "+password);
    }

}
