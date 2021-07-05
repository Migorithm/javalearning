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
        int[] answer = new int[2];
        if (m%n ==0){ //when n is aliquot of m
            answer[0] = n;
            answer[1] = m;
            return answer;
        }
        else{ // when n is not an aliquot of m
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i = 1 ; i <= m ; i++){
                if (m%i ==0 & n%i ==0){arr.add(i);};
            }
            answer[0] = arr.get(arr.size()-1);
            // 48 x 60 ->  2  // 24 30 - > 2 // 12 , 15 -> 3 // 4 , 5
            int ans=1;
            int i = 0;
            while (i < arr.size()){
                //divide number by its modulos
                if (n%(arr.get(i)) ==0 & m%(arr.get(i)) ==0 ){
                    n =  n/(arr.get(i));
                    m = m/(arr.get(i));
                    ans = ans*arr.get(i);}
                else {
                    i++;
                }
            }
            answer[1] = ans*n*m;
            return answer;

        }


}}
