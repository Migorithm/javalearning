package com.migorithm.Algorithm;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12944?language=java
public class Algo_13_getMean {
    public static void main(String[] args) {
        Algo_13_getMean A = new Algo_13_getMean();
        double answer = A.solution(new int[]{1,9,5,3});
        System.out.println(answer);
    }

    public double solution(int[] arr) {
        double answer = 0;
        answer = (double) Arrays.stream(arr).sum()/arr.length; // by using stream and its sum, you can 'streamline' things.
        return answer;
    }
}
