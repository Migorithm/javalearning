package com.migorithm.practice.learning;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        //looping
        int[] numbers = {2,0,1,4,100,4,90,78,77};
        // 다돌려서, numbers 안의 숫자들을 20씩뺀 숫자로 리턴해서 저장 출력.

        for (int i =0 ; i<numbers.length;i++){
            numbers[i] = numbers[i] -20;

        }
        System.out.println(Arrays.toString(numbers));

        //reverse loop
        for (int i = numbers.length-1 ; i >-1 ; i-- ){
            System.out.println(numbers[i]);
        }







    }
}
