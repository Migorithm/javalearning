package com.migorithm.Algorithm;

public class Algo_2_mean {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(solution(arr));
    }
    public static double solution(int[] arr) {

        double answer = 0;
        for (int i : arr){ answer += i;};
        answer = answer / arr.length;
            return answer;
        }
    }

//https://programmers.co.kr/learn/courses/30/lessons/12944