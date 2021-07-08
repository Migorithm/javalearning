package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/12948
public class Algo_22_hiding_numbers {

    public static void main(String[] args) {
        Algo_22_hiding_numbers A = new Algo_22_hiding_numbers();
        System.out.println(A.solution("01033334444"));
    }



    public String solution(String phone_number) {
        String answer = "";
        for(int i =0 ; i < phone_number.length()-4; i++){answer += "*";
        }
        answer = answer + phone_number.substring(phone_number.length()-4);
        return answer;

    }


}
