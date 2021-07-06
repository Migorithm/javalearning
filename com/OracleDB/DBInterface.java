package com.OracleDB;

//SQL구문만 상수로 넣는 인터페이스



public interface DBInterface {
    String Validation = "select * from chat_User where ID = ? and PASSWORD =?";
    //String emp = "Select * from emp";
    String insertUB = "insert into user_behavior values(?,?,?,?)";
    //should be followed by PreparedStatement
//    String insertEmp = "insert into Emp values(?,?,?,?,?,?,?,?)";
//    String deleteEmp = "delete from emp where empno = ?";
//    String updateEmp = "update emp set sal =? where empno =?";

}
