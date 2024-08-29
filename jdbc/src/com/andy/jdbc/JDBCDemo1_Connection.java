package com.andy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//事务：同时成功或同时失败
public class JDBCDemo1_Connection {
    public static void main(String[] args) throws Exception {
//        1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
//        String url = "jdbc:mysql:///db1?useSSL=false";  本机默认3306，可以简写
        String username = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url,username,password);
//        3.定义SQL
        String sql1 = " UPDATE stu set score = 10 where `name` = 'pink'";
        String sql2 = " UPDATE stu set score = 60 where `name` = 'hsp'";

//        4.h获取执行SQL的对象Statement
        Statement stmt = conn.createStatement();


        try {
            //开启事务
            conn.setAutoCommit(false);
//        5.执行SQL
            int count1 = stmt.executeUpdate(sql1);//返回受影响的行数
//            double d = 2/0;
//        6.处理结果
            System.out.println(count1);

            //        5.执行SQL
            int count2 = stmt.executeUpdate(sql2);//返回受影响的行数
//        6.处理结果
            System.out.println(count2);

//          提交事务
            conn.commit();

        } catch (Exception throwables) {
//            失败了就回滚事务
            conn.rollback();
            throwables.printStackTrace();
        }


//        7.释放资源
        stmt.close();
        conn.close();
    }
}
