package com.migorithm.Algorithm;

import java.time.temporal.ValueRange;

public class Algo_4_sum_integer {
    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }

    public static long solution(int a, int b) {
        long answer =0 ;
        answer = (long) (a+b)*(Math.abs((long)a- (long)b+1)/2);

        return answer;
    }
}

