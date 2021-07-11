package com.migorithm.Algorithm;


//https://programmers.co.kr/learn/courses/30/lessons/17681?language=java

public class Algo_32_SecretMap {
    public static void main(String[] args) {
        Algo_32_SecretMap A = new Algo_32_SecretMap();
        int[] arr1 = new int[] {9, 20, 28, 18, 11};
        int[] arr2 = new int[] {30, 1, 21, 17, 28};
       // System.out.println(Integer.toBinaryString(10 | 3));
        String[] answer = A.solution(5,arr1,arr2);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }


    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0 ;i < n; i++){
            StringBuilder str1 = new StringBuilder("");
            String x = Integer.toBinaryString(arr1[i] | arr2[i]);

            while(x.length() + str1.length() != n){
               str1.append(" ");
               }
            char[] chars = x.toCharArray();
            for(int j =0; j < chars.length ; j++){
                if (chars[j] == '1'){
                    str1.append("#");
                }
                else {str1.append(" ");
            }
        }
            answer[i] = str1.toString();
    }
        return answer;
}}
