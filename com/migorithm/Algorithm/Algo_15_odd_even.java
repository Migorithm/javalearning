package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/12937
public class Algo_15_odd_even {
    public static void main(String[] args) {
        Algo_15_odd_even A = new Algo_15_odd_even();
        System.out.println(A.solution(5));

    }

    public String solution(int num) {
        if (num%2 ==1 || num%2 == -1){ //you must think about the case when the range of int goes below 0. i.e, negative.
            return "Odd";
        }
        else {return "Even";}

    }
}
