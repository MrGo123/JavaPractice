package com.zy.jdbc;

import java.sql.*;

/**
 * @ClassName ConnectionJDBC
 * @Description TODO
 * @Author ZY
 * @Date2020/8/11 23:11
 * @Version 1.0
 **/
public class ConnectionJDBC {
    public static void main(String[] args) throws Exception {
        //数据库信息配置
        String JDBC_URL = "jdbc:mysql://localhost:3306/tysql?serverTimezone=UTC";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "admin123";
        //通过Connection获取连接
        // try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
        //     //创建Statement对象
        //     try (Statement stmt = conn.createStatement()) {
        //         //    通过Statement对象执行SQL查询并返回结果
        //         try (ResultSet rs = stmt.executeQuery("SELECT * FROM products")) {
        //             //反复调用resultset.next()读取每一行结果。自动换行，获取列时索引从1开始
        //             while (rs.next()) {
        //                 //必须根据列对应的数据类型调用对应的get类型
        //                 System.out.println(rs.getString(1) + "\n" + rs.getString(2) + "\n" + rs.getString(3));
        //             }
        //         }
        //     }
        // }

    }
}
