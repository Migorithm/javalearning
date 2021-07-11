package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/12921?language=java

public class Algo_28_finding_prime {
    public static void main(String[] args) {
        Algo_28_finding_prime A = new Algo_28_finding_prime();
        System.out.println(A.solution(10));//2,3,5  소수의 갯수 반환 except for 1
    }
    public int solution(int n) {
        int answer = 0;
        if (n>=2){
            answer++;
            for (int i =3 ;i <=n; i+=2){
                int cnt = 0;
                for (int j = 3; j <i/2; j+=2){
                    if (i%j ==0 ){
                        cnt ++;
                        break; } //no touch
                    }
                if (cnt ==0){
                answer++;
                }
            }
        }
        return answer;
    }
}
