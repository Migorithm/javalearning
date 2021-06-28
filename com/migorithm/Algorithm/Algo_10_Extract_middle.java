package com.migorithm.Algorithm;

public class Algo_10_Extract_middle {
    public static void main(String[] args) {
        Algo_10_Extract_middle A = new Algo_10_Extract_middle();
        System.out.println(A.solution("abcdee"));
    }

    public String solution(String s) {
        String answer = "";
        int index = s.length()/2;
        if (s.length()%2 ==1){return String.valueOf(s.charAt(index));}
        else{ return s.substring(index-1,index+1);}

    }
}
