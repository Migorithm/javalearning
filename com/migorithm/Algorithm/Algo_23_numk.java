package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/42748?language=java

import java.util.ArrayList;
import java.util.Arrays;

public class Algo_23_numk {

    public static void main(String[] args) {
        Algo_23_numk A = new Algo_23_numk();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}; // 5 6 3
        A.solution(array,commands);
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0 ; i < commands.length ; i++){
            int [] copy = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(copy);
            answer[i] = copy[commands[i][2]-1];
        }
        return answer;

    }
}