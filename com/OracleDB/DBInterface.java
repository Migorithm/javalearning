package com.OracleDB;

//SQL구문만 상수로 넣는 인터페이스

public interface DBInterface {
    String Validation = "select count(*) from user_table where id = ? and password = ?";
    String insertEmp = "insert into Emp values(?,?,?,?,?,?,?,?)";
    String deleteEmp = "delete from emp where empno = ?";
    String updateEmp = "update emp set sal =? where empno =?";

}
