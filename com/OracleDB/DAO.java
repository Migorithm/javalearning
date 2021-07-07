package com.OracleDB;
import static com.OracleDB.JDBCTemplate.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DAO implements DBInterface {
    public DAO(){}
    public static boolean ID_Validation(String[] id_pwd) {
        String id = id_pwd[1].toLowerCase();
        String pwd = id_pwd[2].toLowerCase();

        Connection con = getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(Validation);
            stmt.setString(1, id);
            stmt.setString(2, pwd);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
    public static void MSGinsert(String[] tokens,String id){
        String sendTo = tokens[1].toLowerCase();
        String body = tokens[2];
        Connection con = getConnection();
        PreparedStatement stmt = null;
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            stmt = con.prepareStatement(insertUB);
            stmt.setString(1,id.toLowerCase());
            stmt.setString(2,sendTo);
            stmt.setString(3,body);
            stmt.setString(4, now.toString());

            stmt.executeQuery();
            con.commit();

        }catch(SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                stmt.close();
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }
//    public static void main(String[] args) {
//        System.out.println(ID_Validation(new String[]{"login","Migo","admin1234"}));
//        MSGinsert(new String[]{"msg","Migo","Hi, what have you been up to?"},"MIGO");
//    }

}



