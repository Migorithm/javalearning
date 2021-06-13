package com.migorithm;

import java.util.Arrays;

public class pr1 {
    public static void main(String[] args) {


        String numbers = "027778888";
        char[] ch = numbers.toCharArray(); // casting 1  string -> array of char
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i<ch.length -4; i++){
            ch[i] = '*';
        }
        String answer = String.valueOf(ch); // casting 2 -> array of char -> string
        System.out.println(answer);
    }
}


