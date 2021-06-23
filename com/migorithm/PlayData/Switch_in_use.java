package com.migorithm.PlayData;

import java.util.Arrays;
import java.util.Scanner;

public class Switch_in_use {
    public static void main(String[] args) {
        int first =0;


        do{
            Scanner arr = new Scanner(System.in);
            first = arr.nextInt();
        switch (first) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일까지 있어요");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일까지 있어요");
                break;
            case 2:
                System.out.println("28일까지 있어요");
                break;
        }}while ( 1<=first && first <=12 );
        int a = 10;



    }
}
