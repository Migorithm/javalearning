package com.migorithm.practice.learning;

import java.util.Arrays;

public class Arrays_pra {
    public static void main(String[] args) {
        //Arrays
        int[] num = new int[4];
        num[0]= 1;
        num[1]= 2;
        System.out.println(Arrays.toString(num));
        boolean [] bools = new boolean[5];
        System.out.println(Arrays.toString(bools));
        float[] num2 = new float[5];
        System.out.println(Arrays.toString(num2));
        String [] str = new String[5];
        System.out.println(Arrays.toString(str));
        Arrays[] arr = new Arrays[4];

        int[] num3 = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(num3));
        System.out.println(num3.length);
        int i= 0;
        while (i<num3.length){
            num3[i] = num3[i]*num3[i];
            i ++;
        }
        System.out.println(Arrays.toString(num3));
    }
}
