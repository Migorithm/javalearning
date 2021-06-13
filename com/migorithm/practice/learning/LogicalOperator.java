package com.migorithm.practice.learning;

public class LogicalOperator {
    public static void main(String[] args) {
        //logical operators
        boolean isAdult =false;
        boolean isStudent = true;
        boolean isMember = true;
        System.out.println(isAdult && isStudent);
        System.out.println(!(isAdult || isStudent));
        System.out.println((isAdult || isStudent) && isMember);


    }
}
