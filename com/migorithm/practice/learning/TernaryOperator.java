package com.migorithm.practice.learning;

public class TernaryOperator {
    public static void main(String[] args) {
        int age =15;
        String message = age >= 18? "you are an adult!" : "you are not!";
        System.out.println(message);
        //if you are evaluting just one boolean expression.
        Object msg1 = age>=14? "you are old enough" : 18 -age;
        System.out.println(msg1);

        }
    }

