package com.migorithm.Algorithm;

import java.time.LocalDate;

//https://programmers.co.kr/learn/courses/30/lessons/12901

public class Algo_26_2016 {
    public static void main(String[] args) {
        Algo_26_2016 A = new Algo_26_2016();
        System.out.println(A.solution(5,24));
    }

    public String solution(int a, int b) {
        LocalDate date2 = LocalDate.of(2016, a, b);
        System.out.println(date2.getDayOfWeek());

        //if you wanna get today?
        //LocalDate date1 = LocalDate.now();



        return date2.getDayOfWeek().toString().substring(0,3);
    }
}
