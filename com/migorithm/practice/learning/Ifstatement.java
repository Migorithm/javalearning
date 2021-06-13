package com.migorithm.practice.learning;

public class Ifstatement {
    public static void main(String[] args) {
        // If statements
        int myAge =17;
        int adultAge = 20;

        if (myAge >=adultAge){
            System.out.println("Hooray ... I'm an adult");
        }
        else{
            System.out.println("You still need "+(adultAge - myAge) +" years");
        }
    }

}
