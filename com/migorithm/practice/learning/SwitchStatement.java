package com.migorithm.practice.learning;

public class SwitchStatement {
    public static void main(String[] args) {
        // Switch Statement
        String gender = "MALE";

        switch (gender){ //evaluate the value in gender // the same as in Javascript
            case "FEMALE":
                System.out.println("11");
                break;
            case "MALE":
                System.out.println("33");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("PREFER_NOT_SAY");
                break;
            default:
                System.out.println("55");

        }
    }
}
