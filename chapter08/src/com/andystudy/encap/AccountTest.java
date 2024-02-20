package com.andystudy.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Account sun = new Account("ssssun", 200, "123456");
        account.setName("andy");
        account.setAmount(12);
        account.setPassword("213");
        account.accountInfo();
        sun.accountInfo();
    }
}