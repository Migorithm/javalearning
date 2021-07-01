package com.migorithm.Algorithm;

import java.util.*;

import static java.lang.Integer.*;

public class Algo_16_add_more_space {
    public static void main(String[] args) {
        Algo_16_add_more_space A = new Algo_16_add_more_space();
        System.out.println(A.solution(987));
    }

    public int solution(int n) {
        int answer = 0;
        char[] str = String.valueOf(n).toCharArray();
        for (int i = 0; i < str.length ; i++){
            answer += Integer.parseInt(String.valueOf(str[i]));
        }
        return answer;

}}
