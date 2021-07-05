package com.migorithm.JDBCsync;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); //클래스 참조형 실행상태.
            //object의 get의 return값.
            // "oracle.jdbc.driver.OracleDriver".class


            con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "migo", "admin1234");
            //Connection = 연결 객체. commit /rollback/ close() / isClosed() 등을가진다.


            if (!con.isClosed()) {
                System.out.println("연결했으");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void Close(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JDBCTemplate.getConnection();
    }
}