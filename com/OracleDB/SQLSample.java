package com.OracleDB;



import java.sql.*;

public class SQLSample {
    public static void main(String[] args) {
        //드라이버 이용해서 오라클 연결 확인
        //jdbc:oracle:thin:@127.0.0.1:1521:XE 내 주소. -> driver property에서 확인 가능. 다른 유저와 연결시 다른 주소로.

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); //클래스 참조형 실행상태.
            //object의 get의 return값.
            // "oracle.jdbc.driver.OracleDriver".class


            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","migo","admin1234");
            //Connection = 연결 객체. commit /rollback/ close() / isClosed() 등을가진다.


            if(!con.isClosed()) {
                System.out.println("연결했으");
            }
            //명령수행
            String str = "select * from emp";
            Statement stmt = con.createStatement();

            //결과리턴
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                System.out.println(rs.getString(1) + ":" + rs.getString("ENAME") + ":" + rs.getDouble("SAL")); //인덱스로도, 칼럼으로도 리턴 가능.
            }
            //종료
            con.close();
            stmt.close();
            con.close();

        }catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();



        }
    }
}
