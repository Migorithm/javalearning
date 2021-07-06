package com.migorithm.Algorithm;


import java.util.ArrayList;
import java.util.Collections;

public class Algo_20_Descending_re {
    public static void main(String[] args) {
        Algo_20_Descending_re A = new Algo_20_Descending_re();
        System.out.println(A.solution(213127569));


    }

    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        char[] chars = String.valueOf(n).toCharArray();
        for(char ch:chars){
            arr.add(Character.getNumericValue(ch));
        }
        Collections.sort(arr,Collections.reverseOrder());
        char[] char2 = new char[arr.size()];


        for (int i =0; i < arr.size(); i++){
            String a = String.valueOf(arr.get(i));
            char2[i] = a.charAt(0);
        }
        String answ = String.copyValueOf(char2);
        answer = (long) Integer.parseInt(answ);


        return (long) answer;
    }


}
