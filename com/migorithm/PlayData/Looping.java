package com.migorithm.PlayData;

import java.util.Arrays;

public class Looping {
    public static void main(String[] args) {
        int [] IntArray = {8,5,3};
        String [] str = new String[4];
        for (int num:IntArray){
            int x = num%3;
            if (x>1){
                System.out.println(num);
            }
        }
        str[0] = "나는나는";
        str[3] = "저팔계";
        System.out.println(Arrays.toString(str));
        for (int i=0; i<str.length ;i++){ //인덱싱 가능
            if (i%2 ==0 || i ==0){
                continue;}
            else{
                System.out.printf("%3d %5s",i,str[i]);
            }
        }



    }
}
