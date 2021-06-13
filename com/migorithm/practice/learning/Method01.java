package com.migorithm.practice.learning;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {
        char[] letters = {'A','A','B','C','D','D','D'};
        System.out.println(countOccurrences(letters,'D'));

    }

    public static int countOccurrences(char[] cg, char searchLetter){
        int a  = 0;
        for (char letter: cg){
            if (letter== searchLetter){
                a +=1 ;
            }
        }

        return a;
    }

}
