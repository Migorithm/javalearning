package com.migorithm;

import java.util.Arrays;

public class pr1 {
    public static void main(String[] args) {
        System.out.println(solution("01062578843"));
    }
    public static String solution(String phone_number){
        String numbers = phone_number;
        char[] chars = numbers.toCharArray(); //어레이 처리
        for (int i =0; i < chars.length - 4; i++){
            chars[i] = '*';
        }
        String answer = String.valueOf(chars); //2차 캐스팅
        return answer;
    }
        }




