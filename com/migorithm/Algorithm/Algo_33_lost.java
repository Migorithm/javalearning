package com.migorithm.Algorithm;


import java.util.Arrays;
import java.util.Collections;

public class Algo_33_lost {
    public static void main(String[] args) {
        Algo_33_lost A = new Algo_33_lost();
        System.out.println(A.solution(7, new int[]{1, 2, 3, 7}, new int[]{4, 5, 6})); //5


    }

    public int solution(int n, int[] lost, int[] reserve) {
        int cnt = 0;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (Math.abs(lost[i] - reserve[j]) == 0) {
                    reserve[j] = -1;
                    break;}
                else if (Math.abs(lost[i] - reserve[j]) == 1) {
                    reserve[j] = -1;
                    break;
                }
            }
        }
        int minus = lost.length ;
        for (int i : reserve) {
            if (i ==-1){
                minus--;
            }
        }
    return n - minus;
    }
}
