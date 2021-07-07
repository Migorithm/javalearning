package com.OracleDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.util.*;


//하나의 테이블당 하나씩 템플릿을 둘 것 ex) EMP  -> Entity     //CRUD -> static
//        EMP -> Value object
// score -> vo -> 이름 국어 영어 수학 - > validation process - > 계산 / ?  - > DB

//어플리케이션 설계시  MVC - > 패키지, 클래스  -- (모델, 뷰, 컨트롤)


//view = 클라이언트 접근하는 화면
//서버의 controller - > 페이지제어, 데이터 유효성 검증.
//Model - 연산, Data access object . -> DB연동  (JDBC!)



//어플리케이션에는 여러페이지가 있다. -insert하는 페이지, update하는 페이지, delete하는 페이지 등...
//동적 객체 생성으로 모든 페이지가 계속 살아있으면 안되므로, 스태틱으로 처리가 되어야한다.
//각각의 소멸시점때문에 스태틱으로.



//연결, 클로즈만 하는 클래스 = statement
//롤백, 커밋만 하는 클래스  = statement



public class JDBCTemplate { //시뮬레이션  - > DB   -> VO , ENTITY
    public static Connection getConnection() {
        Connection con=null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver"); //클래스 참조형 실행상태.
            //  object의 get의 return값.
            // "oracle.jdbc.driver.OracleDriver".class



            con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","MIGO","admin1234");
            //Connection = 연결 객체. commit /rollback/ close() / isClosed() 등을가진다.


            if(!con.isClosed()) {
                System.out.println("DB연동 성공");
            }
        }catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public static void Close(Connection con) {
        if (con!=null) {
            try {
                con.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void Close(Statement stmt) {
        if (stmt!=null) {
            try {
                stmt.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Close(ResultSet rs) {
        if (rs!=null) {
            try {
                rs.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void RollBack(Connection con) {
        if(con!=null) {
            try {
                con.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }}}


    public static void Commit(Connection con) {
        if(con!=null) {
            try {
                con.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



    public static boolean isConnection(Connection con) {
        // (a>b) && (a<b++)
        try {
            if (con != null && !con.isClosed()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }


}












