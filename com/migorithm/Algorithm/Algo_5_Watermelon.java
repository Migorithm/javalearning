package com.migorithm.Algorithm;

public class Algo_5_Watermelon {



        public  String solution(int n) {
            String answer = "";
            for (int i = 1; i <= n; i++) {

                answer += i%2 ==1 ? "수" : "박";

            }
            return answer;}

    public static void main(String[] args) {
        Algo_5_Watermelon A = new Algo_5_Watermelon();
        System.out.println(A.solution(5));
    }
}
