package com.migorithm.practice.learning;

import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {2,0,1,4,100,4,90,78,77};
        String [] str = new String[10];

        for (int number : numbers){ // it doesn't have actual access to index
            System.out.println(number);
        }
        for (int i = 0; i < str.length; i++) {
            str[i] = "길동이" +i;
        }

        System.out.println(Arrays.toString(str));

        //bonus tip!
        Arrays.stream(numbers).forEach(System.out::println);


    }
}
