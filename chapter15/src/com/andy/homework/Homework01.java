package com.andy.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001",new User(1,10,"andy"));
        userDAO.save("002",new User(2,18,"sun"));
        userDAO.save("003",new User(3,20,"king"));
        List<User> list=userDAO.list();
        System.out.println(list);
        userDAO.update("003",new User(3,28,"god"));
        System.out.println("修改后===");
        System.out.println(userDAO.list());
    }
}
