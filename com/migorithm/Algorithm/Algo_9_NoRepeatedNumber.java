package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/12906?language=java

import java.util.*;

public class Algo_9_NoRepeatedNumber {
    public static void main(String[] args) {
        Algo_9_NoRepeatedNumber A = new Algo_9_NoRepeatedNumber();
        int[] arr = A.solution(new int []{1,2,3,44,4,4,4,2,3,4});
        System.out.println(Arrays.toString(arr));
    }

    public int[] solution(int []arr) {

        ArrayList<Integer> aa = new ArrayList<Integer>();
        for(int i =0; i < arr.length ; i++){
            if(i-1 >=0 && arr[i] != arr[i-1]){
                    aa.add(arr[i]);}
            else if(i ==0){
                aa.add(arr[i]);
            }
        }
        int [] answer = new int[aa.size()];
        for (int i =0; i<aa.size(); i++){
            answer[i] = aa.get(i);
        }



        return answer;
    }
}
