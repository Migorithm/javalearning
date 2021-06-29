package com.migorithm.PlayData.Try_Catch;

public class Test01 {
    public static void main(String[] args){
        int num1, num2;
        num1 = 12;
        num2 = 0;
        try { System.out.println(num1/num2); }
        catch (ArithmeticException e) {
            System.out.println(e.getClass());
            System.out.println("0으로는 값을 나눌 수가 없습니다.");
        }
    }
}


