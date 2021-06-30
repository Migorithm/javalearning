package com.migorithm.Algorithm;

import java.util.Arrays;

public class Algo_14_matrix {
    public static void main(String[] args) {
        Algo_14_matrix A = new Algo_14_matrix();
        int[][] answer = A.solution(new int [5][5], new int[5][5]);
        System.out.println(Arrays.deepToString(answer));
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0 ; i < arr1.length ;i++){
            for(int j = 0; j < arr1[0].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
