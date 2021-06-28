package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/12916?language=java

public class Algo_8_countString {

    public static void main(String[] args) {
        Algo_8_countString A = new Algo_8_countString();
        System.out.println(A.solution("pPyy"));
    }
    boolean solution(String s) {
        boolean answer = true;
        long countP = s.toLowerCase().chars().filter(ch -> ch =='p').count();
        long countY = s.toLowerCase().chars().filter(ch -> ch =='p').count();
        if (countP != countY){answer = false;}

        return answer;
        }

}
