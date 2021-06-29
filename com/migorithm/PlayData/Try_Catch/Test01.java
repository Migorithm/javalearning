package com.migorithm.PlayData.Try_Catch;

public class Test01 {
    public static void main(String[] args){
        int num1, num2;
        int[] Intarray = {1,2,3};
        num1 = 12;
        num2 = 0;
        try {
            System.out.println(Intarray[3]);
            System.out.println(num1/num2); }
        catch (ArithmeticException e) {
            System.out.println(e.getClass()); //to get a classname of exception.
            System.out.println("0으로는 값을 나눌 수가 없습니다.");
        }
        catch (ArrayIndexOutOfBoundsException A){
            System.out.println("인덱스 범위가 벗어났어요."); //file.close(), db.close(), backup file 등등 처리될 게 있다면 finally{} 까지.
        }
    }
}


