package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/12954#qna


import java.util.Arrays;

public class Algo_11_xDistance {
    public static void main(String[] args) {
        Algo_11_xDistance A = new Algo_11_xDistance();
        long[] answer = A.solution(-4,5);
        System.out.println(Arrays.toString(answer));
    }

    public long[] solution(int x, int n) {

        long[] answer = new long[n];
        for (int i =0 ; i < n ; i++){
            answer[i] = (long) x*(i+1);
        }

        return answer;
    }
}
