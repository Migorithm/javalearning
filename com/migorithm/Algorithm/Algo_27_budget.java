package com.migorithm.Algorithm;

import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/12982?language=java

public class Algo_27_budget {
    public static void main(String[] args) {
        Algo_27_budget A = new Algo_27_budget();
        System.out.println(A.solution(new int[] {1,3,2,5,4},9)); // 3
    }
    public int solution(int[] d, int budget) {
        int cnt = 0;
        Arrays.sort(d);
        for (int i : d) {
            if (budget - i >=0){
                budget -= i;
                cnt ++;
            }
        }

        return cnt;
    }
}
