package com.web.tom.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbHelper {
    private static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
    private static String userName = "root";
    private static String passWord = "123456";
    private static Connection conn = null;

    private DbHelper() {

    }

    public static Connection getConnection() {
        if (null == conn) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, userName, passWord);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void main(String[] args) { // 测试数据库是否连通
        System.err.println(getConnection());
    }
}
