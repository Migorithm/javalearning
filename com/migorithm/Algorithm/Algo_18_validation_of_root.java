package com.migorithm.Algorithm;

public class Algo_18_validation_of_root {
    public static void main(String[] args) {
        Algo_18_validation_of_root A = new Algo_18_validation_of_root();
        System.out.println(A.solution(121));
    }



    public long solution(long n) {
        long answer = -1;
        double root_double = (double)Math.pow(n,0.5);
        long root_int = (long) Math.pow(n,0.5);
        if ( root_double == (double) root_int){
            return (long) Math.pow(root_int+1,2);
        }
        return answer;
    }
}
