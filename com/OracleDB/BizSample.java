package com.OracleDB;

import java.sql.Connection;
import java.util.List;



//Controller로 부터 유효성 검증이 끝나면 vo를 받아 연산할거면 연산 클래스를 호출한 결과를 리턴하고
//또는 바로 연산없이 데이터베이스에 저장하려면 dao를 부른다.

//비즈니스 로직만 존재.
// JDBCTemplate을 이용해서 C&C 만 호출한다. (connection & close)


public class BizSample {}
//    public List<EmpEntity> getSelectAll(){
//        //계산용 코드를 호출해서 데이터베이스 연결...
//        //vo를 받아서 계산용 클래스로 계산한 다음 entity에 담아서 dao로 넘겨서 리턴받는다.
//
//        Connection con = getConnection();
//        List<EmpEntity> res = new EmpDao(con).getSelectAll();
//        Close(con);
//        return res;
//    }
//
//    public int getEmpInsert(EmpEntity entity) {
//        Connection con = getConnection(); /// import static com.myjdbc.JDBCTemplate.*;으로부터 온 것.
//        int res = new EmpDao(con).getEmpInsert(entity);
//        Close(con); //import static com.myjdbc.JDBCTemplate.*;으로부터 받은 것.
//        return res;
//
//    }
//
//    public int getEmpUpdate(EmpEntity entity) {
//        Connection con = getConnection(); /// import static com.myjdbc.JDBCTemplate.*;으로부터 온 것.
//        int res = new EmpDao(con).getEmpUpdate(entity);
//        Close(con); //import static com.myjdbc.JDBCTemplate.*;으로부터 받은 것.
//        return res;
//    }
//
//    public int getEmpDelete(EmpEntity entity) {
//        Connection con = getConnection(); /// import static com.myjdbc.JDBCTemplate.*;으로부터 온 것.
//        int res = new EmpDao(con).getEmpDelete(entity);
//        Close(con); //import static com.myjdbc.JDBCTemplate.*;으로부터 받은 것.
//        return res;
//    }
//}
