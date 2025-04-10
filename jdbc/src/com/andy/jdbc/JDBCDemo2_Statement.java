package com.andy.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo2_Statement {

    @Test
    public  void testDML() throws Exception {
//        1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
//        String url = "jdbc:mysql:///db1?useSSL=false";  本机默认3306，可以简写
        String username = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url,username,password);
//        3.定义SQL
        String sql = " UPDATE stu set score = 100 where `name` = 'andy'";

//        4.h获取执行SQL的对象Statement
        Statement stmt = conn.createStatement();

//        5.执行SQL
        int count = stmt.executeUpdate(sql);//返回受影响的行数

//        6.处理结果
//        System.out.println(count);

        if (count >0 ){
            System.out.println("修改成功~");
        }else {
            System.out.println("修改失败~");
        }
//        7.释放资源
        stmt.close();
        conn.close();
    }
}
