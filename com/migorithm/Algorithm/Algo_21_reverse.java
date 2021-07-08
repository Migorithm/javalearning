package com.migorithm.Algorithm;


//https://programmers.co.kr/learn/courses/30/lessons/12932

public class Algo_21_reverse {
    public static void main(String[] args) {
        Algo_21_reverse A = new Algo_21_reverse();
        int[] answer = A.solution(545443);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }





    }


    public int[] solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        int[] answer = new int[chars.length];
        for (int i = chars.length -1; i>=0;i--){
            int a = Math.abs(i-(chars.length-1));
            answer[a] = Integer.parseInt(String.valueOf(chars[i]));
        }


        return answer;
    }

}
