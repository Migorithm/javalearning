package com.migorithm.PlayData;

import java.util.Arrays;

public class Alternative_to_In_operator {
    public static void main(String[] args) {
        int a =5;
        if (Arrays.asList(1, 3, 5,7,8,10,12).contains(a)){
            System.out.println("있어 맨");}
        else{
            System.out.println("없어 맨");
        }
    }
}
