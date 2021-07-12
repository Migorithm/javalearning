package com.migorithm.Algorithm;

import java.util.ArrayList;

public class Algo_17_Least_most_common {
    public static void main(String[] args) {
        Algo_17_Least_most_common A = new Algo_17_Least_most_common();
        int a = A.solution(48,60)[0];
        int b = A.solution(48,60)[1];
        System.out.println(a);
        System.out.println(b);

    }

    public int[] solution(int n, int m) {
        int[]answer = new int[2];
        for (int i= Math.max(m,n); i>0; i--){
            if(m%i ==0 && n%i==0){
                answer[0] = i;
                break;
            }
        }
        int answ = 1;
        for (int i= 2;i<=Math.max(n,m)/2;i++){
            while (true){
                if(m%i ==0 && n%i==0){
                    m /= i;
                    n /= i;
                    answ = answ * i;
                }
                else{break;}
            }
        }
        answ= answ*n*m;
        answer[1] = answ;
        return answer;
    }
}
